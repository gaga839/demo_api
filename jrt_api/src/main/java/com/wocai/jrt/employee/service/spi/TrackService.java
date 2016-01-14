package com.wocai.jrt.employee.service.spi;

import com.wocai.jrt.employee.model.Track;
import com.wocai.jrt.employee.model.TrackBean;

import com.vteba.service.generic.MyBatisService;

/**
 * 行程轨迹相关的业务service接口。
 * @author yinlei
 * @date 2015-7-27 10:31:04
 */
public interface TrackService extends MyBatisService<Track, TrackBean, String> {

}
