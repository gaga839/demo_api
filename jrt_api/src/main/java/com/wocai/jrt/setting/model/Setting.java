package com.wocai.jrt.setting.model;

public class Setting {
    /**
     * order by 排序语句
     * 对应数据库表字段 setting
     */
    private String orderBy;

    /**
     * 分页开始记录
     * 对应数据库表字段 setting
     */
    private Integer start;

    /**
     * 分页大小
     * 对应数据库表字段 setting
     */
    private int pageSize = 10;

    /**
     * 是否去重
     * 对应数据库表字段 setting
     */
    private boolean distinct;

    /**
     * 对应数据库表字段 setting.id
     */
    private String id;

    /**
     * 对应数据库表字段 setting.org_id
     */
    private String orgId;

    /**
     * 对应数据库表字段 setting.key_name
     */
    private String keyName;

    /**
     * 对应数据库表字段 setting.key_value
     */
    private String keyValue;

    /**
     * 对应数据库表字段 setting.remark
     */
    private String remark;

    /**
     * 对应数据库表字段 setting.flag
     */
    private Boolean flag;

    /**
     * 对应数据库表字段 setting.content
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
     * 获得字段 setting.id 的值
     *
     * @return the value of setting.id
     */
    public String getId() {
        return id;
    }

    /**
     * 设置字段 setting.id 的值
     *
     * @param id the value for setting.id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获得字段 setting.org_id 的值
     *
     * @return the value of setting.org_id
     */
    public String getOrgId() {
        return orgId;
    }

    /**
     * 设置字段 setting.org_id 的值
     *
     * @param orgId the value for setting.org_id
     */
    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    /**
     * 获得字段 setting.key_name 的值
     *
     * @return the value of setting.key_name
     */
    public String getKeyName() {
        return keyName;
    }

    /**
     * 设置字段 setting.key_name 的值
     *
     * @param keyName the value for setting.key_name
     */
    public void setKeyName(String keyName) {
        this.keyName = keyName;
    }

    /**
     * 获得字段 setting.key_value 的值
     *
     * @return the value of setting.key_value
     */
    public String getKeyValue() {
        return keyValue;
    }

    /**
     * 设置字段 setting.key_value 的值
     *
     * @param keyValue the value for setting.key_value
     */
    public void setKeyValue(String keyValue) {
        this.keyValue = keyValue;
    }

    /**
     * 获得字段 setting.remark 的值
     *
     * @return the value of setting.remark
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置字段 setting.remark 的值
     *
     * @param remark the value for setting.remark
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * 获得字段 setting.flag 的值
     *
     * @return the value of setting.flag
     */
    public Boolean getFlag() {
        return flag;
    }

    /**
     * 设置字段 setting.flag 的值
     *
     * @param flag the value for setting.flag
     */
    public void setFlag(Boolean flag) {
        this.flag = flag;
    }

    /**
     * 获得字段 setting.content 的值
     *
     * @return the value of setting.content
     */
    public String getContent() {
        return content;
    }

    /**
     * 设置字段 setting.content 的值
     *
     * @param content the value for setting.content
     */
    public void setContent(String content) {
        this.content = content;
    }
}