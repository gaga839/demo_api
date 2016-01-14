package com.wocai.jrt.paper.model;

import java.util.ArrayList;
import java.util.List;

public class OptionsBean {
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
     * 是否指定 distinct 去除重复
     * 对应数据库表字段 options
     */
    private boolean distinct;

    /**
     * 逻辑or语句
     * 对应数据库表字段 options
     */
    private List<Criteria> oredCriteria;

    /**
     */
    public OptionsBean() {
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
     * 该类对应数据库表 options
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

        public Criteria andNoIsNull() {
            addCriterion("no is null");
            return (Criteria) this;
        }

        public Criteria andNoIsNotNull() {
            addCriterion("no is not null");
            return (Criteria) this;
        }

        public Criteria andNoEqualTo(String value) {
            addCriterion("no =", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoNotEqualTo(String value) {
            addCriterion("no <>", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoGreaterThan(String value) {
            addCriterion("no >", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoGreaterThanOrEqualTo(String value) {
            addCriterion("no >=", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoLessThan(String value) {
            addCriterion("no <", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoLessThanOrEqualTo(String value) {
            addCriterion("no <=", value, "no");
            return (Criteria) this;
        }

        public Criteria orNoIsNull() {
            orCriterion("no is null");
            return (Criteria) this;
        }

        public Criteria orNoIsNotNull() {
            orCriterion("no is not null");
            return (Criteria) this;
        }

        public Criteria orNoEqualTo(String value) {
            orCriterion("no =", value, "no");
            return (Criteria) this;
        }

        public Criteria orNoNotEqualTo(String value) {
            orCriterion("no <>", value, "no");
            return (Criteria) this;
        }

        public Criteria orNoGreaterThan(String value) {
            orCriterion("no >", value, "no");
            return (Criteria) this;
        }

        public Criteria orNoGreaterThanOrEqualTo(String value) {
            orCriterion("no >=", value, "no");
            return (Criteria) this;
        }

        public Criteria orNoLessThan(String value) {
            orCriterion("no <", value, "no");
            return (Criteria) this;
        }

        public Criteria orNoLessThanOrEqualTo(String value) {
            orCriterion("no <=", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoLike(String value) {
            addCriterion("no like", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoNotLike(String value) {
            addCriterion("no not like", value, "no");
            return (Criteria) this;
        }

        public Criteria orNoLike(String value) {
            orCriterion("no like", value, "no");
            return (Criteria) this;
        }

        public Criteria orNoNotLike(String value) {
            orCriterion("no not like", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoIn(List<String> values) {
            addCriterion("no in", values, "no");
            return (Criteria) this;
        }

        public Criteria andNoNotIn(List<String> values) {
            addCriterion("no not in", values, "no");
            return (Criteria) this;
        }

        public Criteria andNoBetween(String value1, String value2) {
            addCriterion("no between", value1, value2, "no");
            return (Criteria) this;
        }

        public Criteria andNoNotBetween(String value1, String value2) {
            addCriterion("no not between", value1, value2, "no");
            return (Criteria) this;
        }

        public Criteria orNoIn(List<String> values) {
            orCriterion("no in", values, "no");
            return (Criteria) this;
        }

        public Criteria orNoNotIn(List<String> values) {
            orCriterion("no not in", values, "no");
            return (Criteria) this;
        }

        public Criteria orNoBetween(String value1, String value2) {
            orCriterion("no between", value1, value2, "no");
            return (Criteria) this;
        }

        public Criteria orNoNotBetween(String value1, String value2) {
            orCriterion("no not between", value1, value2, "no");
            return (Criteria) this;
        }

        public Criteria andContentIsNull() {
            addCriterion("content is null");
            return (Criteria) this;
        }

        public Criteria andContentIsNotNull() {
            addCriterion("content is not null");
            return (Criteria) this;
        }

        public Criteria andContentEqualTo(String value) {
            addCriterion("content =", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotEqualTo(String value) {
            addCriterion("content <>", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThan(String value) {
            addCriterion("content >", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThanOrEqualTo(String value) {
            addCriterion("content >=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThan(String value) {
            addCriterion("content <", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThanOrEqualTo(String value) {
            addCriterion("content <=", value, "content");
            return (Criteria) this;
        }

        public Criteria orContentIsNull() {
            orCriterion("content is null");
            return (Criteria) this;
        }

        public Criteria orContentIsNotNull() {
            orCriterion("content is not null");
            return (Criteria) this;
        }

        public Criteria orContentEqualTo(String value) {
            orCriterion("content =", value, "content");
            return (Criteria) this;
        }

        public Criteria orContentNotEqualTo(String value) {
            orCriterion("content <>", value, "content");
            return (Criteria) this;
        }

        public Criteria orContentGreaterThan(String value) {
            orCriterion("content >", value, "content");
            return (Criteria) this;
        }

        public Criteria orContentGreaterThanOrEqualTo(String value) {
            orCriterion("content >=", value, "content");
            return (Criteria) this;
        }

        public Criteria orContentLessThan(String value) {
            orCriterion("content <", value, "content");
            return (Criteria) this;
        }

        public Criteria orContentLessThanOrEqualTo(String value) {
            orCriterion("content <=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLike(String value) {
            addCriterion("content like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotLike(String value) {
            addCriterion("content not like", value, "content");
            return (Criteria) this;
        }

        public Criteria orContentLike(String value) {
            orCriterion("content like", value, "content");
            return (Criteria) this;
        }

        public Criteria orContentNotLike(String value) {
            orCriterion("content not like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentIn(List<String> values) {
            addCriterion("content in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotIn(List<String> values) {
            addCriterion("content not in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentBetween(String value1, String value2) {
            addCriterion("content between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotBetween(String value1, String value2) {
            addCriterion("content not between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria orContentIn(List<String> values) {
            orCriterion("content in", values, "content");
            return (Criteria) this;
        }

        public Criteria orContentNotIn(List<String> values) {
            orCriterion("content not in", values, "content");
            return (Criteria) this;
        }

        public Criteria orContentBetween(String value1, String value2) {
            orCriterion("content between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria orContentNotBetween(String value1, String value2) {
            orCriterion("content not between", value1, value2, "content");
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

        public Criteria andUnqualifiedIsNull() {
            addCriterion("unqualified is null");
            return (Criteria) this;
        }

        public Criteria andUnqualifiedIsNotNull() {
            addCriterion("unqualified is not null");
            return (Criteria) this;
        }

        public Criteria andUnqualifiedEqualTo(Boolean value) {
            addCriterion("unqualified =", value, "unqualified");
            return (Criteria) this;
        }

        public Criteria andUnqualifiedNotEqualTo(Boolean value) {
            addCriterion("unqualified <>", value, "unqualified");
            return (Criteria) this;
        }

        public Criteria andUnqualifiedGreaterThan(Boolean value) {
            addCriterion("unqualified >", value, "unqualified");
            return (Criteria) this;
        }

        public Criteria andUnqualifiedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("unqualified >=", value, "unqualified");
            return (Criteria) this;
        }

        public Criteria andUnqualifiedLessThan(Boolean value) {
            addCriterion("unqualified <", value, "unqualified");
            return (Criteria) this;
        }

        public Criteria andUnqualifiedLessThanOrEqualTo(Boolean value) {
            addCriterion("unqualified <=", value, "unqualified");
            return (Criteria) this;
        }

        public Criteria orUnqualifiedIsNull() {
            orCriterion("unqualified is null");
            return (Criteria) this;
        }

        public Criteria orUnqualifiedIsNotNull() {
            orCriterion("unqualified is not null");
            return (Criteria) this;
        }

        public Criteria orUnqualifiedEqualTo(Boolean value) {
            orCriterion("unqualified =", value, "unqualified");
            return (Criteria) this;
        }

        public Criteria orUnqualifiedNotEqualTo(Boolean value) {
            orCriterion("unqualified <>", value, "unqualified");
            return (Criteria) this;
        }

        public Criteria orUnqualifiedGreaterThan(Boolean value) {
            orCriterion("unqualified >", value, "unqualified");
            return (Criteria) this;
        }

        public Criteria orUnqualifiedGreaterThanOrEqualTo(Boolean value) {
            orCriterion("unqualified >=", value, "unqualified");
            return (Criteria) this;
        }

        public Criteria orUnqualifiedLessThan(Boolean value) {
            orCriterion("unqualified <", value, "unqualified");
            return (Criteria) this;
        }

        public Criteria orUnqualifiedLessThanOrEqualTo(Boolean value) {
            orCriterion("unqualified <=", value, "unqualified");
            return (Criteria) this;
        }

        public Criteria andUnqualifiedIn(List<Boolean> values) {
            addCriterion("unqualified in", values, "unqualified");
            return (Criteria) this;
        }

        public Criteria andUnqualifiedNotIn(List<Boolean> values) {
            addCriterion("unqualified not in", values, "unqualified");
            return (Criteria) this;
        }

        public Criteria andUnqualifiedBetween(Boolean value1, Boolean value2) {
            addCriterion("unqualified between", value1, value2, "unqualified");
            return (Criteria) this;
        }

        public Criteria andUnqualifiedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("unqualified not between", value1, value2, "unqualified");
            return (Criteria) this;
        }

        public Criteria orUnqualifiedIn(List<Boolean> values) {
            orCriterion("unqualified in", values, "unqualified");
            return (Criteria) this;
        }

        public Criteria orUnqualifiedNotIn(List<Boolean> values) {
            orCriterion("unqualified not in", values, "unqualified");
            return (Criteria) this;
        }

        public Criteria orUnqualifiedBetween(Boolean value1, Boolean value2) {
            orCriterion("unqualified between", value1, value2, "unqualified");
            return (Criteria) this;
        }

        public Criteria orUnqualifiedNotBetween(Boolean value1, Boolean value2) {
            orCriterion("unqualified not between", value1, value2, "unqualified");
            return (Criteria) this;
        }
    }

    /**
     * 该类对应数据库表 options
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
     * 该类对应数据库表 options
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