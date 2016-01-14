package com.wocai.jrt.employee.action;

import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wocai.jrt.employee.model.Track;
import com.wocai.jrt.employee.service.spi.TrackService;

import com.vteba.web.action.GenericAction;
import com.vteba.web.action.JsonBean;

/**
 * 行程轨迹控制器
 * @author yinlei
 * @date 2015-7-27 10:31:04
 */
@Controller
@RequestMapping("/track")
public class TrackAction extends GenericAction<Track> {
	@Inject
	private TrackService trackServiceImpl;
	
	/**
     * 获得行程轨迹List，初始化列表页。
     * @param model 参数
     * @return 行程轨迹List
     */
    @RequestMapping("/initial")
    public String initial(Track model, Map<String, Object> maps) {
        List<Track> list = trackServiceImpl.pagedList(model);
        maps.put("list", list);
        return "track/initial";
    }
	
	/**
	 * 获得行程轨迹List，Json格式。
	 * @param model 参数
	 * @return 行程轨迹List
	 */
	@ResponseBody
	@RequestMapping("/list")
	public List<Track> list(Track model) {
		List<Track> list = trackServiceImpl.pagedList(model);
		return list;
	}
	
	/**
     * 根据Id获得行程轨迹实体，Json格式。
     * @param id 参数id
     * @return 行程轨迹实体
     */
    @ResponseBody
    @RequestMapping("/get")
    public Track get(String id) {
        Track model = trackServiceImpl.get(id);
        return model;
    }
	
	/**
     * 跳转到新增页面
     * @return 新增页面逻辑视图
     */
    @RequestMapping("/add")
    public String add() {
        return "track/add";
    }
    
    /**
     * 执行实际的新增操作
     * @param model 要新增的数据
     * @return 新增页面逻辑视图
     */
    @ResponseBody
    @RequestMapping("/doAdd")
    public JsonBean doAdd(Track model) {
        int result = trackServiceImpl.save(model);
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
     * 查看行程轨迹详情页。
     * @param model 查询参数，携带ID
     * @return 行程轨迹详情页
     */
    @RequestMapping("/detail")
    public String detail(Track model, Map<String, Object> maps) {
        model = trackServiceImpl.get(model.getId());
        maps.put("model", model);//将model放入视图中，供页面视图使用
        return "track/detail";
    }
    
    /**
     * 跳转到编辑信息页面
     * @param model 查询参数，携带ID
     * @return 编辑页面
     */
    @RequestMapping("/edit")
    public String edit(Track model, Map<String, Object> maps) {
        model = trackServiceImpl.get(model.getId());
        maps.put("model", model);
        return "track/edit";
    }
    
    /**
     * 更新行程轨迹信息
     * @param model 要更新的行程轨迹信息，含有ID
     * @return 操作结果信息
     */
    @ResponseBody
    @RequestMapping("/update")
    public JsonBean update(Track model) {
        int result = trackServiceImpl.updateById(model);
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
     * 删除行程轨迹信息
     * @param id 要删除的行程轨迹ID
     */
    @ResponseBody
    @RequestMapping("/delete")
    public JsonBean delete(String id) {
        int result = trackServiceImpl.deleteById(id);
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
