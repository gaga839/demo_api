package com.wocai.jrt.about.service.spi;

import com.wocai.jrt.about.model.About;
import com.wocai.jrt.about.model.AboutBean;
import com.vteba.service.generic.MyBatisService;

/**
 * 关于我们相关的业务service接口。
 * @author yinlei
 * @date 2015-7-31 10:43:06
 */
public interface AboutService extends MyBatisService<About, AboutBean, String> {
	About getAbout(String productId);
}
