package com.wocai.jrt.device.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PosPadBean {
    /**
     * order by 排序语句
     * 对应数据库表字段 pos_pad
     */
    private String orderBy;

    /**
     * 分页开始记录
     * 对应数据库表字段 pos_pad
     */
    private Integer start;

    /**
     * 分页大小
     * 对应数据库表字段 pos_pad
     */
    private int pageSize = 10;

    /**
     * 是否指定 distinct 去除重复
     * 对应数据库表字段 pos_pad
     */
    private boolean distinct;

    /**
     * 逻辑or语句
     * 对应数据库表字段 pos_pad
     */
    private List<Criteria> oredCriteria;

    /**
     */
    public PosPadBean() {
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
     * 该类对应数据库表 pos_pad
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

        public Criteria andPosIdIsNull() {
            addCriterion("pos_id is null");
            return (Criteria) this;
        }

        public Criteria andPosIdIsNotNull() {
            addCriterion("pos_id is not null");
            return (Criteria) this;
        }

        public Criteria andPosIdEqualTo(String value) {
            addCriterion("pos_id =", value, "posId");
            return (Criteria) this;
        }

        public Criteria andPosIdNotEqualTo(String value) {
            addCriterion("pos_id <>", value, "posId");
            return (Criteria) this;
        }

        public Criteria andPosIdGreaterThan(String value) {
            addCriterion("pos_id >", value, "posId");
            return (Criteria) this;
        }

        public Criteria andPosIdGreaterThanOrEqualTo(String value) {
            addCriterion("pos_id >=", value, "posId");
            return (Criteria) this;
        }

        public Criteria andPosIdLessThan(String value) {
            addCriterion("pos_id <", value, "posId");
            return (Criteria) this;
        }

        public Criteria andPosIdLessThanOrEqualTo(String value) {
            addCriterion("pos_id <=", value, "posId");
            return (Criteria) this;
        }

        public Criteria orPosIdIsNull() {
            orCriterion("pos_id is null");
            return (Criteria) this;
        }

        public Criteria orPosIdIsNotNull() {
            orCriterion("pos_id is not null");
            return (Criteria) this;
        }

        public Criteria orPosIdEqualTo(String value) {
            orCriterion("pos_id =", value, "posId");
            return (Criteria) this;
        }

        public Criteria orPosIdNotEqualTo(String value) {
            orCriterion("pos_id <>", value, "posId");
            return (Criteria) this;
        }

        public Criteria orPosIdGreaterThan(String value) {
            orCriterion("pos_id >", value, "posId");
            return (Criteria) this;
        }

        public Criteria orPosIdGreaterThanOrEqualTo(String value) {
            orCriterion("pos_id >=", value, "posId");
            return (Criteria) this;
        }

        public Criteria orPosIdLessThan(String value) {
            orCriterion("pos_id <", value, "posId");
            return (Criteria) this;
        }

        public Criteria orPosIdLessThanOrEqualTo(String value) {
            orCriterion("pos_id <=", value, "posId");
            return (Criteria) this;
        }

        public Criteria andPosIdLike(String value) {
            addCriterion("pos_id like", value, "posId");
            return (Criteria) this;
        }

        public Criteria andPosIdNotLike(String value) {
            addCriterion("pos_id not like", value, "posId");
            return (Criteria) this;
        }

        public Criteria orPosIdLike(String value) {
            orCriterion("pos_id like", value, "posId");
            return (Criteria) this;
        }

        public Criteria orPosIdNotLike(String value) {
            orCriterion("pos_id not like", value, "posId");
            return (Criteria) this;
        }

        public Criteria andPosIdIn(List<String> values) {
            addCriterion("pos_id in", values, "posId");
            return (Criteria) this;
        }

        public Criteria andPosIdNotIn(List<String> values) {
            addCriterion("pos_id not in", values, "posId");
            return (Criteria) this;
        }

        public Criteria andPosIdBetween(String value1, String value2) {
            addCriterion("pos_id between", value1, value2, "posId");
            return (Criteria) this;
        }

        public Criteria andPosIdNotBetween(String value1, String value2) {
            addCriterion("pos_id not between", value1, value2, "posId");
            return (Criteria) this;
        }

        public Criteria orPosIdIn(List<String> values) {
            orCriterion("pos_id in", values, "posId");
            return (Criteria) this;
        }

        public Criteria orPosIdNotIn(List<String> values) {
            orCriterion("pos_id not in", values, "posId");
            return (Criteria) this;
        }

        public Criteria orPosIdBetween(String value1, String value2) {
            orCriterion("pos_id between", value1, value2, "posId");
            return (Criteria) this;
        }

        public Criteria orPosIdNotBetween(String value1, String value2) {
            orCriterion("pos_id not between", value1, value2, "posId");
            return (Criteria) this;
        }

        public Criteria andPadIdIsNull() {
            addCriterion("pad_id is null");
            return (Criteria) this;
        }

        public Criteria andPadIdIsNotNull() {
            addCriterion("pad_id is not null");
            return (Criteria) this;
        }

        public Criteria andPadIdEqualTo(String value) {
            addCriterion("pad_id =", value, "padId");
            return (Criteria) this;
        }

        public Criteria andPadIdNotEqualTo(String value) {
            addCriterion("pad_id <>", value, "padId");
            return (Criteria) this;
        }

        public Criteria andPadIdGreaterThan(String value) {
            addCriterion("pad_id >", value, "padId");
            return (Criteria) this;
        }

        public Criteria andPadIdGreaterThanOrEqualTo(String value) {
            addCriterion("pad_id >=", value, "padId");
            return (Criteria) this;
        }

        public Criteria andPadIdLessThan(String value) {
            addCriterion("pad_id <", value, "padId");
            return (Criteria) this;
        }

        public Criteria andPadIdLessThanOrEqualTo(String value) {
            addCriterion("pad_id <=", value, "padId");
            return (Criteria) this;
        }

        public Criteria orPadIdIsNull() {
            orCriterion("pad_id is null");
            return (Criteria) this;
        }

        public Criteria orPadIdIsNotNull() {
            orCriterion("pad_id is not null");
            return (Criteria) this;
        }

        public Criteria orPadIdEqualTo(String value) {
            orCriterion("pad_id =", value, "padId");
            return (Criteria) this;
        }

        public Criteria orPadIdNotEqualTo(String value) {
            orCriterion("pad_id <>", value, "padId");
            return (Criteria) this;
        }

        public Criteria orPadIdGreaterThan(String value) {
            orCriterion("pad_id >", value, "padId");
            return (Criteria) this;
        }

        public Criteria orPadIdGreaterThanOrEqualTo(String value) {
            orCriterion("pad_id >=", value, "padId");
            return (Criteria) this;
        }

        public Criteria orPadIdLessThan(String value) {
            orCriterion("pad_id <", value, "padId");
            return (Criteria) this;
        }

        public Criteria orPadIdLessThanOrEqualTo(String value) {
            orCriterion("pad_id <=", value, "padId");
            return (Criteria) this;
        }

        public Criteria andPadIdLike(String value) {
            addCriterion("pad_id like", value, "padId");
            return (Criteria) this;
        }

        public Criteria andPadIdNotLike(String value) {
            addCriterion("pad_id not like", value, "padId");
            return (Criteria) this;
        }

        public Criteria orPadIdLike(String value) {
            orCriterion("pad_id like", value, "padId");
            return (Criteria) this;
        }

        public Criteria orPadIdNotLike(String value) {
            orCriterion("pad_id not like", value, "padId");
            return (Criteria) this;
        }

        public Criteria andPadIdIn(List<String> values) {
            addCriterion("pad_id in", values, "padId");
            return (Criteria) this;
        }

        public Criteria andPadIdNotIn(List<String> values) {
            addCriterion("pad_id not in", values, "padId");
            return (Criteria) this;
        }

        public Criteria andPadIdBetween(String value1, String value2) {
            addCriterion("pad_id between", value1, value2, "padId");
            return (Criteria) this;
        }

        public Criteria andPadIdNotBetween(String value1, String value2) {
            addCriterion("pad_id not between", value1, value2, "padId");
            return (Criteria) this;
        }

        public Criteria orPadIdIn(List<String> values) {
            orCriterion("pad_id in", values, "padId");
            return (Criteria) this;
        }

        public Criteria orPadIdNotIn(List<String> values) {
            orCriterion("pad_id not in", values, "padId");
            return (Criteria) this;
        }

        public Criteria orPadIdBetween(String value1, String value2) {
            orCriterion("pad_id between", value1, value2, "padId");
            return (Criteria) this;
        }

        public Criteria orPadIdNotBetween(String value1, String value2) {
            orCriterion("pad_id not between", value1, value2, "padId");
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
            addCriterion("end_time =", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotEqualTo(Date value) {
            addCriterion("end_time <>", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThan(Date value) {
            addCriterion("end_time >", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("end_time >=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThan(Date value) {
            addCriterion("end_time <", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("end_time <=", value, "endTime");
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
            orCriterion("end_time =", value, "endTime");
            return (Criteria) this;
        }

        public Criteria orEndTimeNotEqualTo(Date value) {
            orCriterion("end_time <>", value, "endTime");
            return (Criteria) this;
        }

        public Criteria orEndTimeGreaterThan(Date value) {
            orCriterion("end_time >", value, "endTime");
            return (Criteria) this;
        }

        public Criteria orEndTimeGreaterThanOrEqualTo(Date value) {
            orCriterion("end_time >=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria orEndTimeLessThan(Date value) {
            orCriterion("end_time <", value, "endTime");
            return (Criteria) this;
        }

        public Criteria orEndTimeLessThanOrEqualTo(Date value) {
            orCriterion("end_time <=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIn(List<Date> values) {
            addCriterion("end_time in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotIn(List<Date> values) {
            addCriterion("end_time not in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeBetween(Date value1, Date value2) {
            addCriterion("end_time between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("end_time not between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria orEndTimeIn(List<Date> values) {
            orCriterion("end_time in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria orEndTimeNotIn(List<Date> values) {
            orCriterion("end_time not in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria orEndTimeBetween(Date value1, Date value2) {
            orCriterion("end_time between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria orEndTimeNotBetween(Date value1, Date value2) {
            orCriterion("end_time not between", value1, value2, "endTime");
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

        public Criteria andBindingTimeIsNull() {
            addCriterion("binding_time is null");
            return (Criteria) this;
        }

        public Criteria andBindingTimeIsNotNull() {
            addCriterion("binding_time is not null");
            return (Criteria) this;
        }

        public Criteria andBindingTimeEqualTo(Date value) {
            addCriterion("binding_time =", value, "bindingTime");
            return (Criteria) this;
        }

        public Criteria andBindingTimeNotEqualTo(Date value) {
            addCriterion("binding_time <>", value, "bindingTime");
            return (Criteria) this;
        }

        public Criteria andBindingTimeGreaterThan(Date value) {
            addCriterion("binding_time >", value, "bindingTime");
            return (Criteria) this;
        }

        public Criteria andBindingTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("binding_time >=", value, "bindingTime");
            return (Criteria) this;
        }

        public Criteria andBindingTimeLessThan(Date value) {
            addCriterion("binding_time <", value, "bindingTime");
            return (Criteria) this;
        }

        public Criteria andBindingTimeLessThanOrEqualTo(Date value) {
            addCriterion("binding_time <=", value, "bindingTime");
            return (Criteria) this;
        }

        public Criteria orBindingTimeIsNull() {
            orCriterion("binding_time is null");
            return (Criteria) this;
        }

        public Criteria orBindingTimeIsNotNull() {
            orCriterion("binding_time is not null");
            return (Criteria) this;
        }

        public Criteria orBindingTimeEqualTo(Date value) {
            orCriterion("binding_time =", value, "bindingTime");
            return (Criteria) this;
        }

        public Criteria orBindingTimeNotEqualTo(Date value) {
            orCriterion("binding_time <>", value, "bindingTime");
            return (Criteria) this;
        }

        public Criteria orBindingTimeGreaterThan(Date value) {
            orCriterion("binding_time >", value, "bindingTime");
            return (Criteria) this;
        }

        public Criteria orBindingTimeGreaterThanOrEqualTo(Date value) {
            orCriterion("binding_time >=", value, "bindingTime");
            return (Criteria) this;
        }

        public Criteria orBindingTimeLessThan(Date value) {
            orCriterion("binding_time <", value, "bindingTime");
            return (Criteria) this;
        }

        public Criteria orBindingTimeLessThanOrEqualTo(Date value) {
            orCriterion("binding_time <=", value, "bindingTime");
            return (Criteria) this;
        }

        public Criteria andBindingTimeIn(List<Date> values) {
            addCriterion("binding_time in", values, "bindingTime");
            return (Criteria) this;
        }

        public Criteria andBindingTimeNotIn(List<Date> values) {
            addCriterion("binding_time not in", values, "bindingTime");
            return (Criteria) this;
        }

        public Criteria andBindingTimeBetween(Date value1, Date value2) {
            addCriterion("binding_time between", value1, value2, "bindingTime");
            return (Criteria) this;
        }

        public Criteria andBindingTimeNotBetween(Date value1, Date value2) {
            addCriterion("binding_time not between", value1, value2, "bindingTime");
            return (Criteria) this;
        }

        public Criteria orBindingTimeIn(List<Date> values) {
            orCriterion("binding_time in", values, "bindingTime");
            return (Criteria) this;
        }

        public Criteria orBindingTimeNotIn(List<Date> values) {
            orCriterion("binding_time not in", values, "bindingTime");
            return (Criteria) this;
        }

        public Criteria orBindingTimeBetween(Date value1, Date value2) {
            orCriterion("binding_time between", value1, value2, "bindingTime");
            return (Criteria) this;
        }

        public Criteria orBindingTimeNotBetween(Date value1, Date value2) {
            orCriterion("binding_time not between", value1, value2, "bindingTime");
            return (Criteria) this;
        }

        public Criteria andCollarTimeIsNull() {
            addCriterion("collar_time is null");
            return (Criteria) this;
        }

        public Criteria andCollarTimeIsNotNull() {
            addCriterion("collar_time is not null");
            return (Criteria) this;
        }

        public Criteria andCollarTimeEqualTo(Date value) {
            addCriterion("collar_time =", value, "collarTime");
            return (Criteria) this;
        }

        public Criteria andCollarTimeNotEqualTo(Date value) {
            addCriterion("collar_time <>", value, "collarTime");
            return (Criteria) this;
        }

        public Criteria andCollarTimeGreaterThan(Date value) {
            addCriterion("collar_time >", value, "collarTime");
            return (Criteria) this;
        }

        public Criteria andCollarTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("collar_time >=", value, "collarTime");
            return (Criteria) this;
        }

        public Criteria andCollarTimeLessThan(Date value) {
            addCriterion("collar_time <", value, "collarTime");
            return (Criteria) this;
        }

        public Criteria andCollarTimeLessThanOrEqualTo(Date value) {
            addCriterion("collar_time <=", value, "collarTime");
            return (Criteria) this;
        }

        public Criteria orCollarTimeIsNull() {
            orCriterion("collar_time is null");
            return (Criteria) this;
        }

        public Criteria orCollarTimeIsNotNull() {
            orCriterion("collar_time is not null");
            return (Criteria) this;
        }

        public Criteria orCollarTimeEqualTo(Date value) {
            orCriterion("collar_time =", value, "collarTime");
            return (Criteria) this;
        }

        public Criteria orCollarTimeNotEqualTo(Date value) {
            orCriterion("collar_time <>", value, "collarTime");
            return (Criteria) this;
        }

        public Criteria orCollarTimeGreaterThan(Date value) {
            orCriterion("collar_time >", value, "collarTime");
            return (Criteria) this;
        }

        public Criteria orCollarTimeGreaterThanOrEqualTo(Date value) {
            orCriterion("collar_time >=", value, "collarTime");
            return (Criteria) this;
        }

        public Criteria orCollarTimeLessThan(Date value) {
            orCriterion("collar_time <", value, "collarTime");
            return (Criteria) this;
        }

        public Criteria orCollarTimeLessThanOrEqualTo(Date value) {
            orCriterion("collar_time <=", value, "collarTime");
            return (Criteria) this;
        }

        public Criteria andCollarTimeIn(List<Date> values) {
            addCriterion("collar_time in", values, "collarTime");
            return (Criteria) this;
        }

        public Criteria andCollarTimeNotIn(List<Date> values) {
            addCriterion("collar_time not in", values, "collarTime");
            return (Criteria) this;
        }

        public Criteria andCollarTimeBetween(Date value1, Date value2) {
            addCriterion("collar_time between", value1, value2, "collarTime");
            return (Criteria) this;
        }

        public Criteria andCollarTimeNotBetween(Date value1, Date value2) {
            addCriterion("collar_time not between", value1, value2, "collarTime");
            return (Criteria) this;
        }

        public Criteria orCollarTimeIn(List<Date> values) {
            orCriterion("collar_time in", values, "collarTime");
            return (Criteria) this;
        }

        public Criteria orCollarTimeNotIn(List<Date> values) {
            orCriterion("collar_time not in", values, "collarTime");
            return (Criteria) this;
        }

        public Criteria orCollarTimeBetween(Date value1, Date value2) {
            orCriterion("collar_time between", value1, value2, "collarTime");
            return (Criteria) this;
        }

        public Criteria orCollarTimeNotBetween(Date value1, Date value2) {
            orCriterion("collar_time not between", value1, value2, "collarTime");
            return (Criteria) this;
        }

        public Criteria andAllocatedTimeIsNull() {
            addCriterion("allocated_time is null");
            return (Criteria) this;
        }

        public Criteria andAllocatedTimeIsNotNull() {
            addCriterion("allocated_time is not null");
            return (Criteria) this;
        }

        public Criteria andAllocatedTimeEqualTo(Date value) {
            addCriterion("allocated_time =", value, "allocatedTime");
            return (Criteria) this;
        }

        public Criteria andAllocatedTimeNotEqualTo(Date value) {
            addCriterion("allocated_time <>", value, "allocatedTime");
            return (Criteria) this;
        }

        public Criteria andAllocatedTimeGreaterThan(Date value) {
            addCriterion("allocated_time >", value, "allocatedTime");
            return (Criteria) this;
        }

        public Criteria andAllocatedTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("allocated_time >=", value, "allocatedTime");
            return (Criteria) this;
        }

        public Criteria andAllocatedTimeLessThan(Date value) {
            addCriterion("allocated_time <", value, "allocatedTime");
            return (Criteria) this;
        }

        public Criteria andAllocatedTimeLessThanOrEqualTo(Date value) {
            addCriterion("allocated_time <=", value, "allocatedTime");
            return (Criteria) this;
        }

        public Criteria orAllocatedTimeIsNull() {
            orCriterion("allocated_time is null");
            return (Criteria) this;
        }

        public Criteria orAllocatedTimeIsNotNull() {
            orCriterion("allocated_time is not null");
            return (Criteria) this;
        }

        public Criteria orAllocatedTimeEqualTo(Date value) {
            orCriterion("allocated_time =", value, "allocatedTime");
            return (Criteria) this;
        }

        public Criteria orAllocatedTimeNotEqualTo(Date value) {
            orCriterion("allocated_time <>", value, "allocatedTime");
            return (Criteria) this;
        }

        public Criteria orAllocatedTimeGreaterThan(Date value) {
            orCriterion("allocated_time >", value, "allocatedTime");
            return (Criteria) this;
        }

        public Criteria orAllocatedTimeGreaterThanOrEqualTo(Date value) {
            orCriterion("allocated_time >=", value, "allocatedTime");
            return (Criteria) this;
        }

        public Criteria orAllocatedTimeLessThan(Date value) {
            orCriterion("allocated_time <", value, "allocatedTime");
            return (Criteria) this;
        }

        public Criteria orAllocatedTimeLessThanOrEqualTo(Date value) {
            orCriterion("allocated_time <=", value, "allocatedTime");
            return (Criteria) this;
        }

        public Criteria andAllocatedTimeIn(List<Date> values) {
            addCriterion("allocated_time in", values, "allocatedTime");
            return (Criteria) this;
        }

        public Criteria andAllocatedTimeNotIn(List<Date> values) {
            addCriterion("allocated_time not in", values, "allocatedTime");
            return (Criteria) this;
        }

        public Criteria andAllocatedTimeBetween(Date value1, Date value2) {
            addCriterion("allocated_time between", value1, value2, "allocatedTime");
            return (Criteria) this;
        }

        public Criteria andAllocatedTimeNotBetween(Date value1, Date value2) {
            addCriterion("allocated_time not between", value1, value2, "allocatedTime");
            return (Criteria) this;
        }

        public Criteria orAllocatedTimeIn(List<Date> values) {
            orCriterion("allocated_time in", values, "allocatedTime");
            return (Criteria) this;
        }

        public Criteria orAllocatedTimeNotIn(List<Date> values) {
            orCriterion("allocated_time not in", values, "allocatedTime");
            return (Criteria) this;
        }

        public Criteria orAllocatedTimeBetween(Date value1, Date value2) {
            orCriterion("allocated_time between", value1, value2, "allocatedTime");
            return (Criteria) this;
        }

        public Criteria orAllocatedTimeNotBetween(Date value1, Date value2) {
            orCriterion("allocated_time not between", value1, value2, "allocatedTime");
            return (Criteria) this;
        }

        public Criteria andAllocatedIsNull() {
            addCriterion("allocated is null");
            return (Criteria) this;
        }

        public Criteria andAllocatedIsNotNull() {
            addCriterion("allocated is not null");
            return (Criteria) this;
        }

        public Criteria andAllocatedEqualTo(Boolean value) {
            addCriterion("allocated =", value, "allocated");
            return (Criteria) this;
        }

        public Criteria andAllocatedNotEqualTo(Boolean value) {
            addCriterion("allocated <>", value, "allocated");
            return (Criteria) this;
        }

        public Criteria andAllocatedGreaterThan(Boolean value) {
            addCriterion("allocated >", value, "allocated");
            return (Criteria) this;
        }

        public Criteria andAllocatedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("allocated >=", value, "allocated");
            return (Criteria) this;
        }

        public Criteria andAllocatedLessThan(Boolean value) {
            addCriterion("allocated <", value, "allocated");
            return (Criteria) this;
        }

        public Criteria andAllocatedLessThanOrEqualTo(Boolean value) {
            addCriterion("allocated <=", value, "allocated");
            return (Criteria) this;
        }

        public Criteria orAllocatedIsNull() {
            orCriterion("allocated is null");
            return (Criteria) this;
        }

        public Criteria orAllocatedIsNotNull() {
            orCriterion("allocated is not null");
            return (Criteria) this;
        }

        public Criteria orAllocatedEqualTo(Boolean value) {
            orCriterion("allocated =", value, "allocated");
            return (Criteria) this;
        }

        public Criteria orAllocatedNotEqualTo(Boolean value) {
            orCriterion("allocated <>", value, "allocated");
            return (Criteria) this;
        }

        public Criteria orAllocatedGreaterThan(Boolean value) {
            orCriterion("allocated >", value, "allocated");
            return (Criteria) this;
        }

        public Criteria orAllocatedGreaterThanOrEqualTo(Boolean value) {
            orCriterion("allocated >=", value, "allocated");
            return (Criteria) this;
        }

        public Criteria orAllocatedLessThan(Boolean value) {
            orCriterion("allocated <", value, "allocated");
            return (Criteria) this;
        }

        public Criteria orAllocatedLessThanOrEqualTo(Boolean value) {
            orCriterion("allocated <=", value, "allocated");
            return (Criteria) this;
        }

        public Criteria andAllocatedIn(List<Boolean> values) {
            addCriterion("allocated in", values, "allocated");
            return (Criteria) this;
        }

        public Criteria andAllocatedNotIn(List<Boolean> values) {
            addCriterion("allocated not in", values, "allocated");
            return (Criteria) this;
        }

        public Criteria andAllocatedBetween(Boolean value1, Boolean value2) {
            addCriterion("allocated between", value1, value2, "allocated");
            return (Criteria) this;
        }

        public Criteria andAllocatedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("allocated not between", value1, value2, "allocated");
            return (Criteria) this;
        }

        public Criteria orAllocatedIn(List<Boolean> values) {
            orCriterion("allocated in", values, "allocated");
            return (Criteria) this;
        }

        public Criteria orAllocatedNotIn(List<Boolean> values) {
            orCriterion("allocated not in", values, "allocated");
            return (Criteria) this;
        }

        public Criteria orAllocatedBetween(Boolean value1, Boolean value2) {
            orCriterion("allocated between", value1, value2, "allocated");
            return (Criteria) this;
        }

        public Criteria orAllocatedNotBetween(Boolean value1, Boolean value2) {
            orCriterion("allocated not between", value1, value2, "allocated");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdIsNull() {
            addCriterion("employee_id is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdIsNotNull() {
            addCriterion("employee_id is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdEqualTo(String value) {
            addCriterion("employee_id =", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdNotEqualTo(String value) {
            addCriterion("employee_id <>", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdGreaterThan(String value) {
            addCriterion("employee_id >", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdGreaterThanOrEqualTo(String value) {
            addCriterion("employee_id >=", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdLessThan(String value) {
            addCriterion("employee_id <", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdLessThanOrEqualTo(String value) {
            addCriterion("employee_id <=", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria orEmployeeIdIsNull() {
            orCriterion("employee_id is null");
            return (Criteria) this;
        }

        public Criteria orEmployeeIdIsNotNull() {
            orCriterion("employee_id is not null");
            return (Criteria) this;
        }

        public Criteria orEmployeeIdEqualTo(String value) {
            orCriterion("employee_id =", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria orEmployeeIdNotEqualTo(String value) {
            orCriterion("employee_id <>", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria orEmployeeIdGreaterThan(String value) {
            orCriterion("employee_id >", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria orEmployeeIdGreaterThanOrEqualTo(String value) {
            orCriterion("employee_id >=", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria orEmployeeIdLessThan(String value) {
            orCriterion("employee_id <", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria orEmployeeIdLessThanOrEqualTo(String value) {
            orCriterion("employee_id <=", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdLike(String value) {
            addCriterion("employee_id like", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdNotLike(String value) {
            addCriterion("employee_id not like", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria orEmployeeIdLike(String value) {
            orCriterion("employee_id like", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria orEmployeeIdNotLike(String value) {
            orCriterion("employee_id not like", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdIn(List<String> values) {
            addCriterion("employee_id in", values, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdNotIn(List<String> values) {
            addCriterion("employee_id not in", values, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdBetween(String value1, String value2) {
            addCriterion("employee_id between", value1, value2, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdNotBetween(String value1, String value2) {
            addCriterion("employee_id not between", value1, value2, "employeeId");
            return (Criteria) this;
        }

        public Criteria orEmployeeIdIn(List<String> values) {
            orCriterion("employee_id in", values, "employeeId");
            return (Criteria) this;
        }

        public Criteria orEmployeeIdNotIn(List<String> values) {
            orCriterion("employee_id not in", values, "employeeId");
            return (Criteria) this;
        }

        public Criteria orEmployeeIdBetween(String value1, String value2) {
            orCriterion("employee_id between", value1, value2, "employeeId");
            return (Criteria) this;
        }

        public Criteria orEmployeeIdNotBetween(String value1, String value2) {
            orCriterion("employee_id not between", value1, value2, "employeeId");
            return (Criteria) this;
        }
    }

    /**
     * 该类对应数据库表 pos_pad
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
     * 该类对应数据库表 pos_pad
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