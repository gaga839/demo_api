package com.wocai.jrt.product.action;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.vteba.web.action.GenericAction;
import com.vteba.web.action.JsonBean;
import com.vteba.web.editer.StringEditor;
import com.wocai.jrt.orders.bean.EmailSendReqBean;
import com.wocai.jrt.orders.model.Orders;
import com.wocai.jrt.orders.service.spi.OrdersService;
import com.wocai.jrt.product.model.Product;
import com.wocai.jrt.product.model.ProductAttachment;
import com.wocai.jrt.product.service.spi.ProductAttachmentService;
import com.wocai.jrt.product.service.spi.ProductService;
import com.wocai.jrt.utils.EmailUtils;

/**
 * 产品附件控制器
 * 
 * @author linbaolu
 * @date 2015-7-24 13:32:08
 */
@Controller
@RequestMapping("/productAttachment")
public class ProductAttachmentAction extends GenericAction<ProductAttachment> {
	private static final Logger LOGGER = LoggerFactory.getLogger(ProductAttachmentAction.class);

	@Inject
	private ProductAttachmentService productAttachmentServiceImpl;
	@Inject
	private ProductService productServiceImpl;
	@Inject
	private OrdersService ordersServiceImpl;

	@InitBinder
	protected void initBinder(WebDataBinder binder) {
		// 空字符串转换为null
		binder.registerCustomEditor(String.class, new StringEditor());
	}

	/**
	 * 获得产品附件List，Json格式。
	 * 
	 * @param model
	 *            参数
	 * @return 产品附件List
	 */
	@ResponseBody
	@RequestMapping("/list")
	public JsonBean list(String productId) {
		JsonBean jsonBean = new JsonBean();

		try {
			LOGGER.info("request product attachment list, productId=[{}]", productId);

			// productId是必传的
			if (StringUtils.isBlank(productId)) {
				jsonBean.setCode(0);
				jsonBean.setMessage("产品id不能为空！");
				LOGGER.error("productId is required, productId = [{}]", productId);
				return jsonBean;
			}

			// 查询产品相关附件列表
			ProductAttachment paParam = new ProductAttachment();
			paParam.setProductId(productId);
			List<ProductAttachment> list = productAttachmentServiceImpl.queryList(paParam);
			LOGGER.info("query product attachment list success, size=[{}]", list.size());

			jsonBean.setCode(1);
			jsonBean.setData(list);
			jsonBean.setMessage(SUCCESS);

		} catch (Exception e) {
			jsonBean.setCode(0);
			jsonBean.setMessage("获取产品附件失败！");
			LOGGER.error("fetch product attachment list error, error=[{}]", e.getMessage());
		}

		return jsonBean;
	}

	@ResponseBody
	@RequestMapping("/sendEmail")
	public JsonBean sendEmail(EmailSendReqBean emailSendReqBean) {
		JsonBean jsonBean = new JsonBean();

		try {
			LOGGER.info("request product attachment sendEmail, emailSendReqBean=[{}]",
					JSON.toJSONString(emailSendReqBean));

			String email = emailSendReqBean.getEmail();
			String title = emailSendReqBean.getTitle();
			String content = emailSendReqBean.getContent();
			List<String> ids = emailSendReqBean.getIds();
			String productId = emailSendReqBean.getProductId();
			if (StringUtils.isBlank(productId)) {
				jsonBean.setCode(0);
				jsonBean.setMessage("产品id不能为空！");
				LOGGER.error("productId is required");
				return jsonBean;
			}

			if (StringUtils.isBlank(email)) {
				jsonBean.setCode(0);
				jsonBean.setMessage("邮箱地址不能为空！");
				LOGGER.error("email is required");
				return jsonBean;
			}

			if (ids == null || ids.size() == 0) {
				jsonBean.setCode(0);
				jsonBean.setMessage("至少选择一个相关文件！");
				LOGGER.error("ids is required");
				return jsonBean;
			}

			Product product = productServiceImpl.get(productId);
			if (StringUtils.isBlank(title)) {
				title = product.getBriefName() + "的介绍";
			}

			if (StringUtils.isBlank(content)) {
				content = product.getBriefName() + "的介绍，请查收！";
			}

			// 查询产品相关附件列表
			ProductAttachment paParam = new ProductAttachment();
			paParam.setProductId(productId);
			List<ProductAttachment> list = productAttachmentServiceImpl.queryList(paParam);

			List<File> affix = new ArrayList<File>();
			if (list != null) {
				for (ProductAttachment pa : list) {
					if (ids.contains(pa.getId())) {
						affix.add(new File(pa.getFilePath()));
					}
				}
			}

			EmailUtils se = new EmailUtils(true);
			se.doSendHtmlEmail(title, content, email, affix);

			LOGGER.info("sendEmail product attachment success");

			jsonBean.setCode(1);
			jsonBean.setMessage("发送成功！");

		} catch (Exception e) {
			jsonBean.setCode(0);
			jsonBean.setMessage("发送相关文件失败！");
			LOGGER.error("sendEmail product attachment error, error=[{}]", e.getMessage());
		}

		return jsonBean;
	}

	@ResponseBody
	@RequestMapping("/sendContactEmail")
	public JsonBean sendContactEmail(EmailSendReqBean emailSendReqBean) {
		JsonBean jsonBean = new JsonBean();

		try {
			LOGGER.info("request product sendContactEmail, emailSendReqBean=[{}]",
					JSON.toJSONString(emailSendReqBean));

			String email = emailSendReqBean.getEmail();
			String title = emailSendReqBean.getTitle();
			String content = emailSendReqBean.getContent();
			String orderId = emailSendReqBean.getOrderId();
			if (StringUtils.isBlank(orderId)) {
				jsonBean.setCode(0);
				jsonBean.setMessage("订单id不能为空！");
				LOGGER.error("orderId is required");
				return jsonBean;
			}

			if (StringUtils.isBlank(email)) {
				jsonBean.setCode(0);
				jsonBean.setMessage("邮箱地址不能为空！");
				LOGGER.error("email is required");
				return jsonBean;
			}
			Orders orderParam = new Orders();
			orderParam.setOrderId(orderId);
			Orders order = ordersServiceImpl.unique(orderParam);

			Product product = productServiceImpl.get(order.getProductId());
			if (StringUtils.isBlank(title)) {
				title = product.getBriefName() + "产品基金合同";
			}

			if (StringUtils.isBlank(content)) {
				content = "您购买的" + product.getBriefName() + "产品的基金合同，请查收！";
			}

			List<File> affix = new ArrayList<File>();
			affix.add(new File(order.getPaySignUser()));

			EmailUtils se = new EmailUtils(true);
			se.doSendHtmlEmail(title, content, email, affix);

			LOGGER.info("sendContactEmail success");

			jsonBean.setCode(1);
			jsonBean.setMessage("发送成功！");

		} catch (Exception e) {
			LOGGER.error("sendContactEmail error, error=[{}]", e.getMessage());
			jsonBean.setCode(0);
			jsonBean.setMessage("发送失败！");
		}

		return jsonBean;
	}
}
