package com.wocai.jrt.employee.service.impl;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import com.wocai.jrt.employee.bean.EmployeeVisitReqBean;
import com.wocai.jrt.employee.dao.EmployeeVisitDao;
import com.wocai.jrt.employee.model.EmployeeVisit;
import com.wocai.jrt.employee.model.EmployeeVisitBean;
import com.wocai.jrt.employee.service.spi.EmployeeVisitService;
import com.vteba.service.generic.impl.MyBatisServiceImpl;
import com.vteba.tx.jdbc.mybatis.spi.BaseDao;

/**
 * 员工回访相关的service业务实现。
 * @author yinlei
 * @date 2015-7-24 11:23:25
 */
@Named
public class EmployeeVisitServiceImpl extends MyBatisServiceImpl<EmployeeVisit, EmployeeVisitBean, String> implements EmployeeVisitService {
	// 添加了方法后，记得改为private
	protected EmployeeVisitDao employeeVisitDao;
	
	@Override
	@Inject
	public void setBaseDao(BaseDao<EmployeeVisit, EmployeeVisitBean, String> employeeVisitDao) {
		this.baseDao = employeeVisitDao;
		this.employeeVisitDao = (EmployeeVisitDao) employeeVisitDao;
	}
	
	/**
	 * 按条件查询员工回访记录
	 * @author zhangyz
	 * @param EmployeeVisitReqBean
	 * @return List<EmployeeVisit>
	 */
	public List<EmployeeVisit> queryVisitList(EmployeeVisitReqBean bean) {
		List<EmployeeVisit> list = employeeVisitDao.queryVisitList(bean);
		return list;
	}
}
