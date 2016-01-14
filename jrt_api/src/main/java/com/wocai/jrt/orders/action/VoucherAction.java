package com.wocai.jrt.orders.action;

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
import com.wocai.jrt.orders.model.Voucher;
import com.wocai.jrt.orders.service.spi.VoucherService;

/**
 * 订单凭证控制器
 * @author yinlei
 * @date 2015-12-16 10:47:15
 */
@Controller
@RequestMapping("/voucher")
public class VoucherAction extends GenericAction<Voucher> {
	private static final Logger LOGGER = LoggerFactory.getLogger(VoucherAction.class);
	
	@Inject
	private VoucherService voucherServiceImpl;
	
	/**
     * 获得订单凭证List，初始化列表页。
     * @param model 参数
     * @return 订单凭证List
     */
    @RequestMapping("/initial")
    public String initial(Voucher model, Map<String, Object> maps) {
    	try {
    		List<Voucher> list = voucherServiceImpl.pagedList(model);
            maps.put("list", list);
		} catch (Exception e) {
			LOGGER.error("get record list error, errorMsg=[{}].", e.getMessage());
			return "common/error";
		}
        return "voucher/initial";
    }
	
	/**
	 * 获得订单凭证List，Json格式。
	 * @param model 参数
	 * @return 订单凭证List
	 */
	@ResponseBody
	@RequestMapping("/list")
	public List<Voucher> list(Voucher model) {
		List<Voucher> list = null;
		try {
			list = voucherServiceImpl.pagedList(model);
		} catch (Exception e) {
			LOGGER.error("get record list error, errorMsg=[{}].", e.getMessage());
		}
		return list;
	}
	
	/**
     * 根据Id获得订单凭证实体，Json格式。
     * @param id 参数id
     * @return 订单凭证实体
     */
    @ResponseBody
    @RequestMapping("/get")
    public Voucher get(String id) {
    	Voucher model = null;
    	try {
    		model = voucherServiceImpl.get(id);
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
        return "voucher/add";
    }
    
    /**
     * 执行实际的新增操作
     * @param model 要新增的数据
     * @return 新增页面逻辑视图
     */
    @ResponseBody
    @RequestMapping("/doAdd")
    public JsonBean doAdd(Voucher model) {
    	JsonBean bean = new JsonBean();
    	try {
    		int result = voucherServiceImpl.save(model);
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
     * 查看订单凭证详情页。
     * @param model 查询参数，携带ID
     * @return 订单凭证详情页
     */
    @RequestMapping("/detail")
    public String detail(Voucher model, Map<String, Object> maps) {
    	try {
    		model = voucherServiceImpl.get(model.getId());
            maps.put("model", model);//将model放入视图中，供页面视图使用
		} catch (Exception e) {
			LOGGER.error("query record detail, errorMsg=[{}].", e.getMessage());
			return "common/error";
		}
        return "voucher/detail";
    }
    
    /**
     * 跳转到编辑信息页面
     * @param model 查询参数，携带ID
     * @return 编辑页面
     */
    @RequestMapping("/edit")
    public String edit(Voucher model, Map<String, Object> maps) {
        model = voucherServiceImpl.get(model.getId());
        maps.put("model", model);
        return "voucher/edit";
    }
    
    /**
     * 更新订单凭证信息
     * @param model 要更新的订单凭证信息，含有ID
     * @return 操作结果信息
     */
    @ResponseBody
    @RequestMapping("/update")
    public JsonBean update(Voucher model) {
    	JsonBean bean = new JsonBean();
    	try {
    		int result = voucherServiceImpl.updateById(model);
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
     * 删除订单凭证信息
     * @param id 要删除的订单凭证ID
     */
    @ResponseBody
    @RequestMapping("/delete")
    public JsonBean delete(String id) {
    	JsonBean bean = new JsonBean();
    	try {
    		int result = voucherServiceImpl.deleteById(id);
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
