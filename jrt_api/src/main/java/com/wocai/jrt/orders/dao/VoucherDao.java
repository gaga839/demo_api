package com.wocai.jrt.orders.dao;

import java.util.List;

import com.vteba.tx.jdbc.mybatis.annotation.DaoMapper;
import com.vteba.tx.jdbc.mybatis.spi.BaseDao;
import com.wocai.jrt.orders.model.Voucher;
import com.wocai.jrt.orders.model.VoucherBean;

/**
 * 表voucher的MyBatis Dao Mapper。
 * 由代码工具自动生成，可以新增方法，但是不要修改自动生成的方法。
 * @date 2015-12-16 10:47:16
 */
@DaoMapper
public interface VoucherDao extends BaseDao<Voucher, VoucherBean, String> {
	
	/**
	 * 获取订单支付凭证
	 */
	List<String> getVoucherList(Voucher voucher);
}