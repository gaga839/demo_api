package com.wocai.jrt.employee.service.impl;

import javax.inject.Inject;
import javax.inject.Named;

import com.wocai.jrt.employee.dao.GroupMemberDao;
import com.wocai.jrt.employee.model.GroupMember;
import com.wocai.jrt.employee.model.GroupMemberBean;
import com.wocai.jrt.employee.service.spi.GroupMemberService;

import com.vteba.service.generic.impl.MyBatisServiceImpl;
import com.vteba.tx.jdbc.mybatis.spi.BaseDao;

/**
 * 团队成员相关的service业务实现。
 * @author yinlei
 * @date 2015-7-24 11:23:25
 */
@Named
public class GroupMemberServiceImpl extends MyBatisServiceImpl<GroupMember, GroupMemberBean, String> implements GroupMemberService {
	// 添加了方法后，记得改为private
	protected GroupMemberDao groupMemberDao;
	
	@Override
	@Inject
	public void setBaseDao(BaseDao<GroupMember, GroupMemberBean, String> groupMemberDao) {
		this.baseDao = groupMemberDao;
		this.groupMemberDao = (GroupMemberDao) groupMemberDao;
	}
}
