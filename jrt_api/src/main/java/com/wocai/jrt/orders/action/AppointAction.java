package com.wocai.jrt.orders.action;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.inject.Inject;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.vteba.tx.jdbc.sequence.HexademicalKeyGenerator;
import com.vteba.utils.id.ObjectId;
import com.vteba.web.action.JsonBean;
import com.vteba.web.editer.DoubleEditor;
import com.vteba.web.editer.IntEditor;
import com.vteba.web.editer.LongEditor;
import com.vteba.web.editer.StringEditor;
import com.wocai.jrt.employee.model.Employee;
import com.wocai.jrt.employee.service.spi.EmployeeService;
import com.wocai.jrt.investor.model.Investor;
import com.wocai.jrt.investor.service.spi.InvestorService;
import com.wocai.jrt.orders.bean.AppointmentReqBean;
import com.wocai.jrt.orders.model.Appointment;
import com.wocai.jrt.orders.service.spi.AppointmentService;
import com.wocai.jrt.product.model.Product;
import com.wocai.jrt.product.service.spi.ProductService;

/**
 * 预约控制器
 * @author zhangyz
 * @date 2015年9月7日15:10:05
 */
@Controller
@RequestMapping("/appointment")
public class AppointAction {

	@Inject
	private AppointmentService appointmentServiceImpl;
	@Inject
	private ProductService productServiceImpl;
	@Inject
	private InvestorService investorServiceImpl;
	@Inject
	private EmployeeService employeeServiceImpl;
	@Inject
	private HexademicalKeyGenerator hexademicalKeyGenerator; 
	
	private static final Logger LOGGER = LoggerFactory.getLogger(AppointAction.class);
	
	@InitBinder
	protected void initBinder(WebDataBinder binder) {
		binder.registerCustomEditor(Date.class, new CustomDateEditor(new SimpleDateFormat(
				"yyyy-MM-dd HH:mm"), true));
		binder.registerCustomEditor(int.class, new IntEditor());
		binder.registerCustomEditor(long.class, new LongEditor());
		binder.registerCustomEditor(double.class, new DoubleEditor());
		binder.registerCustomEditor(String.class, new StringEditor());
	}
  
   
    /**
     * 执行新增预约操作
     * @param model 要新增的数据
     * @return JsonBean
     * @author zhangyz
     */
    @ResponseBody
    @RequestMapping("/doAdd")
    public JsonBean doAdd(AppointmentReqBean appReqBean) {
    	JsonBean bean = new JsonBean();
    	String mobile = appReqBean.getMobile();
		String orgId  = appReqBean.getOrgId();
		String employeeId = appReqBean.getEmployeeId();
		String productId =appReqBean.getProductId();
		String investorName = appReqBean.getInvestorName();
		String orderAmount = appReqBean.getOrderAmount();
		Date appointTime = appReqBean.getAppointTime();
		String acString = "";
    	try {
    		if (StringUtils.isBlank(investorName)) {
        		bean.setCode(0);
        		bean.setMessage("投资人姓名不能为空");
    			return bean;
    		}
    		if ( appointTime ==null) {
        		bean.setCode(0);
        		bean.setMessage("预约时间不能为空");
    			return bean;
    		}
    		if (StringUtils.isBlank(employeeId)) {
        		bean.setCode(0);
        		bean.setMessage("理财师id不能为空");
    			return bean;
    		}
    		if (StringUtils.isBlank(productId)) {
        		bean.setCode(0);
        		bean.setMessage("产品id不能为空");
    			return bean;
    		}
    		if (StringUtils.isBlank(orgId)) {
        		bean.setCode(0);
        		bean.setMessage("机构id不能为空");
    			return bean;
    		}
    		//根据手机号码查询当前投资人是否已经存在
    		Investor  investor = new Investor();
    		investor.setOrgId(orgId);
    		investor.setMobile(mobile);
    		Investor  vestor = investorServiceImpl.unique(investor);
    		Product product = productServiceImpl.get(productId);
    		Employee employee = employeeServiceImpl.get(employeeId);
    		if (null != vestor ) {
    			//投资人已经存在
    			acString = vestor.getId();
    			String belongEmpId = vestor.getEmployeeId();
    			//判断投资人是否属于该理财师客户
    			if(belongEmpId!= null && !"".equals(belongEmpId) && !belongEmpId.equals(employeeId)){
        			bean.setCode(0);
    				bean.setMessage("投资人是其它理财师的客户，请联系团队管理员进行协调.");
    				return bean;
        		}
    			//如果该投资人没有所属理财师
    			if(belongEmpId == null || "".equals(belongEmpId)){
    				Investor inves = new Investor();
    				inves.setId(acString);
    				inves.setEmployeeId(employeeId);
    				investorServiceImpl.updateById(inves);
    			}
    			//判断预约单能否添加
        		Appointment temp = new Appointment();
        		temp.setInvestorId(acString);
        		temp.setProductId(appReqBean.getProductId());
        		temp.setOrgId(orgId);
        		temp.setState(0);
        		List<Appointment> exist = appointmentServiceImpl.pagedList(temp);
        		if(exist.size() > 0){
        			 bean.setMessage("新增预约失败，该客户对该产品已经有相应未处理预约单!");
                     bean.setCode(0);
                     return bean;
        		}
			}else{
				//新增投资人
				String address = appReqBean.getAddress();
				String gender = appReqBean.getGender();
				String email =  appReqBean.getEmail();
				String idcard = appReqBean.getIdcard();
				String idType = appReqBean.getIdType();
				String company = appReqBean.getCompany();
				if (null !=address) {
					investor.setAddress(address);
				}
				if (null !=gender) {
					investor.setGender(Integer.parseInt(gender));
				}
				if (null !=email) {
					investor.setEmail(email);
				}
				if (null !=idcard) {
					investor.setIdcard(idcard);
				}
				if (null !=idType) {
					investor.setIdType(idType);
				}
				if (null !=company) {
					investor.setCompany(company);
				}
				investor.setName(investorName);
				investor.setId(acString);
				investor.setOrgId(orgId);
				investor.setDeleted(false);
				investor.setEmployeeId(employeeId);
				investor.setRegisterTime(new Date());
				investor.setInvitationCode(hexademicalKeyGenerator.next());
				JsonBean result = investorServiceImpl.doAddInvestor(investor);
				if (result.getCode() == 0) {
					return result;
				}else if(result.getCode() == 1){
					acString = result.getData().toString();
				}
			}
    		Appointment app = new Appointment();
    		app.setId(ObjectId.get().toString());
    		app.setAllocated(false);
    		Date nowDate = new Date();
    		long diff = nowDate.getTime() - appointTime.getTime();
    		if (diff >= 0) {
    			bean.setCode(0);
				bean.setMessage("预约时间输入有误!");
				return bean;
			}
    		app.setAppointTime(appointTime);
    		app.setCreateTime(new Date());
    		app.setEmployeeId(employeeId);
    		app.setInvestorId(acString);
    		if (null != orderAmount) {
    			app.setOrderAmount(Double.parseDouble(orderAmount));
			}
    		app.setOrgId(orgId);
    		if(product != null){
    			app.setProductBriefName(product.getBriefName());	
    			app.setProductName(product.getProductName());	
    		}else{
    			bean.setCode(0);
				bean.setMessage("预约产品不存在!");
				return bean;
    		}
    		if(employee != null){
    			app.setEmployeeName(employee.getName());
    		}
    		app.setProductId(productId);
    		app.setReserved(false);
    		app.setState(0);
    		LOGGER.info("request doAdd appointment , param=[{}]", JSON.toJSONString(app));
    		int finals = appointmentServiceImpl.save(app);
    		if (finals == 1) {
    			bean.setCode(1);
    			bean.setData(finals);
				bean.setMessage("新增预约成功!");
			}else {
				bean.setCode(0);
				bean.setData(finals);
				bean.setMessage("新增预约失败!");
			}
		} catch (Exception e) {
			e.printStackTrace();
			LOGGER.error("appointment add error,msg=[{}].", e.getMessage());
			bean.setCode(0);
			bean.setMessage("新增预约失败");
		}
    	return bean;
    }

}
