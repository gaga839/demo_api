package com.wocai.jrt.orders.service.spi;

import java.util.Date;
import java.util.List;

import com.wocai.jrt.orders.bean.EmployeeGroupAmountBean;
import com.wocai.jrt.orders.model.PaySerial;
import com.wocai.jrt.orders.model.PaySerialBean;
import com.vteba.service.generic.MyBatisService;
import com.vteba.web.action.JsonBean;

/**
 * 订单支付流水相关的业务service接口。
 * 
 * @author yinlei
 * @date 2015-7-27 19:32:12
 */
public interface PaySerialService extends MyBatisService<PaySerial, PaySerialBean, String> {
	// 查询自己交易了多少单
	int getOrdersNumber(String employeeId, Date beginDate, Date endDate);

	// 查询自己总共的交易量
	Double getOrdersAmount(String employeeId, Date beginDate, Date endDate);

	// 查询自己最大单
	Double getOrdersMost(String employeeId, Date beginDate, Date endDate);

	// 查询自己团队里面每个理财师的交易量
	List<EmployeeGroupAmountBean> queryEmployeeGroupAmountList(String employeeId, Date beginDate,
			Date endDate);

	JsonBean callback(PaySerial paySerial, String tokenId) throws Exception;
}
