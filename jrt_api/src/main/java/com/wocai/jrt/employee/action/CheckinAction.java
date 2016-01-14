package com.wocai.jrt.employee.action;

import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wocai.jrt.employee.model.Checkin;
import com.wocai.jrt.employee.service.spi.CheckinService;

import com.vteba.web.action.GenericAction;
import com.vteba.web.action.JsonBean;

/**
 * 签到控制器
 * @author yinlei
 * @date 2015-8-17 16:11:01
 */
@Controller
@RequestMapping("/checkin")
public class CheckinAction extends GenericAction<Checkin> {
	private static final Logger LOGGER = LoggerFactory.getLogger(CheckinAction.class);
	
	@Inject
	private CheckinService checkinServiceImpl;
	
	/**
     * 获得签到List，初始化列表页。
     * @param model 参数
     * @return 签到List
     */
    @RequestMapping("/initial")
    public String initial(Checkin model, Map<String, Object> maps) {
    	try {
    		List<Checkin> list = checkinServiceImpl.pagedList(model);
            maps.put("list", list);
		} catch (Exception e) {
			LOGGER.error("get record list error, errorMsg=[{}].", e.getMessage());
			return "common/error";
		}
        return "checkin/initial";
    }
	
	/**
	 * 获得签到List，Json格式。
	 * @param model 参数
	 * @return 签到List
	 */
	@ResponseBody
	@RequestMapping("/list")
	public List<Checkin> list(Checkin model) {
		List<Checkin> list = null;
		try {
			list = checkinServiceImpl.pagedList(model);
		} catch (Exception e) {
			LOGGER.error("get record list error, errorMsg=[{}].", e.getMessage());
		}
		return list;
	}
	
	/**
     * 根据Id获得签到实体，Json格式。
     * @param id 参数id
     * @return 签到实体
     */
    @ResponseBody
    @RequestMapping("/get")
    public Checkin get(String id) {
    	Checkin model = null;
    	try {
    		model = checkinServiceImpl.get(id);
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
        return "checkin/add";
    }
    
    /**
     * 执行实际的新增操作
     * @param model 要新增的数据
     * @return 新增页面逻辑视图
     */
    @ResponseBody
    @RequestMapping("/doAdd")
    public JsonBean doAdd(Checkin model) {
    	JsonBean bean = new JsonBean();
    	try {
    		int result = checkinServiceImpl.save(model);
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
     * 查看签到详情页。
     * @param model 查询参数，携带ID
     * @return 签到详情页
     */
    @RequestMapping("/detail")
    public String detail(Checkin model, Map<String, Object> maps) {
    	try {
    		model = checkinServiceImpl.get(model.getId());
            maps.put("model", model);//将model放入视图中，供页面视图使用
		} catch (Exception e) {
			LOGGER.error("query record detail, errorMsg=[{}].", e.getMessage());
			return "common/error";
		}
        return "checkin/detail";
    }
    
    /**
     * 跳转到编辑信息页面
     * @param model 查询参数，携带ID
     * @return 编辑页面
     */
    @RequestMapping("/edit")
    public String edit(Checkin model, Map<String, Object> maps) {
        model = checkinServiceImpl.get(model.getId());
        maps.put("model", model);
        return "checkin/edit";
    }
    
    /**
     * 更新签到信息
     * @param model 要更新的签到信息，含有ID
     * @return 操作结果信息
     */
    @ResponseBody
    @RequestMapping("/update")
    public JsonBean update(Checkin model) {
    	JsonBean bean = new JsonBean();
    	try {
    		int result = checkinServiceImpl.updateById(model);
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
     * 删除签到信息
     * @param id 要删除的签到ID
     */
    @ResponseBody
    @RequestMapping("/delete")
    public JsonBean delete(String id) {
    	JsonBean bean = new JsonBean();
    	try {
    		int result = checkinServiceImpl.deleteById(id);
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
