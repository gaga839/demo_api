package com.wocai.jrt.orders.service.impl;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import com.wocai.jrt.orders.dao.VoucherDao;
import com.wocai.jrt.orders.model.Voucher;
import com.wocai.jrt.orders.model.VoucherBean;
import com.wocai.jrt.orders.service.spi.VoucherService;
import com.vteba.service.generic.impl.MyBatisServiceImpl;
import com.vteba.tx.jdbc.mybatis.spi.BaseDao;

/**
 * 订单凭证相关的service业务实现。
 * @author yinlei
 * @date 2015-12-16 10:47:15
 */
@Named
public class VoucherServiceImpl extends MyBatisServiceImpl<Voucher, VoucherBean, String> implements VoucherService {
	// 添加了方法后，记得改为private
	protected VoucherDao voucherDao;
	
	@Override
	@Inject
	public void setBaseDao(BaseDao<Voucher, VoucherBean, String> voucherDao) {
		this.baseDao = voucherDao;
		this.voucherDao = (VoucherDao) voucherDao;
	}
	
	/**
	 * 获取订单支付凭证
	 */
	@Override
	public List<String> getVoucherList(Voucher voucher) {
		return voucherDao.getVoucherList(voucher);
	}
}
