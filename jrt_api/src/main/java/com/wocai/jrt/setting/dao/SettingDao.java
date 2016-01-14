package com.wocai.jrt.setting.dao;

import com.vteba.tx.jdbc.mybatis.annotation.DaoMapper;
import com.vteba.tx.jdbc.mybatis.spi.BaseDao;
import com.wocai.jrt.setting.model.Setting;
import com.wocai.jrt.setting.model.SettingBean;

/**
 * 表setting的MyBatis Dao Mapper。
 * 由代码工具自动生成，可以新增方法，但是不要修改自动生成的方法。
 * @date 2015-12-08 10:50:07
 */
@DaoMapper
public interface SettingDao extends BaseDao<Setting, SettingBean, String> {
}