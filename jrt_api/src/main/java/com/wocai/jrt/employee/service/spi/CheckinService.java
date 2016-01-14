package com.wocai.jrt.employee.service.spi;

import com.wocai.jrt.employee.model.Checkin;
import com.wocai.jrt.employee.model.CheckinBean;
import com.vteba.service.generic.MyBatisService;

/**
 * 签到相关的业务service接口。
 * @author yinlei
 * @date 2015-8-17 16:11:01
 */
public interface CheckinService extends MyBatisService<Checkin, CheckinBean, String> {
	

}
