package com.wocai.jrt.paper.service.spi;

import com.wocai.jrt.paper.model.Paper;
import com.wocai.jrt.paper.model.PaperBean;

import com.vteba.service.generic.MyBatisService;

/**
 * 测评试卷相关的业务service接口。
 * @author yinlei
 * @date 2015-11-9 16:40:03
 */
public interface PaperService extends MyBatisService<Paper, PaperBean, String> {

}
