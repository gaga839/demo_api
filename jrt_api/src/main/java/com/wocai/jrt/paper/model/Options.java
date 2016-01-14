package com.wocai.jrt.paper.model;

public class Options {
    /**
     * order by 排序语句
     * 对应数据库表字段 options
     */
    private String orderBy;

    /**
     * 分页开始记录
     * 对应数据库表字段 options
     */
    private Integer start;

    /**
     * 分页大小
     * 对应数据库表字段 options
     */
    private int pageSize = 10;

    /**
     * 是否去重
     * 对应数据库表字段 options
     */
    private boolean distinct;

    /**
     * 对应数据库表字段 options.id
     */
    private String id;

    /**
     * 对应数据库表字段 options.question_id
     */
    private String questionId;

    /**
     * 对应数据库表字段 options.no
     */
    private String no;

    /**
     * 对应数据库表字段 options.content
     */
    private String content;

    /**
     * 对应数据库表字段 options.score
     */
    private Integer score;

    /**
     * 对应数据库表字段 options.unqualified
     */
    private Boolean unqualified;

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
     * 获得字段 options.id 的值
     *
     * @return the value of options.id
     */
    public String getId() {
        return id;
    }

    /**
     * 设置字段 options.id 的值
     *
     * @param id the value for options.id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获得字段 options.question_id 的值
     *
     * @return the value of options.question_id
     */
    public String getQuestionId() {
        return questionId;
    }

    /**
     * 设置字段 options.question_id 的值
     *
     * @param questionId the value for options.question_id
     */
    public void setQuestionId(String questionId) {
        this.questionId = questionId;
    }

    /**
     * 获得字段 options.no 的值
     *
     * @return the value of options.no
     */
    public String getNo() {
        return no;
    }

    /**
     * 设置字段 options.no 的值
     *
     * @param no the value for options.no
     */
    public void setNo(String no) {
        this.no = no;
    }

    /**
     * 获得字段 options.content 的值
     *
     * @return the value of options.content
     */
    public String getContent() {
        return content;
    }

    /**
     * 设置字段 options.content 的值
     *
     * @param content the value for options.content
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * 获得字段 options.score 的值
     *
     * @return the value of options.score
     */
    public Integer getScore() {
        return score;
    }

    /**
     * 设置字段 options.score 的值
     *
     * @param score the value for options.score
     */
    public void setScore(Integer score) {
        this.score = score;
    }

    /**
     * 获得字段 options.unqualified 的值
     *
     * @return the value of options.unqualified
     */
    public Boolean getUnqualified() {
        return unqualified;
    }

    /**
     * 设置字段 options.unqualified 的值
     *
     * @param unqualified the value for options.unqualified
     */
    public void setUnqualified(Boolean unqualified) {
        this.unqualified = unqualified;
    }
}