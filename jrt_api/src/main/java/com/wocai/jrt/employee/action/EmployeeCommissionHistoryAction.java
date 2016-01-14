package com.wocai.jrt.employee.action;

import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wocai.jrt.employee.model.EmployeeCommissionHistory;
import com.wocai.jrt.employee.service.spi.EmployeeCommissionHistoryService;

import com.vteba.web.action.GenericAction;
import com.vteba.web.action.JsonBean;

/**
 * 员工历史佣金控制器
 * @author yinlei
 * @date 2015-7-24 11:23:25
 */
@Controller
@RequestMapping("/employeeCommissionHistory")
public class EmployeeCommissionHistoryAction extends GenericAction<EmployeeCommissionHistory> {
	private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeCommissionHistoryAction.class);
	
	@Inject
	private EmployeeCommissionHistoryService employeeCommissionHistoryServiceImpl;
	
	/**
     * 获得员工历史佣金List，初始化列表页。
     * @param model 参数
     * @return 员工历史佣金List
     */
    @RequestMapping("/initial")
    public String initial(EmployeeCommissionHistory model, Map<String, Object> maps) {
    	try {
    		List<EmployeeCommissionHistory> list = employeeCommissionHistoryServiceImpl.pagedList(model);
            maps.put("list", list);
		} catch (Exception e) {
			LOGGER.error("get record list error, errorMsg=[{}].", e.getMessage());
			return "common/error";
		}
        return "employeeCommissionHistory/initial";
    }
	
	/**
	 * 获得员工历史佣金List，Json格式。
	 * @param model 参数
	 * @return 员工历史佣金List
	 */
	@ResponseBody
	@RequestMapping("/list")
	public List<EmployeeCommissionHistory> list(EmployeeCommissionHistory model) {
		List<EmployeeCommissionHistory> list = null;
		try {
			list = employeeCommissionHistoryServiceImpl.pagedList(model);
		} catch (Exception e) {
			LOGGER.error("get record list error, errorMsg=[{}].", e.getMessage());
		}
		return list;
	}
	
	/**
     * 根据Id获得员工历史佣金实体，Json格式。
     * @param id 参数id
     * @return 员工历史佣金实体
     */
    @ResponseBody
    @RequestMapping("/get")
    public EmployeeCommissionHistory get(String id) {
    	EmployeeCommissionHistory model = null;
    	try {
    		model = employeeCommissionHistoryServiceImpl.get(id);
		} catch (Exception e) {
			LOGGER.error("get record error, errorMsg=[{}].", e.getMessage());
		}
        return model;
    }
	
	/**
     * 跳转到新增页面
     * @return 新增页面逻辑视图
     */
    @RequestMapping("/add")
    public String add() {
        return "employeeCommissionHistory/add";
    }
    
    /**
     * 执行实际的新增操作
     * @param model 要新增的数据
     * @return 新增页面逻辑视图
     */
    @ResponseBody
    @RequestMapping("/doAdd")
    public JsonBean doAdd(EmployeeCommissionHistory model) {
    	JsonBean bean = new JsonBean();
    	try {
    		int result = employeeCommissionHistoryServiceImpl.save(model);
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
     * 查看员工历史佣金详情页。
     * @param model 查询参数，携带ID
     * @return 员工历史佣金详情页
     */
    @RequestMapping("/detail")
    public String detail(EmployeeCommissionHistory model, Map<String, Object> maps) {
    	try {
    		model = employeeCommissionHistoryServiceImpl.get(model.getId());
            maps.put("model", model);//将model放入视图中，供页面视图使用
		} catch (Exception e) {
			LOGGER.error("query record detail, errorMsg=[{}].", e.getMessage());
			return "common/error";
		}
        return "employeeCommissionHistory/detail";
    }
    
    /**
     * 跳转到编辑信息页面
     * @param model 查询参数，携带ID
     * @return 编辑页面
     */
    @RequestMapping("/edit")
    public String edit(EmployeeCommissionHistory model, Map<String, Object> maps) {
        model = employeeCommissionHistoryServiceImpl.get(model.getId());
        maps.put("model", model);
        return "employeeCommissionHistory/edit";
    }
    
    /**
     * 更新员工历史佣金信息
     * @param model 要更新的员工历史佣金信息，含有ID
     * @return 操作结果信息
     */
    @ResponseBody
    @RequestMapping("/update")
    public JsonBean update(EmployeeCommissionHistory model) {
    	JsonBean bean = new JsonBean();
    	try {
    		int result = employeeCommissionHistoryServiceImpl.updateById(model);
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
     * 删除员工历史佣金信息
     * @param id 要删除的员工历史佣金ID
     */
    @ResponseBody
    @RequestMapping("/delete")
    public JsonBean delete(String id) {
    	JsonBean bean = new JsonBean();
    	try {
    		int result = employeeCommissionHistoryServiceImpl.deleteById(id);
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
