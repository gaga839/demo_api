package com.wocai.jrt.setting.service.spi;

import com.wocai.jrt.setting.model.Setting;
import com.wocai.jrt.setting.model.SettingBean;

import com.vteba.service.generic.MyBatisService;

/**
 * 系统设置相关的业务service接口。
 * @author yinlei
 * @date 2015-12-8 10:50:07
 */
public interface SettingService extends MyBatisService<Setting, SettingBean, String> {

}
