package com.wocai.jrt.customer.action;

import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.vteba.web.action.GenericAction;
import com.vteba.web.action.JsonBean;
import com.wocai.jrt.customer.model.Customer;
import com.wocai.jrt.customer.service.spi.CustomerService;

/**
 * 投后用户控制器
 * @author yinlei
 * @date 2015-11-24 9:56:20
 */
@Controller
@RequestMapping("/customer")
public class CustomerAction extends GenericAction<Customer> {
	private static final Logger LOGGER = LoggerFactory.getLogger(CustomerAction.class);
	@Inject
	private CustomerService customerServiceImpl;
	
	/**
     * 获得投后用户List，初始化列表页。
     * @param model 参数
     * @return 投后用户List
     */
    @RequestMapping("/initial")
    public String initial(Customer model, Map<String, Object> maps) {
    	try {
    		List<Customer> list = customerServiceImpl.pagedList(model);
            maps.put("list", list);
		} catch (Exception e) {
			LOGGER.error("get record list error, errorMsg=[{}].", e.getMessage());
			return "common/error";
		}
        return "customer/initial";
    }
	
	/**
	 * 获得投后用户List，Json格式。
	 * @param model 参数
	 * @return 投后用户List
	 */
	@ResponseBody
	@RequestMapping("/list")
	public List<Customer> list(Customer model) {
		List<Customer> list = null;
		try {
			list = customerServiceImpl.pagedList(model);
		} catch (Exception e) {
			LOGGER.error("get record list error, errorMsg=[{}].", e.getMessage());
		}
		return list;
	}
	
	/**
     * 根据Id获得投后用户实体，Json格式。
     * @param id 参数id
     * @return 投后用户实体
     */
    @ResponseBody
    @RequestMapping("/get")
    public Customer get(String id) {
    	Customer model = null;
    	try {
    		model = customerServiceImpl.get(id);
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
        return "customer/add";
    }
    
    /**
     * 执行实际的新增操作
     * @param model 要新增的数据
     * @return 新增页面逻辑视图
     */
    @ResponseBody
    @RequestMapping("/doAdd")
    public JsonBean doAdd(Customer model) {
    	JsonBean bean = new JsonBean();
    	try {
    		int result = customerServiceImpl.save(model);
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
     * 查看投后用户详情页。
     * @param model 查询参数，携带ID
     * @return 投后用户详情页
     */
    @RequestMapping("/detail")
    public String detail(Customer model, Map<String, Object> maps) {
    	try {
    		model = customerServiceImpl.get(model.getId());
            maps.put("model", model);//将model放入视图中，供页面视图使用
		} catch (Exception e) {
			LOGGER.error("query record detail, errorMsg=[{}].", e.getMessage());
			return "common/error";
		}
        return "customer/detail";
    }
    
    /**
     * 跳转到编辑信息页面
     * @param model 查询参数，携带ID
     * @return 编辑页面
     */
    @RequestMapping("/edit")
    public String edit(Customer model, Map<String, Object> maps) {
        model = customerServiceImpl.get(model.getId());
        maps.put("model", model);
        return "customer/edit";
    }
    
    /**
     * 更新投后用户信息
     * @param model 要更新的投后用户信息，含有ID
     * @return 操作结果信息
     */
    @ResponseBody
    @RequestMapping("/update")
    public JsonBean update(Customer model) {
    	JsonBean bean = new JsonBean();
    	try {
    		int result = customerServiceImpl.updateById(model);
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
     * 删除投后用户信息
     * @param id 要删除的投后用户ID
     */
    @ResponseBody
    @RequestMapping("/delete")
    public JsonBean delete(String id) {
    	JsonBean bean = new JsonBean();
    	try {
    		int result = customerServiceImpl.deleteById(id);
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
