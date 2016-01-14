package com.wocai.jrt.employee.action;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.inject.Inject;

import org.apache.commons.lang3.StringUtils;
import org.joda.time.DateTime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wocai.jrt.employee.bean.EmployeeVisitReqBean;
import com.wocai.jrt.employee.model.EmployeeVisit;
import com.wocai.jrt.employee.service.spi.EmployeeVisitService;
import com.alibaba.fastjson.JSON;
import com.vteba.utils.id.ObjectId;
import com.vteba.web.action.GenericAction;
import com.vteba.web.action.JsonBean;
import com.vteba.web.editer.DoubleEditor;
import com.vteba.web.editer.IntEditor;
import com.vteba.web.editer.LongEditor;
import com.vteba.web.editer.StringEditor;


/**
 * 员工回访控制器
 * @author zhangyz
 * @date 2015年7月30日10:22:50
 */
@Controller
@RequestMapping("/employeeVisit")
public class EmployeeVisitAction extends GenericAction<EmployeeVisit> {
	private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeVisitAction.class);
	
	@Inject
	private EmployeeVisitService employeeVisitServiceImpl;
	
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
	 * 获得回访List，Json格式。
	 * @param model 参数
	 * @return 员工回访List
	 */
	@ResponseBody
	@RequestMapping("/list")
	public JsonBean list(EmployeeVisitReqBean model) {
		List<EmployeeVisit> list = null;
		JsonBean bean = new JsonBean();
		if (StringUtils.isBlank(model.getInvestorId())&&StringUtils.isBlank(model.getOrderId())&&StringUtils.isBlank(model.getSubId())) {
			bean.setCode(0);
    		bean.setMessage("param's is error.");
    		return bean;
		}
		Date date = model.getEnd();
		if (date != null) {
			model.setEnd(new DateTime(date).minusHours(-23)
					.minusMinutes(-59).minusSeconds(-59).toDate());
		}
		try {
			LOGGER.info("get employeeVisit list , param=[{}].",JSON.toJSONString(model));
			Integer i = model.getPage();
			if ( i != null) {
				model.setPage(i*model.getPageSize());
			}
			model.setOrderBy("visit_time desc");
			list = employeeVisitServiceImpl.queryVisitList(model);
			bean.setCode(1);
    		bean.setMessage(SUCCESS);
			bean.setData(list);
		} catch (Exception e) {
			LOGGER.error("get employeeVisit list error, errorMsg=[{}].", e.getMessage());
			bean.setCode(0);
    		bean.setMessage("获取联系记录失败");
		}
		return bean;
	}
    
    /**
     * 执行实际的新增操作
     * @param model 要新增的数据
     * @return 新增页面逻辑视图
     */
    @ResponseBody
    @RequestMapping("/doAdd")
    public JsonBean doAdd(EmployeeVisit model) {
    	JsonBean bean = new JsonBean();
    	try {
    		model.setId(ObjectId.get().toString());
    		if (StringUtils.isBlank(model.getInvestorId())) {
        		bean.setMessage("param's InvestorId cannot be null.");
        		return bean;
        	}
    		if (StringUtils.isBlank(model.getEmployeeId())) {
        		bean.setMessage("param's EmployeeId cannot be null.");
        		return bean;
        	}
    		if (model.getVisitTime() ==null) {
    			model.setVisitTime(new Date());
        	}
    		if (StringUtils.isBlank(model.getContent())) {
    			bean.setMessage("param's Content cannot be null.");
        		return bean;
        	}
    		LOGGER.info("save employeeVisit list , param=[{}].",JSON.toJSONString(model));
    		int result = employeeVisitServiceImpl.save(model);
            if (result == 1) {
                bean.setMessage(SUCCESS);
                bean.setCode(1);
                LOGGER.info("save record success.");
            } else {
                bean.setMessage(ERROR);
                LOGGER.error("save record error.");
            }
		} catch (Exception e) {
			LOGGER.error("save employeeVisit list error, errorMsg=[{}].", e.getMessage());
			e.printStackTrace();
			bean.setMessage(e.getMessage());
		}
        return bean;
    }
}
