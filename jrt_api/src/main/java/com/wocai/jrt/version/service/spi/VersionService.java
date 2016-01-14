package com.wocai.jrt.version.service.spi;

import com.wocai.jrt.version.model.Version;
import com.wocai.jrt.version.model.VersionBean;
import com.vteba.service.generic.MyBatisService;

/**
 * 版本相关的业务service接口。
 * @author yinlei
 * @date 2015-7-28 14:06:14
 */
public interface VersionService extends MyBatisService<Version, VersionBean, String> {
}