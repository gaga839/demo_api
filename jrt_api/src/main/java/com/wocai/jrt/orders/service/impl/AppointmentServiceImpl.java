package com.wocai.jrt.orders.service.impl;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.inject.Inject;
import javax.inject.Named;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.vteba.service.generic.impl.MyBatisServiceImpl;
import com.vteba.tx.jdbc.mybatis.spi.BaseDao;
import com.wocai.jrt.investor.bean.InvestorCountBean;
import com.wocai.jrt.orders.bean.AppointmentCountBean;
import com.wocai.jrt.orders.bean.AppointmentDealReqBean;
import com.wocai.jrt.orders.bean.AppointmentDetailBean;
import com.wocai.jrt.orders.bean.AppointmentReqBean;
import com.wocai.jrt.orders.bean.AppointmentResBean;
import com.wocai.jrt.orders.bean.GroupAppointmentReqBean;
import com.wocai.jrt.orders.bean.OrdersReqBean;
import com.wocai.jrt.orders.bean.OrdersResBean;
import com.wocai.jrt.orders.bean.SortClass;
import com.wocai.jrt.orders.dao.AppointmentDao;
import com.wocai.jrt.orders.model.Appointment;
import com.wocai.jrt.orders.model.AppointmentBean;
import com.wocai.jrt.orders.service.spi.AppointmentService;
import com.wocai.jrt.utils.DateUtils;

/**
 * 预约相关的service业务实现。
 * 
 * @author zhangyz
 * @date 2015-7-28 13:33:34
 */
@Named
public class AppointmentServiceImpl extends
		MyBatisServiceImpl<Appointment, AppointmentBean, String> implements AppointmentService{
	
	private static final Logger LOGGER = LoggerFactory.getLogger(AppointmentServiceImpl.class);

	private AppointmentDao appointmentDao;

	@Override
	@Inject
	public void setBaseDao(BaseDao<Appointment, AppointmentBean, String> appointmentDao) {
		this.baseDao = appointmentDao;
		this.appointmentDao = (AppointmentDao) appointmentDao;
	}

	/**
	 * 根据投资人id查询投资人预约记录
	 * 
	 * @param OrdersReqBean
	 *            orderReqBean
	 * @return List<AppointmentResBean>
	 * 
	 */
	@Override
	public List<AppointmentResBean> queryList(OrdersReqBean orderReqBean) {
		List<AppointmentResBean> list = appointmentDao.queryList(orderReqBean);
		return list;
	}

	/**
	 * 根据条件查询检索理财师下所有预约订单
	 * 
	 * @param OrdersReqBean
	 *            ordersReqBean
	 * @return List<OrdersBriefBean>
	 */
	@Override
	public List<OrdersResBean> queryFactor(OrdersReqBean ordersReqBean) {
		List<OrdersResBean> ordersList = appointmentDao.queryFactor(ordersReqBean);
		return ordersList;
	}

	/**
	 * 根据预约单id获取预约详情信息
	 * 
	 * @param AppointmentReqBean
	 *            appointmentReqBean
	 * @return List<AppointmentDetailBean>
	 */
	@Override
	public List<AppointmentDetailBean>detail(AppointmentReqBean appointmentReqBean) {
		List<AppointmentDetailBean> detailBean = appointmentDao
				.detail(appointmentReqBean);
		return detailBean;
	}

	/**
	 * 根据预约单id、处理类型 处理预约单
	 * 
	 * @param AppointmentDealReqBean
	 *            appointmentDealReqBean
	 * @return AppointmentResBean
	 * @throws Exception
	 */
	@Override
	public int deal(AppointmentDealReqBean appointmentDealReqBean) throws Exception {
		int aResBean = 0 ;
		try {
			aResBean = appointmentDao.deal(appointmentDealReqBean);
			return aResBean;
		} catch (Exception e) {
			return aResBean;
		}
	}
	
	/**
	 * 根据员工id查询投资人预约记录
	 * @param OrdersReqBean ordersReqBean
	 * @return  List<AppointmentResBean>
	 */
	@Override
	public List<AppointmentResBean> queryEmp(OrdersReqBean orderReqBean) {
		List<AppointmentResBean> list = appointmentDao.queryEmp(orderReqBean);
		return list;
	}
	
	/**
     *  根据员工id统计该员工的所有预约统计信息
     * @param  AppointmentReqBean appointmentReqBean
     * @return JsonBean
     */
	public Map<String, Object> appointmentCount(AppointmentReqBean appointmentReqBean){
		//按条件查询预约单信息
		List<AppointmentResBean> appointmentList = appointmentDao.appointmentCount(appointmentReqBean);
		AppointmentReqBean bean = new AppointmentReqBean();
		bean.setEmployeeId(appointmentReqBean.getEmployeeId());
		//该员工所有预约单信息
		List<AppointmentResBean> allappointmentList = appointmentDao.appointmentCount(bean);
		Map<String, Object> map = new HashMap<String, Object>();
		SimpleDateFormat sdFormat = new SimpleDateFormat("yyyy-MM-dd");
		List<Object> listday = new ArrayList<Object>();
		// 按日期统计所有预约单
		Map<String, Integer> appointmentMap = new HashMap<String, Integer>();
		// 按日期统计所有订单bean
		List<InvestorCountBean> allAppoResultlist = new ArrayList<InvestorCountBean>();
		// 3日预约单单统计
		AppointmentCountBean gridThreeDay = new AppointmentCountBean();
		gridThreeDay.setType("近3日");
		// 7日预约单单统计
		AppointmentCountBean gridSevenDay = new AppointmentCountBean();
		gridSevenDay.setType("近7日");
		// 30日预约单单统计
		AppointmentCountBean gridThirtyDay = new AppointmentCountBean();
		gridThirtyDay.setType("近30日");
		// 60日预约单单统计
		AppointmentCountBean gridSixtyDay = new AppointmentCountBean();
		gridSixtyDay.setType("近60日");
		// 90日预约单单统计
		AppointmentCountBean gridNintyDay = new AppointmentCountBean();
		gridNintyDay.setType("近90日");
		String dateString;
		Integer stateInteger;
		Date date = new Date();
		Date appointmentDate;
		int days;
		try {
			for (AppointmentResBean appointmentResBean : appointmentList) {
				appointmentDate = appointmentResBean.getCreateTime();
				dateString = sdFormat.format(appointmentDate);
				stateInteger = appointmentResBean.getState();
				if(dateString!=null){
					if (appointmentMap.containsKey(dateString)) {
						appointmentMap.put(dateString, 1 + appointmentMap.get(dateString));
					} else {
						appointmentMap.put(dateString, 1);
					}
				}
			}	
			//所有预约单统计数据封装到bean中
			Iterator<?> it = appointmentMap.entrySet().iterator();
			try {
				while(it.hasNext()){
					InvestorCountBean tempbean = new InvestorCountBean();
					Entry<?, ?> entry = (Entry<?, ?>)it.next();
					tempbean.setCount(Integer.parseInt(entry.getValue().toString()));
					tempbean.setDate(new SimpleDateFormat("yyyy-MM-dd").parse(entry.getKey().toString()));
					allAppoResultlist.add(tempbean);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			//所有预约单统计List按时间升序排列
			Collections.sort(allAppoResultlist, new SortClass());
			for (AppointmentResBean appo : allappointmentList) {
				appointmentDate = appo.getCreateTime();
				stateInteger = appo.getState();
				// 按已成交天数统计订单
				days = DateUtils.countDays(appointmentDate,date);
				if (days <=3) {
					//总预约单
					gridThreeDay.setAppointment(gridThreeDay.getAppointment()+1);
					//未处理
					if(stateInteger == 0){
							gridThreeDay.setUndeal(gridThreeDay.getUndeal()+1);
					}
					//已处理
					else if(stateInteger == 1){
							gridThreeDay.setDeal(gridThreeDay.getDeal()+1);
					}
					//已取消
					else if(stateInteger == 2){
							gridThreeDay.setCancel(gridThreeDay.getCancel()+1);
					}
					//转订单
					else if(stateInteger == 3){
							gridThreeDay.setExpired(gridThreeDay.getExpired()+1);
					}
				}
				if (days <=7) {
					//总预约单
					gridSevenDay.setAppointment(gridSevenDay.getAppointment()+1);
					//未处理
					if(stateInteger == 0){
						gridSevenDay.setUndeal(gridSevenDay.getUndeal()+1);
					}
					//已处理
					else if(stateInteger == 1){
						gridSevenDay.setDeal(gridSevenDay.getDeal()+1);
					}
					//已取消
					else if(stateInteger == 2){
						gridSevenDay.setCancel(gridSevenDay.getCancel()+1);
					}
					//转订单
					else if(stateInteger == 3){
						gridSevenDay.setExpired(gridSevenDay.getExpired()+1);
					}
				}
				if (days <=30) {
					//总预约单
					gridThirtyDay.setAppointment(gridThirtyDay.getAppointment()+1);
					//未处理
					if(stateInteger == 0){
						gridThirtyDay.setUndeal(gridThirtyDay.getUndeal()+1);
					}
					//已处理
					else if(stateInteger == 1){
						gridThirtyDay.setDeal(gridThirtyDay.getDeal()+1);
					}
					//已取消
					else if(stateInteger == 2){
						gridThirtyDay.setCancel(gridThirtyDay.getCancel()+1);
					}
					//转订单
					else if(stateInteger == 3){
						gridThirtyDay.setExpired(gridThirtyDay.getExpired()+1);
					}			
				}
				if (days <=60) {
					//总预约单
					gridSixtyDay.setAppointment(gridSixtyDay.getAppointment()+1);
					//未处理
					if(stateInteger == 0){
						gridSixtyDay.setUndeal(gridSixtyDay.getUndeal()+1);
					}
					//已处理
					else if(stateInteger == 1){
						gridSixtyDay.setDeal(gridSixtyDay.getDeal()+1);
					}
					//已取消
					else if(stateInteger == 2){
						gridSixtyDay.setCancel(gridSixtyDay.getCancel()+1);
					}
					//转订单
					else if(stateInteger == 3){
						gridSixtyDay.setExpired(gridSixtyDay.getExpired()+1);
					}
				}
				if (days <=90) {
					//总预约单
					gridNintyDay.setAppointment(gridNintyDay.getAppointment()+1);
					//未处理
					if(stateInteger == 0){
						gridNintyDay.setUndeal(gridNintyDay.getUndeal()+1);
					}
					//已处理
					else if(stateInteger == 1){
						gridNintyDay.setDeal(gridNintyDay.getDeal()+1);
					}
					//已取消
					else if(stateInteger == 2){
						gridNintyDay.setCancel(gridNintyDay.getCancel()+1);
					}
					//转订单
					else if(stateInteger == 3){
						gridNintyDay.setExpired(gridNintyDay.getExpired()+1);
					}
				}
			}	
			listday.add(gridThreeDay);
			listday.add(gridSevenDay);
			listday.add(gridThirtyDay);
			listday.add(gridSixtyDay);
			listday.add(gridNintyDay);
			map.put("allAppointmentMap", allAppoResultlist);
			map.put("gridWithDay", listday);
		} catch (Exception e) {
			e.printStackTrace();
			LOGGER.error("count appointmentCount error.msg=[{}]", e.getMessage());
		}
		return map;
	}
		
	
	/**
	 * 团队长根据条件查询检索该团队下所有预约订单
	 * @param OrdersReqBean ordersReqBean
	 * @return  List<OrdersBriefBean>
	 */
	public List<OrdersResBean> leader(OrdersReqBean ordersReqBean){
		List<OrdersResBean> ordersResBeans = appointmentDao.leader(ordersReqBean);
		return ordersResBeans;
		
	}

	/**
	 * 查询团队下所有的预约信息，根据队长的ID
	 * @param OrdersReqBean ordersReqBean
	 * @return  List<OrdersBriefBean>
	 */
	@Override
	public List<Appointment> getGroupAppointment(GroupAppointmentReqBean groupAppointmentReqBean) {
		return appointmentDao.getGroupAppointment(groupAppointmentReqBean);
	}



}
