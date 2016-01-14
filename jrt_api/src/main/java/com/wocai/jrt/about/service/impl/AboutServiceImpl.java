package com.wocai.jrt.about.service.impl;

import javax.inject.Inject;
import javax.inject.Named;

import com.wocai.jrt.about.dao.AboutDao;
import com.wocai.jrt.about.model.About;
import com.wocai.jrt.about.model.AboutBean;
import com.wocai.jrt.about.service.spi.AboutService;
import com.vteba.service.generic.impl.MyBatisServiceImpl;
import com.vteba.tx.jdbc.mybatis.spi.BaseDao;

/**
 * 关于我们相关的service业务实现。
 * @author yinlei
 * @date 2015-7-31 10:43:06
 */
@Named
public class AboutServiceImpl extends MyBatisServiceImpl<About, AboutBean, String> implements AboutService {
	
	private AboutDao aboutDao;
	
	@Override
	@Inject
	public void setBaseDao(BaseDao<About, AboutBean, String> aboutDao) {
		this.baseDao = aboutDao;
		this.aboutDao = (AboutDao) aboutDao;
	}

	@Override
	public About getAbout(String productId) {
		return aboutDao.getAbout(productId);
	}
}
