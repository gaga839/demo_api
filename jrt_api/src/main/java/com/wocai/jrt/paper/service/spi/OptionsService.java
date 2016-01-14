package com.wocai.jrt.paper.service.spi;

import com.wocai.jrt.paper.model.Options;
import com.wocai.jrt.paper.model.OptionsBean;

import com.vteba.service.generic.MyBatisService;

/**
 * 题目选项相关的业务service接口。
 * @author yinlei
 * @date 2015-11-9 16:40:03
 */
public interface OptionsService extends MyBatisService<Options, OptionsBean, String> {

}
