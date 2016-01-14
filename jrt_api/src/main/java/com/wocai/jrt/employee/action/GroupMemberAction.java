package com.wocai.jrt.employee.action;

import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wocai.jrt.employee.model.GroupMember;
import com.wocai.jrt.employee.service.spi.GroupMemberService;

import com.vteba.web.action.GenericAction;
import com.vteba.web.action.JsonBean;

/**
 * 团队成员控制器
 * @author yinlei
 * @date 2015-7-24 11:23:25
 */
@Controller
@RequestMapping("/groupMember")
public class GroupMemberAction extends GenericAction<GroupMember> {
	private static final Logger LOGGER = LoggerFactory.getLogger(GroupMemberAction.class);
	
	@Inject
	private GroupMemberService groupMemberServiceImpl;
	
	/**
     * 获得团队成员List，初始化列表页。
     * @param model 参数
     * @return 团队成员List
     */
    @RequestMapping("/initial")
    public String initial(GroupMember model, Map<String, Object> maps) {
    	try {
    		List<GroupMember> list = groupMemberServiceImpl.pagedList(model);
            maps.put("list", list);
		} catch (Exception e) {
			LOGGER.error("get record list error, errorMsg=[{}].", e.getMessage());
			return "common/error";
		}
        return "groupMember/initial";
    }
	
	/**
	 * 获得团队成员List，Json格式。
	 * @param model 参数
	 * @return 团队成员List
	 */
	@ResponseBody
	@RequestMapping("/list")
	public List<GroupMember> list(GroupMember model) {
		List<GroupMember> list = null;
		try {
			list = groupMemberServiceImpl.pagedList(model);
		} catch (Exception e) {
			LOGGER.error("get record list error, errorMsg=[{}].", e.getMessage());
		}
		return list;
	}
	
	/**
     * 根据Id获得团队成员实体，Json格式。
     * @param id 参数id
     * @return 团队成员实体
     */
    @ResponseBody
    @RequestMapping("/get")
    public GroupMember get(String id) {
    	GroupMember model = null;
    	try {
    		model = groupMemberServiceImpl.get(id);
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
        return "groupMember/add";
    }
    
    /**
     * 执行实际的新增操作
     * @param model 要新增的数据
     * @return 新增页面逻辑视图
     */
    @ResponseBody
    @RequestMapping("/doAdd")
    public JsonBean doAdd(GroupMember model) {
    	JsonBean bean = new JsonBean();
    	try {
    		int result = groupMemberServiceImpl.save(model);
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
     * 查看团队成员详情页。
     * @param model 查询参数，携带ID
     * @return 团队成员详情页
     */
    @RequestMapping("/detail")
    public String detail(GroupMember model, Map<String, Object> maps) {
    	try {
    		model = groupMemberServiceImpl.get(model.getId());
            maps.put("model", model);//将model放入视图中，供页面视图使用
		} catch (Exception e) {
			LOGGER.error("query record detail, errorMsg=[{}].", e.getMessage());
			return "common/error";
		}
        return "groupMember/detail";
    }
    
    /**
     * 跳转到编辑信息页面
     * @param model 查询参数，携带ID
     * @return 编辑页面
     */
    @RequestMapping("/edit")
    public String edit(GroupMember model, Map<String, Object> maps) {
        model = groupMemberServiceImpl.get(model.getId());
        maps.put("model", model);
        return "groupMember/edit";
    }
    
    /**
     * 更新团队成员信息
     * @param model 要更新的团队成员信息，含有ID
     * @return 操作结果信息
     */
    @ResponseBody
    @RequestMapping("/update")
    public JsonBean update(GroupMember model) {
    	JsonBean bean = new JsonBean();
    	try {
    		int result = groupMemberServiceImpl.updateById(model);
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
     * 删除团队成员信息
     * @param id 要删除的团队成员ID
     */
    @ResponseBody
    @RequestMapping("/delete")
    public JsonBean delete(String id) {
    	JsonBean bean = new JsonBean();
    	try {
    		int result = groupMemberServiceImpl.deleteById(id);
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
