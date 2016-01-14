package com.wocai.jrt.employee.service.spi;

import java.util.List;


import com.wocai.jrt.employee.bean.EmployeeVisitReqBean;
import com.wocai.jrt.employee.model.EmployeeVisit;
import com.wocai.jrt.employee.model.EmployeeVisitBean;
import com.vteba.service.generic.MyBatisService;

/**
 * 员工回访相关的业务service接口。
 * @author yinlei
 * @date 2015-7-24 11:23:25
 */
public interface EmployeeVisitService extends MyBatisService<EmployeeVisit, EmployeeVisitBean, String> {

	/**
	 * 按条件查询员工回访记录
	 * @author zhangyz
	 * @param EmployeeVisitReqBean
	 * @return List<EmployeeVisit>
	 */
	public List<EmployeeVisit> queryVisitList(EmployeeVisitReqBean bean);
}
