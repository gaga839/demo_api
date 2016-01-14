package com.wocai.jrt.employee.service.spi;

import com.wocai.jrt.employee.model.GroupMember;
import com.wocai.jrt.employee.model.GroupMemberBean;

import com.vteba.service.generic.MyBatisService;

/**
 * 团队成员相关的业务service接口。
 * @author yinlei
 * @date 2015-7-24 11:23:25
 */
public interface GroupMemberService extends MyBatisService<GroupMember, GroupMemberBean, String> {

}
