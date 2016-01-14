package com.wocai.jrt.product.action;

import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wocai.jrt.product.model.ProductGrade;
import com.wocai.jrt.product.service.spi.ProductGradeService;

import com.vteba.web.action.GenericAction;
import com.vteba.web.action.JsonBean;

/**
 * 产品评级控制器
 * @author linbaolu
 * @date 2015-9-1 21:03:46
 */
@Controller
@RequestMapping("/productGrade")
public class ProductGradeAction extends GenericAction<ProductGrade> {
	private static final Logger LOGGER = LoggerFactory.getLogger(ProductGradeAction.class);
	
	@Inject
	private ProductGradeService productGradeServiceImpl;
	
	/**
     * 获得产品评级List，初始化列表页。
     * @param model 参数
     * @return 产品评级List
     */
    @RequestMapping("/initial")
    public String initial(ProductGrade model, Map<String, Object> maps) {
    	try {
    		List<ProductGrade> list = productGradeServiceImpl.pagedList(model);
            maps.put("list", list);
		} catch (Exception e) {
			LOGGER.error("get record list error, errorMsg=[{}].", e.getMessage());
			return "common/error";
		}
        return "productGrade/initial";
    }
	
	/**
	 * 获得产品评级List，Json格式。
	 * @param model 参数
	 * @return 产品评级List
	 */
	@ResponseBody
	@RequestMapping("/list")
	public List<ProductGrade> list(ProductGrade model) {
		List<ProductGrade> list = null;
		try {
			list = productGradeServiceImpl.pagedList(model);
		} catch (Exception e) {
			LOGGER.error("get record list error, errorMsg=[{}].", e.getMessage());
		}
		return list;
	}
	
	/**
     * 根据Id获得产品评级实体，Json格式。
     * @param id 参数id
     * @return 产品评级实体
     */
    @ResponseBody
    @RequestMapping("/get")
    public ProductGrade get(String id) {
    	ProductGrade model = null;
    	try {
    		model = productGradeServiceImpl.get(id);
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
        return "productGrade/add";
    }
    
    /**
     * 执行实际的新增操作
     * @param model 要新增的数据
     * @return 新增页面逻辑视图
     */
    @ResponseBody
    @RequestMapping("/doAdd")
    public JsonBean doAdd(ProductGrade model) {
    	JsonBean bean = new JsonBean();
    	try {
    		int result = productGradeServiceImpl.save(model);
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
     * 查看产品评级详情页。
     * @param model 查询参数，携带ID
     * @return 产品评级详情页
     */
    @RequestMapping("/detail")
    public String detail(ProductGrade model, Map<String, Object> maps) {
    	try {
    		model = productGradeServiceImpl.get(model.getId());
            maps.put("model", model);//将model放入视图中，供页面视图使用
		} catch (Exception e) {
			LOGGER.error("query record detail, errorMsg=[{}].", e.getMessage());
			return "common/error";
		}
        return "productGrade/detail";
    }
    
    /**
     * 跳转到编辑信息页面
     * @param model 查询参数，携带ID
     * @return 编辑页面
     */
    @RequestMapping("/edit")
    public String edit(ProductGrade model, Map<String, Object> maps) {
        model = productGradeServiceImpl.get(model.getId());
        maps.put("model", model);
        return "productGrade/edit";
    }
    
    /**
     * 更新产品评级信息
     * @param model 要更新的产品评级信息，含有ID
     * @return 操作结果信息
     */
    @ResponseBody
    @RequestMapping("/update")
    public JsonBean update(ProductGrade model) {
    	JsonBean bean = new JsonBean();
    	try {
    		int result = productGradeServiceImpl.updateById(model);
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
     * 删除产品评级信息
     * @param id 要删除的产品评级ID
     */
    @ResponseBody
    @RequestMapping("/delete")
    public JsonBean delete(String id) {
    	JsonBean bean = new JsonBean();
    	try {
    		int result = productGradeServiceImpl.deleteById(id);
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
