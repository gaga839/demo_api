package com.wocai.jrt.orders.service.impl;

import java.io.File;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.crypto.SecretKey;
import javax.inject.Inject;
import javax.inject.Named;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.vteba.service.generic.impl.MyBatisServiceImpl;
import com.vteba.tx.jdbc.mybatis.spi.BaseDao;
import com.vteba.utils.common.BigDecimalUtils;
import com.vteba.utils.common.PropsUtils;
import com.vteba.utils.cryption.DESUtils;
import com.vteba.utils.id.ObjectId;
import com.vteba.web.action.JsonBean;
import com.wocai.jrt.employee.model.EmployeeCommissionHistory;
import com.wocai.jrt.employee.model.EmployeeGroup;
import com.wocai.jrt.employee.model.GroupMember;
import com.wocai.jrt.employee.model.Org;
import com.wocai.jrt.employee.service.spi.EmployeeCommissionHistoryService;
import com.wocai.jrt.employee.service.spi.EmployeeGroupService;
import com.wocai.jrt.employee.service.spi.GroupMemberService;
import com.wocai.jrt.employee.service.spi.OrgService;
import com.wocai.jrt.investor.model.Investor;
import com.wocai.jrt.investor.service.spi.InvestorService;
import com.wocai.jrt.message.model.PayMessage;
import com.wocai.jrt.orders.bean.EmployeeGroupAmountBean;
import com.wocai.jrt.orders.dao.PaySerialDao;
import com.wocai.jrt.orders.model.Orders;
import com.wocai.jrt.orders.model.PaySerial;
import com.wocai.jrt.orders.model.PaySerialBean;
import com.wocai.jrt.orders.service.spi.OrdersService;
import com.wocai.jrt.orders.service.spi.PaySerialService;
import com.wocai.jrt.product.bean.ProductReqBean;
import com.wocai.jrt.product.model.Product;
import com.wocai.jrt.product.service.spi.ProductService;
import com.wocai.jrt.utils.MessagePush;
import com.wocai.jrt.utils.MyFileUtils;
import com.wocai.jrt.utils.NumberToCNUtils;
import com.wocai.jrt.utils.WPS2PDFUtils;
import com.wocai.jrt.utils.WordFormatter;
import com.wocai.jrt.utils.WordUtils;

/**
 * 订单支付流水相关的service业务实现。
 * 
 * @author yinlei
 * @date 2015-7-27 19:32:12
 */
@Named
public class PaySerialServiceImpl extends MyBatisServiceImpl<PaySerial, PaySerialBean, String>
		implements PaySerialService {
	private static final Logger LOGGER = LoggerFactory.getLogger(PaySerialServiceImpl.class);

	private PaySerialDao paySerialDao;
	@Inject
	private OrdersService ordersServiceImpl;
	@Inject
	private EmployeeCommissionHistoryService employeeCommissionHistoryServiceImpl;
	@Inject
	private EmployeeGroupService employeeGroupServiceImpl;
	@Inject
	private GroupMemberService groupMemberServiceImpl;
	@Inject
	private ProductService productServiceImpl;
	@Inject
	private InvestorService investorServiceImpl;
	@Inject
	private OrgService orgServiceImpl;

	@Override
	@Inject
	public void setBaseDao(BaseDao<PaySerial, PaySerialBean, String> paySerialDao) {
		this.baseDao = paySerialDao;
		this.paySerialDao = (PaySerialDao) paySerialDao;
	}

	@Override
	public int getOrdersNumber(String employeeId, Date beginDate, Date endDate) {
		return paySerialDao.getOrdersNumber(employeeId, beginDate, endDate);
	}

	@Override
	public Double getOrdersAmount(String employeeId, Date beginDate, Date endDate) {
		return paySerialDao.getOrdersAmount(employeeId, beginDate, endDate);
	}

	@Override
	public Double getOrdersMost(String employeeId, Date beginDate, Date endDate) {
		return paySerialDao.getOrdersMost(employeeId, beginDate, endDate);
	}

	@Override
	public List<EmployeeGroupAmountBean> queryEmployeeGroupAmountList(String employeeId,
			Date beginDate, Date endDate) {
		return paySerialDao.queryEmployeeGroupAmountList(employeeId, beginDate, endDate);
	}

	@Override
	public synchronized JsonBean callback(PaySerial paySerial, String tokenId) throws Exception {
		// 验证参数的合法性
		JsonBean jsonBean = validParam(paySerial, tokenId);
		if (jsonBean.getCode() == 0) {
			return jsonBean;
		} else {
			LOGGER.info("step 1: valid pay callback parameter success");
		}

		// 获取订单数据
		String orderId = paySerial.getOrderId();
		Orders orderParam = new Orders();
		orderParam.setOrderId(orderId);
		Orders order = ordersServiceImpl.unique(orderParam);
		if (order.getState() == 6) {
			jsonBean.setCode(0);
			jsonBean.setMessage("订单已完成，无需再支付！");
			LOGGER.error("order is paied, orderId = [{}]", orderId);
			return jsonBean;
		}

		// 插入支付流水
		paySerial.setId(ObjectId.get().toString());
		paySerial.setOrderId(orderId);
		paySerial.setInvestorId(order.getInvestorId());
		paySerial.setEmployeeId(order.getEmployeeId());

		// pay_serial支付失败时不传
		paySerial.setBankDeposit(order.getBankDeposit());
		paySerial.setBankAccount(order.getBankAccount());
		paySerial.setBankName(order.getBankName());
		paySerial.setOrgId(order.getOrgId());
		paySerialDao.save(paySerial);
		LOGGER.info("step 2: add paySerial success, paySerialId=[{}]", paySerial.getId());

		// 更新订单，包括状态,支付失败不需要更新
		if (paySerial.getState() == 1) {
			Orders orderRecord = new Orders();
			orderRecord.setId(order.getId());
			orderRecord.setPayTime(paySerial.getPayTime());
			LOGGER.info("step 3.1: set order id/payTime success, orderId=[{}], payTime=[{}]",
					orderId, paySerial.getPayTime());

			// 刷新已支付字段
			Double oldPaidAmount = order.getPaidAmount();
			Double newPaidAmount = paySerial.getPayAmount();
			Double paidAmount = (null == oldPaidAmount) ? newPaidAmount : BigDecimalUtils.add(
					oldPaidAmount, newPaidAmount);
			orderRecord.setPaidAmount(paidAmount);
			LOGGER.info("step 3.2: set order paidAmount success, orderId = [{}], paidAmount=[{}]",
					orderId, paidAmount);

			// 其他费用等于认购费+手续费
			Double orderAllAmount = order.getOrderAllAmount();

			if (null == orderAllAmount) {
				jsonBean.setCode(0);
				jsonBean.setMessage("订单总金额为空，请根据订单id查看数据！");
				LOGGER.error("orderAllAmount is null, orderId = [{}]", orderId);
				return jsonBean;
			}

			// 1已支付2未支付3已赎回4部分支付5已取消6已完成
			Integer state = order.getState();
			if (paidAmount == 0) {
				state = 2;
			} else if (paidAmount < orderAllAmount) {
				state = 4;
			} else if (paidAmount >= orderAllAmount) {
				state = 6;

				if (StringUtils.isBlank(order.getPaySignUser())) {
					try {
						// 生成电子合同
						String contactFileWithSign = createContact(orderId);
						orderRecord.setPaySignUser(contactFileWithSign);
						LOGGER.info("createContact success, contactFileWithSign=[{}]",
								contactFileWithSign);

						// 插入佣金历史表
						createCommission(orderId);
						LOGGER.info("createCommission success, orderId=[{}]", orderId);

						// 生成风险揭示书
						String userRiskDisclosure = createRiskDisclosure(orderId);
						LOGGER.info("create userRiskDisclosure success, userRiskDisclosure=[{}]",
								userRiskDisclosure);

						// Pad端投资人签订合同成功,提醒投后APP用户
						ordersServiceImpl.createContractMessage(orderId);
						LOGGER.info("send jiguang success");
					} catch (Exception e) {
						LOGGER.error("createContact/send jiguang/createCommission error, msg=[{}]",
								e.getMessage());
					}
				}

			}
			orderRecord.setState(state);
			orderRecord.setPayMethod(1);
			LOGGER.info("step 3.3: set order state success, orderId = [{}], state=[{}]", orderId,
					state);

			ordersServiceImpl.updateById(orderRecord);
			LOGGER.info("step 3: update order success, orderId = [{}]", orderId);

			try {
				// Pad端pos机刷卡支付成功,向投后APP用户推送消息,TODO
				ordersServiceImpl.paymentSucceedMessage(orderId, newPaidAmount);
				LOGGER.info("step 4.1: paymentSucceedMessage success, orderId = [{}]", orderId);
			} catch (Exception e) {
				LOGGER.error("paymentSucceedMessage error, error=[{}]", e.getMessage());
			}

			try {
				// 发送通知，通知pad
				PayMessage payMessage = new PayMessage();
				payMessage.setType("0");
				payMessage.setState(String.valueOf(paySerial.getState()));
				payMessage.setAlias(order.getEmployeeId());
				sendPayMessage(payMessage);
				LOGGER.info("step 4.2: sendPayMessage success, orderId = [{}]", orderId);
			} catch (Exception e) {
				LOGGER.error("sendPayMessage error, error=[{}]", e.getMessage());
			}
		} else {
			LOGGER.info("step 3: pay failure, paySerialId=[{}]", paySerial.getId());
		}

		jsonBean.setCode(1);
		return jsonBean;
	}

	private JsonBean validParam(PaySerial paySerial, String tokenId) {
		JsonBean jsonBean = new JsonBean();

		// 验证tokenId
		String raw = "55ec3040f2def095bc4e66f3&1441542208470";

		// String tokenId =
		// "jG8MJPZFG_tQ77YKbsz7WR7abxEpb2CAqnmBQad-cgC8diabq_mxxQ";
		SecretKey key = DESUtils.genDesedeKey("asdfjklajsaddddduiyuyu24");
		byte[] iv = { 98, -1, 78, 22, 1, -32, -101, 3 };
		String decryptTokenId = DESUtils.desedeDecrypt(tokenId, key, iv);
		if (StringUtils.isBlank(tokenId) || !raw.equals(decryptTokenId)) {
			jsonBean.setCode(0);
			jsonBean.setMessage("tokenId错误！");
			LOGGER.error("tokenId is mistake,tokenId=[{}]", tokenId);
			return jsonBean;
		}

		// 验证orderId
		String orderId = paySerial.getOrderId();
		if (StringUtils.isBlank(orderId)) {
			jsonBean.setCode(0);
			jsonBean.setMessage("orderId不能为空！");
			LOGGER.error("orderId is null");
			return jsonBean;
		} else {
			Orders orderParam = new Orders();
			orderParam.setOrderId(orderId);
			int count = ordersServiceImpl.countBy(orderParam);
			if (count == 0) {
				jsonBean.setCode(0);
				jsonBean.setMessage("orderId错误，订单不存在！");
				LOGGER.error("orderId is mistake, orderId=[{}]", orderId);
				return jsonBean;
			}
		}

		// 验证payAmount
		Double payAmount = paySerial.getPayAmount();
		if (payAmount == null || payAmount < 0) {
			jsonBean.setCode(0);
			jsonBean.setMessage("payAmount不能为空或小于0！");
			LOGGER.error("payAmount is null or < 0, payAmount=[{}]", payAmount);
			return jsonBean;
		}

		// 验证state
		Integer state = paySerial.getState();
		if (state == null) {
			jsonBean.setCode(0);
			jsonBean.setMessage("state不能为空！");
			LOGGER.error("state is null");
			return jsonBean;
		}

		// 验证payTime
		Date payTime = paySerial.getPayTime();
		if (payTime == null) {
			jsonBean.setCode(0);
			jsonBean.setMessage("payTime不能为空！");
			LOGGER.error("payTime is null");
			return jsonBean;
		}

		// 验证paySerial
		String _paySerial = paySerial.getPaySerial();
		if (state == 1 && StringUtils.isBlank(_paySerial)) {
			jsonBean.setCode(0);
			jsonBean.setMessage("支付成功时，paySerial不能为空！");
			LOGGER.error("paySerial is required when pay success, state=[{}]", state);
			return jsonBean;
		}

		if (StringUtils.isNotBlank(_paySerial)) {
			PaySerial psParam = new PaySerial();
			psParam.setPaySerial(_paySerial);
			int count = paySerialDao.countBy(psParam);
			if (count > 0) {
				jsonBean.setCode(0);
				jsonBean.setMessage("paySerial已经存在！");
				LOGGER.error("paySerial existed, not need callback again");
				return jsonBean;
			}
		}

		jsonBean.setCode(1);
		return jsonBean;
	}

	private void sendPayMessage(PayMessage payMessage) {
		try {
			// 极光向接收人推送消息
			MessagePush messagePush = new MessagePush(null);
			messagePush.sendPayMessage(payMessage);
		} catch (Exception e) {
			LOGGER.error("send pay message error" + e.getMessage());
		}
	}

	private void createCommission(String orderId) {
		try {
			Orders orderParam = new Orders();
			orderParam.setOrderId(orderId);
			Orders _order = ordersServiceImpl.unique(orderParam);

			String employeeId = _order.getEmployeeId();

			// 获取产品详情
			ProductReqBean productReqBean = new ProductReqBean();
			productReqBean.setProductId(_order.getProductId());
			productReqBean.setEmployeeId(employeeId);
			Product productDetail = productServiceImpl.getDetail(productReqBean);

			// 判断是否为团队长
			EmployeeGroup egParam = new EmployeeGroup();
			egParam.setEmployeeId(employeeId);
			egParam.setDeleted(false);
			EmployeeGroup employeeGroup = employeeGroupServiceImpl.unique(egParam);

			EmployeeCommissionHistory employeeCommissionHistory = new EmployeeCommissionHistory();
			employeeCommissionHistory.setId(ObjectId.get().toString());
			employeeCommissionHistory.setOrderId(orderId);
			employeeCommissionHistory.setProductId(_order.getProductId());
			employeeCommissionHistory.setCommissionRate(productDetail.getCommissionRate());
			employeeCommissionHistory.setCommission(BigDecimalUtils.multiply(
					_order.getOrderAmount(), productDetail.getCommissionRate()));
			employeeCommissionHistory.setEmployeeId(employeeId);
			employeeCommissionHistory.setCreateTime(new Date());

			if (null != employeeGroup) {
				employeeCommissionHistory.setDividendRate(productDetail.getDividendRate());
				employeeCommissionHistory.setDividend(BigDecimalUtils.multiply(
						_order.getOrderAmount(), productDetail.getDividendRate()));
			} else {

				// 不是团队长，也要插入团队长的提成
				String teamleaderEmId = null;
				try {
					GroupMember gmParam = new GroupMember();
					gmParam.setEmployeeId(employeeId);
					String groupId = groupMemberServiceImpl.unique(gmParam).getGroupId();

					teamleaderEmId = employeeGroupServiceImpl.get(groupId).getEmployeeId();
				} catch (Exception e) {
					LOGGER.error(
							"employee existed multi group error/employee not existed a group error, msg = [{}]",
							e.getMessage());
				}

				if (null != teamleaderEmId) {
					ProductReqBean productReqBean1 = new ProductReqBean();
					productReqBean1.setProductId(_order.getProductId());
					productReqBean1.setEmployeeId(teamleaderEmId);
					Product productDetail1 = productServiceImpl.getDetail(productReqBean1);

					EmployeeCommissionHistory teamleaderECH = new EmployeeCommissionHistory();
					teamleaderECH.setId(ObjectId.get().toString());
					teamleaderECH.setOrderId(orderId);
					teamleaderECH.setProductId(_order.getProductId());
					teamleaderECH.setEmployeeId(teamleaderEmId);
					teamleaderECH.setCreateTime(new Date());

					teamleaderECH.setDividendRate(productDetail1.getDividendRate());
					teamleaderECH.setDividend(BigDecimalUtils.multiply(_order.getOrderAmount(),
							productDetail1.getDividendRate()));
					teamleaderECH.setState(0);
					employeeCommissionHistoryServiceImpl.save(teamleaderECH);
					LOGGER.info(
							"save employee's teamleader divedend success, teamleaderEmployeeId = [{}]",
							teamleaderEmId);
				}
			}

			employeeCommissionHistory.setState(0);
			employeeCommissionHistoryServiceImpl.save(employeeCommissionHistory);
			LOGGER.info("save employee's commission/devidend success, employeeId = [{}]",
					employeeId);
		} catch (Exception e) {
			LOGGER.error("create commission failure, msg=[{}]", e.getMessage());
		}
	}

	private String createContact(String orderId) throws Exception {
		Orders orderParam = new Orders();
		orderParam.setOrderId(orderId);
		Orders order = ordersServiceImpl.unique(orderParam);

		Investor investor = investorServiceImpl.get(order.getInvestorId());
		Product product = productServiceImpl.get(order.getProductId());

		// 产品合同原件
		String contactPath = product.getContactFile();

		// 用户（投资人）各自合并签名后的合同路径
		String userContactPath = null;
		if (!StringUtils.isBlank(contactPath)) {
			if (contactPath.toLowerCase().endsWith(".docx")) {

				Map<String, String> map = new HashMap<String, String>();
				WordFormatter wf = new WordFormatter();

				// 生成订单合同编号，规则产品合同前缀+日期（yyyyMMdd）+6位产品递增数
				String contactNum = createContactNum(product.getContactNum());
				String orderContactNum = product.getContactPrefix()
						+ new SimpleDateFormat("yyyyMMdd").format(new Date()) + contactNum;
				LOGGER.info("create order contact number success, orderContactNum=[{}]",
						orderContactNum);

				// 订单合同编号
				wf.setContractNumber(orderContactNum);
				wf.setInvestorName(investor.getName());

				// 投资人签名，这里是图片路径
				String investorSignName = PropsUtils.get("images.url") + order.getContactSignUser();
				wf.setInvestorSignName(investorSignName);
				LOGGER.info("set investorSign path success, investorSignPath=[{}]",
						investorSignName);

				// 签单时间
				String signTime = new SimpleDateFormat("yyyy年MM月dd日").format(new Date());
				wf.setSignTime(signTime);
				LOGGER.info("create signTime success, signTime=[{}]", signTime);

				// 投资金额
				double orderAmount = order.getOrderAmount();
				DecimalFormat format = new DecimalFormat("#,##0.00");
				wf.setAmount(format.format(orderAmount));

				// 投资金额大写
				wf.setAmountToCN(NumberToCNUtils.number2CNMontrayUnit(BigDecimal
						.valueOf(orderAmount)));
				LOGGER.info("set orderAmount success, orderAmount=[{}]", orderAmount);

				// 证件号
				wf.setIDCard(investor.getIdcard());

				// 通信地址
				wf.setAddress(investor.getAddress());

				// 联系电话，模板占位符区分大小写，且不允许带字符格式
				wf.setPhone(investor.getMobile());

				// 邮件
				wf.setEmail(investor.getEmail());

				// 开户行
				wf.setBankName(order.getBankDeposit());

				// 开户名
				wf.setAccountName(order.getBankName());

				// 银行帐（卡）号
				wf.setBankAccount(order.getBankAccount());

				// 通过类反射机制生成替换占位符的map数据
				Field[] fields = wf.getClass().getDeclaredFields();
				for (Field field : fields) {
					field.setAccessible(true);
					String fieldValue = String.valueOf(field.get(wf));
					if (!"null".equals(fieldValue)) {
						map.put(field.getName(), fieldValue);
					} else {
						map.put(field.getName(), "");
					}

					System.out.println(field.getName() + ": " + fieldValue);
				}
				map.put("[", "");
				map.put("]", "");

				// 生成中间文件路径，中间文件不会被删除，作为备份
				String filename = new File(contactPath).getName();
				String docxPath = MyFileUtils.getFilePath(filename, MyFileUtils.DOC_TYPE);

				// 生成中间文件，即替换占位符生成新的docx文件，注：contactPath带占位符合同路径，docxPath替换后中间文件路径
				WordUtils.searchAndReplace(contactPath, docxPath, map);
				LOGGER.info("replace contact file success, contactPath=[{}], docxPath=[{}]",
						contactPath, docxPath);

				// 生成最终的pdf文件路径
				userContactPath = MyFileUtils.getFilePath(
						filename.replace(".docx", wf.getContractNumber() + ".pdf"),
						MyFileUtils.PDF_TYPE);

				// 生成最终的pdf文件，即将中间文件docx转换成pdf文件即可,userContactPath:目标文件路径
				WPS2PDFUtils.word2PDF(docxPath, userContactPath);
				LOGGER.info("convert word to pdf success, docxPath=[{}], userContactPath=[{}]",
						docxPath, userContactPath);

				// 更新产品合同数字
				Product productParam = new Product();
				String productId = product.getId();
				productParam.setId(productId);
				productParam.setContactNum(contactNum);
				productServiceImpl.updateById(productParam);
				LOGGER.info("update product contactNum success,  productId=[{}], contactNum=[{}]",
						productId, contactNum);

				// 更新订单合同编号
				Orders orderData = new Orders();

				// 这里不是orderId而是id
				orderData.setId(order.getId());
				orderData.setContactNum(orderContactNum);
				ordersServiceImpl.updateById(orderData);
				LOGGER.info(
						"update order orderContactNum success,  orderId=[{}], orderContactNum=[{}]",
						orderId, orderContactNum);
			} else {
				LOGGER.error("not support other file format but docx, userContactPath=[{}]",
						userContactPath);
			}
		}

		return userContactPath;
	}

	private String createContactNum(String code) {
		int num = StringUtils.isBlank(code) ? 0 : Integer.valueOf(code);
		num++;
		code = String.valueOf(num);
		int leng = code.length();
		if (leng == 1) {
			code = "00000" + num;
		} else if (leng == 2) {
			code = "0000" + num;
		} else if (leng == 3) {
			code = "000" + num;
		} else if (leng == 4) {
			code = "00" + num;
		} else if (leng == 5) {
			code = "0" + num;
		}

		return code;
	}

	private String createRiskDisclosure(String orderId) throws Exception {
		// 获取订单详情
		Orders orderParam = new Orders();
		orderParam.setOrderId(orderId);
		Orders order = ordersServiceImpl.unique(orderParam);

		// 获取机构详情
		Org org = orgServiceImpl.get(order.getOrgId());

		// 风险揭示书原件
		String riskDisclosure = org.getRiskDisclosure();

		// 用户（投资人）各自合并签名后的揭示书路径
		String userRiskDisclosure = null;
		if (!StringUtils.isBlank(riskDisclosure)) {
			if (riskDisclosure.toLowerCase().endsWith(".docx")) {

				Map<String, String> map = new HashMap<String, String>();

				// 基金全称
				map.put("FundFullName", order.getProductName());

				// 投资人签名，这里是图片路径
				String investorSignName = PropsUtils.get("images.url") + order.getContactSignUser();
				map.put("InvestorSignName", investorSignName);
				LOGGER.info("set investorSign path success, investorSignPath=[{}]",
						investorSignName);

				// 签单时间
				String signTime = new SimpleDateFormat("yyyy年MM月dd日").format(new Date());
				map.put("SignTime", signTime);
				LOGGER.info("create signTime success, signTime=[{}]", signTime);

				map.put("[", "");
				map.put("]", "");

				// 生成中间文件路径，中间文件不会被删除，作为备份
				String filename = new File(riskDisclosure).getName();
				String docxPath = MyFileUtils.getFilePath(filename, MyFileUtils.DOC_TYPE);

				// 生成中间文件，即替换占位符生成新的docx文件，注：contactPath带占位符合同路径，docxPath替换后中间文件路径
				WordUtils.searchAndReplace(riskDisclosure, docxPath, map);
				LOGGER.info("replace contact file success, contactPath=[{}], docxPath=[{}]",
						riskDisclosure, docxPath);

				String investorName = investorServiceImpl.get(order.getInvestorId()).getName();
				
				// 生成最终的pdf文件路径
				userRiskDisclosure = MyFileUtils.getFilePath(
						filename.replace(".docx", "_【" + investorName + "】.pdf"),
						MyFileUtils.PDF_TYPE);

				// 生成最终的pdf文件，即将中间文件docx转换成pdf文件即可,userContactPath:目标文件路径
				WPS2PDFUtils.word2PDF(docxPath, userRiskDisclosure);
				LOGGER.info("convert word to pdf success, docxPath=[{}], userContactPath=[{}]",
						docxPath, userRiskDisclosure);

				// 更新订单合同编号
				Orders orderData = new Orders();

				// 这里不是orderId而是id
				orderData.setId(order.getId());
				orderData.setRiskDisclosure(userRiskDisclosure);
				ordersServiceImpl.updateById(orderData);
				LOGGER.info(
						"update order orderContactNum success,  orderId=[{}], userRiskDisclosure=[{}]",
						orderId, userRiskDisclosure);
			} else {
				LOGGER.error("not support other file format but docx, userContactPath=[{}]",
						userRiskDisclosure);
			}
		}

		return userRiskDisclosure;
	}
	// public static void main(String[] args) {
	// PayMessage payMessage = new PayMessage();
	// payMessage.setType("0");
	// payMessage.setState("1");
	// payMessage.setAlias("56217e2618646c91eca67c");
	// new PayAction().sendPayMessage(payMessage);
	// }
}
