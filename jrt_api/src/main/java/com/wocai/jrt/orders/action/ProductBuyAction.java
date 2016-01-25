package com.wocai.jrt.orders.action;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.alibaba.fastjson.JSON;
import com.vteba.cache.redis.RedisService;
import com.vteba.utils.common.BigDecimalUtils;
import com.vteba.utils.id.Ids;
import com.vteba.utils.id.ObjectId;
import com.vteba.web.action.GenericAction;
import com.vteba.web.action.JsonBean;
import com.vteba.web.editer.DoubleEditor;
import com.vteba.web.editer.IntEditor;
import com.vteba.web.editer.LongEditor;
import com.vteba.web.editer.StringEditor;
import com.wocai.jrt.device.model.PosPad;
import com.wocai.jrt.device.service.spi.PosPadService;
import com.wocai.jrt.employee.model.Employee;
import com.wocai.jrt.employee.service.impl.EmployeeServiceImpl;
import com.wocai.jrt.investor.model.Investor;
import com.wocai.jrt.investor.service.spi.InvestorService;
import com.wocai.jrt.orders.bean.ProductBuyReqBean;
import com.wocai.jrt.orders.model.Orders;
import com.wocai.jrt.orders.service.spi.OrdersService;
import com.wocai.jrt.paper.model.Paper;
import com.wocai.jrt.paper.service.spi.PaperService;
import com.wocai.jrt.product.model.Product;
import com.wocai.jrt.product.model.ProductGrade;
import com.wocai.jrt.product.service.spi.ProductGradeService;
import com.wocai.jrt.product.service.spi.ProductService;
import com.wocai.jrt.utils.ImgType;
import com.wocai.jrt.utils.MyFileUtils;
import com.wocai.jrt.utils.SmsVerificationUtils;

/**
 * 购买流程控制器
 * 
 * @author linbaolu
 * @date 2015-9-1 19:26:12
 */
@Controller
@RequestMapping("/productBuy")
public class ProductBuyAction extends GenericAction<Orders> {

	// 任何上传文件/图片的地方都需要验证格式,没加的补上
	// private static final Pattern IMAGE =
	// Pattern.compile("^(.*)+.(jpg|jpeg|gif|png|bmp)$");
	// private static final Pattern FILE =
	// Pattern.compile("^(.*)+.(doc|pdf|txt|docx|xlsx|xls)$");
	private static final Logger LOGGER = LoggerFactory.getLogger(ProductBuyAction.class);

	@Inject
	private OrdersService ordersServiceImpl;
	@Inject
	private EmployeeServiceImpl employeeServiceImpl;
	@Inject
	private ProductService productServiceImpl;
	@Inject
	private InvestorService investorServiceImpl;
	@Inject
	private PosPadService posPadServiceImpl;
	@Inject
	private RedisService<String, String> redisService;// 存放短信验证码
	@Inject
	private PaperService paperServiceImpl;
	@Inject
	private ProductGradeService productGradeServiceImpl;

	@InitBinder
	protected void initBinder(WebDataBinder binder) {
		binder.registerCustomEditor(Date.class, new CustomDateEditor(new SimpleDateFormat(
				"yyyy-MM-dd"), true));
		binder.registerCustomEditor(int.class, new IntEditor());
		binder.registerCustomEditor(long.class, new LongEditor());
		binder.registerCustomEditor(double.class, new DoubleEditor());
		binder.registerCustomEditor(String.class, new StringEditor());
	}

	/***
	 * Step1: 产品确认(confirm)，调用获取产品详情接口 Step2_0: 填写客户信息 备注：这也是预约转订单的接口
	 */
	@ResponseBody
	@RequestMapping("/fullInvestInfo")
	public JsonBean fullInvestInfo(ProductBuyReqBean productBuyReqBean, Investor investor) {
		JsonBean jsonBean = null;

		try {
			// 发起请求的参数
			LOGGER.info("request fullInvestInfo, productBuyReqBean=[{}], investor=[{}]",
					JSON.toJSONString(productBuyReqBean), JSON.toJSONString(investor));

			// 判断入参的合法性
			jsonBean = checkParam(productBuyReqBean, investor);
			if (jsonBean.getCode() == 0) {
				LOGGER.error("request fullInvestInfo error caused by illegal parameter, msg=[{}]",
						jsonBean.getMessage());
				return jsonBean;
			}

			String mobile = investor.getMobile();
			String authCode = productBuyReqBean.getAuthCode();

			// 校验手机验证码，固话时绕过判断
			if (!Pattern.compile("[0]{1}[0-9]{2,3}[0-9]{7,8}$").matcher(mobile).matches()) {
				if (!SmsVerificationUtils.check(redisService, mobile,
						SmsVerificationUtils.INVESTOR_AUTH, authCode)) {
					jsonBean.setCode(0);
					jsonBean.setMessage("验证码错误！");
					LOGGER.error(
							"request fullInvestInfo error caused authCode is incorrect, authCode=[{}]",
							authCode);
					return jsonBean;
				}
			}

			// 查询手机投资人， 当investorId不为空时，需要根据id来更新非唯一项；反之新增
			Investor investorParam = new Investor();
			investorParam.setMobile(mobile);
			investorParam.setOrgId(investor.getOrgId());
			Investor iRecord = investorServiceImpl.unique(investorParam);

			if (StringUtils.isBlank(productBuyReqBean.getInvestorId()) && null != iRecord) {
				jsonBean.setCode(0);
				jsonBean.setMessage("投资人已存在，信息填写有误！");
				LOGGER.error("investor existed, not allowed to add");
				return jsonBean;
			}

			Paper pagerParam = new Paper();
			pagerParam.setOrgId(investor.getOrgId());
			pagerParam.setCurrent(true);
			Paper paper = paperServiceImpl.unique(pagerParam);
			if (iRecord == null) {

				// 如果投资人不存在，就插入
				jsonBean = investorServiceImpl.doAddInvestor(investor);
				if (jsonBean.getCode() == 0) {
					LOGGER.error("add investor failure, investorId=[{}]", investor.getId());
					return jsonBean;
				} else {
					LOGGER.info("add investor success, investorId=[{}]", investor.getId());
				}

				// 返回测评结果
				if (null != paper) {
					Map<String, Object> map = new HashMap<String, Object>();
					Product product = productServiceImpl.get(productBuyReqBean.getProductId());

					investor.setRiskPass(false);
					map.put("investor", investor);
					map.put("product", product);
					jsonBean.setCode(1);
					jsonBean.setData(map);
					LOGGER.info("new add investor need to risk test");
					return jsonBean;
				}
			} else {
				// 判断指派订单
				if (StringUtils.isNotBlank(productBuyReqBean.getOrderId())) {
					// 查询已存在订单
					Orders orderParam = new Orders();
					orderParam.setOrderId(productBuyReqBean.getOrderId());
					Orders orderRecord = ordersServiceImpl.unique(orderParam);
					if (StringUtils.isNotBlank(orderRecord.getAgentId())) {
						if (!orderRecord.getEmployeeId().equals(iRecord.getEmployeeId())) {
							jsonBean.setCode(0);
							jsonBean.setMessage("该投资人的理财师并非该订单的指派理财师！");
							LOGGER.error(
									"agentId is not current employeeId, agentId=[{}], employeeId",
									orderRecord.getAgentId(), productBuyReqBean.getEmployeeId());
							return jsonBean;
						}
					}
				} else if (!iRecord.getEmployeeId().equals(productBuyReqBean.getEmployeeId())) {
					jsonBean.setCode(0);
					jsonBean.setMessage("投资人是其他理财师的客户，请联系团队管理员进行协调！");
					LOGGER.error("this investor below to other employee");
					return jsonBean;
				}

				if (null != paper) {
					boolean riskPass = iRecord.getRiskPass();
					Date evaluationTime = iRecord.getEvaluationTime();
					Calendar cal = Calendar.getInstance();
					if (null != evaluationTime) {
						cal.setTime(evaluationTime);
					}
					cal.add(Calendar.YEAR, 1);

					// 测评不通过, 订单还不会创建
					if (!riskPass || cal.getTime().getTime() < System.currentTimeMillis()) {
						Map<String, Object> map = new HashMap<String, Object>();
						Product product = productServiceImpl.get(productBuyReqBean.getProductId());

						iRecord.setRiskPass(false);
						map.put("investor", iRecord);
						map.put("product", product);
						jsonBean.setCode(1);
						jsonBean.setData(map);
						LOGGER.info("update investor need to risk test which has not pass risk test");
						return jsonBean;
					}
				}

				// 如果存在，需要更新
				investor.setId(iRecord.getId());
				investor.setDeleted(false);

				if (StringUtils.isNotBlank(iRecord.getEmployeeId())) {
					investor.setEmployeeId(null);
				}
				investorServiceImpl.updateById(investor);
				LOGGER.info("update investor success");
			}

			String orderId = productBuyReqBean.getOrderId();
			String productId = productBuyReqBean.getProductId();
			String employeeId = productBuyReqBean.getEmployeeId();
			String bankDeposit = productBuyReqBean.getBankDeposit();
			String bankName = productBuyReqBean.getBankName();
			String bankAccount = productBuyReqBean.getBankAccount();

			// 查询购买的产品详情
			Product product = productServiceImpl.get(productId);

			// 查询理财师详情
			Employee employee = employeeServiceImpl.get(employeeId);
			Orders order;
			if (StringUtils.isBlank(orderId)) {

				// 没有订单，需要创建订单
				order = new Orders();
				order.setId(ObjectId.get().toString());
				order.setOrderTime(new Date());
				order.setOrderId(product.getProductCode().toUpperCase() + Ids.get().toString());
			} else {

				// 查询已存在订单
				Orders orderParam = new Orders();
				orderParam.setOrderId(orderId);
				order = ordersServiceImpl.unique(orderParam);
			}

			order.setInvestorId(investor.getId());
			order.setProductId(product.getId());
			order.setProductName(product.getProductName());
			order.setProductBriefName(product.getBriefName());
			// 缺少订单金额
			if (StringUtils.isBlank(order.getEmployeeId())) {
				order.setEmployeeId(employee.getEmployeeId());
				order.setEmployeeName(employee.getName());
			}

			// 缺少支付日期，padid，posid
			PosPad posPadParam = new PosPad();
			posPadParam.setEmployeeId(employeeId);
			PosPad posPad = posPadServiceImpl.unique(posPadParam);
			order.setPosId(posPad.getPosId());
			order.setPadId(posPad.getPadId());
			order.setOrgId(employee.getOrgId());
			order.setState(2); // 1已支付2未支付3已赎回4部分支付5已取消6已完成
			order.setBankDeposit(bankDeposit);
			order.setBankName(bankName);
			order.setBankAccount(bankAccount);

			order.setHandlingFee(product.getHandlingFee());
			order.setSubFee(product.getSubFee());

			// TODO
			// 根据employeeId查询设备更新orders设备
			if (StringUtils.isBlank(orderId)) {
				ordersServiceImpl.save(order);
				LOGGER.info("add order success");

				// 生成订单成功时,极光推送消息
				try {
					ordersServiceImpl.createOrderMessage(order);
				} catch (Exception e) {
					LOGGER.error("send jiguang error, error=[{}]", e.getMessage());
				}
			} else {
				ordersServiceImpl.updateById(order);
				LOGGER.info("update order success");
			}

			// 封装jsonBean
			jsonBean = getOrder(order.getOrderId());

		} catch (Exception e) {
			jsonBean.setCode(0);
			jsonBean.setMessage("请求填写用户信息失败！");
			LOGGER.error("request fullInvestInfo error, error=[{}]", e.getMessage());
		}

		return jsonBean;
	}

	private JsonBean getOrder(String orderId) {
		JsonBean bean = new JsonBean();

		Map<String, Object> map = new HashMap<String, Object>();

		// 获取订单信息，get方法被改了，其实不合理
		Orders order = ordersServiceImpl.get(orderId);

		// 查询并写入选择收益档次信息
		if (StringUtils.isNotBlank(order.getGradeId())) {
			ProductGrade pg = productGradeServiceImpl.get(order.getGradeId());
			order.setProductGrade(pg.getGrade());
			order.setProspectiveEarnings(pg.getProspectiveEarnings());
			order.setSubScopeStart(pg.getSubScopeStart());
			order.setSubScopeEnd(pg.getSubScopeEnd());
			order.setRemark(pg.getRemark());
		}

		// 获取产品信息
		Product product = productServiceImpl.get(order.getProductId());

		// 获取投资人信息
		Investor investor = investorServiceImpl.get(order.getInvestorId());
		map.put("order", order);
		map.put("product", product);

		investor.setRiskPass(true);
		map.put("investor", investor);
		bean.setCode(1);
		bean.setData(map);
		bean.setMessage("获取定单详情信息成功");
		return bean;
	}

	private JsonBean checkParam(ProductBuyReqBean productBuyReqBean, Investor investor) {
		JsonBean jsonBean = new JsonBean();
		String bankAccount = productBuyReqBean.getBankAccount();
		String bankDeposit = productBuyReqBean.getBankDeposit();
		String bankName = productBuyReqBean.getBankName();
		String employeeId = productBuyReqBean.getEmployeeId();
		String productId = productBuyReqBean.getProductId();
		String mobile = investor.getMobile();
		String idcard = investor.getIdcard();
		String investorName = investor.getName();

		if (StringUtils.isBlank(employeeId)) {
			jsonBean.setCode(0);
			jsonBean.setMessage("理财师id不能为空！");
			return jsonBean;
		}

		if (StringUtils.isBlank(productId)) {
			jsonBean.setCode(0);
			jsonBean.setMessage("产品id不能为空！");
			return jsonBean;
		}

		if (StringUtils.isBlank(bankAccount)) {
			jsonBean.setCode(0);
			jsonBean.setMessage("银行卡号不能为空！");
			return jsonBean;
		}

		if (StringUtils.isBlank(bankDeposit)) {
			jsonBean.setCode(0);
			jsonBean.setMessage("开户行不能为空！");
			return jsonBean;
		}

		if (StringUtils.isBlank(bankName)) {
			jsonBean.setCode(0);
			jsonBean.setMessage("开户名不能为空！");
			return jsonBean;
		}

		if (StringUtils.isBlank(mobile)) {
			jsonBean.setCode(0);
			jsonBean.setMessage("手机号或固话不能为空！");
			return jsonBean;
		}

		if (StringUtils.isBlank(idcard)) {
			jsonBean.setCode(0);
			jsonBean.setMessage("证件号不能为空！");
			return jsonBean;
		}

		if (StringUtils.isBlank(investorName)) {
			jsonBean.setCode(0);
			jsonBean.setMessage("投资人姓名不能为空！");
			return jsonBean;
		}

		jsonBean.setCode(1);
		return jsonBean;
	}

	/***
	 * Step2_1: 填写客户信息时，需要短信验证
	 * 
	 * @param mobile
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/sendSms")
	public JsonBean sendSms(String mobile) {
		JsonBean jsonBean = new JsonBean();
		try {

			LOGGER.info("request sendSms, mobile=[{}]", mobile);
			if (null != mobile) {
				boolean result = SmsVerificationUtils.sendSms(redisService, mobile,
						SmsVerificationUtils.INVESTOR_AUTH);
				if (result) {
					jsonBean.setCode(1);
					jsonBean.setMessage("发送成功！");
				} else {
					jsonBean.setCode(0);
					jsonBean.setMessage("发送失败！");
				}
			}

		} catch (Exception e) {
			jsonBean.setCode(0);
			jsonBean.setMessage("发送失败！");
			LOGGER.error("sendSms error.msg=[{}]", e.getMessage());
		}

		return jsonBean;
	}

	/***
	 * Step3: 上传身份证正反面 Step5: 上传投资人和理财师签名 Step7: 上传投资人和理财师确认签名
	 * 
	 * @RequestParam注解来指定表单上的file为MultipartFile
	 * @param file
	 * @param flag
	 *            1 - 正面，0 - 反面
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/uploadMultiFile")
	public JsonBean uploadMultiFile(HttpServletRequest request) {
		JsonBean jsonBean = new JsonBean();

		try {
			String orderId = request.getParameter("orderId");
			String tyPeString = request.getParameter("type");

			// type:0-身份证正反面,1-投资人签字,2-理财师签字
			Integer type = tyPeString == null ? null : Integer.valueOf(tyPeString);
			MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest) request;

			// 发起请求的参数
			LOGGER.info("request multi file upload, orderId=[{}], type=[{}]", orderId, type);

			// 判断订单id是否为空
			if (StringUtils.isBlank(orderId)) {
				jsonBean.setCode(0);
				jsonBean.setMessage("订单id不能为空！");
				LOGGER.error("orderId is required, orderId=[{}]", orderId);
				return jsonBean;
			}

			// 判断type是否越界
			if (type == null || (type != 0 && type != 1 && type != 2 && type != 3)) {
				jsonBean.setCode(0);
				jsonBean.setMessage("type错误！");
				LOGGER.error("out bound of type(0,1,2,3), type=[{}]", type);
				return jsonBean;
			}

			MultipartFile firstFile = multipartRequest.getFile("firstFile");
			MultipartFile secondFile = multipartRequest.getFile("secondFile");
			MultipartFile thirdFile = multipartRequest.getFile("thirdFile");
			String firstFilePath = null;
			String secondFilePath = null;
			String thirdFilePath=null;

			// 上传第一个文件
			if (null != firstFile) {

				// !=3，上传图片
				if (type != 3) {
					firstFilePath = MyFileUtils.uploadImg(firstFile, ImgType.ORDER);
				} else {
					firstFilePath = MyFileUtils.uploadFile(firstFile, MyFileUtils.VIDEO_TYPE);
				}

				LOGGER.info("upload first file success, firstFilePath=[{}], type=[{}]",
						firstFilePath, type);
			}

			// 上传第二个文件
			if (null != secondFile) {

				// !=3，上传图片
				if (type != 3) {
					secondFilePath = MyFileUtils.uploadImg(secondFile, ImgType.ORDER);
				} else {
					secondFilePath = MyFileUtils.uploadFile(secondFile, MyFileUtils.VIDEO_TYPE);
				}

				LOGGER.info("upload second file success, secondFilePath=[{}], type=[{}]",
						secondFilePath, type);
			}

			// 上传第三个文件
			if (null != thirdFile) {

				// ==0，上传银行卡图片
				if (type == 0) {
					thirdFilePath = MyFileUtils.uploadImg(thirdFile, ImgType.ORDER);
				}

				LOGGER.info("upload third file success, thirdFile=[{}], type=[{}]", thirdFile, type);
			}

			Orders order = new Orders();
			if (type == 0) {

				// 更新身份证正反面路径
				order.setIdcardFront(firstFilePath);
				order.setIdcardBack(secondFilePath);
				order.setBankCard(thirdFilePath);
			} else if (type == 1) {

				// 更新投资人签字路径
				order.setContactSignUser(firstFilePath);
			} else if (type == 2) {

				// 更新理财师签字路径
				order.setPaySignManager(firstFilePath);
			} else {
				order.setVideoUser(firstFilePath);
				order.setVideoManager(secondFilePath);
			}

			// 插入证件路径
			Orders condition = new Orders();
			condition.setOrderId(orderId);
			ordersServiceImpl.updateBulks(order, condition);
			LOGGER.info("update related file path success");

			// 封装jsonBean
			jsonBean = getOrder(orderId);
		} catch (Exception e) {
			jsonBean.setCode(0);
			jsonBean.setMessage("上传文件失败！");
			LOGGER.error("upload multi file error, error=[{}]", e.getMessage());
		}

		return jsonBean;
	}

	/***
	 * Step4_0: 获取订单金额 Step4_1: 更新订单金额，调用orders/update
	 * 
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/confirmOrderAmount")
	public JsonBean confirmOrderAmount(String orderId, Double orderAmount, String gradeId) {
		JsonBean jsonBean = new JsonBean();

		try {
			// 判断订单id是否传过来
			if (StringUtils.isBlank(orderId) || orderAmount == null || orderAmount <= 0) {
				jsonBean.setCode(0);
				jsonBean.setMessage("订单id或订单金额不能为空！");
				LOGGER.error("orderId/orderAmount is error");
				return jsonBean;
			}

			// 判断认购金额是否在所属产品档次范围之间
			if (StringUtils.isNotBlank(gradeId)) {
				ProductGrade productGrade = productGradeServiceImpl.get(gradeId);
				Double subScopeStart = productGrade.getSubScopeStart();
				Double subScopeEnd = productGrade.getSubScopeEnd();
				if (orderAmount < subScopeStart || orderAmount > subScopeEnd) {
					jsonBean.setCode(0);
					jsonBean.setMessage("请输入“" + (subScopeStart / 10000.0) + "万~"
							+ (subScopeEnd / 10000.0) + "万”之间的金额！");
					LOGGER.error("orderAmount out of subScope range, orderAmount=[{}]", orderAmount);
					return jsonBean;
				}

			}

			// 获取当前订单
			Orders ordersParam = new Orders();
			ordersParam.setOrderId(orderId);
			Orders order = ordersServiceImpl.unique(ordersParam);

			// 获取订单产品
			Product productRecord = productServiceImpl.get(order.getProductId());

			// 判断订单认购金额是否存在
			Double existOrderAmount = order.getOrderAmount();

			// 当已有认购金额不存在
			if (null == existOrderAmount) {

				// 当最新认购金额再正常范围，则直接更新此金额，同时扣除产品可认购金额
				if (orderAmount >= productRecord.getSubStart()
						&& orderAmount <= productRecord.getAvailable()) {

					// 更新当前订单
					Orders orderParam = new Orders();
					orderParam.setId(order.getId());
					orderParam.setOrderAmount(orderAmount);

					// 计算总金额
					Double otherFee = BigDecimalUtils.add(order.getHandlingFee(),
							BigDecimalUtils.multiply(orderAmount, order.getSubFee()));
					Double orderAllAmount = BigDecimalUtils.add(orderAmount, otherFee);
					orderParam.setOrderAllAmount(orderAllAmount);
					orderParam.setGradeId(gradeId);
					ordersServiceImpl.updateById(orderParam);
					LOGGER.info("confirmOrderAmount switch 1: update order success, orderId=[{}]",
							orderId);

					Product productParam = new Product();
					productParam.setId(order.getProductId());
					productParam.setAvailable(BigDecimalUtils.subtract(
							productRecord.getAvailable(), orderAmount));
					productServiceImpl.updateById(productParam);
					LOGGER.info(
							"confirmOrderAmount switch 1: update product success, productId=[{}]",
							order.getProductId());

					// 千万别再删了
					try {
						// 设置订单金额时为了极光推送
						order.setOrderAmount(orderAmount);

						// 确认认购金额时,极光推送消息
						ordersServiceImpl.comfirmAmountMessage(order);
					} catch (Exception e) {
						LOGGER.error("send jiguang error, msg = [{}]", e.getMessage());
					}
				} else {
					jsonBean.setCode(0);
					jsonBean.setMessage("orderAmount out range of (subStart,available)");
					LOGGER.error("orderAmount out range of (subStart,available)");
					return jsonBean;
				}
			} else {
				// 认购订单金额已经存在，先释放金额
				Double newAvailable = BigDecimalUtils.add(productRecord.getAvailable(),
						existOrderAmount);

				// 判断最新订单金额是否大于等于起购，小于等于释放后的产品可认购金额
				if (orderAmount >= productRecord.getSubStart() && orderAmount <= newAvailable) {

					// 更新当前订单金额
					Orders orderParam = new Orders();
					orderParam.setId(order.getId());
					orderParam.setOrderAmount(orderAmount);
					Double otherFee = BigDecimalUtils.add(order.getHandlingFee(),
							BigDecimalUtils.multiply(orderAmount, order.getSubFee()));
					Double orderAllAmount = BigDecimalUtils.add(orderAmount, otherFee);
					orderParam.setOrderAllAmount(orderAllAmount);
					orderParam.setGradeId(gradeId);
					ordersServiceImpl.updateById(orderParam);
					LOGGER.info("confirmOrderAmount switch 2: update order success, orderId=[{}]",
							orderId);

					// 更新产品可购买余额
					Product productParam = new Product();
					productParam.setId(order.getProductId());
					productParam.setAvailable(BigDecimalUtils.subtract(newAvailable, orderAmount));
					productServiceImpl.updateById(productParam);
					LOGGER.info(
							"confirmOrderAmount switch 2: update product success, productId=[{}]",
							order.getProductId());
				} else {
					jsonBean.setCode(0);
					jsonBean.setMessage("orderAmount out range of (subStart,available)");
					LOGGER.error("orderAmount out range of (subStart,available)");
					return jsonBean;
				}

			}

			// 封装jsonBean
			jsonBean = getOrder(order.getOrderId());

		} catch (Exception e) {
			jsonBean.setCode(0);
			jsonBean.setMessage("获取订单金额失败！");
			LOGGER.error("fetchOrderAmount error, error=[{}]", e.getMessage());
		}

		return jsonBean;
	}

	@ResponseBody
	@RequestMapping("/testCheckSms")
	public JsonBean testCheckSms(String mobile, String authCode) {
		JsonBean jsonBean = new JsonBean();

		try {
			// 发起请求的参数
			LOGGER.info("request testCheckSms, mobile=[{}],authCode=[{}]", mobile, authCode);

			// 判断手机验证的正确性
			if (!SmsVerificationUtils.check(redisService, mobile,
					SmsVerificationUtils.INVESTOR_AUTH, authCode)) {
				jsonBean.setCode(0);
				jsonBean.setMessage("authCode is incorrect");
				LOGGER.error("request testCheckSms error caused authCode is incorrect");
				return jsonBean;
			}

			jsonBean.setCode(1);
			jsonBean.setMessage(SUCCESS);

		} catch (Exception e) {
			LOGGER.error("request testCheckSms error, error=[{}]", e.getMessage());
			jsonBean.setCode(0);
			jsonBean.setMessage("request testCheckSms error");
		}

		return jsonBean;
	}
}
