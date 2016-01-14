package com.wocai.jrt.paper.model;

import java.util.ArrayList;
import java.util.List;

public class AnswerBean {
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
     * 是否指定 distinct 去除重复
     * 对应数据库表字段 answer
     */
    private boolean distinct;

    /**
     * 逻辑or语句
     * 对应数据库表字段 answer
     */
    private List<Criteria> oredCriteria;

    /**
     */
    public AnswerBean() {
        oredCriteria = new ArrayList<Criteria>();
    }

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
     * 设置是否指定 distinct 去除重复
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * 是否设置了distinct语句，true是，false否。
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * 获得逻辑or语句
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * 添加逻辑or语句
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * 添加逻辑and语句
     */
    public void and(Criteria criteria) {
        criteria.setAndRelation(true);
        oredCriteria.add(criteria);
    }

    /**
     * 新建逻辑或or语句
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * 新建逻辑and语句
     */
    public Criteria and() {
        Criteria criteria = createCriteriaInternal();
        criteria.setAndRelation(true);
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * 创建查询条件，如果逻辑或为空，同时将查询条件放入。
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * 创建新查询条件。
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * 清除逻辑或or语句，并且distinct为false，不去重。
     */
    public void clear() {
        oredCriteria.clear();
    }

    /**
     * 该类对应数据库表 answer
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void orCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition, true));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void orCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value, true));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        protected void orCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2, true));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria orIdIsNull() {
            orCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria orIdIsNotNull() {
            orCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria orIdEqualTo(String value) {
            orCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria orIdNotEqualTo(String value) {
            orCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria orIdGreaterThan(String value) {
            orCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria orIdGreaterThanOrEqualTo(String value) {
            orCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria orIdLessThan(String value) {
            orCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria orIdLessThanOrEqualTo(String value) {
            orCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria orIdLike(String value) {
            orCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria orIdNotLike(String value) {
            orCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria orIdIn(List<String> values) {
            orCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria orIdNotIn(List<String> values) {
            orCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria orIdBetween(String value1, String value2) {
            orCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria orIdNotBetween(String value1, String value2) {
            orCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andInvestorIdIsNull() {
            addCriterion("investor_id is null");
            return (Criteria) this;
        }

        public Criteria andInvestorIdIsNotNull() {
            addCriterion("investor_id is not null");
            return (Criteria) this;
        }

        public Criteria andInvestorIdEqualTo(String value) {
            addCriterion("investor_id =", value, "investorId");
            return (Criteria) this;
        }

        public Criteria andInvestorIdNotEqualTo(String value) {
            addCriterion("investor_id <>", value, "investorId");
            return (Criteria) this;
        }

        public Criteria andInvestorIdGreaterThan(String value) {
            addCriterion("investor_id >", value, "investorId");
            return (Criteria) this;
        }

        public Criteria andInvestorIdGreaterThanOrEqualTo(String value) {
            addCriterion("investor_id >=", value, "investorId");
            return (Criteria) this;
        }

        public Criteria andInvestorIdLessThan(String value) {
            addCriterion("investor_id <", value, "investorId");
            return (Criteria) this;
        }

        public Criteria andInvestorIdLessThanOrEqualTo(String value) {
            addCriterion("investor_id <=", value, "investorId");
            return (Criteria) this;
        }

        public Criteria orInvestorIdIsNull() {
            orCriterion("investor_id is null");
            return (Criteria) this;
        }

        public Criteria orInvestorIdIsNotNull() {
            orCriterion("investor_id is not null");
            return (Criteria) this;
        }

        public Criteria orInvestorIdEqualTo(String value) {
            orCriterion("investor_id =", value, "investorId");
            return (Criteria) this;
        }

        public Criteria orInvestorIdNotEqualTo(String value) {
            orCriterion("investor_id <>", value, "investorId");
            return (Criteria) this;
        }

        public Criteria orInvestorIdGreaterThan(String value) {
            orCriterion("investor_id >", value, "investorId");
            return (Criteria) this;
        }

        public Criteria orInvestorIdGreaterThanOrEqualTo(String value) {
            orCriterion("investor_id >=", value, "investorId");
            return (Criteria) this;
        }

        public Criteria orInvestorIdLessThan(String value) {
            orCriterion("investor_id <", value, "investorId");
            return (Criteria) this;
        }

        public Criteria orInvestorIdLessThanOrEqualTo(String value) {
            orCriterion("investor_id <=", value, "investorId");
            return (Criteria) this;
        }

        public Criteria andInvestorIdLike(String value) {
            addCriterion("investor_id like", value, "investorId");
            return (Criteria) this;
        }

        public Criteria andInvestorIdNotLike(String value) {
            addCriterion("investor_id not like", value, "investorId");
            return (Criteria) this;
        }

        public Criteria orInvestorIdLike(String value) {
            orCriterion("investor_id like", value, "investorId");
            return (Criteria) this;
        }

        public Criteria orInvestorIdNotLike(String value) {
            orCriterion("investor_id not like", value, "investorId");
            return (Criteria) this;
        }

        public Criteria andInvestorIdIn(List<String> values) {
            addCriterion("investor_id in", values, "investorId");
            return (Criteria) this;
        }

        public Criteria andInvestorIdNotIn(List<String> values) {
            addCriterion("investor_id not in", values, "investorId");
            return (Criteria) this;
        }

        public Criteria andInvestorIdBetween(String value1, String value2) {
            addCriterion("investor_id between", value1, value2, "investorId");
            return (Criteria) this;
        }

        public Criteria andInvestorIdNotBetween(String value1, String value2) {
            addCriterion("investor_id not between", value1, value2, "investorId");
            return (Criteria) this;
        }

        public Criteria orInvestorIdIn(List<String> values) {
            orCriterion("investor_id in", values, "investorId");
            return (Criteria) this;
        }

        public Criteria orInvestorIdNotIn(List<String> values) {
            orCriterion("investor_id not in", values, "investorId");
            return (Criteria) this;
        }

        public Criteria orInvestorIdBetween(String value1, String value2) {
            orCriterion("investor_id between", value1, value2, "investorId");
            return (Criteria) this;
        }

        public Criteria orInvestorIdNotBetween(String value1, String value2) {
            orCriterion("investor_id not between", value1, value2, "investorId");
            return (Criteria) this;
        }

        public Criteria andOrgIdIsNull() {
            addCriterion("org_id is null");
            return (Criteria) this;
        }

        public Criteria andOrgIdIsNotNull() {
            addCriterion("org_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrgIdEqualTo(String value) {
            addCriterion("org_id =", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdNotEqualTo(String value) {
            addCriterion("org_id <>", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdGreaterThan(String value) {
            addCriterion("org_id >", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdGreaterThanOrEqualTo(String value) {
            addCriterion("org_id >=", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdLessThan(String value) {
            addCriterion("org_id <", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdLessThanOrEqualTo(String value) {
            addCriterion("org_id <=", value, "orgId");
            return (Criteria) this;
        }

        public Criteria orOrgIdIsNull() {
            orCriterion("org_id is null");
            return (Criteria) this;
        }

        public Criteria orOrgIdIsNotNull() {
            orCriterion("org_id is not null");
            return (Criteria) this;
        }

        public Criteria orOrgIdEqualTo(String value) {
            orCriterion("org_id =", value, "orgId");
            return (Criteria) this;
        }

        public Criteria orOrgIdNotEqualTo(String value) {
            orCriterion("org_id <>", value, "orgId");
            return (Criteria) this;
        }

        public Criteria orOrgIdGreaterThan(String value) {
            orCriterion("org_id >", value, "orgId");
            return (Criteria) this;
        }

        public Criteria orOrgIdGreaterThanOrEqualTo(String value) {
            orCriterion("org_id >=", value, "orgId");
            return (Criteria) this;
        }

        public Criteria orOrgIdLessThan(String value) {
            orCriterion("org_id <", value, "orgId");
            return (Criteria) this;
        }

        public Criteria orOrgIdLessThanOrEqualTo(String value) {
            orCriterion("org_id <=", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdLike(String value) {
            addCriterion("org_id like", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdNotLike(String value) {
            addCriterion("org_id not like", value, "orgId");
            return (Criteria) this;
        }

        public Criteria orOrgIdLike(String value) {
            orCriterion("org_id like", value, "orgId");
            return (Criteria) this;
        }

        public Criteria orOrgIdNotLike(String value) {
            orCriterion("org_id not like", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdIn(List<String> values) {
            addCriterion("org_id in", values, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdNotIn(List<String> values) {
            addCriterion("org_id not in", values, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdBetween(String value1, String value2) {
            addCriterion("org_id between", value1, value2, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdNotBetween(String value1, String value2) {
            addCriterion("org_id not between", value1, value2, "orgId");
            return (Criteria) this;
        }

        public Criteria orOrgIdIn(List<String> values) {
            orCriterion("org_id in", values, "orgId");
            return (Criteria) this;
        }

        public Criteria orOrgIdNotIn(List<String> values) {
            orCriterion("org_id not in", values, "orgId");
            return (Criteria) this;
        }

        public Criteria orOrgIdBetween(String value1, String value2) {
            orCriterion("org_id between", value1, value2, "orgId");
            return (Criteria) this;
        }

        public Criteria orOrgIdNotBetween(String value1, String value2) {
            orCriterion("org_id not between", value1, value2, "orgId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdIsNull() {
            addCriterion("question_id is null");
            return (Criteria) this;
        }

        public Criteria andQuestionIdIsNotNull() {
            addCriterion("question_id is not null");
            return (Criteria) this;
        }

        public Criteria andQuestionIdEqualTo(String value) {
            addCriterion("question_id =", value, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdNotEqualTo(String value) {
            addCriterion("question_id <>", value, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdGreaterThan(String value) {
            addCriterion("question_id >", value, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdGreaterThanOrEqualTo(String value) {
            addCriterion("question_id >=", value, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdLessThan(String value) {
            addCriterion("question_id <", value, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdLessThanOrEqualTo(String value) {
            addCriterion("question_id <=", value, "questionId");
            return (Criteria) this;
        }

        public Criteria orQuestionIdIsNull() {
            orCriterion("question_id is null");
            return (Criteria) this;
        }

        public Criteria orQuestionIdIsNotNull() {
            orCriterion("question_id is not null");
            return (Criteria) this;
        }

        public Criteria orQuestionIdEqualTo(String value) {
            orCriterion("question_id =", value, "questionId");
            return (Criteria) this;
        }

        public Criteria orQuestionIdNotEqualTo(String value) {
            orCriterion("question_id <>", value, "questionId");
            return (Criteria) this;
        }

        public Criteria orQuestionIdGreaterThan(String value) {
            orCriterion("question_id >", value, "questionId");
            return (Criteria) this;
        }

        public Criteria orQuestionIdGreaterThanOrEqualTo(String value) {
            orCriterion("question_id >=", value, "questionId");
            return (Criteria) this;
        }

        public Criteria orQuestionIdLessThan(String value) {
            orCriterion("question_id <", value, "questionId");
            return (Criteria) this;
        }

        public Criteria orQuestionIdLessThanOrEqualTo(String value) {
            orCriterion("question_id <=", value, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdLike(String value) {
            addCriterion("question_id like", value, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdNotLike(String value) {
            addCriterion("question_id not like", value, "questionId");
            return (Criteria) this;
        }

        public Criteria orQuestionIdLike(String value) {
            orCriterion("question_id like", value, "questionId");
            return (Criteria) this;
        }

        public Criteria orQuestionIdNotLike(String value) {
            orCriterion("question_id not like", value, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdIn(List<String> values) {
            addCriterion("question_id in", values, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdNotIn(List<String> values) {
            addCriterion("question_id not in", values, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdBetween(String value1, String value2) {
            addCriterion("question_id between", value1, value2, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdNotBetween(String value1, String value2) {
            addCriterion("question_id not between", value1, value2, "questionId");
            return (Criteria) this;
        }

        public Criteria orQuestionIdIn(List<String> values) {
            orCriterion("question_id in", values, "questionId");
            return (Criteria) this;
        }

        public Criteria orQuestionIdNotIn(List<String> values) {
            orCriterion("question_id not in", values, "questionId");
            return (Criteria) this;
        }

        public Criteria orQuestionIdBetween(String value1, String value2) {
            orCriterion("question_id between", value1, value2, "questionId");
            return (Criteria) this;
        }

        public Criteria orQuestionIdNotBetween(String value1, String value2) {
            orCriterion("question_id not between", value1, value2, "questionId");
            return (Criteria) this;
        }

        public Criteria andScoreIsNull() {
            addCriterion("score is null");
            return (Criteria) this;
        }

        public Criteria andScoreIsNotNull() {
            addCriterion("score is not null");
            return (Criteria) this;
        }

        public Criteria andScoreEqualTo(Integer value) {
            addCriterion("score =", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotEqualTo(Integer value) {
            addCriterion("score <>", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThan(Integer value) {
            addCriterion("score >", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("score >=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThan(Integer value) {
            addCriterion("score <", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThanOrEqualTo(Integer value) {
            addCriterion("score <=", value, "score");
            return (Criteria) this;
        }

        public Criteria orScoreIsNull() {
            orCriterion("score is null");
            return (Criteria) this;
        }

        public Criteria orScoreIsNotNull() {
            orCriterion("score is not null");
            return (Criteria) this;
        }

        public Criteria orScoreEqualTo(Integer value) {
            orCriterion("score =", value, "score");
            return (Criteria) this;
        }

        public Criteria orScoreNotEqualTo(Integer value) {
            orCriterion("score <>", value, "score");
            return (Criteria) this;
        }

        public Criteria orScoreGreaterThan(Integer value) {
            orCriterion("score >", value, "score");
            return (Criteria) this;
        }

        public Criteria orScoreGreaterThanOrEqualTo(Integer value) {
            orCriterion("score >=", value, "score");
            return (Criteria) this;
        }

        public Criteria orScoreLessThan(Integer value) {
            orCriterion("score <", value, "score");
            return (Criteria) this;
        }

        public Criteria orScoreLessThanOrEqualTo(Integer value) {
            orCriterion("score <=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreIn(List<Integer> values) {
            addCriterion("score in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotIn(List<Integer> values) {
            addCriterion("score not in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreBetween(Integer value1, Integer value2) {
            addCriterion("score between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("score not between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria orScoreIn(List<Integer> values) {
            orCriterion("score in", values, "score");
            return (Criteria) this;
        }

        public Criteria orScoreNotIn(List<Integer> values) {
            orCriterion("score not in", values, "score");
            return (Criteria) this;
        }

        public Criteria orScoreBetween(Integer value1, Integer value2) {
            orCriterion("score between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria orScoreNotBetween(Integer value1, Integer value2) {
            orCriterion("score not between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andAnswerOptionIsNull() {
            addCriterion("answer_option is null");
            return (Criteria) this;
        }

        public Criteria andAnswerOptionIsNotNull() {
            addCriterion("answer_option is not null");
            return (Criteria) this;
        }

        public Criteria andAnswerOptionEqualTo(String value) {
            addCriterion("answer_option =", value, "answerOption");
            return (Criteria) this;
        }

        public Criteria andAnswerOptionNotEqualTo(String value) {
            addCriterion("answer_option <>", value, "answerOption");
            return (Criteria) this;
        }

        public Criteria andAnswerOptionGreaterThan(String value) {
            addCriterion("answer_option >", value, "answerOption");
            return (Criteria) this;
        }

        public Criteria andAnswerOptionGreaterThanOrEqualTo(String value) {
            addCriterion("answer_option >=", value, "answerOption");
            return (Criteria) this;
        }

        public Criteria andAnswerOptionLessThan(String value) {
            addCriterion("answer_option <", value, "answerOption");
            return (Criteria) this;
        }

        public Criteria andAnswerOptionLessThanOrEqualTo(String value) {
            addCriterion("answer_option <=", value, "answerOption");
            return (Criteria) this;
        }

        public Criteria orAnswerOptionIsNull() {
            orCriterion("answer_option is null");
            return (Criteria) this;
        }

        public Criteria orAnswerOptionIsNotNull() {
            orCriterion("answer_option is not null");
            return (Criteria) this;
        }

        public Criteria orAnswerOptionEqualTo(String value) {
            orCriterion("answer_option =", value, "answerOption");
            return (Criteria) this;
        }

        public Criteria orAnswerOptionNotEqualTo(String value) {
            orCriterion("answer_option <>", value, "answerOption");
            return (Criteria) this;
        }

        public Criteria orAnswerOptionGreaterThan(String value) {
            orCriterion("answer_option >", value, "answerOption");
            return (Criteria) this;
        }

        public Criteria orAnswerOptionGreaterThanOrEqualTo(String value) {
            orCriterion("answer_option >=", value, "answerOption");
            return (Criteria) this;
        }

        public Criteria orAnswerOptionLessThan(String value) {
            orCriterion("answer_option <", value, "answerOption");
            return (Criteria) this;
        }

        public Criteria orAnswerOptionLessThanOrEqualTo(String value) {
            orCriterion("answer_option <=", value, "answerOption");
            return (Criteria) this;
        }

        public Criteria andAnswerOptionLike(String value) {
            addCriterion("answer_option like", value, "answerOption");
            return (Criteria) this;
        }

        public Criteria andAnswerOptionNotLike(String value) {
            addCriterion("answer_option not like", value, "answerOption");
            return (Criteria) this;
        }

        public Criteria orAnswerOptionLike(String value) {
            orCriterion("answer_option like", value, "answerOption");
            return (Criteria) this;
        }

        public Criteria orAnswerOptionNotLike(String value) {
            orCriterion("answer_option not like", value, "answerOption");
            return (Criteria) this;
        }

        public Criteria andAnswerOptionIn(List<String> values) {
            addCriterion("answer_option in", values, "answerOption");
            return (Criteria) this;
        }

        public Criteria andAnswerOptionNotIn(List<String> values) {
            addCriterion("answer_option not in", values, "answerOption");
            return (Criteria) this;
        }

        public Criteria andAnswerOptionBetween(String value1, String value2) {
            addCriterion("answer_option between", value1, value2, "answerOption");
            return (Criteria) this;
        }

        public Criteria andAnswerOptionNotBetween(String value1, String value2) {
            addCriterion("answer_option not between", value1, value2, "answerOption");
            return (Criteria) this;
        }

        public Criteria orAnswerOptionIn(List<String> values) {
            orCriterion("answer_option in", values, "answerOption");
            return (Criteria) this;
        }

        public Criteria orAnswerOptionNotIn(List<String> values) {
            orCriterion("answer_option not in", values, "answerOption");
            return (Criteria) this;
        }

        public Criteria orAnswerOptionBetween(String value1, String value2) {
            orCriterion("answer_option between", value1, value2, "answerOption");
            return (Criteria) this;
        }

        public Criteria orAnswerOptionNotBetween(String value1, String value2) {
            orCriterion("answer_option not between", value1, value2, "answerOption");
            return (Criteria) this;
        }

        public Criteria andPaperIdIsNull() {
            addCriterion("paper_id is null");
            return (Criteria) this;
        }

        public Criteria andPaperIdIsNotNull() {
            addCriterion("paper_id is not null");
            return (Criteria) this;
        }

        public Criteria andPaperIdEqualTo(String value) {
            addCriterion("paper_id =", value, "paperId");
            return (Criteria) this;
        }

        public Criteria andPaperIdNotEqualTo(String value) {
            addCriterion("paper_id <>", value, "paperId");
            return (Criteria) this;
        }

        public Criteria andPaperIdGreaterThan(String value) {
            addCriterion("paper_id >", value, "paperId");
            return (Criteria) this;
        }

        public Criteria andPaperIdGreaterThanOrEqualTo(String value) {
            addCriterion("paper_id >=", value, "paperId");
            return (Criteria) this;
        }

        public Criteria andPaperIdLessThan(String value) {
            addCriterion("paper_id <", value, "paperId");
            return (Criteria) this;
        }

        public Criteria andPaperIdLessThanOrEqualTo(String value) {
            addCriterion("paper_id <=", value, "paperId");
            return (Criteria) this;
        }

        public Criteria orPaperIdIsNull() {
            orCriterion("paper_id is null");
            return (Criteria) this;
        }

        public Criteria orPaperIdIsNotNull() {
            orCriterion("paper_id is not null");
            return (Criteria) this;
        }

        public Criteria orPaperIdEqualTo(String value) {
            orCriterion("paper_id =", value, "paperId");
            return (Criteria) this;
        }

        public Criteria orPaperIdNotEqualTo(String value) {
            orCriterion("paper_id <>", value, "paperId");
            return (Criteria) this;
        }

        public Criteria orPaperIdGreaterThan(String value) {
            orCriterion("paper_id >", value, "paperId");
            return (Criteria) this;
        }

        public Criteria orPaperIdGreaterThanOrEqualTo(String value) {
            orCriterion("paper_id >=", value, "paperId");
            return (Criteria) this;
        }

        public Criteria orPaperIdLessThan(String value) {
            orCriterion("paper_id <", value, "paperId");
            return (Criteria) this;
        }

        public Criteria orPaperIdLessThanOrEqualTo(String value) {
            orCriterion("paper_id <=", value, "paperId");
            return (Criteria) this;
        }

        public Criteria andPaperIdLike(String value) {
            addCriterion("paper_id like", value, "paperId");
            return (Criteria) this;
        }

        public Criteria andPaperIdNotLike(String value) {
            addCriterion("paper_id not like", value, "paperId");
            return (Criteria) this;
        }

        public Criteria orPaperIdLike(String value) {
            orCriterion("paper_id like", value, "paperId");
            return (Criteria) this;
        }

        public Criteria orPaperIdNotLike(String value) {
            orCriterion("paper_id not like", value, "paperId");
            return (Criteria) this;
        }

        public Criteria andPaperIdIn(List<String> values) {
            addCriterion("paper_id in", values, "paperId");
            return (Criteria) this;
        }

        public Criteria andPaperIdNotIn(List<String> values) {
            addCriterion("paper_id not in", values, "paperId");
            return (Criteria) this;
        }

        public Criteria andPaperIdBetween(String value1, String value2) {
            addCriterion("paper_id between", value1, value2, "paperId");
            return (Criteria) this;
        }

        public Criteria andPaperIdNotBetween(String value1, String value2) {
            addCriterion("paper_id not between", value1, value2, "paperId");
            return (Criteria) this;
        }

        public Criteria orPaperIdIn(List<String> values) {
            orCriterion("paper_id in", values, "paperId");
            return (Criteria) this;
        }

        public Criteria orPaperIdNotIn(List<String> values) {
            orCriterion("paper_id not in", values, "paperId");
            return (Criteria) this;
        }

        public Criteria orPaperIdBetween(String value1, String value2) {
            orCriterion("paper_id between", value1, value2, "paperId");
            return (Criteria) this;
        }

        public Criteria orPaperIdNotBetween(String value1, String value2) {
            orCriterion("paper_id not between", value1, value2, "paperId");
            return (Criteria) this;
        }
    }

    /**
     * 该类对应数据库表 answer
     */
    public static class Criteria extends GeneratedCriteria {
        protected boolean andRelation;

        public boolean isAndRelation() {
            return andRelation;
        }

        protected Criteria() {
            super();
        }

        public void setAndRelation(boolean andRelation) {
            this.andRelation = andRelation;
        }
    }

    /**
     * 该类对应数据库表 answer
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean orValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isOrValue() {
            return orValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, boolean orValue) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
            this.orValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, boolean orValue) {
            this(condition, value, null);
            this.orValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, boolean orValue) {
            this(condition, value, secondValue, null);
            this.orValue = true;
        }
    }
}