package com.wocai.jrt.ads.dao;

import com.vteba.tx.jdbc.mybatis.annotation.DaoMapper;
import com.vteba.tx.jdbc.mybatis.spi.BaseDao;
import com.wocai.jrt.ads.model.Ads;
import com.wocai.jrt.ads.model.AdsBean;

/**
 * 表ads的MyBatis Dao Mapper。
 * 由代码工具自动生成，可以新增方法，但是不要修改自动生成的方法。
 * @date 2015-12-14 17:49:51
 */
@DaoMapper
public interface AdsDao extends BaseDao<Ads, AdsBean, String> {
}