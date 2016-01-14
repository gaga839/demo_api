package com.wocai.jrt.employee.service.spi;

import com.wocai.jrt.employee.model.Org;
import com.wocai.jrt.employee.model.OrgBean;

import com.vteba.service.generic.MyBatisService;

/**
 * 机构相关的业务service接口。
 * @author yinlei
 * @date 2015-9-8 10:18:19
 */
public interface OrgService extends MyBatisService<Org, OrgBean, String> {

}
