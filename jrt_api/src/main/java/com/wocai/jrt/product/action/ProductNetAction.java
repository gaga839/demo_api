package com.wocai.jrt.product.action;

import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wocai.jrt.product.model.ProductNet;
import com.wocai.jrt.product.service.spi.ProductNetService;
import com.vteba.web.action.GenericAction;
import com.vteba.web.action.JsonBean;
import com.vteba.web.editer.StringEditor;

/**
 * 产品净值控制器
 * @author linbaolu
 * @date 2015-7-28 17:46:10
 */
@Controller
@RequestMapping("/productNet")
public class ProductNetAction extends GenericAction<ProductNet> {
	@Inject
	private ProductNetService productNetServiceImpl;
	
	@InitBinder
    protected void initBinder(WebDataBinder binder) {
    	// 空字符串转换为null
        binder.registerCustomEditor(String.class, new StringEditor());
    }
	
	/**
     * 获得产品净值List，初始化列表页。
     * @param model 参数
     * @return 产品净值List
     */
    @RequestMapping("/initial")
    public String initial(ProductNet model, Map<String, Object> maps) {
        List<ProductNet> list = productNetServiceImpl.pagedList(model);
        maps.put("list", list);
        return "productNet/initial";
    }
	
	/**
	 * 获得产品净值List，Json格式。
	 * @param model 参数
	 * @return 产品净值List
	 */
	@ResponseBody
	@RequestMapping("/list")
	public List<ProductNet> list(ProductNet model) {
		List<ProductNet> list = productNetServiceImpl.pagedList(model);
		return list;
	}
	
	/**
     * 根据Id获得产品净值实体，Json格式。
     * @param id 参数id
     * @return 产品净值实体
     */
    @ResponseBody
    @RequestMapping("/get")
    public ProductNet get(String id) {
        ProductNet model = productNetServiceImpl.get(id);
        return model;
    }
	
	/**
     * 跳转到新增页面
     * @return 新增页面逻辑视图
     */
    @RequestMapping("/add")
    public String add() {
        return "productNet/add";
    }
    
    /**
     * 执行实际的新增操作
     * @param model 要新增的数据
     * @return 新增页面逻辑视图
     */
    @ResponseBody
    @RequestMapping("/doAdd")
    public JsonBean doAdd(ProductNet model) {
        int result = productNetServiceImpl.save(model);
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
     * 查看产品净值详情页。
     * @param model 查询参数，携带ID
     * @return 产品净值详情页
     */
    @RequestMapping("/detail")
    public String detail(ProductNet model, Map<String, Object> maps) {
        model = productNetServiceImpl.get(model.getId());
        maps.put("model", model);//将model放入视图中，供页面视图使用
        return "productNet/detail";
    }
    
    /**
     * 跳转到编辑信息页面
     * @param model 查询参数，携带ID
     * @return 编辑页面
     */
    @RequestMapping("/edit")
    public String edit(ProductNet model, Map<String, Object> maps) {
        model = productNetServiceImpl.get(model.getId());
        maps.put("model", model);
        return "productNet/edit";
    }
    
    /**
     * 更新产品净值信息
     * @param model 要更新的产品净值信息，含有ID
     * @return 操作结果信息
     */
    @ResponseBody
    @RequestMapping("/update")
    public JsonBean update(ProductNet model) {
        int result = productNetServiceImpl.updateById(model);
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
     * 删除产品净值信息
     * @param id 要删除的产品净值ID
     */
    @ResponseBody
    @RequestMapping("/delete")
    public JsonBean delete(String id) {
        int result = productNetServiceImpl.deleteById(id);
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
