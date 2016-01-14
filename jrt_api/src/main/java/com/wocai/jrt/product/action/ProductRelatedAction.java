package com.wocai.jrt.product.action;

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

import com.vteba.web.action.GenericAction;
import com.vteba.web.action.JsonBean;
import com.vteba.web.editer.StringEditor;
import com.wocai.jrt.product.bean.ProductResBean;
import com.wocai.jrt.product.model.ProductRelated;
import com.wocai.jrt.product.service.spi.ProductRelatedService;

/**
 * 产品的相关产品控制器
 * 
 * @author linbaolu
 * @date 2015-7-24 13:32:08
 */
@Controller
@RequestMapping("/productRelated")
public class ProductRelatedAction extends GenericAction<ProductRelated> {
	private static final Logger LOGGER = LoggerFactory.getLogger(ProductRelatedAction.class);

	@Inject
	private ProductRelatedService productRelatedServiceImpl;

	@InitBinder
	protected void initBinder(WebDataBinder binder) {
		// 空字符串转换为null
		binder.registerCustomEditor(String.class, new StringEditor());
	}

	/**
	 * 获得产品的相关产品List，Json格式。
	 * 
	 * @param model
	 *            参数
	 * @return 产品的相关产品List
	 */
	@ResponseBody
	@RequestMapping("/list")
	public JsonBean list(String productId, Integer page, Integer pageSize) {
		JsonBean jsonBean = new JsonBean();

		try {
			LOGGER.info("request product related list, productId=[{}]", productId);

			// productId是必传的
			if (StringUtils.isBlank(productId)) {
				jsonBean.setCode(0);
				jsonBean.setMessage("产品id不能为空！");
				LOGGER.error("productId is required, productId = [{}]", productId);
				return jsonBean;
			}

			// 查询产品相关产品列表
			ProductRelated prParam = new ProductRelated();
			prParam.setProductId(productId);

			if (null == pageSize) {

				// pageSize不传默认是10
				pageSize = 10;
			}

			if (null != page) {
				prParam.setStart(page * pageSize);
				prParam.setPageSize(pageSize);
			}
			
			List<ProductResBean> list = productRelatedServiceImpl.getProductRelatedList(prParam);
			LOGGER.info("query product related list success, size=[{}]", list.size());

			jsonBean.setCode(1);
			jsonBean.setData(list);
			jsonBean.setMessage(SUCCESS);

		} catch (Exception e) {
			jsonBean.setCode(0);
			jsonBean.setMessage("获取产品相关列表失败！");
			LOGGER.error("fetch product related list error, error=[{}]", e.getMessage());
		}

		return jsonBean;
	}
}
