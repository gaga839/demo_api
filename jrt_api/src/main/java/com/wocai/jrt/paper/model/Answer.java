package com.wocai.jrt.paper.model;

public class Answer {
    /**
     * order by 排序语句
     * 对应数据库表字段 answer
     */
    private String orderBy;

    /**
     * 分页开始记录
     * 对应数据库表字段 answer
     */
    private Integer start;

    /**
     * 分页大小
     * 对应数据库表字段 answer
     */
    private int pageSize = 10;

    /**
     * 是否去重
     * 对应数据库表字段 answer
     */
    private boolean distinct;

    /**
     * 对应数据库表字段 answer.id
     */
    private String id;

    /**
     * 对应数据库表字段 answer.investor_id
     */
    private String investorId;

    /**
     * 对应数据库表字段 answer.org_id
     */
    private String orgId;

    /**
     * 对应数据库表字段 answer.question_id
     */
    private String questionId;

    /**
     * 对应数据库表字段 answer.score
     */
    private Integer score;

    /**
     * 对应数据库表字段 answer.answer_option
     */
    private String answerOption;

    /**
     * 对应数据库表字段 answer.paper_id
     */
    private String paperId;

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
     * 获得字段 answer.id 的值
     *
     * @return the value of answer.id
     */
    public String getId() {
        return id;
    }

    /**
     * 设置字段 answer.id 的值
     *
     * @param id the value for answer.id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获得字段 answer.investor_id 的值
     *
     * @return the value of answer.investor_id
     */
    public String getInvestorId() {
        return investorId;
    }

    /**
     * 设置字段 answer.investor_id 的值
     *
     * @param investorId the value for answer.investor_id
     */
    public void setInvestorId(String investorId) {
        this.investorId = investorId;
    }

    /**
     * 获得字段 answer.org_id 的值
     *
     * @return the value of answer.org_id
     */
    public String getOrgId() {
        return orgId;
    }

    /**
     * 设置字段 answer.org_id 的值
     *
     * @param orgId the value for answer.org_id
     */
    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    /**
     * 获得字段 answer.question_id 的值
     *
     * @return the value of answer.question_id
     */
    public String getQuestionId() {
        return questionId;
    }

    /**
     * 设置字段 answer.question_id 的值
     *
     * @param questionId the value for answer.question_id
     */
    public void setQuestionId(String questionId) {
        this.questionId = questionId;
    }

    /**
     * 获得字段 answer.score 的值
     *
     * @return the value of answer.score
     */
    public Integer getScore() {
        return score;
    }

    /**
     * 设置字段 answer.score 的值
     *
     * @param score the value for answer.score
     */
    public void setScore(Integer score) {
        this.score = score;
    }

    /**
     * 获得字段 answer.answer_option 的值
     *
     * @return the value of answer.answer_option
     */
    public String getAnswerOption() {
        return answerOption;
    }

    /**
     * 设置字段 answer.answer_option 的值
     *
     * @param answerOption the value for answer.answer_option
     */
    public void setAnswerOption(String answerOption) {
        this.answerOption = answerOption;
    }

    /**
     * 获得字段 answer.paper_id 的值
     *
     * @return the value of answer.paper_id
     */
    public String getPaperId() {
        return paperId;
    }

    /**
     * 设置字段 answer.paper_id 的值
     *
     * @param paperId the value for answer.paper_id
     */
    public void setPaperId(String paperId) {
        this.paperId = paperId;
    }
}