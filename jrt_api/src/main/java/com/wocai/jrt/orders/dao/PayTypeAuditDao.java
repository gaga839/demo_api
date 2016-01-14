package com.wocai.jrt.orders.dao;

import com.vteba.tx.jdbc.mybatis.annotation.DaoMapper;
import com.vteba.tx.jdbc.mybatis.spi.BaseDao;
import com.wocai.jrt.orders.model.PayTypeAudit;
import com.wocai.jrt.orders.model.PayTypeAuditBean;

/**
 * 表pay_type_audit的MyBatis Dao Mapper。
 * 由代码工具自动生成，可以新增方法，但是不要修改自动生成的方法。
 * @date 2015-12-16 17:56:47
 */
@DaoMapper
public interface PayTypeAuditDao extends BaseDao<PayTypeAudit, PayTypeAuditBean, String> {
}