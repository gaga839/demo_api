package com.wocai.jrt.customer.model;

public class Customer {
    /**
     * order by 排序语句
     * 对应数据库表字段 customer
     */
    private String orderBy;

    /**
     * 分页开始记录
     * 对应数据库表字段 customer
     */
    private Integer start;

    /**
     * 分页大小
     * 对应数据库表字段 customer
     */
    private int pageSize = 10;

    /**
     * 是否去重
     * 对应数据库表字段 customer
     */
    private boolean distinct;

    /**
     * 对应数据库表字段 customer.id
     */
    private String id;

    /**
     * 对应数据库表字段 customer.name
     */
    private String name;

    /**
     * 对应数据库表字段 customer.gender
     */
    private Integer gender;

    /**
     * 对应数据库表字段 customer.password
     */
    private String password;

    /**
     * 对应数据库表字段 customer.avatar
     */
    private String avatar;

    /**
     * 对应数据库表字段 customer.mobile
     */
    private String mobile;

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
     * 获得字段 customer.id 的值
     *
     * @return the value of customer.id
     */
    public String getId() {
        return id;
    }

    /**
     * 设置字段 customer.id 的值
     *
     * @param id the value for customer.id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获得字段 customer.name 的值
     *
     * @return the value of customer.name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置字段 customer.name 的值
     *
     * @param name the value for customer.name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获得字段 customer.gender 的值
     *
     * @return the value of customer.gender
     */
    public Integer getGender() {
        return gender;
    }

    /**
     * 设置字段 customer.gender 的值
     *
     * @param gender the value for customer.gender
     */
    public void setGender(Integer gender) {
        this.gender = gender;
    }

    /**
     * 获得字段 customer.password 的值
     *
     * @return the value of customer.password
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置字段 customer.password 的值
     *
     * @param password the value for customer.password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获得字段 customer.avatar 的值
     *
     * @return the value of customer.avatar
     */
    public String getAvatar() {
        return avatar;
    }

    /**
     * 设置字段 customer.avatar 的值
     *
     * @param avatar the value for customer.avatar
     */
    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    /**
     * 获得字段 customer.mobile 的值
     *
     * @return the value of customer.mobile
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * 设置字段 customer.mobile 的值
     *
     * @param mobile the value for customer.mobile
     */
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}