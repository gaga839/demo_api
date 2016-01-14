package com.wocai.jrt.orders.service.spi;

import com.wocai.jrt.orders.model.PayTypeAudit;
import com.wocai.jrt.orders.model.PayTypeAuditBean;

import com.vteba.service.generic.MyBatisService;

/**
 * 支付方式申请审核相关的业务service接口。
 * @author yinlei
 * @date 2015-12-16 17:56:47
 */
public interface PayTypeAuditService extends MyBatisService<PayTypeAudit, PayTypeAuditBean, String> {

}
