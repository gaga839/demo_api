package com.wocai.jrt.orders.action;

import java.io.File;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.alibaba.fastjson.JSON;
import com.vteba.utils.common.PropsUtils;
import com.vteba.utils.id.ObjectId;
import com.vteba.web.action.GenericAction;
import com.vteba.web.action.JsonBean;
import com.wocai.jrt.investor.model.Investor;
import com.wocai.jrt.investor.service.spi.InvestorService;
import com.wocai.jrt.orders.model.Orders;
import com.wocai.jrt.orders.model.PayTypeAudit;
import com.wocai.jrt.orders.model.Voucher;
import com.wocai.jrt.orders.service.spi.OrdersService;
import com.wocai.jrt.orders.service.spi.PayTypeAuditService;
import com.wocai.jrt.orders.service.spi.VoucherService;
import com.wocai.jrt.product.model.Product;
import com.wocai.jrt.product.service.spi.ProductService;
import com.wocai.jrt.utils.ImgType;
import com.wocai.jrt.utils.MyFileUtils;
import com.wocai.jrt.utils.NumberToCNUtils;
import com.wocai.jrt.utils.WPS2PDFUtils;
import com.wocai.jrt.utils.WordFormatter;
import com.wocai.jrt.utils.WordUtils;

/**
 * 支付方式申请审核控制器
 * 
 * @author linbaolu
 * @date 2015-12-16 17:56:47
 */
@Controller
@RequestMapping("/payTypeAudit")
public class PayTypeAuditAction extends GenericAction<PayTypeAudit> {
	private static final Logger LOGGER = LoggerFactory.getLogger(PayTypeAuditAction.class);

	@Inject
	private PayTypeAuditService payTypeAuditServiceImpl;
	@Inject
	private OrdersService ordersServiceImpl;
	@Inject
	private VoucherService voucherServiceImpl;
	@Inject
	private ProductService productServiceImpl;
	@Inject
	private InvestorService investorServiceImpl;

	/**
	 * 执行实际的新增操作
	 * 
	 * @param model
	 *            要新增的数据
	 * @return 新增页面逻辑视图
	 */
	@ResponseBody
	@RequestMapping("/apply")
	public JsonBean apply(PayTypeAudit model) {
		JsonBean bean = new JsonBean();
		try {
			LOGGER.info("apply for other pay way, param=[{}]", JSON.toJSONString(model));

			if (StringUtils.isBlank(model.getOrderId())) {
				bean.setCode(0);
				bean.setMessage("订单id不能为空！");
				LOGGER.error("orderId is required.");
			}

			if (StringUtils.isBlank(model.getEmployeeId())) {
				bean.setCode(0);
				bean.setMessage("理财师id不能为空！");
				LOGGER.error("employeeId is required.");
			}

			if (StringUtils.isBlank(model.getEmployeeName())) {
				bean.setCode(0);
				bean.setMessage("理财师姓名不能为空！");
				LOGGER.error("employeeName is required.");
			}

			model.setId(ObjectId.get().toString());
			model.setApplyTime(new Date());
			int result = payTypeAuditServiceImpl.save(model);
			if (result == 1) {
				bean.setCode(1);
				bean.setMessage("申请成功！");
				LOGGER.info("save record success, payTypeAuditId=[{}]", model.getId());

				Orders data = new Orders();
				data.setOfflineAudit(1);

				Orders condition = new Orders();
				condition.setOrderId(model.getOrderId());
				ordersServiceImpl.updateBulks(data, condition);
				LOGGER.info("update order offlineAudit success, orderId=[{}]", model.getOrderId());
			} else {
				bean.setCode(0);
				bean.setMessage("申请失败！");
				LOGGER.error("save record error.");
			}
		} catch (Exception e) {
			bean.setCode(0);
			bean.setMessage("申请失败！");
			LOGGER.error("save record error, errorMsg=[{}].", e.getMessage());
		}
		return bean;
	}

	/**
	 * 执行实际的新增操作
	 * 
	 * @param model
	 *            要新增的数据
	 * @return 新增页面逻辑视图
	 */
	@ResponseBody
	@RequestMapping("/get")
	public JsonBean get(String orderId) {
		JsonBean bean = new JsonBean();
		try {
			LOGGER.info("get other pay way, orderId=[{}]", orderId);

			if (StringUtils.isBlank(orderId)) {
				bean.setCode(0);
				bean.setMessage("订单id不能为空！");
				LOGGER.error("orderId is required.");
			}

			Orders orderParam = new Orders();
			orderParam.setOrderId(orderId);

			Orders order = ordersServiceImpl.unique(orderParam);
			bean.setCode(1);
			bean.setData(order);
			bean.setMessage("获取申请结果成功！");
			LOGGER.info("get other pay way success.");
		} catch (Exception e) {
			LOGGER.error("get other pay way error, errorMsg=[{}].", e.getMessage());
			bean.setMessage("获取申请结果失败！");
		}
		return bean;
	}

	@ResponseBody
	@RequestMapping("/uploadMultiFile")
	public JsonBean uploadMultiFile(HttpServletRequest request) {
		JsonBean jsonBean = new JsonBean();

		try {
			String orderId = request.getParameter("orderId");
			String payMethod = request.getParameter("payMethod");

			MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest) request;
			List<MultipartFile> vouchers = (List<MultipartFile>) multipartRequest
					.getFiles("voucher");

			LOGGER.info("request uploadMultiFile, orderId=[{}], payMethod=[{}]", orderId, payMethod);

			if (StringUtils.isBlank(orderId)) {
				jsonBean.setCode(0);
				jsonBean.setMessage("订单id不能为空！");
				LOGGER.error("orderId is required.");
				return jsonBean;
			}

			Orders orderParam = new Orders();
			orderParam.setOrderId(orderId);
			Orders order = ordersServiceImpl.unique(orderParam);

			if (StringUtils.isBlank(payMethod)) {
				jsonBean.setCode(0);
				jsonBean.setMessage("支付方式不能为空！");
				LOGGER.error("payMethod is required.");
				return jsonBean;
			}

			if (null == vouchers || vouchers.size() == 0 || vouchers.size() > 5) {
				jsonBean.setCode(0);
				jsonBean.setMessage("支付凭证1-5张！");
				LOGGER.error("voucher size is 1-5.");
				return jsonBean;
			}

			Voucher voucherParam = new Voucher();
			voucherParam.setOrderId(orderId);
			int clearSize = voucherServiceImpl.deleteBulks(voucherParam);
			LOGGER.info("clear voucher by orderId success, orderId=[{}], clearSize=[{}]", orderId,
					clearSize);

			for (MultipartFile voucher : vouchers) {
				String voucherFilePath = MyFileUtils.uploadImg(voucher, ImgType.ORDER);

				Voucher voucherImage = new Voucher();
				voucherImage.setId(ObjectId.get().toString());
				voucherImage.setOrderId(orderId);
				voucherImage.setOrgId(order.getOrderId());
				voucherImage.setEmployeeId(order.getEmployeeId());
				voucherImage.setFilePath(voucherFilePath);
				voucherImage.setCreateTime(new Date());
				voucherServiceImpl.save(voucherImage);
			}
			LOGGER.info("upload voucher success, size=[{}]", vouchers.size());

			Orders data = new Orders();
			data.setId(order.getId());
			data.setUploadVoucher(true);
			data.setOfflinePay(true);
			data.setPayTime(new Date());
			data.setPaidAmount(order.getOrderAllAmount());
			data.setPayMethod(Integer.parseInt(payMethod));
			data.setState(1);// 已支付

			if (StringUtils.isBlank(order.getPaySignUser())) {
				try {

					// 生成电子合同
					String contactFileWithSign = createContact(orderId);
					data.setPaySignUser(contactFileWithSign);
					LOGGER.info("createContact success, contactFileWithSign=[{}]",
							contactFileWithSign);

					// Pad端投资人签订合同成功,提醒投后APP用户
					ordersServiceImpl.createContractMessage(orderId);
					LOGGER.info("send jiguang success");
				} catch (Exception e) {
					LOGGER.error("createContact/send jiguang error, msg=[{}]", e.getMessage());
				}
			}

			ordersServiceImpl.updateById(data);
			LOGGER.info("update order success, orderId=[{}]", orderId);

			jsonBean.setCode(1);
			jsonBean.setMessage("上传凭证成功！");

		} catch (Exception e) {
			jsonBean.setCode(0);
			jsonBean.setMessage("上传凭证失败！");
			LOGGER.error("request uploadMultiFile error, msg=[{}]", e.getMessage());
		}

		return jsonBean;
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

}
