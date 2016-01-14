package com.wocai.jrt.investor.model;

public class InvestorGroup {
    /**
     * order by 排序语句
     * 对应数据库表字段 investor_group
     */
    private String orderBy;

    /**
     * 分页开始记录
     * 对应数据库表字段 investor_group
     */
    private Integer start;

    /**
     * 分页大小
     * 对应数据库表字段 investor_group
     */
    private int pageSize = 10;

    /**
     * 是否去重
     * 对应数据库表字段 investor_group
     */
    private boolean distinct;

    /**
     * 对应数据库表字段 investor_group.id
     */
    private String id;

    /**
     * 对应数据库表字段 investor_group.name
     */
    private String name;

    /**
     * 对应数据库表字段 investor_group.number
     */
    private Integer number;

    /**
     * 对应数据库表字段 investor_group.org_id
     */
    private String orgId;

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
     * 获得字段 investor_group.id 的值
     *
     * @return the value of investor_group.id
     */
    public String getId() {
        return id;
    }

    /**
     * 设置字段 investor_group.id 的值
     *
     * @param id the value for investor_group.id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获得字段 investor_group.name 的值
     *
     * @return the value of investor_group.name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置字段 investor_group.name 的值
     *
     * @param name the value for investor_group.name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获得字段 investor_group.number 的值
     *
     * @return the value of investor_group.number
     */
    public Integer getNumber() {
        return number;
    }

    /**
     * 设置字段 investor_group.number 的值
     *
     * @param number the value for investor_group.number
     */
    public void setNumber(Integer number) {
        this.number = number;
    }

    /**
     * 获得字段 investor_group.org_id 的值
     *
     * @return the value of investor_group.org_id
     */
    public String getOrgId() {
        return orgId;
    }

    /**
     * 设置字段 investor_group.org_id 的值
     *
     * @param orgId the value for investor_group.org_id
     */
    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }
}