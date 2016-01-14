package com.wocai.jrt.about.model;

public class About {
    /**
     * order by 排序语句
     * 对应数据库表字段 about
     */
    private String orderBy;

    /**
     * 分页开始记录
     * 对应数据库表字段 about
     */
    private Integer start;

    /**
     * 分页大小
     * 对应数据库表字段 about
     */
    private int pageSize = 10;

    /**
     * 是否去重
     * 对应数据库表字段 about
     */
    private boolean distinct;

    /**
     * 对应数据库表字段 about.id
     */
    private String id;

    /**
     * 对应数据库表字段 about.title
     */
    private String title;

    /**
     * 对应数据库表字段 about.org_id
     */
    private String orgId;

    /**
     * 对应数据库表字段 about.orders
     */
    private Integer orders;

    /**
     * 对应数据库表字段 about.content
     */
    private String content;

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
    public void setPage(Integer start) {
        this.start = start;
    }

    /**
     * 获得 start，分页开始记录
     */
    public Integer getPage() {
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
     * 获得字段 about.id 的值
     *
     * @return the value of about.id
     */
    public String getId() {
        return id;
    }

    /**
     * 设置字段 about.id 的值
     *
     * @param id the value for about.id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获得字段 about.title 的值
     *
     * @return the value of about.title
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置字段 about.title 的值
     *
     * @param title the value for about.title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 获得字段 about.org_id 的值
     *
     * @return the value of about.org_id
     */
    public String getOrgId() {
        return orgId;
    }

    /**
     * 设置字段 about.org_id 的值
     *
     * @param orgId the value for about.org_id
     */
    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    /**
     * 获得字段 about.orders 的值
     *
     * @return the value of about.orders
     */
    public Integer getOrders() {
        return orders;
    }

    /**
     * 设置字段 about.orders 的值
     *
     * @param orders the value for about.orders
     */
    public void setOrders(Integer orders) {
        this.orders = orders;
    }

    /**
     * 获得字段 about.content 的值
     *
     * @return the value of about.content
     */
    public String getContent() {
        return content;
    }

    /**
     * 设置字段 about.content 的值
     *
     * @param content the value for about.content
     */
    public void setContent(String content) {
        this.content = content;
    }
}