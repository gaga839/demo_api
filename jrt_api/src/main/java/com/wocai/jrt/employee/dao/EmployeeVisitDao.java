package com.wocai.jrt.employee.dao;

import java.util.List;

import com.vteba.tx.jdbc.mybatis.annotation.DaoMapper;
import com.vteba.tx.jdbc.mybatis.spi.BaseDao;
import com.wocai.jrt.employee.bean.EmployeeVisitReqBean;
import com.wocai.jrt.employee.model.EmployeeVisit;
import com.wocai.jrt.employee.model.EmployeeVisitBean;

/**
 * 表employee_visit的MyBatis Dao Mapper。
 * 由代码工具自动生成，可以新增方法，但是不要修改自动生成的方法。
 * @date 2015-07-24 11:23:26
 */
@DaoMapper
public interface EmployeeVisitDao extends BaseDao<EmployeeVisit, EmployeeVisitBean, String> {
	/**
	 * 按条件查询员工回访记录
	 * @author zhangyz
	 * @param EmployeeVisitReqBean
	 * @return List<EmployeeVisit>
	 */
	List<EmployeeVisit> queryVisitList(EmployeeVisitReqBean bean);
}