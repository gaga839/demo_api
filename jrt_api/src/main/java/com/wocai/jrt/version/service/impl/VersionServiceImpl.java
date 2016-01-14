package com.wocai.jrt.version.service.impl;

import javax.inject.Inject;
import javax.inject.Named;

import com.wocai.jrt.version.dao.VersionDao;
import com.wocai.jrt.version.model.Version;
import com.wocai.jrt.version.model.VersionBean;
import com.wocai.jrt.version.service.spi.VersionService;
import com.vteba.service.generic.impl.MyBatisServiceImpl;
import com.vteba.tx.jdbc.mybatis.spi.BaseDao;

/**
 * 版本相关的service业务实现。
 * @author yinlei
 * @date 2015-7-28 14:06:14
 */
@Named
public class VersionServiceImpl extends MyBatisServiceImpl<Version, VersionBean, String> implements VersionService {
	
	protected VersionDao versionDao;
	
	@Override
	@Inject
	public void setBaseDao(BaseDao<Version, VersionBean, String> versionDao) {
		this.baseDao = versionDao;
		this.versionDao = (VersionDao) versionDao;
	}
}