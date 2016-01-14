package com.wocai.jrt.paper.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class QuestionBean {
    /**
     * order by 排序语句
     * 对应数据库表字段 question
     */
    private String orderBy;

    /**
     * 分页开始记录
     * 对应数据库表字段 question
     */
    private Integer start;

    /**
     * 分页大小
     * 对应数据库表字段 question
     */
    private int pageSize = 10;

    /**
     * 是否指定 distinct 去除重复
     * 对应数据库表字段 question
     */
    private boolean distinct;

    /**
     * 逻辑or语句
     * 对应数据库表字段 question
     */
    private List<Criteria> oredCriteria;

    /**
     */
    public QuestionBean() {
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
     * 该类对应数据库表 question
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

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria orTitleIsNull() {
            orCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria orTitleIsNotNull() {
            orCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria orTitleEqualTo(String value) {
            orCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria orTitleNotEqualTo(String value) {
            orCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria orTitleGreaterThan(String value) {
            orCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria orTitleGreaterThanOrEqualTo(String value) {
            orCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria orTitleLessThan(String value) {
            orCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria orTitleLessThanOrEqualTo(String value) {
            orCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria orTitleLike(String value) {
            orCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria orTitleNotLike(String value) {
            orCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria orTitleIn(List<String> values) {
            orCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria orTitleNotIn(List<String> values) {
            orCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria orTitleBetween(String value1, String value2) {
            orCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria orTitleNotBetween(String value1, String value2) {
            orCriterion("title not between", value1, value2, "title");
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

        public Criteria andNoEqualTo(Integer value) {
            addCriterion("no =", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoNotEqualTo(Integer value) {
            addCriterion("no <>", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoGreaterThan(Integer value) {
            addCriterion("no >", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("no >=", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoLessThan(Integer value) {
            addCriterion("no <", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoLessThanOrEqualTo(Integer value) {
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

        public Criteria orNoEqualTo(Integer value) {
            orCriterion("no =", value, "no");
            return (Criteria) this;
        }

        public Criteria orNoNotEqualTo(Integer value) {
            orCriterion("no <>", value, "no");
            return (Criteria) this;
        }

        public Criteria orNoGreaterThan(Integer value) {
            orCriterion("no >", value, "no");
            return (Criteria) this;
        }

        public Criteria orNoGreaterThanOrEqualTo(Integer value) {
            orCriterion("no >=", value, "no");
            return (Criteria) this;
        }

        public Criteria orNoLessThan(Integer value) {
            orCriterion("no <", value, "no");
            return (Criteria) this;
        }

        public Criteria orNoLessThanOrEqualTo(Integer value) {
            orCriterion("no <=", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoIn(List<Integer> values) {
            addCriterion("no in", values, "no");
            return (Criteria) this;
        }

        public Criteria andNoNotIn(List<Integer> values) {
            addCriterion("no not in", values, "no");
            return (Criteria) this;
        }

        public Criteria andNoBetween(Integer value1, Integer value2) {
            addCriterion("no between", value1, value2, "no");
            return (Criteria) this;
        }

        public Criteria andNoNotBetween(Integer value1, Integer value2) {
            addCriterion("no not between", value1, value2, "no");
            return (Criteria) this;
        }

        public Criteria orNoIn(List<Integer> values) {
            orCriterion("no in", values, "no");
            return (Criteria) this;
        }

        public Criteria orNoNotIn(List<Integer> values) {
            orCriterion("no not in", values, "no");
            return (Criteria) this;
        }

        public Criteria orNoBetween(Integer value1, Integer value2) {
            orCriterion("no between", value1, value2, "no");
            return (Criteria) this;
        }

        public Criteria orNoNotBetween(Integer value1, Integer value2) {
            orCriterion("no not between", value1, value2, "no");
            return (Criteria) this;
        }

        public Criteria andOptionsIsNull() {
            addCriterion("options is null");
            return (Criteria) this;
        }

        public Criteria andOptionsIsNotNull() {
            addCriterion("options is not null");
            return (Criteria) this;
        }

        public Criteria andOptionsEqualTo(Boolean value) {
            addCriterion("options =", value, "options");
            return (Criteria) this;
        }

        public Criteria andOptionsNotEqualTo(Boolean value) {
            addCriterion("options <>", value, "options");
            return (Criteria) this;
        }

        public Criteria andOptionsGreaterThan(Boolean value) {
            addCriterion("options >", value, "options");
            return (Criteria) this;
        }

        public Criteria andOptionsGreaterThanOrEqualTo(Boolean value) {
            addCriterion("options >=", value, "options");
            return (Criteria) this;
        }

        public Criteria andOptionsLessThan(Boolean value) {
            addCriterion("options <", value, "options");
            return (Criteria) this;
        }

        public Criteria andOptionsLessThanOrEqualTo(Boolean value) {
            addCriterion("options <=", value, "options");
            return (Criteria) this;
        }

        public Criteria orOptionsIsNull() {
            orCriterion("options is null");
            return (Criteria) this;
        }

        public Criteria orOptionsIsNotNull() {
            orCriterion("options is not null");
            return (Criteria) this;
        }

        public Criteria orOptionsEqualTo(Boolean value) {
            orCriterion("options =", value, "options");
            return (Criteria) this;
        }

        public Criteria orOptionsNotEqualTo(Boolean value) {
            orCriterion("options <>", value, "options");
            return (Criteria) this;
        }

        public Criteria orOptionsGreaterThan(Boolean value) {
            orCriterion("options >", value, "options");
            return (Criteria) this;
        }

        public Criteria orOptionsGreaterThanOrEqualTo(Boolean value) {
            orCriterion("options >=", value, "options");
            return (Criteria) this;
        }

        public Criteria orOptionsLessThan(Boolean value) {
            orCriterion("options <", value, "options");
            return (Criteria) this;
        }

        public Criteria orOptionsLessThanOrEqualTo(Boolean value) {
            orCriterion("options <=", value, "options");
            return (Criteria) this;
        }

        public Criteria andOptionsIn(List<Boolean> values) {
            addCriterion("options in", values, "options");
            return (Criteria) this;
        }

        public Criteria andOptionsNotIn(List<Boolean> values) {
            addCriterion("options not in", values, "options");
            return (Criteria) this;
        }

        public Criteria andOptionsBetween(Boolean value1, Boolean value2) {
            addCriterion("options between", value1, value2, "options");
            return (Criteria) this;
        }

        public Criteria andOptionsNotBetween(Boolean value1, Boolean value2) {
            addCriterion("options not between", value1, value2, "options");
            return (Criteria) this;
        }

        public Criteria orOptionsIn(List<Boolean> values) {
            orCriterion("options in", values, "options");
            return (Criteria) this;
        }

        public Criteria orOptionsNotIn(List<Boolean> values) {
            orCriterion("options not in", values, "options");
            return (Criteria) this;
        }

        public Criteria orOptionsBetween(Boolean value1, Boolean value2) {
            orCriterion("options between", value1, value2, "options");
            return (Criteria) this;
        }

        public Criteria orOptionsNotBetween(Boolean value1, Boolean value2) {
            orCriterion("options not between", value1, value2, "options");
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

        public Criteria andUnqualifiedEqualTo(String value) {
            addCriterion("unqualified =", value, "unqualified");
            return (Criteria) this;
        }

        public Criteria andUnqualifiedNotEqualTo(String value) {
            addCriterion("unqualified <>", value, "unqualified");
            return (Criteria) this;
        }

        public Criteria andUnqualifiedGreaterThan(String value) {
            addCriterion("unqualified >", value, "unqualified");
            return (Criteria) this;
        }

        public Criteria andUnqualifiedGreaterThanOrEqualTo(String value) {
            addCriterion("unqualified >=", value, "unqualified");
            return (Criteria) this;
        }

        public Criteria andUnqualifiedLessThan(String value) {
            addCriterion("unqualified <", value, "unqualified");
            return (Criteria) this;
        }

        public Criteria andUnqualifiedLessThanOrEqualTo(String value) {
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

        public Criteria orUnqualifiedEqualTo(String value) {
            orCriterion("unqualified =", value, "unqualified");
            return (Criteria) this;
        }

        public Criteria orUnqualifiedNotEqualTo(String value) {
            orCriterion("unqualified <>", value, "unqualified");
            return (Criteria) this;
        }

        public Criteria orUnqualifiedGreaterThan(String value) {
            orCriterion("unqualified >", value, "unqualified");
            return (Criteria) this;
        }

        public Criteria orUnqualifiedGreaterThanOrEqualTo(String value) {
            orCriterion("unqualified >=", value, "unqualified");
            return (Criteria) this;
        }

        public Criteria orUnqualifiedLessThan(String value) {
            orCriterion("unqualified <", value, "unqualified");
            return (Criteria) this;
        }

        public Criteria orUnqualifiedLessThanOrEqualTo(String value) {
            orCriterion("unqualified <=", value, "unqualified");
            return (Criteria) this;
        }

        public Criteria andUnqualifiedLike(String value) {
            addCriterion("unqualified like", value, "unqualified");
            return (Criteria) this;
        }

        public Criteria andUnqualifiedNotLike(String value) {
            addCriterion("unqualified not like", value, "unqualified");
            return (Criteria) this;
        }

        public Criteria orUnqualifiedLike(String value) {
            orCriterion("unqualified like", value, "unqualified");
            return (Criteria) this;
        }

        public Criteria orUnqualifiedNotLike(String value) {
            orCriterion("unqualified not like", value, "unqualified");
            return (Criteria) this;
        }

        public Criteria andUnqualifiedIn(List<String> values) {
            addCriterion("unqualified in", values, "unqualified");
            return (Criteria) this;
        }

        public Criteria andUnqualifiedNotIn(List<String> values) {
            addCriterion("unqualified not in", values, "unqualified");
            return (Criteria) this;
        }

        public Criteria andUnqualifiedBetween(String value1, String value2) {
            addCriterion("unqualified between", value1, value2, "unqualified");
            return (Criteria) this;
        }

        public Criteria andUnqualifiedNotBetween(String value1, String value2) {
            addCriterion("unqualified not between", value1, value2, "unqualified");
            return (Criteria) this;
        }

        public Criteria orUnqualifiedIn(List<String> values) {
            orCriterion("unqualified in", values, "unqualified");
            return (Criteria) this;
        }

        public Criteria orUnqualifiedNotIn(List<String> values) {
            orCriterion("unqualified not in", values, "unqualified");
            return (Criteria) this;
        }

        public Criteria orUnqualifiedBetween(String value1, String value2) {
            orCriterion("unqualified between", value1, value2, "unqualified");
            return (Criteria) this;
        }

        public Criteria orUnqualifiedNotBetween(String value1, String value2) {
            orCriterion("unqualified not between", value1, value2, "unqualified");
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

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria orCreateTimeIsNull() {
            orCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria orCreateTimeIsNotNull() {
            orCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria orCreateTimeEqualTo(Date value) {
            orCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria orCreateTimeNotEqualTo(Date value) {
            orCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria orCreateTimeGreaterThan(Date value) {
            orCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria orCreateTimeGreaterThanOrEqualTo(Date value) {
            orCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria orCreateTimeLessThan(Date value) {
            orCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria orCreateTimeLessThanOrEqualTo(Date value) {
            orCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria orCreateTimeIn(List<Date> values) {
            orCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria orCreateTimeNotIn(List<Date> values) {
            orCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria orCreateTimeBetween(Date value1, Date value2) {
            orCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria orCreateTimeNotBetween(Date value1, Date value2) {
            orCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria orUpdateTimeIsNull() {
            orCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria orUpdateTimeIsNotNull() {
            orCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria orUpdateTimeEqualTo(Date value) {
            orCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria orUpdateTimeNotEqualTo(Date value) {
            orCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria orUpdateTimeGreaterThan(Date value) {
            orCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria orUpdateTimeGreaterThanOrEqualTo(Date value) {
            orCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria orUpdateTimeLessThan(Date value) {
            orCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria orUpdateTimeLessThanOrEqualTo(Date value) {
            orCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria orUpdateTimeIn(List<Date> values) {
            orCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria orUpdateTimeNotIn(List<Date> values) {
            orCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria orUpdateTimeBetween(Date value1, Date value2) {
            orCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria orUpdateTimeNotBetween(Date value1, Date value2) {
            orCriterion("update_time not between", value1, value2, "updateTime");
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

        public Criteria andTagIsNull() {
            addCriterion("tag is null");
            return (Criteria) this;
        }

        public Criteria andTagIsNotNull() {
            addCriterion("tag is not null");
            return (Criteria) this;
        }

        public Criteria andTagEqualTo(Boolean value) {
            addCriterion("tag =", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagNotEqualTo(Boolean value) {
            addCriterion("tag <>", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagGreaterThan(Boolean value) {
            addCriterion("tag >", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("tag >=", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagLessThan(Boolean value) {
            addCriterion("tag <", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagLessThanOrEqualTo(Boolean value) {
            addCriterion("tag <=", value, "tag");
            return (Criteria) this;
        }

        public Criteria orTagIsNull() {
            orCriterion("tag is null");
            return (Criteria) this;
        }

        public Criteria orTagIsNotNull() {
            orCriterion("tag is not null");
            return (Criteria) this;
        }

        public Criteria orTagEqualTo(Boolean value) {
            orCriterion("tag =", value, "tag");
            return (Criteria) this;
        }

        public Criteria orTagNotEqualTo(Boolean value) {
            orCriterion("tag <>", value, "tag");
            return (Criteria) this;
        }

        public Criteria orTagGreaterThan(Boolean value) {
            orCriterion("tag >", value, "tag");
            return (Criteria) this;
        }

        public Criteria orTagGreaterThanOrEqualTo(Boolean value) {
            orCriterion("tag >=", value, "tag");
            return (Criteria) this;
        }

        public Criteria orTagLessThan(Boolean value) {
            orCriterion("tag <", value, "tag");
            return (Criteria) this;
        }

        public Criteria orTagLessThanOrEqualTo(Boolean value) {
            orCriterion("tag <=", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagIn(List<Boolean> values) {
            addCriterion("tag in", values, "tag");
            return (Criteria) this;
        }

        public Criteria andTagNotIn(List<Boolean> values) {
            addCriterion("tag not in", values, "tag");
            return (Criteria) this;
        }

        public Criteria andTagBetween(Boolean value1, Boolean value2) {
            addCriterion("tag between", value1, value2, "tag");
            return (Criteria) this;
        }

        public Criteria andTagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("tag not between", value1, value2, "tag");
            return (Criteria) this;
        }

        public Criteria orTagIn(List<Boolean> values) {
            orCriterion("tag in", values, "tag");
            return (Criteria) this;
        }

        public Criteria orTagNotIn(List<Boolean> values) {
            orCriterion("tag not in", values, "tag");
            return (Criteria) this;
        }

        public Criteria orTagBetween(Boolean value1, Boolean value2) {
            orCriterion("tag between", value1, value2, "tag");
            return (Criteria) this;
        }

        public Criteria orTagNotBetween(Boolean value1, Boolean value2) {
            orCriterion("tag not between", value1, value2, "tag");
            return (Criteria) this;
        }
    }

    /**
     * 该类对应数据库表 question
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
     * 该类对应数据库表 question
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