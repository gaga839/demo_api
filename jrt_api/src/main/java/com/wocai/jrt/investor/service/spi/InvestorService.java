package com.wocai.jrt.investor.service.spi;

import java.util.List;

import com.wocai.jrt.employee.bean.GetMyGroupBean;
import com.wocai.jrt.investor.bean.InvestorCountBean;
import com.wocai.jrt.investor.bean.InvestorReqBean;
import com.wocai.jrt.investor.bean.InvestorResBean;
import com.wocai.jrt.investor.model.Investor;
import com.wocai.jrt.investor.model.InvestorBean;
import com.vteba.service.generic.MyBatisService;
import com.vteba.web.action.JsonBean;

/**
 * 投资人相关的业务service接口。
 * 
 * @author yinlei
 * @date 2015-7-24 17:10:45
 */
public interface InvestorService extends MyBatisService<Investor, InvestorBean, String> {

	/**
	 * 根据投资人(姓名、身份证、手机号)、在指定注册时间内来查询客户列表信息
	 * 
	 * @param InvestorResBean
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
	public int deleteLogic(String id);

	/**
	 * 查询投资人列表
	 * 
	 * @param InvestorResBean
	 * @return List<Investor>
	 */
	public List<InvestorResBean> queryList(InvestorReqBean investorReqBean);

	/**
	 * 根据员工id统计该员工下所有投资人信息
	 * 
	 * @param InvestorReqBean
	 * @return JsonBean
	 */
	public List<InvestorCountBean> count(InvestorReqBean investorReqBean);

	/**
	 * 查询团队长下所有下级员工的客户信息
	 * 
	 * @param InvestorReqBean
	 * @return List<InvestorResBean>
	 */
	public List<InvestorResBean> leader(InvestorReqBean investorReqBean);

	/**
	 * 根据团队队长ID，查询团队下新增的投资人
	 * 
	 * @param getMyGroupBean
	 * @return
	 */
	public List<Investor> getMyGroupInvestor(GetMyGroupBean getMyGroupBean);
	
	/**
	 * 根据投资人id查询投资人详情页信息
	 * @author zhangyz
	 * @param InvestorReqBean investorReqBean
	 * @return InvestorResBean
	 */
	public InvestorResBean getDeatilPageInfo(InvestorReqBean investorReqBean);
	
	/**
	 * 根据查询投资人所有详情信息
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

	public JsonBean doAddInvestor(Investor model);
}
