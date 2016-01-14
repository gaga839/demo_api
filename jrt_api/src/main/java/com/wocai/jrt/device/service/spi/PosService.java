package com.wocai.jrt.device.service.spi;

import com.wocai.jrt.device.model.Pos;
import com.wocai.jrt.device.model.PosBean;

import com.vteba.service.generic.MyBatisService;

/**
 * POS机相关的业务service接口。
 * @author yinlei
 * @date 2015-9-8 14:13:55
 */
public interface PosService extends MyBatisService<Pos, PosBean, String> {

}
