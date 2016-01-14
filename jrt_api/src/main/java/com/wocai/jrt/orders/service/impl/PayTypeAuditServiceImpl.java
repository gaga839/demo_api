package com.wocai.jrt.orders.service.impl;

import javax.inject.Inject;
import javax.inject.Named;

import com.wocai.jrt.orders.dao.PayTypeAuditDao;
import com.wocai.jrt.orders.model.PayTypeAudit;
import com.wocai.jrt.orders.model.PayTypeAuditBean;
import com.wocai.jrt.orders.service.spi.PayTypeAuditService;

import com.vteba.service.generic.impl.MyBatisServiceImpl;
import com.vteba.tx.jdbc.mybatis.spi.BaseDao;

/**
 * 支付方式申请审核相关的service业务实现。
 * @author yinlei
 * @date 2015-12-16 17:56:47
 */
@Named
public class PayTypeAuditServiceImpl extends MyBatisServiceImpl<PayTypeAudit, PayTypeAuditBean, String> implements PayTypeAuditService {
	// 添加了方法后，记得改为private
	protected PayTypeAuditDao payTypeAuditDao;
	
	@Override
	@Inject
	public void setBaseDao(BaseDao<PayTypeAudit, PayTypeAuditBean, String> payTypeAuditDao) {
		this.baseDao = payTypeAuditDao;
		this.payTypeAuditDao = (PayTypeAuditDao) payTypeAuditDao;
	}
}
