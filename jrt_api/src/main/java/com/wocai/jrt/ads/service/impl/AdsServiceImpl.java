package com.wocai.jrt.ads.service.impl;

import javax.inject.Inject;
import javax.inject.Named;

import com.wocai.jrt.ads.dao.AdsDao;
import com.wocai.jrt.ads.model.Ads;
import com.wocai.jrt.ads.model.AdsBean;
import com.wocai.jrt.ads.service.spi.AdsService;

import com.vteba.service.generic.impl.MyBatisServiceImpl;
import com.vteba.tx.jdbc.mybatis.spi.BaseDao;

/**
 * 广告相关的service业务实现。
 * @author yinlei
 * @date 2015-12-14 17:49:50
 */
@Named
public class AdsServiceImpl extends MyBatisServiceImpl<Ads, AdsBean, String> implements AdsService {
	// 添加了方法后，记得改为private
	protected AdsDao adsDao;
	
	@Override
	@Inject
	public void setBaseDao(BaseDao<Ads, AdsBean, String> adsDao) {
		this.baseDao = adsDao;
		this.adsDao = (AdsDao) adsDao;
	}
}
