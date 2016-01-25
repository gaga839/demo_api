package com.wocai.jrt.employee.action;

import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wocai.jrt.employee.model.Org;
import com.wocai.jrt.employee.service.spi.OrgService;

import com.vteba.web.action.GenericAction;
import com.vteba.web.action.JsonBean;

/**
 * 机构控制器
 * 
 * @author yinlei
 * @date 2015-9-8 10:18:19
 */
@Controller
@RequestMapping("/org")
public class OrgAction extends GenericAction<Org> {
	private static final Logger LOGGER = LoggerFactory.getLogger(OrgAction.class);

	@Inject
	private OrgService orgServiceImpl;

	/**
	 * 获得机构List，初始化列表页。
	 * 
	 * @param model
	 *            参数
	 * @return 机构List
	 */
	@RequestMapping("/initial")
	public String initial(Org model, Map<String, Object> maps) {
		try {
			List<Org> list = orgServiceImpl.pagedList(model);
			maps.put("list", list);
		} catch (Exception e) {
			LOGGER.error("get record list error, errorMsg=[{}].", e.getMessage());
			return "common/error";
		}
		return "org/initial";
	}

	/**
	 * 获得机构List，Json格式。
	 * 
	 * @param model
	 *            参数
	 * @return 机构List
	 */
	@ResponseBody
	@RequestMapping("/list")
	public List<Org> list(Org model) {
		List<Org> list = null;
		try {
			list = orgServiceImpl.pagedList(model);
		} catch (Exception e) {
			LOGGER.error("get record list error, errorMsg=[{}].", e.getMessage());
		}
		return list;
	}

	/**
	 * 根据Id获得机构实体，Json格式。
	 * 
	 * @param id
	 *            参数id
	 * @return 机构实体
	 */
	@ResponseBody
	@RequestMapping("/get")
	public JsonBean get(String id) {
		JsonBean jsonBean = new JsonBean();
		try {
			Org model = orgServiceImpl.get(id);
			jsonBean.setCode(1);
			jsonBean.setData(model);
			jsonBean.setMessage(SUCCESS);
		} catch (Exception e) {
			jsonBean.setCode(0);
			jsonBean.setMessage("获取风险揭示书失败！");
			LOGGER.error("get record error, errorMsg=[{}].", e.getMessage());
		}
		return jsonBean;
	}

	/**
	 * 跳转到新增页面
	 * 
	 * @return 新增页面逻辑视图
	 */
	@RequestMapping("/add")
	public String add() {
		return "org/add";
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
	public JsonBean doAdd(Org model) {
		JsonBean bean = new JsonBean();
		try {
			int result = orgServiceImpl.save(model);
			if (result == 1) {
				bean.setMessage(SUCCESS);
				bean.setCode(1);
				LOGGER.info("save record success.");
			} else {
				bean.setMessage(ERROR);
				LOGGER.error("save record error.");
			}
		} catch (Exception e) {
			LOGGER.error("save record error, errorMsg=[{}].", e.getMessage());
			bean.setMessage(ERROR);
		}
		return bean;
	}

	/**
	 * 查看机构详情页。
	 * 
	 * @param model
	 *            查询参数，携带ID
	 * @return 机构详情页
	 */
	@RequestMapping("/detail")
	public String detail(Org model, Map<String, Object> maps) {
		try {
			model = orgServiceImpl.get(model.getId());
			maps.put("model", model);// 将model放入视图中，供页面视图使用
		} catch (Exception e) {
			LOGGER.error("query record detail, errorMsg=[{}].", e.getMessage());
			return "common/error";
		}
		return "org/detail";
	}

	/**
	 * 跳转到编辑信息页面
	 * 
	 * @param model
	 *            查询参数，携带ID
	 * @return 编辑页面
	 */
	@RequestMapping("/edit")
	public String edit(Org model, Map<String, Object> maps) {
		model = orgServiceImpl.get(model.getId());
		maps.put("model", model);
		return "org/edit";
	}

	/**
	 * 更新机构信息
	 * 
	 * @param model
	 *            要更新的机构信息，含有ID
	 * @return 操作结果信息
	 */
	@ResponseBody
	@RequestMapping("/update")
	public JsonBean update(Org model) {
		JsonBean bean = new JsonBean();
		try {
			int result = orgServiceImpl.updateById(model);
			if (result == 1) {
				bean.setMessage(SUCCESS);
				bean.setCode(1);
				LOGGER.info("update record success.");
			} else {
				bean.setMessage(ERROR);
				LOGGER.error("update record error.");
			}
		} catch (Exception e) {
			LOGGER.error("update record error, errorMsg=[{}].", e.getMessage());
			bean.setMessage(ERROR);
		}
		return bean;
	}

	/**
	 * 删除机构信息
	 * 
	 * @param id
	 *            要删除的机构ID
	 */
	@ResponseBody
	@RequestMapping("/delete")
	public JsonBean delete(String id) {
		JsonBean bean = new JsonBean();
		try {
			int result = orgServiceImpl.deleteById(id);
			if (result == 1) {
				bean.setMessage(SUCCESS);
				bean.setCode(1);
				LOGGER.info("delete record success, id=[{}].", id);
			} else {
				bean.setMessage(ERROR);
				LOGGER.error("delete record error.");
			}
		} catch (Exception e) {
			LOGGER.error("delete record error, id=[{}], errorMsg=[{}].", id, e.getMessage());
			bean.setMessage(ERROR);
		}
		return bean;
	}
}
