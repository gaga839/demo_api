package com.wocai.jrt.employee.service.impl;

import javax.inject.Inject;
import javax.inject.Named;

import com.wocai.jrt.employee.dao.TrackDao;
import com.wocai.jrt.employee.model.Track;
import com.wocai.jrt.employee.model.TrackBean;
import com.wocai.jrt.employee.service.spi.TrackService;

import com.vteba.service.generic.impl.MyBatisServiceImpl;
import com.vteba.tx.jdbc.mybatis.spi.BaseDao;

/**
 * 行程轨迹相关的service业务实现。
 * @author yinlei
 * @date 2015-7-27 10:31:04
 */
@Named
public class TrackServiceImpl extends MyBatisServiceImpl<Track, TrackBean, String> implements TrackService {
	
	private TrackDao trackDao;
	
	@Override
	@Inject
	public void setBaseDao(BaseDao<Track, TrackBean, String> trackDao) {
		this.baseDao = trackDao;
		this.trackDao = (TrackDao) trackDao;
	}
}
