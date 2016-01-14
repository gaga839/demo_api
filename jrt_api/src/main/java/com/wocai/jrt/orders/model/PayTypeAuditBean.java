package com.wocai.jrt.orders.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PayTypeAuditBean {
    /**
     * order by 排序语句
     * 对应数据库表字段 pay_type_audit
     */
    private String orderBy;

    /**
     * 分页开始记录
     * 对应数据库表字段 pay_type_audit
     */
    private Integer start;

    /**
     * 分页大小
     * 对应数据库表字段 pay_type_audit
     */
    private int pageSize = 10;

    /**
     * 是否指定 distinct 去除重复
     * 对应数据库表字段 pay_type_audit
     */
    private boolean distinct;

    /**
     * 逻辑or语句
     * 对应数据库表字段 pay_type_audit
     */
    private List<Criteria> oredCriteria;

    /**
     */
    public PayTypeAuditBean() {
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
     * 该类对应数据库表 pay_type_audit
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

        public Criteria andAuditNameIsNull() {
            addCriterion("audit_name is null");
            return (Criteria) this;
        }

        public Criteria andAuditNameIsNotNull() {
            addCriterion("audit_name is not null");
            return (Criteria) this;
        }

        public Criteria andAuditNameEqualTo(String value) {
            addCriterion("audit_name =", value, "auditName");
            return (Criteria) this;
        }

        public Criteria andAuditNameNotEqualTo(String value) {
            addCriterion("audit_name <>", value, "auditName");
            return (Criteria) this;
        }

        public Criteria andAuditNameGreaterThan(String value) {
            addCriterion("audit_name >", value, "auditName");
            return (Criteria) this;
        }

        public Criteria andAuditNameGreaterThanOrEqualTo(String value) {
            addCriterion("audit_name >=", value, "auditName");
            return (Criteria) this;
        }

        public Criteria andAuditNameLessThan(String value) {
            addCriterion("audit_name <", value, "auditName");
            return (Criteria) this;
        }

        public Criteria andAuditNameLessThanOrEqualTo(String value) {
            addCriterion("audit_name <=", value, "auditName");
            return (Criteria) this;
        }

        public Criteria orAuditNameIsNull() {
            orCriterion("audit_name is null");
            return (Criteria) this;
        }

        public Criteria orAuditNameIsNotNull() {
            orCriterion("audit_name is not null");
            return (Criteria) this;
        }

        public Criteria orAuditNameEqualTo(String value) {
            orCriterion("audit_name =", value, "auditName");
            return (Criteria) this;
        }

        public Criteria orAuditNameNotEqualTo(String value) {
            orCriterion("audit_name <>", value, "auditName");
            return (Criteria) this;
        }

        public Criteria orAuditNameGreaterThan(String value) {
            orCriterion("audit_name >", value, "auditName");
            return (Criteria) this;
        }

        public Criteria orAuditNameGreaterThanOrEqualTo(String value) {
            orCriterion("audit_name >=", value, "auditName");
            return (Criteria) this;
        }

        public Criteria orAuditNameLessThan(String value) {
            orCriterion("audit_name <", value, "auditName");
            return (Criteria) this;
        }

        public Criteria orAuditNameLessThanOrEqualTo(String value) {
            orCriterion("audit_name <=", value, "auditName");
            return (Criteria) this;
        }

        public Criteria andAuditNameLike(String value) {
            addCriterion("audit_name like", value, "auditName");
            return (Criteria) this;
        }

        public Criteria andAuditNameNotLike(String value) {
            addCriterion("audit_name not like", value, "auditName");
            return (Criteria) this;
        }

        public Criteria orAuditNameLike(String value) {
            orCriterion("audit_name like", value, "auditName");
            return (Criteria) this;
        }

        public Criteria orAuditNameNotLike(String value) {
            orCriterion("audit_name not like", value, "auditName");
            return (Criteria) this;
        }

        public Criteria andAuditNameIn(List<String> values) {
            addCriterion("audit_name in", values, "auditName");
            return (Criteria) this;
        }

        public Criteria andAuditNameNotIn(List<String> values) {
            addCriterion("audit_name not in", values, "auditName");
            return (Criteria) this;
        }

        public Criteria andAuditNameBetween(String value1, String value2) {
            addCriterion("audit_name between", value1, value2, "auditName");
            return (Criteria) this;
        }

        public Criteria andAuditNameNotBetween(String value1, String value2) {
            addCriterion("audit_name not between", value1, value2, "auditName");
            return (Criteria) this;
        }

        public Criteria orAuditNameIn(List<String> values) {
            orCriterion("audit_name in", values, "auditName");
            return (Criteria) this;
        }

        public Criteria orAuditNameNotIn(List<String> values) {
            orCriterion("audit_name not in", values, "auditName");
            return (Criteria) this;
        }

        public Criteria orAuditNameBetween(String value1, String value2) {
            orCriterion("audit_name between", value1, value2, "auditName");
            return (Criteria) this;
        }

        public Criteria orAuditNameNotBetween(String value1, String value2) {
            orCriterion("audit_name not between", value1, value2, "auditName");
            return (Criteria) this;
        }

        public Criteria andAuditIdIsNull() {
            addCriterion("audit_id is null");
            return (Criteria) this;
        }

        public Criteria andAuditIdIsNotNull() {
            addCriterion("audit_id is not null");
            return (Criteria) this;
        }

        public Criteria andAuditIdEqualTo(String value) {
            addCriterion("audit_id =", value, "auditId");
            return (Criteria) this;
        }

        public Criteria andAuditIdNotEqualTo(String value) {
            addCriterion("audit_id <>", value, "auditId");
            return (Criteria) this;
        }

        public Criteria andAuditIdGreaterThan(String value) {
            addCriterion("audit_id >", value, "auditId");
            return (Criteria) this;
        }

        public Criteria andAuditIdGreaterThanOrEqualTo(String value) {
            addCriterion("audit_id >=", value, "auditId");
            return (Criteria) this;
        }

        public Criteria andAuditIdLessThan(String value) {
            addCriterion("audit_id <", value, "auditId");
            return (Criteria) this;
        }

        public Criteria andAuditIdLessThanOrEqualTo(String value) {
            addCriterion("audit_id <=", value, "auditId");
            return (Criteria) this;
        }

        public Criteria orAuditIdIsNull() {
            orCriterion("audit_id is null");
            return (Criteria) this;
        }

        public Criteria orAuditIdIsNotNull() {
            orCriterion("audit_id is not null");
            return (Criteria) this;
        }

        public Criteria orAuditIdEqualTo(String value) {
            orCriterion("audit_id =", value, "auditId");
            return (Criteria) this;
        }

        public Criteria orAuditIdNotEqualTo(String value) {
            orCriterion("audit_id <>", value, "auditId");
            return (Criteria) this;
        }

        public Criteria orAuditIdGreaterThan(String value) {
            orCriterion("audit_id >", value, "auditId");
            return (Criteria) this;
        }

        public Criteria orAuditIdGreaterThanOrEqualTo(String value) {
            orCriterion("audit_id >=", value, "auditId");
            return (Criteria) this;
        }

        public Criteria orAuditIdLessThan(String value) {
            orCriterion("audit_id <", value, "auditId");
            return (Criteria) this;
        }

        public Criteria orAuditIdLessThanOrEqualTo(String value) {
            orCriterion("audit_id <=", value, "auditId");
            return (Criteria) this;
        }

        public Criteria andAuditIdLike(String value) {
            addCriterion("audit_id like", value, "auditId");
            return (Criteria) this;
        }

        public Criteria andAuditIdNotLike(String value) {
            addCriterion("audit_id not like", value, "auditId");
            return (Criteria) this;
        }

        public Criteria orAuditIdLike(String value) {
            orCriterion("audit_id like", value, "auditId");
            return (Criteria) this;
        }

        public Criteria orAuditIdNotLike(String value) {
            orCriterion("audit_id not like", value, "auditId");
            return (Criteria) this;
        }

        public Criteria andAuditIdIn(List<String> values) {
            addCriterion("audit_id in", values, "auditId");
            return (Criteria) this;
        }

        public Criteria andAuditIdNotIn(List<String> values) {
            addCriterion("audit_id not in", values, "auditId");
            return (Criteria) this;
        }

        public Criteria andAuditIdBetween(String value1, String value2) {
            addCriterion("audit_id between", value1, value2, "auditId");
            return (Criteria) this;
        }

        public Criteria andAuditIdNotBetween(String value1, String value2) {
            addCriterion("audit_id not between", value1, value2, "auditId");
            return (Criteria) this;
        }

        public Criteria orAuditIdIn(List<String> values) {
            orCriterion("audit_id in", values, "auditId");
            return (Criteria) this;
        }

        public Criteria orAuditIdNotIn(List<String> values) {
            orCriterion("audit_id not in", values, "auditId");
            return (Criteria) this;
        }

        public Criteria orAuditIdBetween(String value1, String value2) {
            orCriterion("audit_id between", value1, value2, "auditId");
            return (Criteria) this;
        }

        public Criteria orAuditIdNotBetween(String value1, String value2) {
            orCriterion("audit_id not between", value1, value2, "auditId");
            return (Criteria) this;
        }

        public Criteria andAuditTimeIsNull() {
            addCriterion("audit_time is null");
            return (Criteria) this;
        }

        public Criteria andAuditTimeIsNotNull() {
            addCriterion("audit_time is not null");
            return (Criteria) this;
        }

        public Criteria andAuditTimeEqualTo(Date value) {
            addCriterion("audit_time =", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeNotEqualTo(Date value) {
            addCriterion("audit_time <>", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeGreaterThan(Date value) {
            addCriterion("audit_time >", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("audit_time >=", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeLessThan(Date value) {
            addCriterion("audit_time <", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeLessThanOrEqualTo(Date value) {
            addCriterion("audit_time <=", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria orAuditTimeIsNull() {
            orCriterion("audit_time is null");
            return (Criteria) this;
        }

        public Criteria orAuditTimeIsNotNull() {
            orCriterion("audit_time is not null");
            return (Criteria) this;
        }

        public Criteria orAuditTimeEqualTo(Date value) {
            orCriterion("audit_time =", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria orAuditTimeNotEqualTo(Date value) {
            orCriterion("audit_time <>", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria orAuditTimeGreaterThan(Date value) {
            orCriterion("audit_time >", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria orAuditTimeGreaterThanOrEqualTo(Date value) {
            orCriterion("audit_time >=", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria orAuditTimeLessThan(Date value) {
            orCriterion("audit_time <", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria orAuditTimeLessThanOrEqualTo(Date value) {
            orCriterion("audit_time <=", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeIn(List<Date> values) {
            addCriterion("audit_time in", values, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeNotIn(List<Date> values) {
            addCriterion("audit_time not in", values, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeBetween(Date value1, Date value2) {
            addCriterion("audit_time between", value1, value2, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeNotBetween(Date value1, Date value2) {
            addCriterion("audit_time not between", value1, value2, "auditTime");
            return (Criteria) this;
        }

        public Criteria orAuditTimeIn(List<Date> values) {
            orCriterion("audit_time in", values, "auditTime");
            return (Criteria) this;
        }

        public Criteria orAuditTimeNotIn(List<Date> values) {
            orCriterion("audit_time not in", values, "auditTime");
            return (Criteria) this;
        }

        public Criteria orAuditTimeBetween(Date value1, Date value2) {
            orCriterion("audit_time between", value1, value2, "auditTime");
            return (Criteria) this;
        }

        public Criteria orAuditTimeNotBetween(Date value1, Date value2) {
            orCriterion("audit_time not between", value1, value2, "auditTime");
            return (Criteria) this;
        }

        public Criteria andResultIsNull() {
            addCriterion("result is null");
            return (Criteria) this;
        }

        public Criteria andResultIsNotNull() {
            addCriterion("result is not null");
            return (Criteria) this;
        }

        public Criteria andResultEqualTo(Boolean value) {
            addCriterion("result =", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultNotEqualTo(Boolean value) {
            addCriterion("result <>", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultGreaterThan(Boolean value) {
            addCriterion("result >", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultGreaterThanOrEqualTo(Boolean value) {
            addCriterion("result >=", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultLessThan(Boolean value) {
            addCriterion("result <", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultLessThanOrEqualTo(Boolean value) {
            addCriterion("result <=", value, "result");
            return (Criteria) this;
        }

        public Criteria orResultIsNull() {
            orCriterion("result is null");
            return (Criteria) this;
        }

        public Criteria orResultIsNotNull() {
            orCriterion("result is not null");
            return (Criteria) this;
        }

        public Criteria orResultEqualTo(Boolean value) {
            orCriterion("result =", value, "result");
            return (Criteria) this;
        }

        public Criteria orResultNotEqualTo(Boolean value) {
            orCriterion("result <>", value, "result");
            return (Criteria) this;
        }

        public Criteria orResultGreaterThan(Boolean value) {
            orCriterion("result >", value, "result");
            return (Criteria) this;
        }

        public Criteria orResultGreaterThanOrEqualTo(Boolean value) {
            orCriterion("result >=", value, "result");
            return (Criteria) this;
        }

        public Criteria orResultLessThan(Boolean value) {
            orCriterion("result <", value, "result");
            return (Criteria) this;
        }

        public Criteria orResultLessThanOrEqualTo(Boolean value) {
            orCriterion("result <=", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultIn(List<Boolean> values) {
            addCriterion("result in", values, "result");
            return (Criteria) this;
        }

        public Criteria andResultNotIn(List<Boolean> values) {
            addCriterion("result not in", values, "result");
            return (Criteria) this;
        }

        public Criteria andResultBetween(Boolean value1, Boolean value2) {
            addCriterion("result between", value1, value2, "result");
            return (Criteria) this;
        }

        public Criteria andResultNotBetween(Boolean value1, Boolean value2) {
            addCriterion("result not between", value1, value2, "result");
            return (Criteria) this;
        }

        public Criteria orResultIn(List<Boolean> values) {
            orCriterion("result in", values, "result");
            return (Criteria) this;
        }

        public Criteria orResultNotIn(List<Boolean> values) {
            orCriterion("result not in", values, "result");
            return (Criteria) this;
        }

        public Criteria orResultBetween(Boolean value1, Boolean value2) {
            orCriterion("result between", value1, value2, "result");
            return (Criteria) this;
        }

        public Criteria orResultNotBetween(Boolean value1, Boolean value2) {
            orCriterion("result not between", value1, value2, "result");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNull() {
            addCriterion("order_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("order_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(String value) {
            addCriterion("order_id =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(String value) {
            addCriterion("order_id <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(String value) {
            addCriterion("order_id >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(String value) {
            addCriterion("order_id >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(String value) {
            addCriterion("order_id <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(String value) {
            addCriterion("order_id <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria orOrderIdIsNull() {
            orCriterion("order_id is null");
            return (Criteria) this;
        }

        public Criteria orOrderIdIsNotNull() {
            orCriterion("order_id is not null");
            return (Criteria) this;
        }

        public Criteria orOrderIdEqualTo(String value) {
            orCriterion("order_id =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria orOrderIdNotEqualTo(String value) {
            orCriterion("order_id <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria orOrderIdGreaterThan(String value) {
            orCriterion("order_id >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria orOrderIdGreaterThanOrEqualTo(String value) {
            orCriterion("order_id >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria orOrderIdLessThan(String value) {
            orCriterion("order_id <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria orOrderIdLessThanOrEqualTo(String value) {
            orCriterion("order_id <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLike(String value) {
            addCriterion("order_id like", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotLike(String value) {
            addCriterion("order_id not like", value, "orderId");
            return (Criteria) this;
        }

        public Criteria orOrderIdLike(String value) {
            orCriterion("order_id like", value, "orderId");
            return (Criteria) this;
        }

        public Criteria orOrderIdNotLike(String value) {
            orCriterion("order_id not like", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<String> values) {
            addCriterion("order_id in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<String> values) {
            addCriterion("order_id not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(String value1, String value2) {
            addCriterion("order_id between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(String value1, String value2) {
            addCriterion("order_id not between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria orOrderIdIn(List<String> values) {
            orCriterion("order_id in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria orOrderIdNotIn(List<String> values) {
            orCriterion("order_id not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria orOrderIdBetween(String value1, String value2) {
            orCriterion("order_id between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria orOrderIdNotBetween(String value1, String value2) {
            orCriterion("order_id not between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andApplyReasonIsNull() {
            addCriterion("apply_reason is null");
            return (Criteria) this;
        }

        public Criteria andApplyReasonIsNotNull() {
            addCriterion("apply_reason is not null");
            return (Criteria) this;
        }

        public Criteria andApplyReasonEqualTo(String value) {
            addCriterion("apply_reason =", value, "applyReason");
            return (Criteria) this;
        }

        public Criteria andApplyReasonNotEqualTo(String value) {
            addCriterion("apply_reason <>", value, "applyReason");
            return (Criteria) this;
        }

        public Criteria andApplyReasonGreaterThan(String value) {
            addCriterion("apply_reason >", value, "applyReason");
            return (Criteria) this;
        }

        public Criteria andApplyReasonGreaterThanOrEqualTo(String value) {
            addCriterion("apply_reason >=", value, "applyReason");
            return (Criteria) this;
        }

        public Criteria andApplyReasonLessThan(String value) {
            addCriterion("apply_reason <", value, "applyReason");
            return (Criteria) this;
        }

        public Criteria andApplyReasonLessThanOrEqualTo(String value) {
            addCriterion("apply_reason <=", value, "applyReason");
            return (Criteria) this;
        }

        public Criteria orApplyReasonIsNull() {
            orCriterion("apply_reason is null");
            return (Criteria) this;
        }

        public Criteria orApplyReasonIsNotNull() {
            orCriterion("apply_reason is not null");
            return (Criteria) this;
        }

        public Criteria orApplyReasonEqualTo(String value) {
            orCriterion("apply_reason =", value, "applyReason");
            return (Criteria) this;
        }

        public Criteria orApplyReasonNotEqualTo(String value) {
            orCriterion("apply_reason <>", value, "applyReason");
            return (Criteria) this;
        }

        public Criteria orApplyReasonGreaterThan(String value) {
            orCriterion("apply_reason >", value, "applyReason");
            return (Criteria) this;
        }

        public Criteria orApplyReasonGreaterThanOrEqualTo(String value) {
            orCriterion("apply_reason >=", value, "applyReason");
            return (Criteria) this;
        }

        public Criteria orApplyReasonLessThan(String value) {
            orCriterion("apply_reason <", value, "applyReason");
            return (Criteria) this;
        }

        public Criteria orApplyReasonLessThanOrEqualTo(String value) {
            orCriterion("apply_reason <=", value, "applyReason");
            return (Criteria) this;
        }

        public Criteria andApplyReasonLike(String value) {
            addCriterion("apply_reason like", value, "applyReason");
            return (Criteria) this;
        }

        public Criteria andApplyReasonNotLike(String value) {
            addCriterion("apply_reason not like", value, "applyReason");
            return (Criteria) this;
        }

        public Criteria orApplyReasonLike(String value) {
            orCriterion("apply_reason like", value, "applyReason");
            return (Criteria) this;
        }

        public Criteria orApplyReasonNotLike(String value) {
            orCriterion("apply_reason not like", value, "applyReason");
            return (Criteria) this;
        }

        public Criteria andApplyReasonIn(List<String> values) {
            addCriterion("apply_reason in", values, "applyReason");
            return (Criteria) this;
        }

        public Criteria andApplyReasonNotIn(List<String> values) {
            addCriterion("apply_reason not in", values, "applyReason");
            return (Criteria) this;
        }

        public Criteria andApplyReasonBetween(String value1, String value2) {
            addCriterion("apply_reason between", value1, value2, "applyReason");
            return (Criteria) this;
        }

        public Criteria andApplyReasonNotBetween(String value1, String value2) {
            addCriterion("apply_reason not between", value1, value2, "applyReason");
            return (Criteria) this;
        }

        public Criteria orApplyReasonIn(List<String> values) {
            orCriterion("apply_reason in", values, "applyReason");
            return (Criteria) this;
        }

        public Criteria orApplyReasonNotIn(List<String> values) {
            orCriterion("apply_reason not in", values, "applyReason");
            return (Criteria) this;
        }

        public Criteria orApplyReasonBetween(String value1, String value2) {
            orCriterion("apply_reason between", value1, value2, "applyReason");
            return (Criteria) this;
        }

        public Criteria orApplyReasonNotBetween(String value1, String value2) {
            orCriterion("apply_reason not between", value1, value2, "applyReason");
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

        public Criteria andEmployeeNameIsNull() {
            addCriterion("employee_name is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameIsNotNull() {
            addCriterion("employee_name is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameEqualTo(String value) {
            addCriterion("employee_name =", value, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameNotEqualTo(String value) {
            addCriterion("employee_name <>", value, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameGreaterThan(String value) {
            addCriterion("employee_name >", value, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameGreaterThanOrEqualTo(String value) {
            addCriterion("employee_name >=", value, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameLessThan(String value) {
            addCriterion("employee_name <", value, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameLessThanOrEqualTo(String value) {
            addCriterion("employee_name <=", value, "employeeName");
            return (Criteria) this;
        }

        public Criteria orEmployeeNameIsNull() {
            orCriterion("employee_name is null");
            return (Criteria) this;
        }

        public Criteria orEmployeeNameIsNotNull() {
            orCriterion("employee_name is not null");
            return (Criteria) this;
        }

        public Criteria orEmployeeNameEqualTo(String value) {
            orCriterion("employee_name =", value, "employeeName");
            return (Criteria) this;
        }

        public Criteria orEmployeeNameNotEqualTo(String value) {
            orCriterion("employee_name <>", value, "employeeName");
            return (Criteria) this;
        }

        public Criteria orEmployeeNameGreaterThan(String value) {
            orCriterion("employee_name >", value, "employeeName");
            return (Criteria) this;
        }

        public Criteria orEmployeeNameGreaterThanOrEqualTo(String value) {
            orCriterion("employee_name >=", value, "employeeName");
            return (Criteria) this;
        }

        public Criteria orEmployeeNameLessThan(String value) {
            orCriterion("employee_name <", value, "employeeName");
            return (Criteria) this;
        }

        public Criteria orEmployeeNameLessThanOrEqualTo(String value) {
            orCriterion("employee_name <=", value, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameLike(String value) {
            addCriterion("employee_name like", value, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameNotLike(String value) {
            addCriterion("employee_name not like", value, "employeeName");
            return (Criteria) this;
        }

        public Criteria orEmployeeNameLike(String value) {
            orCriterion("employee_name like", value, "employeeName");
            return (Criteria) this;
        }

        public Criteria orEmployeeNameNotLike(String value) {
            orCriterion("employee_name not like", value, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameIn(List<String> values) {
            addCriterion("employee_name in", values, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameNotIn(List<String> values) {
            addCriterion("employee_name not in", values, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameBetween(String value1, String value2) {
            addCriterion("employee_name between", value1, value2, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameNotBetween(String value1, String value2) {
            addCriterion("employee_name not between", value1, value2, "employeeName");
            return (Criteria) this;
        }

        public Criteria orEmployeeNameIn(List<String> values) {
            orCriterion("employee_name in", values, "employeeName");
            return (Criteria) this;
        }

        public Criteria orEmployeeNameNotIn(List<String> values) {
            orCriterion("employee_name not in", values, "employeeName");
            return (Criteria) this;
        }

        public Criteria orEmployeeNameBetween(String value1, String value2) {
            orCriterion("employee_name between", value1, value2, "employeeName");
            return (Criteria) this;
        }

        public Criteria orEmployeeNameNotBetween(String value1, String value2) {
            orCriterion("employee_name not between", value1, value2, "employeeName");
            return (Criteria) this;
        }

        public Criteria andApplyTimeIsNull() {
            addCriterion("apply_time is null");
            return (Criteria) this;
        }

        public Criteria andApplyTimeIsNotNull() {
            addCriterion("apply_time is not null");
            return (Criteria) this;
        }

        public Criteria andApplyTimeEqualTo(Date value) {
            addCriterion("apply_time =", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeNotEqualTo(Date value) {
            addCriterion("apply_time <>", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeGreaterThan(Date value) {
            addCriterion("apply_time >", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("apply_time >=", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeLessThan(Date value) {
            addCriterion("apply_time <", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeLessThanOrEqualTo(Date value) {
            addCriterion("apply_time <=", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria orApplyTimeIsNull() {
            orCriterion("apply_time is null");
            return (Criteria) this;
        }

        public Criteria orApplyTimeIsNotNull() {
            orCriterion("apply_time is not null");
            return (Criteria) this;
        }

        public Criteria orApplyTimeEqualTo(Date value) {
            orCriterion("apply_time =", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria orApplyTimeNotEqualTo(Date value) {
            orCriterion("apply_time <>", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria orApplyTimeGreaterThan(Date value) {
            orCriterion("apply_time >", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria orApplyTimeGreaterThanOrEqualTo(Date value) {
            orCriterion("apply_time >=", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria orApplyTimeLessThan(Date value) {
            orCriterion("apply_time <", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria orApplyTimeLessThanOrEqualTo(Date value) {
            orCriterion("apply_time <=", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeIn(List<Date> values) {
            addCriterion("apply_time in", values, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeNotIn(List<Date> values) {
            addCriterion("apply_time not in", values, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeBetween(Date value1, Date value2) {
            addCriterion("apply_time between", value1, value2, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeNotBetween(Date value1, Date value2) {
            addCriterion("apply_time not between", value1, value2, "applyTime");
            return (Criteria) this;
        }

        public Criteria orApplyTimeIn(List<Date> values) {
            orCriterion("apply_time in", values, "applyTime");
            return (Criteria) this;
        }

        public Criteria orApplyTimeNotIn(List<Date> values) {
            orCriterion("apply_time not in", values, "applyTime");
            return (Criteria) this;
        }

        public Criteria orApplyTimeBetween(Date value1, Date value2) {
            orCriterion("apply_time between", value1, value2, "applyTime");
            return (Criteria) this;
        }

        public Criteria orApplyTimeNotBetween(Date value1, Date value2) {
            orCriterion("apply_time not between", value1, value2, "applyTime");
            return (Criteria) this;
        }
    }

    /**
     * 该类对应数据库表 pay_type_audit
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
     * 该类对应数据库表 pay_type_audit
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