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
import com.wocai.jrt.product.model.ProductAchieve;
import com.wocai.jrt.product.model.ProductNet;
import com.wocai.jrt.product.service.spi.ProductNetService;

/**
 * 产品业绩控制器
 * 
 * @author linbaolu
 * @date 2015-7-24 13:32:08
 */
@Controller
@RequestMapping("/productAchieve")
public class ProductAchieveAction extends GenericAction<ProductAchieve> {
	private static final Logger LOGGER = LoggerFactory.getLogger(ProductAchieveAction.class);

	@Inject
	private ProductNetService productNetServiceImpl;

	@InitBinder
	protected void initBinder(WebDataBinder binder) {
		// 空字符串转换为null
		binder.registerCustomEditor(String.class, new StringEditor());
	}

	/**
	 * 根据Id获得产品业绩实体，Json格式。
	 * 
	 * @param id
	 *            参数id
	 * @return 产品业绩实体
	 */
	@ResponseBody
	@RequestMapping("/get")
	public JsonBean get(String productId, Integer page, Integer pageSize) {
		JsonBean jsonBean = new JsonBean();

		try {
			// 入参log, pageSize不传默认是10
			LOGGER.info("request product achieve, productId = [{}], page = [{}], pageSize = [{}]",
					productId, page, pageSize);

			// productId是必传的
			if (StringUtils.isBlank(productId)) {
				jsonBean.setCode(0);
				jsonBean.setMessage("产品id不能为空！");
				LOGGER.error("productId is required, productId = [{}]", productId);
				return jsonBean;
			}

			// 查询产品净值表
			ProductNet pnParam = new ProductNet();
			pnParam.setProductId(productId);
			if (null == pageSize) {

				// pageSize不传默认是10
				pageSize = 10;
			}

			if (null != page) {
				pnParam.setStart(page * pageSize);
				pnParam.setPageSize(pageSize);
			}

			pnParam.setOrderBy("date desc");
			List<ProductNet> productNetList = productNetServiceImpl.queryList(pnParam);
			LOGGER.info("query product net list success, size=[{}]", productNetList.size());

			jsonBean.setCode(1);
			jsonBean.setData(productNetList);
			jsonBean.setMessage(SUCCESS);

		} catch (Exception e) {
			jsonBean.setCode(0);
			jsonBean.setMessage("获取产品净值失败！");
			LOGGER.error("fetch product achieve error, error=[{}]", e.getMessage());
		}

		return jsonBean;
	}

}
