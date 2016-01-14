package com.wocai.jrt.ads.service.spi;

import com.wocai.jrt.ads.model.Ads;
import com.wocai.jrt.ads.model.AdsBean;

import com.vteba.service.generic.MyBatisService;

/**
 * 广告相关的业务service接口。
 * @author yinlei
 * @date 2015-12-14 17:49:50
 */
public interface AdsService extends MyBatisService<Ads, AdsBean, String> {

}
