package com.wocai.jrt.employee.dao;

import com.vteba.tx.jdbc.mybatis.annotation.DaoMapper;
import com.vteba.tx.jdbc.mybatis.spi.BaseDao;
import com.wocai.jrt.employee.model.GroupMember;
import com.wocai.jrt.employee.model.GroupMemberBean;

/**
 * 表group_member的MyBatis Dao Mapper。
 * 由代码工具自动生成，可以新增方法，但是不要修改自动生成的方法。
 * @date 2015-07-24 11:23:26
 */
@DaoMapper
public interface GroupMemberDao extends BaseDao<GroupMember, GroupMemberBean, String> {
}