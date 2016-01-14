package com.wocai.jrt.device.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PosBean {
    /**
     * order by 排序语句
     * 对应数据库表字段 pos
     */
    private String orderBy;

    /**
     * 分页开始记录
     * 对应数据库表字段 pos
     */
    private Integer start;

    /**
     * 分页大小
     * 对应数据库表字段 pos
     */
    private int pageSize = 10;

    /**
     * 是否指定 distinct 去除重复
     * 对应数据库表字段 pos
     */
    private boolean distinct;

    /**
     * 逻辑or语句
     * 对应数据库表字段 pos
     */
    private List<Criteria> oredCriteria;

    /**
     */
    public PosBean() {
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
     * 该类对应数据库表 pos
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

        public Criteria andSerialNumberIsNull() {
            addCriterion("serial_number is null");
            return (Criteria) this;
        }

        public Criteria andSerialNumberIsNotNull() {
            addCriterion("serial_number is not null");
            return (Criteria) this;
        }

        public Criteria andSerialNumberEqualTo(String value) {
            addCriterion("serial_number =", value, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberNotEqualTo(String value) {
            addCriterion("serial_number <>", value, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberGreaterThan(String value) {
            addCriterion("serial_number >", value, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberGreaterThanOrEqualTo(String value) {
            addCriterion("serial_number >=", value, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberLessThan(String value) {
            addCriterion("serial_number <", value, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberLessThanOrEqualTo(String value) {
            addCriterion("serial_number <=", value, "serialNumber");
            return (Criteria) this;
        }

        public Criteria orSerialNumberIsNull() {
            orCriterion("serial_number is null");
            return (Criteria) this;
        }

        public Criteria orSerialNumberIsNotNull() {
            orCriterion("serial_number is not null");
            return (Criteria) this;
        }

        public Criteria orSerialNumberEqualTo(String value) {
            orCriterion("serial_number =", value, "serialNumber");
            return (Criteria) this;
        }

        public Criteria orSerialNumberNotEqualTo(String value) {
            orCriterion("serial_number <>", value, "serialNumber");
            return (Criteria) this;
        }

        public Criteria orSerialNumberGreaterThan(String value) {
            orCriterion("serial_number >", value, "serialNumber");
            return (Criteria) this;
        }

        public Criteria orSerialNumberGreaterThanOrEqualTo(String value) {
            orCriterion("serial_number >=", value, "serialNumber");
            return (Criteria) this;
        }

        public Criteria orSerialNumberLessThan(String value) {
            orCriterion("serial_number <", value, "serialNumber");
            return (Criteria) this;
        }

        public Criteria orSerialNumberLessThanOrEqualTo(String value) {
            orCriterion("serial_number <=", value, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberLike(String value) {
            addCriterion("serial_number like", value, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberNotLike(String value) {
            addCriterion("serial_number not like", value, "serialNumber");
            return (Criteria) this;
        }

        public Criteria orSerialNumberLike(String value) {
            orCriterion("serial_number like", value, "serialNumber");
            return (Criteria) this;
        }

        public Criteria orSerialNumberNotLike(String value) {
            orCriterion("serial_number not like", value, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberIn(List<String> values) {
            addCriterion("serial_number in", values, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberNotIn(List<String> values) {
            addCriterion("serial_number not in", values, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberBetween(String value1, String value2) {
            addCriterion("serial_number between", value1, value2, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberNotBetween(String value1, String value2) {
            addCriterion("serial_number not between", value1, value2, "serialNumber");
            return (Criteria) this;
        }

        public Criteria orSerialNumberIn(List<String> values) {
            orCriterion("serial_number in", values, "serialNumber");
            return (Criteria) this;
        }

        public Criteria orSerialNumberNotIn(List<String> values) {
            orCriterion("serial_number not in", values, "serialNumber");
            return (Criteria) this;
        }

        public Criteria orSerialNumberBetween(String value1, String value2) {
            orCriterion("serial_number between", value1, value2, "serialNumber");
            return (Criteria) this;
        }

        public Criteria orSerialNumberNotBetween(String value1, String value2) {
            orCriterion("serial_number not between", value1, value2, "serialNumber");
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

        public Criteria andRelatedIsNull() {
            addCriterion("related is null");
            return (Criteria) this;
        }

        public Criteria andRelatedIsNotNull() {
            addCriterion("related is not null");
            return (Criteria) this;
        }

        public Criteria andRelatedEqualTo(Integer value) {
            addCriterion("related =", value, "related");
            return (Criteria) this;
        }

        public Criteria andRelatedNotEqualTo(Integer value) {
            addCriterion("related <>", value, "related");
            return (Criteria) this;
        }

        public Criteria andRelatedGreaterThan(Integer value) {
            addCriterion("related >", value, "related");
            return (Criteria) this;
        }

        public Criteria andRelatedGreaterThanOrEqualTo(Integer value) {
            addCriterion("related >=", value, "related");
            return (Criteria) this;
        }

        public Criteria andRelatedLessThan(Integer value) {
            addCriterion("related <", value, "related");
            return (Criteria) this;
        }

        public Criteria andRelatedLessThanOrEqualTo(Integer value) {
            addCriterion("related <=", value, "related");
            return (Criteria) this;
        }

        public Criteria orRelatedIsNull() {
            orCriterion("related is null");
            return (Criteria) this;
        }

        public Criteria orRelatedIsNotNull() {
            orCriterion("related is not null");
            return (Criteria) this;
        }

        public Criteria orRelatedEqualTo(Integer value) {
            orCriterion("related =", value, "related");
            return (Criteria) this;
        }

        public Criteria orRelatedNotEqualTo(Integer value) {
            orCriterion("related <>", value, "related");
            return (Criteria) this;
        }

        public Criteria orRelatedGreaterThan(Integer value) {
            orCriterion("related >", value, "related");
            return (Criteria) this;
        }

        public Criteria orRelatedGreaterThanOrEqualTo(Integer value) {
            orCriterion("related >=", value, "related");
            return (Criteria) this;
        }

        public Criteria orRelatedLessThan(Integer value) {
            orCriterion("related <", value, "related");
            return (Criteria) this;
        }

        public Criteria orRelatedLessThanOrEqualTo(Integer value) {
            orCriterion("related <=", value, "related");
            return (Criteria) this;
        }

        public Criteria andRelatedIn(List<Integer> values) {
            addCriterion("related in", values, "related");
            return (Criteria) this;
        }

        public Criteria andRelatedNotIn(List<Integer> values) {
            addCriterion("related not in", values, "related");
            return (Criteria) this;
        }

        public Criteria andRelatedBetween(Integer value1, Integer value2) {
            addCriterion("related between", value1, value2, "related");
            return (Criteria) this;
        }

        public Criteria andRelatedNotBetween(Integer value1, Integer value2) {
            addCriterion("related not between", value1, value2, "related");
            return (Criteria) this;
        }

        public Criteria orRelatedIn(List<Integer> values) {
            orCriterion("related in", values, "related");
            return (Criteria) this;
        }

        public Criteria orRelatedNotIn(List<Integer> values) {
            orCriterion("related not in", values, "related");
            return (Criteria) this;
        }

        public Criteria orRelatedBetween(Integer value1, Integer value2) {
            orCriterion("related between", value1, value2, "related");
            return (Criteria) this;
        }

        public Criteria orRelatedNotBetween(Integer value1, Integer value2) {
            orCriterion("related not between", value1, value2, "related");
            return (Criteria) this;
        }

        public Criteria andHardCodeIsNull() {
            addCriterion("hard_code is null");
            return (Criteria) this;
        }

        public Criteria andHardCodeIsNotNull() {
            addCriterion("hard_code is not null");
            return (Criteria) this;
        }

        public Criteria andHardCodeEqualTo(String value) {
            addCriterion("hard_code =", value, "hardCode");
            return (Criteria) this;
        }

        public Criteria andHardCodeNotEqualTo(String value) {
            addCriterion("hard_code <>", value, "hardCode");
            return (Criteria) this;
        }

        public Criteria andHardCodeGreaterThan(String value) {
            addCriterion("hard_code >", value, "hardCode");
            return (Criteria) this;
        }

        public Criteria andHardCodeGreaterThanOrEqualTo(String value) {
            addCriterion("hard_code >=", value, "hardCode");
            return (Criteria) this;
        }

        public Criteria andHardCodeLessThan(String value) {
            addCriterion("hard_code <", value, "hardCode");
            return (Criteria) this;
        }

        public Criteria andHardCodeLessThanOrEqualTo(String value) {
            addCriterion("hard_code <=", value, "hardCode");
            return (Criteria) this;
        }

        public Criteria orHardCodeIsNull() {
            orCriterion("hard_code is null");
            return (Criteria) this;
        }

        public Criteria orHardCodeIsNotNull() {
            orCriterion("hard_code is not null");
            return (Criteria) this;
        }

        public Criteria orHardCodeEqualTo(String value) {
            orCriterion("hard_code =", value, "hardCode");
            return (Criteria) this;
        }

        public Criteria orHardCodeNotEqualTo(String value) {
            orCriterion("hard_code <>", value, "hardCode");
            return (Criteria) this;
        }

        public Criteria orHardCodeGreaterThan(String value) {
            orCriterion("hard_code >", value, "hardCode");
            return (Criteria) this;
        }

        public Criteria orHardCodeGreaterThanOrEqualTo(String value) {
            orCriterion("hard_code >=", value, "hardCode");
            return (Criteria) this;
        }

        public Criteria orHardCodeLessThan(String value) {
            orCriterion("hard_code <", value, "hardCode");
            return (Criteria) this;
        }

        public Criteria orHardCodeLessThanOrEqualTo(String value) {
            orCriterion("hard_code <=", value, "hardCode");
            return (Criteria) this;
        }

        public Criteria andHardCodeLike(String value) {
            addCriterion("hard_code like", value, "hardCode");
            return (Criteria) this;
        }

        public Criteria andHardCodeNotLike(String value) {
            addCriterion("hard_code not like", value, "hardCode");
            return (Criteria) this;
        }

        public Criteria orHardCodeLike(String value) {
            orCriterion("hard_code like", value, "hardCode");
            return (Criteria) this;
        }

        public Criteria orHardCodeNotLike(String value) {
            orCriterion("hard_code not like", value, "hardCode");
            return (Criteria) this;
        }

        public Criteria andHardCodeIn(List<String> values) {
            addCriterion("hard_code in", values, "hardCode");
            return (Criteria) this;
        }

        public Criteria andHardCodeNotIn(List<String> values) {
            addCriterion("hard_code not in", values, "hardCode");
            return (Criteria) this;
        }

        public Criteria andHardCodeBetween(String value1, String value2) {
            addCriterion("hard_code between", value1, value2, "hardCode");
            return (Criteria) this;
        }

        public Criteria andHardCodeNotBetween(String value1, String value2) {
            addCriterion("hard_code not between", value1, value2, "hardCode");
            return (Criteria) this;
        }

        public Criteria orHardCodeIn(List<String> values) {
            orCriterion("hard_code in", values, "hardCode");
            return (Criteria) this;
        }

        public Criteria orHardCodeNotIn(List<String> values) {
            orCriterion("hard_code not in", values, "hardCode");
            return (Criteria) this;
        }

        public Criteria orHardCodeBetween(String value1, String value2) {
            orCriterion("hard_code between", value1, value2, "hardCode");
            return (Criteria) this;
        }

        public Criteria orHardCodeNotBetween(String value1, String value2) {
            orCriterion("hard_code not between", value1, value2, "hardCode");
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

        public Criteria andStorageTimeIsNull() {
            addCriterion("storage_time is null");
            return (Criteria) this;
        }

        public Criteria andStorageTimeIsNotNull() {
            addCriterion("storage_time is not null");
            return (Criteria) this;
        }

        public Criteria andStorageTimeEqualTo(Date value) {
            addCriterion("storage_time =", value, "storageTime");
            return (Criteria) this;
        }

        public Criteria andStorageTimeNotEqualTo(Date value) {
            addCriterion("storage_time <>", value, "storageTime");
            return (Criteria) this;
        }

        public Criteria andStorageTimeGreaterThan(Date value) {
            addCriterion("storage_time >", value, "storageTime");
            return (Criteria) this;
        }

        public Criteria andStorageTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("storage_time >=", value, "storageTime");
            return (Criteria) this;
        }

        public Criteria andStorageTimeLessThan(Date value) {
            addCriterion("storage_time <", value, "storageTime");
            return (Criteria) this;
        }

        public Criteria andStorageTimeLessThanOrEqualTo(Date value) {
            addCriterion("storage_time <=", value, "storageTime");
            return (Criteria) this;
        }

        public Criteria orStorageTimeIsNull() {
            orCriterion("storage_time is null");
            return (Criteria) this;
        }

        public Criteria orStorageTimeIsNotNull() {
            orCriterion("storage_time is not null");
            return (Criteria) this;
        }

        public Criteria orStorageTimeEqualTo(Date value) {
            orCriterion("storage_time =", value, "storageTime");
            return (Criteria) this;
        }

        public Criteria orStorageTimeNotEqualTo(Date value) {
            orCriterion("storage_time <>", value, "storageTime");
            return (Criteria) this;
        }

        public Criteria orStorageTimeGreaterThan(Date value) {
            orCriterion("storage_time >", value, "storageTime");
            return (Criteria) this;
        }

        public Criteria orStorageTimeGreaterThanOrEqualTo(Date value) {
            orCriterion("storage_time >=", value, "storageTime");
            return (Criteria) this;
        }

        public Criteria orStorageTimeLessThan(Date value) {
            orCriterion("storage_time <", value, "storageTime");
            return (Criteria) this;
        }

        public Criteria orStorageTimeLessThanOrEqualTo(Date value) {
            orCriterion("storage_time <=", value, "storageTime");
            return (Criteria) this;
        }

        public Criteria andStorageTimeIn(List<Date> values) {
            addCriterion("storage_time in", values, "storageTime");
            return (Criteria) this;
        }

        public Criteria andStorageTimeNotIn(List<Date> values) {
            addCriterion("storage_time not in", values, "storageTime");
            return (Criteria) this;
        }

        public Criteria andStorageTimeBetween(Date value1, Date value2) {
            addCriterion("storage_time between", value1, value2, "storageTime");
            return (Criteria) this;
        }

        public Criteria andStorageTimeNotBetween(Date value1, Date value2) {
            addCriterion("storage_time not between", value1, value2, "storageTime");
            return (Criteria) this;
        }

        public Criteria orStorageTimeIn(List<Date> values) {
            orCriterion("storage_time in", values, "storageTime");
            return (Criteria) this;
        }

        public Criteria orStorageTimeNotIn(List<Date> values) {
            orCriterion("storage_time not in", values, "storageTime");
            return (Criteria) this;
        }

        public Criteria orStorageTimeBetween(Date value1, Date value2) {
            orCriterion("storage_time between", value1, value2, "storageTime");
            return (Criteria) this;
        }

        public Criteria orStorageTimeNotBetween(Date value1, Date value2) {
            orCriterion("storage_time not between", value1, value2, "storageTime");
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

        public Criteria andBatchNumberIsNull() {
            addCriterion("batch_number is null");
            return (Criteria) this;
        }

        public Criteria andBatchNumberIsNotNull() {
            addCriterion("batch_number is not null");
            return (Criteria) this;
        }

        public Criteria andBatchNumberEqualTo(String value) {
            addCriterion("batch_number =", value, "batchNumber");
            return (Criteria) this;
        }

        public Criteria andBatchNumberNotEqualTo(String value) {
            addCriterion("batch_number <>", value, "batchNumber");
            return (Criteria) this;
        }

        public Criteria andBatchNumberGreaterThan(String value) {
            addCriterion("batch_number >", value, "batchNumber");
            return (Criteria) this;
        }

        public Criteria andBatchNumberGreaterThanOrEqualTo(String value) {
            addCriterion("batch_number >=", value, "batchNumber");
            return (Criteria) this;
        }

        public Criteria andBatchNumberLessThan(String value) {
            addCriterion("batch_number <", value, "batchNumber");
            return (Criteria) this;
        }

        public Criteria andBatchNumberLessThanOrEqualTo(String value) {
            addCriterion("batch_number <=", value, "batchNumber");
            return (Criteria) this;
        }

        public Criteria orBatchNumberIsNull() {
            orCriterion("batch_number is null");
            return (Criteria) this;
        }

        public Criteria orBatchNumberIsNotNull() {
            orCriterion("batch_number is not null");
            return (Criteria) this;
        }

        public Criteria orBatchNumberEqualTo(String value) {
            orCriterion("batch_number =", value, "batchNumber");
            return (Criteria) this;
        }

        public Criteria orBatchNumberNotEqualTo(String value) {
            orCriterion("batch_number <>", value, "batchNumber");
            return (Criteria) this;
        }

        public Criteria orBatchNumberGreaterThan(String value) {
            orCriterion("batch_number >", value, "batchNumber");
            return (Criteria) this;
        }

        public Criteria orBatchNumberGreaterThanOrEqualTo(String value) {
            orCriterion("batch_number >=", value, "batchNumber");
            return (Criteria) this;
        }

        public Criteria orBatchNumberLessThan(String value) {
            orCriterion("batch_number <", value, "batchNumber");
            return (Criteria) this;
        }

        public Criteria orBatchNumberLessThanOrEqualTo(String value) {
            orCriterion("batch_number <=", value, "batchNumber");
            return (Criteria) this;
        }

        public Criteria andBatchNumberLike(String value) {
            addCriterion("batch_number like", value, "batchNumber");
            return (Criteria) this;
        }

        public Criteria andBatchNumberNotLike(String value) {
            addCriterion("batch_number not like", value, "batchNumber");
            return (Criteria) this;
        }

        public Criteria orBatchNumberLike(String value) {
            orCriterion("batch_number like", value, "batchNumber");
            return (Criteria) this;
        }

        public Criteria orBatchNumberNotLike(String value) {
            orCriterion("batch_number not like", value, "batchNumber");
            return (Criteria) this;
        }

        public Criteria andBatchNumberIn(List<String> values) {
            addCriterion("batch_number in", values, "batchNumber");
            return (Criteria) this;
        }

        public Criteria andBatchNumberNotIn(List<String> values) {
            addCriterion("batch_number not in", values, "batchNumber");
            return (Criteria) this;
        }

        public Criteria andBatchNumberBetween(String value1, String value2) {
            addCriterion("batch_number between", value1, value2, "batchNumber");
            return (Criteria) this;
        }

        public Criteria andBatchNumberNotBetween(String value1, String value2) {
            addCriterion("batch_number not between", value1, value2, "batchNumber");
            return (Criteria) this;
        }

        public Criteria orBatchNumberIn(List<String> values) {
            orCriterion("batch_number in", values, "batchNumber");
            return (Criteria) this;
        }

        public Criteria orBatchNumberNotIn(List<String> values) {
            orCriterion("batch_number not in", values, "batchNumber");
            return (Criteria) this;
        }

        public Criteria orBatchNumberBetween(String value1, String value2) {
            orCriterion("batch_number between", value1, value2, "batchNumber");
            return (Criteria) this;
        }

        public Criteria orBatchNumberNotBetween(String value1, String value2) {
            orCriterion("batch_number not between", value1, value2, "batchNumber");
            return (Criteria) this;
        }

        public Criteria andDeletedIsNull() {
            addCriterion("deleted is null");
            return (Criteria) this;
        }

        public Criteria andDeletedIsNotNull() {
            addCriterion("deleted is not null");
            return (Criteria) this;
        }

        public Criteria andDeletedEqualTo(Boolean value) {
            addCriterion("deleted =", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotEqualTo(Boolean value) {
            addCriterion("deleted <>", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedGreaterThan(Boolean value) {
            addCriterion("deleted >", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("deleted >=", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedLessThan(Boolean value) {
            addCriterion("deleted <", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedLessThanOrEqualTo(Boolean value) {
            addCriterion("deleted <=", value, "deleted");
            return (Criteria) this;
        }

        public Criteria orDeletedIsNull() {
            orCriterion("deleted is null");
            return (Criteria) this;
        }

        public Criteria orDeletedIsNotNull() {
            orCriterion("deleted is not null");
            return (Criteria) this;
        }

        public Criteria orDeletedEqualTo(Boolean value) {
            orCriterion("deleted =", value, "deleted");
            return (Criteria) this;
        }

        public Criteria orDeletedNotEqualTo(Boolean value) {
            orCriterion("deleted <>", value, "deleted");
            return (Criteria) this;
        }

        public Criteria orDeletedGreaterThan(Boolean value) {
            orCriterion("deleted >", value, "deleted");
            return (Criteria) this;
        }

        public Criteria orDeletedGreaterThanOrEqualTo(Boolean value) {
            orCriterion("deleted >=", value, "deleted");
            return (Criteria) this;
        }

        public Criteria orDeletedLessThan(Boolean value) {
            orCriterion("deleted <", value, "deleted");
            return (Criteria) this;
        }

        public Criteria orDeletedLessThanOrEqualTo(Boolean value) {
            orCriterion("deleted <=", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedIn(List<Boolean> values) {
            addCriterion("deleted in", values, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotIn(List<Boolean> values) {
            addCriterion("deleted not in", values, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedBetween(Boolean value1, Boolean value2) {
            addCriterion("deleted between", value1, value2, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("deleted not between", value1, value2, "deleted");
            return (Criteria) this;
        }

        public Criteria orDeletedIn(List<Boolean> values) {
            orCriterion("deleted in", values, "deleted");
            return (Criteria) this;
        }

        public Criteria orDeletedNotIn(List<Boolean> values) {
            orCriterion("deleted not in", values, "deleted");
            return (Criteria) this;
        }

        public Criteria orDeletedBetween(Boolean value1, Boolean value2) {
            orCriterion("deleted between", value1, value2, "deleted");
            return (Criteria) this;
        }

        public Criteria orDeletedNotBetween(Boolean value1, Boolean value2) {
            orCriterion("deleted not between", value1, value2, "deleted");
            return (Criteria) this;
        }
    }

    /**
     * 该类对应数据库表 pos
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
     * 该类对应数据库表 pos
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