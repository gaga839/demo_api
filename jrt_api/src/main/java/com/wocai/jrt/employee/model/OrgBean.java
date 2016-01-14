package com.wocai.jrt.employee.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class OrgBean {
    /**
     * order by 排序语句
     * 对应数据库表字段 org
     */
    private String orderBy;

    /**
     * 分页开始记录
     * 对应数据库表字段 org
     */
    private Integer start;

    /**
     * 分页大小
     * 对应数据库表字段 org
     */
    private int pageSize = 10;

    /**
     * 是否指定 distinct 去除重复
     * 对应数据库表字段 org
     */
    private boolean distinct;

    /**
     * 逻辑or语句
     * 对应数据库表字段 org
     */
    private List<Criteria> oredCriteria;

    /**
     */
    public OrgBean() {
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
     * 该类对应数据库表 org
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andOrgCodeIsNull() {
            addCriterion("org_code is null");
            return (Criteria) this;
        }

        public Criteria andOrgCodeIsNotNull() {
            addCriterion("org_code is not null");
            return (Criteria) this;
        }

        public Criteria andOrgCodeEqualTo(String value) {
            addCriterion("org_code =", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeNotEqualTo(String value) {
            addCriterion("org_code <>", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeGreaterThan(String value) {
            addCriterion("org_code >", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeGreaterThanOrEqualTo(String value) {
            addCriterion("org_code >=", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeLessThan(String value) {
            addCriterion("org_code <", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeLessThanOrEqualTo(String value) {
            addCriterion("org_code <=", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria orOrgCodeIsNull() {
            orCriterion("org_code is null");
            return (Criteria) this;
        }

        public Criteria orOrgCodeIsNotNull() {
            orCriterion("org_code is not null");
            return (Criteria) this;
        }

        public Criteria orOrgCodeEqualTo(String value) {
            orCriterion("org_code =", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria orOrgCodeNotEqualTo(String value) {
            orCriterion("org_code <>", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria orOrgCodeGreaterThan(String value) {
            orCriterion("org_code >", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria orOrgCodeGreaterThanOrEqualTo(String value) {
            orCriterion("org_code >=", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria orOrgCodeLessThan(String value) {
            orCriterion("org_code <", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria orOrgCodeLessThanOrEqualTo(String value) {
            orCriterion("org_code <=", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeLike(String value) {
            addCriterion("org_code like", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeNotLike(String value) {
            addCriterion("org_code not like", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria orOrgCodeLike(String value) {
            orCriterion("org_code like", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria orOrgCodeNotLike(String value) {
            orCriterion("org_code not like", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeIn(List<String> values) {
            addCriterion("org_code in", values, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeNotIn(List<String> values) {
            addCriterion("org_code not in", values, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeBetween(String value1, String value2) {
            addCriterion("org_code between", value1, value2, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeNotBetween(String value1, String value2) {
            addCriterion("org_code not between", value1, value2, "orgCode");
            return (Criteria) this;
        }

        public Criteria orOrgCodeIn(List<String> values) {
            orCriterion("org_code in", values, "orgCode");
            return (Criteria) this;
        }

        public Criteria orOrgCodeNotIn(List<String> values) {
            orCriterion("org_code not in", values, "orgCode");
            return (Criteria) this;
        }

        public Criteria orOrgCodeBetween(String value1, String value2) {
            orCriterion("org_code between", value1, value2, "orgCode");
            return (Criteria) this;
        }

        public Criteria orOrgCodeNotBetween(String value1, String value2) {
            orCriterion("org_code not between", value1, value2, "orgCode");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria orNameIsNull() {
            orCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria orNameIsNotNull() {
            orCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria orNameEqualTo(String value) {
            orCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria orNameNotEqualTo(String value) {
            orCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria orNameGreaterThan(String value) {
            orCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria orNameGreaterThanOrEqualTo(String value) {
            orCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria orNameLessThan(String value) {
            orCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria orNameLessThanOrEqualTo(String value) {
            orCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria orNameLike(String value) {
            orCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria orNameNotLike(String value) {
            orCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria orNameIn(List<String> values) {
            orCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria orNameNotIn(List<String> values) {
            orCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria orNameBetween(String value1, String value2) {
            orCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria orNameNotBetween(String value1, String value2) {
            orCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andBriefNameIsNull() {
            addCriterion("brief_name is null");
            return (Criteria) this;
        }

        public Criteria andBriefNameIsNotNull() {
            addCriterion("brief_name is not null");
            return (Criteria) this;
        }

        public Criteria andBriefNameEqualTo(String value) {
            addCriterion("brief_name =", value, "briefName");
            return (Criteria) this;
        }

        public Criteria andBriefNameNotEqualTo(String value) {
            addCriterion("brief_name <>", value, "briefName");
            return (Criteria) this;
        }

        public Criteria andBriefNameGreaterThan(String value) {
            addCriterion("brief_name >", value, "briefName");
            return (Criteria) this;
        }

        public Criteria andBriefNameGreaterThanOrEqualTo(String value) {
            addCriterion("brief_name >=", value, "briefName");
            return (Criteria) this;
        }

        public Criteria andBriefNameLessThan(String value) {
            addCriterion("brief_name <", value, "briefName");
            return (Criteria) this;
        }

        public Criteria andBriefNameLessThanOrEqualTo(String value) {
            addCriterion("brief_name <=", value, "briefName");
            return (Criteria) this;
        }

        public Criteria orBriefNameIsNull() {
            orCriterion("brief_name is null");
            return (Criteria) this;
        }

        public Criteria orBriefNameIsNotNull() {
            orCriterion("brief_name is not null");
            return (Criteria) this;
        }

        public Criteria orBriefNameEqualTo(String value) {
            orCriterion("brief_name =", value, "briefName");
            return (Criteria) this;
        }

        public Criteria orBriefNameNotEqualTo(String value) {
            orCriterion("brief_name <>", value, "briefName");
            return (Criteria) this;
        }

        public Criteria orBriefNameGreaterThan(String value) {
            orCriterion("brief_name >", value, "briefName");
            return (Criteria) this;
        }

        public Criteria orBriefNameGreaterThanOrEqualTo(String value) {
            orCriterion("brief_name >=", value, "briefName");
            return (Criteria) this;
        }

        public Criteria orBriefNameLessThan(String value) {
            orCriterion("brief_name <", value, "briefName");
            return (Criteria) this;
        }

        public Criteria orBriefNameLessThanOrEqualTo(String value) {
            orCriterion("brief_name <=", value, "briefName");
            return (Criteria) this;
        }

        public Criteria andBriefNameLike(String value) {
            addCriterion("brief_name like", value, "briefName");
            return (Criteria) this;
        }

        public Criteria andBriefNameNotLike(String value) {
            addCriterion("brief_name not like", value, "briefName");
            return (Criteria) this;
        }

        public Criteria orBriefNameLike(String value) {
            orCriterion("brief_name like", value, "briefName");
            return (Criteria) this;
        }

        public Criteria orBriefNameNotLike(String value) {
            orCriterion("brief_name not like", value, "briefName");
            return (Criteria) this;
        }

        public Criteria andBriefNameIn(List<String> values) {
            addCriterion("brief_name in", values, "briefName");
            return (Criteria) this;
        }

        public Criteria andBriefNameNotIn(List<String> values) {
            addCriterion("brief_name not in", values, "briefName");
            return (Criteria) this;
        }

        public Criteria andBriefNameBetween(String value1, String value2) {
            addCriterion("brief_name between", value1, value2, "briefName");
            return (Criteria) this;
        }

        public Criteria andBriefNameNotBetween(String value1, String value2) {
            addCriterion("brief_name not between", value1, value2, "briefName");
            return (Criteria) this;
        }

        public Criteria orBriefNameIn(List<String> values) {
            orCriterion("brief_name in", values, "briefName");
            return (Criteria) this;
        }

        public Criteria orBriefNameNotIn(List<String> values) {
            orCriterion("brief_name not in", values, "briefName");
            return (Criteria) this;
        }

        public Criteria orBriefNameBetween(String value1, String value2) {
            orCriterion("brief_name between", value1, value2, "briefName");
            return (Criteria) this;
        }

        public Criteria orBriefNameNotBetween(String value1, String value2) {
            orCriterion("brief_name not between", value1, value2, "briefName");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(Integer value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Integer value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Integer value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Integer value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Integer value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria orStateIsNull() {
            orCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria orStateIsNotNull() {
            orCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria orStateEqualTo(Integer value) {
            orCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria orStateNotEqualTo(Integer value) {
            orCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria orStateGreaterThan(Integer value) {
            orCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria orStateGreaterThanOrEqualTo(Integer value) {
            orCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria orStateLessThan(Integer value) {
            orCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria orStateLessThanOrEqualTo(Integer value) {
            orCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Integer> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Integer> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Integer value1, Integer value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Integer value1, Integer value2) {
            addCriterion("state not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria orStateIn(List<Integer> values) {
            orCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria orStateNotIn(List<Integer> values) {
            orCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria orStateBetween(Integer value1, Integer value2) {
            orCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria orStateNotBetween(Integer value1, Integer value2) {
            orCriterion("state not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andOrgGroupIdIsNull() {
            addCriterion("org_group_id is null");
            return (Criteria) this;
        }

        public Criteria andOrgGroupIdIsNotNull() {
            addCriterion("org_group_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrgGroupIdEqualTo(String value) {
            addCriterion("org_group_id =", value, "orgGroupId");
            return (Criteria) this;
        }

        public Criteria andOrgGroupIdNotEqualTo(String value) {
            addCriterion("org_group_id <>", value, "orgGroupId");
            return (Criteria) this;
        }

        public Criteria andOrgGroupIdGreaterThan(String value) {
            addCriterion("org_group_id >", value, "orgGroupId");
            return (Criteria) this;
        }

        public Criteria andOrgGroupIdGreaterThanOrEqualTo(String value) {
            addCriterion("org_group_id >=", value, "orgGroupId");
            return (Criteria) this;
        }

        public Criteria andOrgGroupIdLessThan(String value) {
            addCriterion("org_group_id <", value, "orgGroupId");
            return (Criteria) this;
        }

        public Criteria andOrgGroupIdLessThanOrEqualTo(String value) {
            addCriterion("org_group_id <=", value, "orgGroupId");
            return (Criteria) this;
        }

        public Criteria orOrgGroupIdIsNull() {
            orCriterion("org_group_id is null");
            return (Criteria) this;
        }

        public Criteria orOrgGroupIdIsNotNull() {
            orCriterion("org_group_id is not null");
            return (Criteria) this;
        }

        public Criteria orOrgGroupIdEqualTo(String value) {
            orCriterion("org_group_id =", value, "orgGroupId");
            return (Criteria) this;
        }

        public Criteria orOrgGroupIdNotEqualTo(String value) {
            orCriterion("org_group_id <>", value, "orgGroupId");
            return (Criteria) this;
        }

        public Criteria orOrgGroupIdGreaterThan(String value) {
            orCriterion("org_group_id >", value, "orgGroupId");
            return (Criteria) this;
        }

        public Criteria orOrgGroupIdGreaterThanOrEqualTo(String value) {
            orCriterion("org_group_id >=", value, "orgGroupId");
            return (Criteria) this;
        }

        public Criteria orOrgGroupIdLessThan(String value) {
            orCriterion("org_group_id <", value, "orgGroupId");
            return (Criteria) this;
        }

        public Criteria orOrgGroupIdLessThanOrEqualTo(String value) {
            orCriterion("org_group_id <=", value, "orgGroupId");
            return (Criteria) this;
        }

        public Criteria andOrgGroupIdLike(String value) {
            addCriterion("org_group_id like", value, "orgGroupId");
            return (Criteria) this;
        }

        public Criteria andOrgGroupIdNotLike(String value) {
            addCriterion("org_group_id not like", value, "orgGroupId");
            return (Criteria) this;
        }

        public Criteria orOrgGroupIdLike(String value) {
            orCriterion("org_group_id like", value, "orgGroupId");
            return (Criteria) this;
        }

        public Criteria orOrgGroupIdNotLike(String value) {
            orCriterion("org_group_id not like", value, "orgGroupId");
            return (Criteria) this;
        }

        public Criteria andOrgGroupIdIn(List<String> values) {
            addCriterion("org_group_id in", values, "orgGroupId");
            return (Criteria) this;
        }

        public Criteria andOrgGroupIdNotIn(List<String> values) {
            addCriterion("org_group_id not in", values, "orgGroupId");
            return (Criteria) this;
        }

        public Criteria andOrgGroupIdBetween(String value1, String value2) {
            addCriterion("org_group_id between", value1, value2, "orgGroupId");
            return (Criteria) this;
        }

        public Criteria andOrgGroupIdNotBetween(String value1, String value2) {
            addCriterion("org_group_id not between", value1, value2, "orgGroupId");
            return (Criteria) this;
        }

        public Criteria orOrgGroupIdIn(List<String> values) {
            orCriterion("org_group_id in", values, "orgGroupId");
            return (Criteria) this;
        }

        public Criteria orOrgGroupIdNotIn(List<String> values) {
            orCriterion("org_group_id not in", values, "orgGroupId");
            return (Criteria) this;
        }

        public Criteria orOrgGroupIdBetween(String value1, String value2) {
            orCriterion("org_group_id between", value1, value2, "orgGroupId");
            return (Criteria) this;
        }

        public Criteria orOrgGroupIdNotBetween(String value1, String value2) {
            orCriterion("org_group_id not between", value1, value2, "orgGroupId");
            return (Criteria) this;
        }

        public Criteria andSummaryIsNull() {
            addCriterion("summary is null");
            return (Criteria) this;
        }

        public Criteria andSummaryIsNotNull() {
            addCriterion("summary is not null");
            return (Criteria) this;
        }

        public Criteria andSummaryEqualTo(String value) {
            addCriterion("summary =", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryNotEqualTo(String value) {
            addCriterion("summary <>", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryGreaterThan(String value) {
            addCriterion("summary >", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryGreaterThanOrEqualTo(String value) {
            addCriterion("summary >=", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryLessThan(String value) {
            addCriterion("summary <", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryLessThanOrEqualTo(String value) {
            addCriterion("summary <=", value, "summary");
            return (Criteria) this;
        }

        public Criteria orSummaryIsNull() {
            orCriterion("summary is null");
            return (Criteria) this;
        }

        public Criteria orSummaryIsNotNull() {
            orCriterion("summary is not null");
            return (Criteria) this;
        }

        public Criteria orSummaryEqualTo(String value) {
            orCriterion("summary =", value, "summary");
            return (Criteria) this;
        }

        public Criteria orSummaryNotEqualTo(String value) {
            orCriterion("summary <>", value, "summary");
            return (Criteria) this;
        }

        public Criteria orSummaryGreaterThan(String value) {
            orCriterion("summary >", value, "summary");
            return (Criteria) this;
        }

        public Criteria orSummaryGreaterThanOrEqualTo(String value) {
            orCriterion("summary >=", value, "summary");
            return (Criteria) this;
        }

        public Criteria orSummaryLessThan(String value) {
            orCriterion("summary <", value, "summary");
            return (Criteria) this;
        }

        public Criteria orSummaryLessThanOrEqualTo(String value) {
            orCriterion("summary <=", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryLike(String value) {
            addCriterion("summary like", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryNotLike(String value) {
            addCriterion("summary not like", value, "summary");
            return (Criteria) this;
        }

        public Criteria orSummaryLike(String value) {
            orCriterion("summary like", value, "summary");
            return (Criteria) this;
        }

        public Criteria orSummaryNotLike(String value) {
            orCriterion("summary not like", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryIn(List<String> values) {
            addCriterion("summary in", values, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryNotIn(List<String> values) {
            addCriterion("summary not in", values, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryBetween(String value1, String value2) {
            addCriterion("summary between", value1, value2, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryNotBetween(String value1, String value2) {
            addCriterion("summary not between", value1, value2, "summary");
            return (Criteria) this;
        }

        public Criteria orSummaryIn(List<String> values) {
            orCriterion("summary in", values, "summary");
            return (Criteria) this;
        }

        public Criteria orSummaryNotIn(List<String> values) {
            orCriterion("summary not in", values, "summary");
            return (Criteria) this;
        }

        public Criteria orSummaryBetween(String value1, String value2) {
            orCriterion("summary between", value1, value2, "summary");
            return (Criteria) this;
        }

        public Criteria orSummaryNotBetween(String value1, String value2) {
            orCriterion("summary not between", value1, value2, "summary");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria orAddressIsNull() {
            orCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria orAddressIsNotNull() {
            orCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria orAddressEqualTo(String value) {
            orCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria orAddressNotEqualTo(String value) {
            orCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria orAddressGreaterThan(String value) {
            orCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria orAddressGreaterThanOrEqualTo(String value) {
            orCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria orAddressLessThan(String value) {
            orCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria orAddressLessThanOrEqualTo(String value) {
            orCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria orAddressLike(String value) {
            orCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria orAddressNotLike(String value) {
            orCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria orAddressIn(List<String> values) {
            orCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria orAddressNotIn(List<String> values) {
            orCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria orAddressBetween(String value1, String value2) {
            orCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria orAddressNotBetween(String value1, String value2) {
            orCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andContactIsNull() {
            addCriterion("contact is null");
            return (Criteria) this;
        }

        public Criteria andContactIsNotNull() {
            addCriterion("contact is not null");
            return (Criteria) this;
        }

        public Criteria andContactEqualTo(String value) {
            addCriterion("contact =", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactNotEqualTo(String value) {
            addCriterion("contact <>", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactGreaterThan(String value) {
            addCriterion("contact >", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactGreaterThanOrEqualTo(String value) {
            addCriterion("contact >=", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactLessThan(String value) {
            addCriterion("contact <", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactLessThanOrEqualTo(String value) {
            addCriterion("contact <=", value, "contact");
            return (Criteria) this;
        }

        public Criteria orContactIsNull() {
            orCriterion("contact is null");
            return (Criteria) this;
        }

        public Criteria orContactIsNotNull() {
            orCriterion("contact is not null");
            return (Criteria) this;
        }

        public Criteria orContactEqualTo(String value) {
            orCriterion("contact =", value, "contact");
            return (Criteria) this;
        }

        public Criteria orContactNotEqualTo(String value) {
            orCriterion("contact <>", value, "contact");
            return (Criteria) this;
        }

        public Criteria orContactGreaterThan(String value) {
            orCriterion("contact >", value, "contact");
            return (Criteria) this;
        }

        public Criteria orContactGreaterThanOrEqualTo(String value) {
            orCriterion("contact >=", value, "contact");
            return (Criteria) this;
        }

        public Criteria orContactLessThan(String value) {
            orCriterion("contact <", value, "contact");
            return (Criteria) this;
        }

        public Criteria orContactLessThanOrEqualTo(String value) {
            orCriterion("contact <=", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactLike(String value) {
            addCriterion("contact like", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactNotLike(String value) {
            addCriterion("contact not like", value, "contact");
            return (Criteria) this;
        }

        public Criteria orContactLike(String value) {
            orCriterion("contact like", value, "contact");
            return (Criteria) this;
        }

        public Criteria orContactNotLike(String value) {
            orCriterion("contact not like", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactIn(List<String> values) {
            addCriterion("contact in", values, "contact");
            return (Criteria) this;
        }

        public Criteria andContactNotIn(List<String> values) {
            addCriterion("contact not in", values, "contact");
            return (Criteria) this;
        }

        public Criteria andContactBetween(String value1, String value2) {
            addCriterion("contact between", value1, value2, "contact");
            return (Criteria) this;
        }

        public Criteria andContactNotBetween(String value1, String value2) {
            addCriterion("contact not between", value1, value2, "contact");
            return (Criteria) this;
        }

        public Criteria orContactIn(List<String> values) {
            orCriterion("contact in", values, "contact");
            return (Criteria) this;
        }

        public Criteria orContactNotIn(List<String> values) {
            orCriterion("contact not in", values, "contact");
            return (Criteria) this;
        }

        public Criteria orContactBetween(String value1, String value2) {
            orCriterion("contact between", value1, value2, "contact");
            return (Criteria) this;
        }

        public Criteria orContactNotBetween(String value1, String value2) {
            orCriterion("contact not between", value1, value2, "contact");
            return (Criteria) this;
        }

        public Criteria andMobileIsNull() {
            addCriterion("mobile is null");
            return (Criteria) this;
        }

        public Criteria andMobileIsNotNull() {
            addCriterion("mobile is not null");
            return (Criteria) this;
        }

        public Criteria andMobileEqualTo(String value) {
            addCriterion("mobile =", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotEqualTo(String value) {
            addCriterion("mobile <>", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThan(String value) {
            addCriterion("mobile >", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThanOrEqualTo(String value) {
            addCriterion("mobile >=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThan(String value) {
            addCriterion("mobile <", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThanOrEqualTo(String value) {
            addCriterion("mobile <=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria orMobileIsNull() {
            orCriterion("mobile is null");
            return (Criteria) this;
        }

        public Criteria orMobileIsNotNull() {
            orCriterion("mobile is not null");
            return (Criteria) this;
        }

        public Criteria orMobileEqualTo(String value) {
            orCriterion("mobile =", value, "mobile");
            return (Criteria) this;
        }

        public Criteria orMobileNotEqualTo(String value) {
            orCriterion("mobile <>", value, "mobile");
            return (Criteria) this;
        }

        public Criteria orMobileGreaterThan(String value) {
            orCriterion("mobile >", value, "mobile");
            return (Criteria) this;
        }

        public Criteria orMobileGreaterThanOrEqualTo(String value) {
            orCriterion("mobile >=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria orMobileLessThan(String value) {
            orCriterion("mobile <", value, "mobile");
            return (Criteria) this;
        }

        public Criteria orMobileLessThanOrEqualTo(String value) {
            orCriterion("mobile <=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLike(String value) {
            addCriterion("mobile like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotLike(String value) {
            addCriterion("mobile not like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria orMobileLike(String value) {
            orCriterion("mobile like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria orMobileNotLike(String value) {
            orCriterion("mobile not like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileIn(List<String> values) {
            addCriterion("mobile in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotIn(List<String> values) {
            addCriterion("mobile not in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileBetween(String value1, String value2) {
            addCriterion("mobile between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotBetween(String value1, String value2) {
            addCriterion("mobile not between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria orMobileIn(List<String> values) {
            orCriterion("mobile in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria orMobileNotIn(List<String> values) {
            orCriterion("mobile not in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria orMobileBetween(String value1, String value2) {
            orCriterion("mobile between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria orMobileNotBetween(String value1, String value2) {
            orCriterion("mobile not between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria orEmailIsNull() {
            orCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria orEmailIsNotNull() {
            orCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria orEmailEqualTo(String value) {
            orCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria orEmailNotEqualTo(String value) {
            orCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria orEmailGreaterThan(String value) {
            orCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria orEmailGreaterThanOrEqualTo(String value) {
            orCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria orEmailLessThan(String value) {
            orCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria orEmailLessThanOrEqualTo(String value) {
            orCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria orEmailLike(String value) {
            orCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria orEmailNotLike(String value) {
            orCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria orEmailIn(List<String> values) {
            orCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria orEmailNotIn(List<String> values) {
            orCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria orEmailBetween(String value1, String value2) {
            orCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria orEmailNotBetween(String value1, String value2) {
            orCriterion("email not between", value1, value2, "email");
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
            addCriterionForJDBCDate("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterionForJDBCDate("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("create_time <=", value, "createTime");
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
            addCriterionForJDBCDate("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria orCreateTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria orCreateTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria orCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria orCreateTimeLessThan(Date value) {
            addCriterionForJDBCDate("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria orCreateTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterionForJDBCDate("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria orCreateTimeIn(List<Date> values) {
            addCriterionForJDBCDate("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria orCreateTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria orCreateTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria orCreateTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNull() {
            addCriterion("end_time is null");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNotNull() {
            addCriterion("end_time is not null");
            return (Criteria) this;
        }

        public Criteria andEndTimeEqualTo(Date value) {
            addCriterionForJDBCDate("end_time =", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("end_time <>", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("end_time >", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("end_time >=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThan(Date value) {
            addCriterionForJDBCDate("end_time <", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("end_time <=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria orEndTimeIsNull() {
            orCriterion("end_time is null");
            return (Criteria) this;
        }

        public Criteria orEndTimeIsNotNull() {
            orCriterion("end_time is not null");
            return (Criteria) this;
        }

        public Criteria orEndTimeEqualTo(Date value) {
            addCriterionForJDBCDate("end_time =", value, "endTime");
            return (Criteria) this;
        }

        public Criteria orEndTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("end_time <>", value, "endTime");
            return (Criteria) this;
        }

        public Criteria orEndTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("end_time >", value, "endTime");
            return (Criteria) this;
        }

        public Criteria orEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("end_time >=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria orEndTimeLessThan(Date value) {
            addCriterionForJDBCDate("end_time <", value, "endTime");
            return (Criteria) this;
        }

        public Criteria orEndTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("end_time <=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIn(List<Date> values) {
            addCriterionForJDBCDate("end_time in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("end_time not in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("end_time between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("end_time not between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria orEndTimeIn(List<Date> values) {
            addCriterionForJDBCDate("end_time in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria orEndTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("end_time not in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria orEndTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("end_time between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria orEndTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("end_time not between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andDeviceNumberIsNull() {
            addCriterion("device_number is null");
            return (Criteria) this;
        }

        public Criteria andDeviceNumberIsNotNull() {
            addCriterion("device_number is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceNumberEqualTo(Integer value) {
            addCriterion("device_number =", value, "deviceNumber");
            return (Criteria) this;
        }

        public Criteria andDeviceNumberNotEqualTo(Integer value) {
            addCriterion("device_number <>", value, "deviceNumber");
            return (Criteria) this;
        }

        public Criteria andDeviceNumberGreaterThan(Integer value) {
            addCriterion("device_number >", value, "deviceNumber");
            return (Criteria) this;
        }

        public Criteria andDeviceNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("device_number >=", value, "deviceNumber");
            return (Criteria) this;
        }

        public Criteria andDeviceNumberLessThan(Integer value) {
            addCriterion("device_number <", value, "deviceNumber");
            return (Criteria) this;
        }

        public Criteria andDeviceNumberLessThanOrEqualTo(Integer value) {
            addCriterion("device_number <=", value, "deviceNumber");
            return (Criteria) this;
        }

        public Criteria orDeviceNumberIsNull() {
            orCriterion("device_number is null");
            return (Criteria) this;
        }

        public Criteria orDeviceNumberIsNotNull() {
            orCriterion("device_number is not null");
            return (Criteria) this;
        }

        public Criteria orDeviceNumberEqualTo(Integer value) {
            orCriterion("device_number =", value, "deviceNumber");
            return (Criteria) this;
        }

        public Criteria orDeviceNumberNotEqualTo(Integer value) {
            orCriterion("device_number <>", value, "deviceNumber");
            return (Criteria) this;
        }

        public Criteria orDeviceNumberGreaterThan(Integer value) {
            orCriterion("device_number >", value, "deviceNumber");
            return (Criteria) this;
        }

        public Criteria orDeviceNumberGreaterThanOrEqualTo(Integer value) {
            orCriterion("device_number >=", value, "deviceNumber");
            return (Criteria) this;
        }

        public Criteria orDeviceNumberLessThan(Integer value) {
            orCriterion("device_number <", value, "deviceNumber");
            return (Criteria) this;
        }

        public Criteria orDeviceNumberLessThanOrEqualTo(Integer value) {
            orCriterion("device_number <=", value, "deviceNumber");
            return (Criteria) this;
        }

        public Criteria andDeviceNumberIn(List<Integer> values) {
            addCriterion("device_number in", values, "deviceNumber");
            return (Criteria) this;
        }

        public Criteria andDeviceNumberNotIn(List<Integer> values) {
            addCriterion("device_number not in", values, "deviceNumber");
            return (Criteria) this;
        }

        public Criteria andDeviceNumberBetween(Integer value1, Integer value2) {
            addCriterion("device_number between", value1, value2, "deviceNumber");
            return (Criteria) this;
        }

        public Criteria andDeviceNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("device_number not between", value1, value2, "deviceNumber");
            return (Criteria) this;
        }

        public Criteria orDeviceNumberIn(List<Integer> values) {
            orCriterion("device_number in", values, "deviceNumber");
            return (Criteria) this;
        }

        public Criteria orDeviceNumberNotIn(List<Integer> values) {
            orCriterion("device_number not in", values, "deviceNumber");
            return (Criteria) this;
        }

        public Criteria orDeviceNumberBetween(Integer value1, Integer value2) {
            orCriterion("device_number between", value1, value2, "deviceNumber");
            return (Criteria) this;
        }

        public Criteria orDeviceNumberNotBetween(Integer value1, Integer value2) {
            orCriterion("device_number not between", value1, value2, "deviceNumber");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria orRemarkIsNull() {
            orCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria orRemarkIsNotNull() {
            orCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria orRemarkEqualTo(String value) {
            orCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria orRemarkNotEqualTo(String value) {
            orCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria orRemarkGreaterThan(String value) {
            orCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria orRemarkGreaterThanOrEqualTo(String value) {
            orCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria orRemarkLessThan(String value) {
            orCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria orRemarkLessThanOrEqualTo(String value) {
            orCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria orRemarkLike(String value) {
            orCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria orRemarkNotLike(String value) {
            orCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria orRemarkIn(List<String> values) {
            orCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria orRemarkNotIn(List<String> values) {
            orCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria orRemarkBetween(String value1, String value2) {
            orCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria orRemarkNotBetween(String value1, String value2) {
            orCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andBankCustomerNoIsNull() {
            addCriterion("bank_customer_no is null");
            return (Criteria) this;
        }

        public Criteria andBankCustomerNoIsNotNull() {
            addCriterion("bank_customer_no is not null");
            return (Criteria) this;
        }

        public Criteria andBankCustomerNoEqualTo(String value) {
            addCriterion("bank_customer_no =", value, "bankCustomerNo");
            return (Criteria) this;
        }

        public Criteria andBankCustomerNoNotEqualTo(String value) {
            addCriterion("bank_customer_no <>", value, "bankCustomerNo");
            return (Criteria) this;
        }

        public Criteria andBankCustomerNoGreaterThan(String value) {
            addCriterion("bank_customer_no >", value, "bankCustomerNo");
            return (Criteria) this;
        }

        public Criteria andBankCustomerNoGreaterThanOrEqualTo(String value) {
            addCriterion("bank_customer_no >=", value, "bankCustomerNo");
            return (Criteria) this;
        }

        public Criteria andBankCustomerNoLessThan(String value) {
            addCriterion("bank_customer_no <", value, "bankCustomerNo");
            return (Criteria) this;
        }

        public Criteria andBankCustomerNoLessThanOrEqualTo(String value) {
            addCriterion("bank_customer_no <=", value, "bankCustomerNo");
            return (Criteria) this;
        }

        public Criteria orBankCustomerNoIsNull() {
            orCriterion("bank_customer_no is null");
            return (Criteria) this;
        }

        public Criteria orBankCustomerNoIsNotNull() {
            orCriterion("bank_customer_no is not null");
            return (Criteria) this;
        }

        public Criteria orBankCustomerNoEqualTo(String value) {
            orCriterion("bank_customer_no =", value, "bankCustomerNo");
            return (Criteria) this;
        }

        public Criteria orBankCustomerNoNotEqualTo(String value) {
            orCriterion("bank_customer_no <>", value, "bankCustomerNo");
            return (Criteria) this;
        }

        public Criteria orBankCustomerNoGreaterThan(String value) {
            orCriterion("bank_customer_no >", value, "bankCustomerNo");
            return (Criteria) this;
        }

        public Criteria orBankCustomerNoGreaterThanOrEqualTo(String value) {
            orCriterion("bank_customer_no >=", value, "bankCustomerNo");
            return (Criteria) this;
        }

        public Criteria orBankCustomerNoLessThan(String value) {
            orCriterion("bank_customer_no <", value, "bankCustomerNo");
            return (Criteria) this;
        }

        public Criteria orBankCustomerNoLessThanOrEqualTo(String value) {
            orCriterion("bank_customer_no <=", value, "bankCustomerNo");
            return (Criteria) this;
        }

        public Criteria andBankCustomerNoLike(String value) {
            addCriterion("bank_customer_no like", value, "bankCustomerNo");
            return (Criteria) this;
        }

        public Criteria andBankCustomerNoNotLike(String value) {
            addCriterion("bank_customer_no not like", value, "bankCustomerNo");
            return (Criteria) this;
        }

        public Criteria orBankCustomerNoLike(String value) {
            orCriterion("bank_customer_no like", value, "bankCustomerNo");
            return (Criteria) this;
        }

        public Criteria orBankCustomerNoNotLike(String value) {
            orCriterion("bank_customer_no not like", value, "bankCustomerNo");
            return (Criteria) this;
        }

        public Criteria andBankCustomerNoIn(List<String> values) {
            addCriterion("bank_customer_no in", values, "bankCustomerNo");
            return (Criteria) this;
        }

        public Criteria andBankCustomerNoNotIn(List<String> values) {
            addCriterion("bank_customer_no not in", values, "bankCustomerNo");
            return (Criteria) this;
        }

        public Criteria andBankCustomerNoBetween(String value1, String value2) {
            addCriterion("bank_customer_no between", value1, value2, "bankCustomerNo");
            return (Criteria) this;
        }

        public Criteria andBankCustomerNoNotBetween(String value1, String value2) {
            addCriterion("bank_customer_no not between", value1, value2, "bankCustomerNo");
            return (Criteria) this;
        }

        public Criteria orBankCustomerNoIn(List<String> values) {
            orCriterion("bank_customer_no in", values, "bankCustomerNo");
            return (Criteria) this;
        }

        public Criteria orBankCustomerNoNotIn(List<String> values) {
            orCriterion("bank_customer_no not in", values, "bankCustomerNo");
            return (Criteria) this;
        }

        public Criteria orBankCustomerNoBetween(String value1, String value2) {
            orCriterion("bank_customer_no between", value1, value2, "bankCustomerNo");
            return (Criteria) this;
        }

        public Criteria orBankCustomerNoNotBetween(String value1, String value2) {
            orCriterion("bank_customer_no not between", value1, value2, "bankCustomerNo");
            return (Criteria) this;
        }

        public Criteria andBankTerminalNoIsNull() {
            addCriterion("bank_terminal_no is null");
            return (Criteria) this;
        }

        public Criteria andBankTerminalNoIsNotNull() {
            addCriterion("bank_terminal_no is not null");
            return (Criteria) this;
        }

        public Criteria andBankTerminalNoEqualTo(String value) {
            addCriterion("bank_terminal_no =", value, "bankTerminalNo");
            return (Criteria) this;
        }

        public Criteria andBankTerminalNoNotEqualTo(String value) {
            addCriterion("bank_terminal_no <>", value, "bankTerminalNo");
            return (Criteria) this;
        }

        public Criteria andBankTerminalNoGreaterThan(String value) {
            addCriterion("bank_terminal_no >", value, "bankTerminalNo");
            return (Criteria) this;
        }

        public Criteria andBankTerminalNoGreaterThanOrEqualTo(String value) {
            addCriterion("bank_terminal_no >=", value, "bankTerminalNo");
            return (Criteria) this;
        }

        public Criteria andBankTerminalNoLessThan(String value) {
            addCriterion("bank_terminal_no <", value, "bankTerminalNo");
            return (Criteria) this;
        }

        public Criteria andBankTerminalNoLessThanOrEqualTo(String value) {
            addCriterion("bank_terminal_no <=", value, "bankTerminalNo");
            return (Criteria) this;
        }

        public Criteria orBankTerminalNoIsNull() {
            orCriterion("bank_terminal_no is null");
            return (Criteria) this;
        }

        public Criteria orBankTerminalNoIsNotNull() {
            orCriterion("bank_terminal_no is not null");
            return (Criteria) this;
        }

        public Criteria orBankTerminalNoEqualTo(String value) {
            orCriterion("bank_terminal_no =", value, "bankTerminalNo");
            return (Criteria) this;
        }

        public Criteria orBankTerminalNoNotEqualTo(String value) {
            orCriterion("bank_terminal_no <>", value, "bankTerminalNo");
            return (Criteria) this;
        }

        public Criteria orBankTerminalNoGreaterThan(String value) {
            orCriterion("bank_terminal_no >", value, "bankTerminalNo");
            return (Criteria) this;
        }

        public Criteria orBankTerminalNoGreaterThanOrEqualTo(String value) {
            orCriterion("bank_terminal_no >=", value, "bankTerminalNo");
            return (Criteria) this;
        }

        public Criteria orBankTerminalNoLessThan(String value) {
            orCriterion("bank_terminal_no <", value, "bankTerminalNo");
            return (Criteria) this;
        }

        public Criteria orBankTerminalNoLessThanOrEqualTo(String value) {
            orCriterion("bank_terminal_no <=", value, "bankTerminalNo");
            return (Criteria) this;
        }

        public Criteria andBankTerminalNoLike(String value) {
            addCriterion("bank_terminal_no like", value, "bankTerminalNo");
            return (Criteria) this;
        }

        public Criteria andBankTerminalNoNotLike(String value) {
            addCriterion("bank_terminal_no not like", value, "bankTerminalNo");
            return (Criteria) this;
        }

        public Criteria orBankTerminalNoLike(String value) {
            orCriterion("bank_terminal_no like", value, "bankTerminalNo");
            return (Criteria) this;
        }

        public Criteria orBankTerminalNoNotLike(String value) {
            orCriterion("bank_terminal_no not like", value, "bankTerminalNo");
            return (Criteria) this;
        }

        public Criteria andBankTerminalNoIn(List<String> values) {
            addCriterion("bank_terminal_no in", values, "bankTerminalNo");
            return (Criteria) this;
        }

        public Criteria andBankTerminalNoNotIn(List<String> values) {
            addCriterion("bank_terminal_no not in", values, "bankTerminalNo");
            return (Criteria) this;
        }

        public Criteria andBankTerminalNoBetween(String value1, String value2) {
            addCriterion("bank_terminal_no between", value1, value2, "bankTerminalNo");
            return (Criteria) this;
        }

        public Criteria andBankTerminalNoNotBetween(String value1, String value2) {
            addCriterion("bank_terminal_no not between", value1, value2, "bankTerminalNo");
            return (Criteria) this;
        }

        public Criteria orBankTerminalNoIn(List<String> values) {
            orCriterion("bank_terminal_no in", values, "bankTerminalNo");
            return (Criteria) this;
        }

        public Criteria orBankTerminalNoNotIn(List<String> values) {
            orCriterion("bank_terminal_no not in", values, "bankTerminalNo");
            return (Criteria) this;
        }

        public Criteria orBankTerminalNoBetween(String value1, String value2) {
            orCriterion("bank_terminal_no between", value1, value2, "bankTerminalNo");
            return (Criteria) this;
        }

        public Criteria orBankTerminalNoNotBetween(String value1, String value2) {
            orCriterion("bank_terminal_no not between", value1, value2, "bankTerminalNo");
            return (Criteria) this;
        }
    }

    /**
     * 该类对应数据库表 org
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
     * 该类对应数据库表 org
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