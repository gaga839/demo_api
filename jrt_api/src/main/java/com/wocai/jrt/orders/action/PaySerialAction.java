package com.wocai.jrt.orders.action;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.vteba.utils.id.ObjectId;
import com.vteba.web.action.GenericAction;
import com.vteba.web.action.JsonBean;
import com.vteba.web.editer.DoubleEditor;
import com.vteba.web.editer.IntEditor;
import com.vteba.web.editer.LongEditor;
import com.vteba.web.editer.StringEditor;
import com.wocai.jrt.orders.model.PaySerial;
import com.wocai.jrt.orders.service.spi.PaySerialService;

/**
 * 订单支付流水控制器
 * 
 * @author linbaolu
 * @date 2015-7-27 19:32:12
 */
@Controller
@RequestMapping("/paySerial")
public class PaySerialAction extends GenericAction<PaySerial> {
	private static final Logger LOGGER = LoggerFactory.getLogger(PaySerialAction.class);
	@Inject
	private PaySerialService paySerialServiceImpl;

	@InitBinder
	protected void initBinder(WebDataBinder binder) {
		binder.registerCustomEditor(Date.class, new CustomDateEditor(new SimpleDateFormat(
				"yyyy-MM-dd"), true));
		binder.registerCustomEditor(int.class, new IntEditor());
		binder.registerCustomEditor(long.class, new LongEditor());
		binder.registerCustomEditor(double.class, new DoubleEditor());
		binder.registerCustomEditor(String.class, new StringEditor());
	}

	/**
	 * 获得订单支付流水List，初始化列表页。
	 * 
	 * @param model
	 *            参数
	 * @return 订单支付流水List
	 */
	@RequestMapping("/initial")
	public String initial(PaySerial model, Map<String, Object> maps) {
		List<PaySerial> list = paySerialServiceImpl.pagedList(model);
		maps.put("list", list);
		return "paySerial/initial";
	}

	/**
	 * 获得订单支付流水List，Json格式。
	 * 
	 * @param model
	 *            参数
	 * @return 订单支付流水List
	 */
	@ResponseBody
	@RequestMapping("/list")
	public JsonBean list(PaySerial model, Integer page) {
		JsonBean jsonBean = new JsonBean();

		try {
			// 发起请求的参数,以后直接用AOP代替
			LOGGER.info("request paySerial list, param=[{}]", JSON.toJSONString(model));

			// 员工id是必传的
			String orderId = model.getOrderId();
			if (StringUtils.isBlank(orderId)) {
				jsonBean.setCode(0);
				jsonBean.setMessage("orderId is required");
				LOGGER.error("orderId is required, orderId = [{}]", orderId);
				return jsonBean;
			}

			if (null != page) {
				model.setStart(page * model.getPageSize());
			}

			List<PaySerial> list = paySerialServiceImpl.pagedList(model);
			jsonBean.setCode(1);
			jsonBean.setData(list);
			jsonBean.setMessage(SUCCESS);
			LOGGER.error("request paySerial list success, size = [{}]", null != list ? list.size()
					: 0);
		} catch (Exception e) {
			LOGGER.error("request paySerial lis error, error=[{}]", e.getMessage());
			jsonBean.setCode(0);
			jsonBean.setMessage("request paySerial lis error");
		}

		return jsonBean;

	}

	/**
	 * 根据Id获得订单支付流水实体，Json格式。
	 * 
	 * @param id
	 *            参数id
	 * @return 订单支付流水实体
	 */
	@ResponseBody
	@RequestMapping("/get")
	public PaySerial get(String id) {
		PaySerial model = paySerialServiceImpl.get(id);
		return model;
	}

	/**
	 * 跳转到新增页面
	 * 
	 * @return 新增页面逻辑视图
	 */
	@RequestMapping("/add")
	public String add() {
		return "paySerial/add";
	}

	/**
	 * 执行实际的新增操作
	 * 
	 * @param model
	 *            要新增的数据
	 * @return 新增页面逻辑视图
	 */
	@ResponseBody
	@RequestMapping("/doAdd")
	public JsonBean doAdd(PaySerial model) {
		JsonBean bean = new JsonBean();
		try {
			model.setId(ObjectId.get().toString());
			int result = paySerialServiceImpl.save(model);
			if (result == 1) {
				bean.setMessage(SUCCESS);
			} else {
				bean.setCode(0);
				bean.setMessage(ERROR);
			}
			return bean;
		} catch (Exception e) {
			LOGGER.error("paySerial add error,msg=[{}].", e.getMessage());
			bean.setCode(0);
			bean.setMessage("paySerial add error");
			return bean;
		}

	}

	/**
	 * 查看订单支付流水详情页。
	 * 
	 * @param model
	 *            查询参数，携带ID
	 * @return 订单支付流水详情页
	 */
	@RequestMapping("/detail")
	public String detail(PaySerial model, Map<String, Object> maps) {
		model = paySerialServiceImpl.get(model.getId());
		maps.put("model", model);// 将model放入视图中，供页面视图使用
		return "paySerial/detail";
	}

	/**
	 * 跳转到编辑信息页面
	 * 
	 * @param model
	 *            查询参数，携带ID
	 * @return 编辑页面
	 */
	@RequestMapping("/edit")
	public String edit(PaySerial model, Map<String, Object> maps) {
		model = paySerialServiceImpl.get(model.getId());
		maps.put("model", model);
		return "paySerial/edit";
	}

	/**
	 * 更新订单支付流水信息
	 * 
	 * @param model
	 *            要更新的订单支付流水信息，含有ID
	 * @return 操作结果信息
	 */
	@ResponseBody
	@RequestMapping("/update")
	public JsonBean update(PaySerial model) {
		int result = paySerialServiceImpl.updateById(model);
		JsonBean bean = new JsonBean();
		if (result == 1) {
			bean.setMessage(SUCCESS);
		} else {
			bean.setCode(1);
			bean.setMessage(ERROR);
		}
		return bean;
	}

	/**
	 * 删除订单支付流水信息
	 * 
	 * @param id
	 *            要删除的订单支付流水ID
	 */
	@ResponseBody
	@RequestMapping("/delete")
	public JsonBean delete(String id) {
		int result = paySerialServiceImpl.deleteById(id);
		JsonBean bean = new JsonBean();
		if (result == 1) {
			bean.setMessage(SUCCESS);
		} else {
			bean.setCode(1);
			bean.setMessage(ERROR);
		}
		return bean;
	}
}
