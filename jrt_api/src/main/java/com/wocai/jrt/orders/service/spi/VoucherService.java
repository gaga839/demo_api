package com.wocai.jrt.orders.service.spi;

import java.util.List;

import com.wocai.jrt.orders.model.Voucher;
import com.wocai.jrt.orders.model.VoucherBean;
import com.vteba.service.generic.MyBatisService;

/**
 * 订单凭证相关的业务service接口。
 * @author yinlei
 * @date 2015-12-16 10:47:15
 */
public interface VoucherService extends MyBatisService<Voucher, VoucherBean, String> {
	/**
	 * 获取订单支付凭证
	 */
	List<String> getVoucherList(Voucher voucher);

}
