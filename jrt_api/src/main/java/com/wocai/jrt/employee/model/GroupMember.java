package com.wocai.jrt.employee.model;

public class GroupMember {
    /**
     * order by 排序语句
     * 对应数据库表字段 group_member
     */
    private String orderBy;

    /**
     * 分页开始记录
     * 对应数据库表字段 group_member
     */
    private Integer start;

    /**
     * 分页大小
     * 对应数据库表字段 group_member
     */
    private int pageSize = 10;

    /**
     * 是否去重
     * 对应数据库表字段 group_member
     */
    private boolean distinct;

    /**
     * 对应数据库表字段 group_member.id
     */
    private String id;

    /**
     * 对应数据库表字段 group_member.group_id
     */
    private String groupId;

    /**
     * 对应数据库表字段 group_member.employee_id
     */
    private String employeeId;

    /**
     * 设置 order by 排序语句
     */
    public void setOrderBy(String orderBy) {
        this.orderBy = orderBy;
    }

    /**
     * 获得 order by 排序语句
     */
    public String getOrderBy() {
        return orderBy;
    }

    /**
     * 设置 start，分页开始记录
     */
    public void setStart(Integer start) {
        this.start = start;
    }

    /**
     * 获得 start，分页开始记录
     */
    public Integer getStart() {
        return start;
    }

    /**
     * 设置 pageSize，分页大小
     */
    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    /**
     * 获得 pageSize，分页大小
     */
    public int getPageSize() {
        return pageSize;
    }

    /**
     * 设置 distinct，是否去重
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * 获得 distinct，是否去重
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * 获得字段 group_member.id 的值
     *
     * @return the value of group_member.id
     */
    public String getId() {
        return id;
    }

    /**
     * 设置字段 group_member.id 的值
     *
     * @param id the value for group_member.id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获得字段 group_member.group_id 的值
     *
     * @return the value of group_member.group_id
     */
    public String getGroupId() {
        return groupId;
    }

    /**
     * 设置字段 group_member.group_id 的值
     *
     * @param groupId the value for group_member.group_id
     */
    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    /**
     * 获得字段 group_member.employee_id 的值
     *
     * @return the value of group_member.employee_id
     */
    public String getEmployeeId() {
        return employeeId;
    }

    /**
     * 设置字段 group_member.employee_id 的值
     *
     * @param employeeId the value for group_member.employee_id
     */
    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }
}