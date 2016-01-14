package com.wocai.jrt.investor.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.vteba.tx.jdbc.mybatis.annotation.DaoMapper;
import com.vteba.tx.jdbc.mybatis.spi.BaseDao;
import com.wocai.jrt.employee.bean.GetMyGroupBean;
import com.wocai.jrt.investor.bean.InvestorReqBean;
import com.wocai.jrt.investor.bean.InvestorResBean;
import com.wocai.jrt.investor.model.Investor;
import com.wocai.jrt.investor.model.InvestorBean;

/**
 * 表investor的MyBatis Dao Mapper。 由代码工具自动生成，可以新增方法，但是不要修改自动生成的方法。
 * 
 * @author zhangyz
 * @date 2015-07-24 17:10:45
 */
@DaoMapper
public interface InvestorDao extends BaseDao<Investor, InvestorBean, String> {
	/**
	 * 根据投资人(姓名、身份证、手机号)、在指定注册时间内来查询客户列表信息
	 * 
	 * @param employeeId
	 *            员工id start 注册时间 end 注册时间
	 * @return List<Investor>
	 */
	public List<InvestorResBean> factor(InvestorReqBean investorReqBean);

	/**
	 * 投资人信息逻辑删除
	 * 
	 * @param 投资人id
	 *            id
	 * @return 1 成功 0 失败
	 */
	public int deleteLogic(@Param(value = "id") String id);

	/**
	 * 根据员工id查询其所有客户列表信息
	 * 
	 * @param InvestorResBean
	 * @return List<InvestorResBean>
	 */
	public List<InvestorResBean> queryList(InvestorReqBean investorReqBean);

	/**
	 * 查询团队长下所有下级员工的客户信息
	 * 
	 * @param InvestorReqBean
	 * @return List<Investor>
	 */
	public List<InvestorResBean> leader(InvestorReqBean investorReqBean);

	/**
	 * 根据团队队长ID查询团队下新增的投资人
	 * 
	 * @param getMyGroupBean
	 * @return
	 */
	public List<Investor> getMyGroupInvestor(GetMyGroupBean getMyGroupBean);
	
	/**
	 * 根据投资人id查询投资人详情（包括基本信息、联系记录、订单记录、预约记录）
	 * @author zhangyz
	 * @param InvestorReqBean investorReqBean
	 * @return JsonBean
	 */
	public InvestorResBean getDeatilPageInfo(InvestorReqBean investorReqBean);
	
	/**
	 * 根据投资人id查询投资人所有详情信息
	 * @author zhangyz
	 * @param InvestorReqBean investorReqBean
	 * @return Investor
	 */
	public List<Investor> getDeatilInfo(InvestorReqBean investorReqBean);
	
	/**
	 * 根据员工id快速查询其所有客户列表信息
	 * 
	 * @param InvestorResBean
	 * @return List<InvestorResBean>
	 */
	public List<InvestorResBean> fecthList(InvestorReqBean investorReqBean);
}
