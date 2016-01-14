package com.wocai.jrt.employee.model;

import java.util.ArrayList;
import java.util.List;

public class EmployeeGroupBean {
    /**
     * order by 排序语句
     * 对应数据库表字段 employee_group
     */
    private String orderBy;

    /**
     * 分页开始记录
     * 对应数据库表字段 employee_group
     */
    private Integer start;

    /**
     * 分页大小
     * 对应数据库表字段 employee_group
     */
    private int pageSize = 10;

    /**
     * 是否指定 distinct 去除重复
     * 对应数据库表字段 employee_group
     */
    private boolean distinct;

    /**
     * 逻辑or语句
     * 对应数据库表字段 employee_group
     */
    private List<Criteria> oredCriteria;

    /**
     */
    public EmployeeGroupBean() {
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
     * 该类对应数据库表 employee_group
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

        public Criteria andCodeIsNull() {
            addCriterion("code is null");
            return (Criteria) this;
        }

        public Criteria andCodeIsNotNull() {
            addCriterion("code is not null");
            return (Criteria) this;
        }

        public Criteria andCodeEqualTo(String value) {
            addCriterion("code =", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotEqualTo(String value) {
            addCriterion("code <>", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThan(String value) {
            addCriterion("code >", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThanOrEqualTo(String value) {
            addCriterion("code >=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThan(String value) {
            addCriterion("code <", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThanOrEqualTo(String value) {
            addCriterion("code <=", value, "code");
            return (Criteria) this;
        }

        public Criteria orCodeIsNull() {
            orCriterion("code is null");
            return (Criteria) this;
        }

        public Criteria orCodeIsNotNull() {
            orCriterion("code is not null");
            return (Criteria) this;
        }

        public Criteria orCodeEqualTo(String value) {
            orCriterion("code =", value, "code");
            return (Criteria) this;
        }

        public Criteria orCodeNotEqualTo(String value) {
            orCriterion("code <>", value, "code");
            return (Criteria) this;
        }

        public Criteria orCodeGreaterThan(String value) {
            orCriterion("code >", value, "code");
            return (Criteria) this;
        }

        public Criteria orCodeGreaterThanOrEqualTo(String value) {
            orCriterion("code >=", value, "code");
            return (Criteria) this;
        }

        public Criteria orCodeLessThan(String value) {
            orCriterion("code <", value, "code");
            return (Criteria) this;
        }

        public Criteria orCodeLessThanOrEqualTo(String value) {
            orCriterion("code <=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLike(String value) {
            addCriterion("code like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotLike(String value) {
            addCriterion("code not like", value, "code");
            return (Criteria) this;
        }

        public Criteria orCodeLike(String value) {
            orCriterion("code like", value, "code");
            return (Criteria) this;
        }

        public Criteria orCodeNotLike(String value) {
            orCriterion("code not like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeIn(List<String> values) {
            addCriterion("code in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotIn(List<String> values) {
            addCriterion("code not in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeBetween(String value1, String value2) {
            addCriterion("code between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotBetween(String value1, String value2) {
            addCriterion("code not between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria orCodeIn(List<String> values) {
            orCriterion("code in", values, "code");
            return (Criteria) this;
        }

        public Criteria orCodeNotIn(List<String> values) {
            orCriterion("code not in", values, "code");
            return (Criteria) this;
        }

        public Criteria orCodeBetween(String value1, String value2) {
            orCriterion("code between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria orCodeNotBetween(String value1, String value2) {
            orCriterion("code not between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andGroupNameIsNull() {
            addCriterion("group_name is null");
            return (Criteria) this;
        }

        public Criteria andGroupNameIsNotNull() {
            addCriterion("group_name is not null");
            return (Criteria) this;
        }

        public Criteria andGroupNameEqualTo(String value) {
            addCriterion("group_name =", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameNotEqualTo(String value) {
            addCriterion("group_name <>", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameGreaterThan(String value) {
            addCriterion("group_name >", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameGreaterThanOrEqualTo(String value) {
            addCriterion("group_name >=", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameLessThan(String value) {
            addCriterion("group_name <", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameLessThanOrEqualTo(String value) {
            addCriterion("group_name <=", value, "groupName");
            return (Criteria) this;
        }

        public Criteria orGroupNameIsNull() {
            orCriterion("group_name is null");
            return (Criteria) this;
        }

        public Criteria orGroupNameIsNotNull() {
            orCriterion("group_name is not null");
            return (Criteria) this;
        }

        public Criteria orGroupNameEqualTo(String value) {
            orCriterion("group_name =", value, "groupName");
            return (Criteria) this;
        }

        public Criteria orGroupNameNotEqualTo(String value) {
            orCriterion("group_name <>", value, "groupName");
            return (Criteria) this;
        }

        public Criteria orGroupNameGreaterThan(String value) {
            orCriterion("group_name >", value, "groupName");
            return (Criteria) this;
        }

        public Criteria orGroupNameGreaterThanOrEqualTo(String value) {
            orCriterion("group_name >=", value, "groupName");
            return (Criteria) this;
        }

        public Criteria orGroupNameLessThan(String value) {
            orCriterion("group_name <", value, "groupName");
            return (Criteria) this;
        }

        public Criteria orGroupNameLessThanOrEqualTo(String value) {
            orCriterion("group_name <=", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameLike(String value) {
            addCriterion("group_name like", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameNotLike(String value) {
            addCriterion("group_name not like", value, "groupName");
            return (Criteria) this;
        }

        public Criteria orGroupNameLike(String value) {
            orCriterion("group_name like", value, "groupName");
            return (Criteria) this;
        }

        public Criteria orGroupNameNotLike(String value) {
            orCriterion("group_name not like", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameIn(List<String> values) {
            addCriterion("group_name in", values, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameNotIn(List<String> values) {
            addCriterion("group_name not in", values, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameBetween(String value1, String value2) {
            addCriterion("group_name between", value1, value2, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameNotBetween(String value1, String value2) {
            addCriterion("group_name not between", value1, value2, "groupName");
            return (Criteria) this;
        }

        public Criteria orGroupNameIn(List<String> values) {
            orCriterion("group_name in", values, "groupName");
            return (Criteria) this;
        }

        public Criteria orGroupNameNotIn(List<String> values) {
            orCriterion("group_name not in", values, "groupName");
            return (Criteria) this;
        }

        public Criteria orGroupNameBetween(String value1, String value2) {
            orCriterion("group_name between", value1, value2, "groupName");
            return (Criteria) this;
        }

        public Criteria orGroupNameNotBetween(String value1, String value2) {
            orCriterion("group_name not between", value1, value2, "groupName");
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

        public Criteria andParentIsNull() {
            addCriterion("parent is null");
            return (Criteria) this;
        }

        public Criteria andParentIsNotNull() {
            addCriterion("parent is not null");
            return (Criteria) this;
        }

        public Criteria andParentEqualTo(String value) {
            addCriterion("parent =", value, "parent");
            return (Criteria) this;
        }

        public Criteria andParentNotEqualTo(String value) {
            addCriterion("parent <>", value, "parent");
            return (Criteria) this;
        }

        public Criteria andParentGreaterThan(String value) {
            addCriterion("parent >", value, "parent");
            return (Criteria) this;
        }

        public Criteria andParentGreaterThanOrEqualTo(String value) {
            addCriterion("parent >=", value, "parent");
            return (Criteria) this;
        }

        public Criteria andParentLessThan(String value) {
            addCriterion("parent <", value, "parent");
            return (Criteria) this;
        }

        public Criteria andParentLessThanOrEqualTo(String value) {
            addCriterion("parent <=", value, "parent");
            return (Criteria) this;
        }

        public Criteria orParentIsNull() {
            orCriterion("parent is null");
            return (Criteria) this;
        }

        public Criteria orParentIsNotNull() {
            orCriterion("parent is not null");
            return (Criteria) this;
        }

        public Criteria orParentEqualTo(String value) {
            orCriterion("parent =", value, "parent");
            return (Criteria) this;
        }

        public Criteria orParentNotEqualTo(String value) {
            orCriterion("parent <>", value, "parent");
            return (Criteria) this;
        }

        public Criteria orParentGreaterThan(String value) {
            orCriterion("parent >", value, "parent");
            return (Criteria) this;
        }

        public Criteria orParentGreaterThanOrEqualTo(String value) {
            orCriterion("parent >=", value, "parent");
            return (Criteria) this;
        }

        public Criteria orParentLessThan(String value) {
            orCriterion("parent <", value, "parent");
            return (Criteria) this;
        }

        public Criteria orParentLessThanOrEqualTo(String value) {
            orCriterion("parent <=", value, "parent");
            return (Criteria) this;
        }

        public Criteria andParentLike(String value) {
            addCriterion("parent like", value, "parent");
            return (Criteria) this;
        }

        public Criteria andParentNotLike(String value) {
            addCriterion("parent not like", value, "parent");
            return (Criteria) this;
        }

        public Criteria orParentLike(String value) {
            orCriterion("parent like", value, "parent");
            return (Criteria) this;
        }

        public Criteria orParentNotLike(String value) {
            orCriterion("parent not like", value, "parent");
            return (Criteria) this;
        }

        public Criteria andParentIn(List<String> values) {
            addCriterion("parent in", values, "parent");
            return (Criteria) this;
        }

        public Criteria andParentNotIn(List<String> values) {
            addCriterion("parent not in", values, "parent");
            return (Criteria) this;
        }

        public Criteria andParentBetween(String value1, String value2) {
            addCriterion("parent between", value1, value2, "parent");
            return (Criteria) this;
        }

        public Criteria andParentNotBetween(String value1, String value2) {
            addCriterion("parent not between", value1, value2, "parent");
            return (Criteria) this;
        }

        public Criteria orParentIn(List<String> values) {
            orCriterion("parent in", values, "parent");
            return (Criteria) this;
        }

        public Criteria orParentNotIn(List<String> values) {
            orCriterion("parent not in", values, "parent");
            return (Criteria) this;
        }

        public Criteria orParentBetween(String value1, String value2) {
            orCriterion("parent between", value1, value2, "parent");
            return (Criteria) this;
        }

        public Criteria orParentNotBetween(String value1, String value2) {
            orCriterion("parent not between", value1, value2, "parent");
            return (Criteria) this;
        }

        public Criteria andMemberNumberIsNull() {
            addCriterion("member_number is null");
            return (Criteria) this;
        }

        public Criteria andMemberNumberIsNotNull() {
            addCriterion("member_number is not null");
            return (Criteria) this;
        }

        public Criteria andMemberNumberEqualTo(Integer value) {
            addCriterion("member_number =", value, "memberNumber");
            return (Criteria) this;
        }

        public Criteria andMemberNumberNotEqualTo(Integer value) {
            addCriterion("member_number <>", value, "memberNumber");
            return (Criteria) this;
        }

        public Criteria andMemberNumberGreaterThan(Integer value) {
            addCriterion("member_number >", value, "memberNumber");
            return (Criteria) this;
        }

        public Criteria andMemberNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("member_number >=", value, "memberNumber");
            return (Criteria) this;
        }

        public Criteria andMemberNumberLessThan(Integer value) {
            addCriterion("member_number <", value, "memberNumber");
            return (Criteria) this;
        }

        public Criteria andMemberNumberLessThanOrEqualTo(Integer value) {
            addCriterion("member_number <=", value, "memberNumber");
            return (Criteria) this;
        }

        public Criteria orMemberNumberIsNull() {
            orCriterion("member_number is null");
            return (Criteria) this;
        }

        public Criteria orMemberNumberIsNotNull() {
            orCriterion("member_number is not null");
            return (Criteria) this;
        }

        public Criteria orMemberNumberEqualTo(Integer value) {
            orCriterion("member_number =", value, "memberNumber");
            return (Criteria) this;
        }

        public Criteria orMemberNumberNotEqualTo(Integer value) {
            orCriterion("member_number <>", value, "memberNumber");
            return (Criteria) this;
        }

        public Criteria orMemberNumberGreaterThan(Integer value) {
            orCriterion("member_number >", value, "memberNumber");
            return (Criteria) this;
        }

        public Criteria orMemberNumberGreaterThanOrEqualTo(Integer value) {
            orCriterion("member_number >=", value, "memberNumber");
            return (Criteria) this;
        }

        public Criteria orMemberNumberLessThan(Integer value) {
            orCriterion("member_number <", value, "memberNumber");
            return (Criteria) this;
        }

        public Criteria orMemberNumberLessThanOrEqualTo(Integer value) {
            orCriterion("member_number <=", value, "memberNumber");
            return (Criteria) this;
        }

        public Criteria andMemberNumberIn(List<Integer> values) {
            addCriterion("member_number in", values, "memberNumber");
            return (Criteria) this;
        }

        public Criteria andMemberNumberNotIn(List<Integer> values) {
            addCriterion("member_number not in", values, "memberNumber");
            return (Criteria) this;
        }

        public Criteria andMemberNumberBetween(Integer value1, Integer value2) {
            addCriterion("member_number between", value1, value2, "memberNumber");
            return (Criteria) this;
        }

        public Criteria andMemberNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("member_number not between", value1, value2, "memberNumber");
            return (Criteria) this;
        }

        public Criteria orMemberNumberIn(List<Integer> values) {
            orCriterion("member_number in", values, "memberNumber");
            return (Criteria) this;
        }

        public Criteria orMemberNumberNotIn(List<Integer> values) {
            orCriterion("member_number not in", values, "memberNumber");
            return (Criteria) this;
        }

        public Criteria orMemberNumberBetween(Integer value1, Integer value2) {
            orCriterion("member_number between", value1, value2, "memberNumber");
            return (Criteria) this;
        }

        public Criteria orMemberNumberNotBetween(Integer value1, Integer value2) {
            orCriterion("member_number not between", value1, value2, "memberNumber");
            return (Criteria) this;
        }

        public Criteria andProductNumberIsNull() {
            addCriterion("product_number is null");
            return (Criteria) this;
        }

        public Criteria andProductNumberIsNotNull() {
            addCriterion("product_number is not null");
            return (Criteria) this;
        }

        public Criteria andProductNumberEqualTo(Integer value) {
            addCriterion("product_number =", value, "productNumber");
            return (Criteria) this;
        }

        public Criteria andProductNumberNotEqualTo(Integer value) {
            addCriterion("product_number <>", value, "productNumber");
            return (Criteria) this;
        }

        public Criteria andProductNumberGreaterThan(Integer value) {
            addCriterion("product_number >", value, "productNumber");
            return (Criteria) this;
        }

        public Criteria andProductNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("product_number >=", value, "productNumber");
            return (Criteria) this;
        }

        public Criteria andProductNumberLessThan(Integer value) {
            addCriterion("product_number <", value, "productNumber");
            return (Criteria) this;
        }

        public Criteria andProductNumberLessThanOrEqualTo(Integer value) {
            addCriterion("product_number <=", value, "productNumber");
            return (Criteria) this;
        }

        public Criteria orProductNumberIsNull() {
            orCriterion("product_number is null");
            return (Criteria) this;
        }

        public Criteria orProductNumberIsNotNull() {
            orCriterion("product_number is not null");
            return (Criteria) this;
        }

        public Criteria orProductNumberEqualTo(Integer value) {
            orCriterion("product_number =", value, "productNumber");
            return (Criteria) this;
        }

        public Criteria orProductNumberNotEqualTo(Integer value) {
            orCriterion("product_number <>", value, "productNumber");
            return (Criteria) this;
        }

        public Criteria orProductNumberGreaterThan(Integer value) {
            orCriterion("product_number >", value, "productNumber");
            return (Criteria) this;
        }

        public Criteria orProductNumberGreaterThanOrEqualTo(Integer value) {
            orCriterion("product_number >=", value, "productNumber");
            return (Criteria) this;
        }

        public Criteria orProductNumberLessThan(Integer value) {
            orCriterion("product_number <", value, "productNumber");
            return (Criteria) this;
        }

        public Criteria orProductNumberLessThanOrEqualTo(Integer value) {
            orCriterion("product_number <=", value, "productNumber");
            return (Criteria) this;
        }

        public Criteria andProductNumberIn(List<Integer> values) {
            addCriterion("product_number in", values, "productNumber");
            return (Criteria) this;
        }

        public Criteria andProductNumberNotIn(List<Integer> values) {
            addCriterion("product_number not in", values, "productNumber");
            return (Criteria) this;
        }

        public Criteria andProductNumberBetween(Integer value1, Integer value2) {
            addCriterion("product_number between", value1, value2, "productNumber");
            return (Criteria) this;
        }

        public Criteria andProductNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("product_number not between", value1, value2, "productNumber");
            return (Criteria) this;
        }

        public Criteria orProductNumberIn(List<Integer> values) {
            orCriterion("product_number in", values, "productNumber");
            return (Criteria) this;
        }

        public Criteria orProductNumberNotIn(List<Integer> values) {
            orCriterion("product_number not in", values, "productNumber");
            return (Criteria) this;
        }

        public Criteria orProductNumberBetween(Integer value1, Integer value2) {
            orCriterion("product_number between", value1, value2, "productNumber");
            return (Criteria) this;
        }

        public Criteria orProductNumberNotBetween(Integer value1, Integer value2) {
            orCriterion("product_number not between", value1, value2, "productNumber");
            return (Criteria) this;
        }

        public Criteria andInvestorNumberIsNull() {
            addCriterion("investor_number is null");
            return (Criteria) this;
        }

        public Criteria andInvestorNumberIsNotNull() {
            addCriterion("investor_number is not null");
            return (Criteria) this;
        }

        public Criteria andInvestorNumberEqualTo(Integer value) {
            addCriterion("investor_number =", value, "investorNumber");
            return (Criteria) this;
        }

        public Criteria andInvestorNumberNotEqualTo(Integer value) {
            addCriterion("investor_number <>", value, "investorNumber");
            return (Criteria) this;
        }

        public Criteria andInvestorNumberGreaterThan(Integer value) {
            addCriterion("investor_number >", value, "investorNumber");
            return (Criteria) this;
        }

        public Criteria andInvestorNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("investor_number >=", value, "investorNumber");
            return (Criteria) this;
        }

        public Criteria andInvestorNumberLessThan(Integer value) {
            addCriterion("investor_number <", value, "investorNumber");
            return (Criteria) this;
        }

        public Criteria andInvestorNumberLessThanOrEqualTo(Integer value) {
            addCriterion("investor_number <=", value, "investorNumber");
            return (Criteria) this;
        }

        public Criteria orInvestorNumberIsNull() {
            orCriterion("investor_number is null");
            return (Criteria) this;
        }

        public Criteria orInvestorNumberIsNotNull() {
            orCriterion("investor_number is not null");
            return (Criteria) this;
        }

        public Criteria orInvestorNumberEqualTo(Integer value) {
            orCriterion("investor_number =", value, "investorNumber");
            return (Criteria) this;
        }

        public Criteria orInvestorNumberNotEqualTo(Integer value) {
            orCriterion("investor_number <>", value, "investorNumber");
            return (Criteria) this;
        }

        public Criteria orInvestorNumberGreaterThan(Integer value) {
            orCriterion("investor_number >", value, "investorNumber");
            return (Criteria) this;
        }

        public Criteria orInvestorNumberGreaterThanOrEqualTo(Integer value) {
            orCriterion("investor_number >=", value, "investorNumber");
            return (Criteria) this;
        }

        public Criteria orInvestorNumberLessThan(Integer value) {
            orCriterion("investor_number <", value, "investorNumber");
            return (Criteria) this;
        }

        public Criteria orInvestorNumberLessThanOrEqualTo(Integer value) {
            orCriterion("investor_number <=", value, "investorNumber");
            return (Criteria) this;
        }

        public Criteria andInvestorNumberIn(List<Integer> values) {
            addCriterion("investor_number in", values, "investorNumber");
            return (Criteria) this;
        }

        public Criteria andInvestorNumberNotIn(List<Integer> values) {
            addCriterion("investor_number not in", values, "investorNumber");
            return (Criteria) this;
        }

        public Criteria andInvestorNumberBetween(Integer value1, Integer value2) {
            addCriterion("investor_number between", value1, value2, "investorNumber");
            return (Criteria) this;
        }

        public Criteria andInvestorNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("investor_number not between", value1, value2, "investorNumber");
            return (Criteria) this;
        }

        public Criteria orInvestorNumberIn(List<Integer> values) {
            orCriterion("investor_number in", values, "investorNumber");
            return (Criteria) this;
        }

        public Criteria orInvestorNumberNotIn(List<Integer> values) {
            orCriterion("investor_number not in", values, "investorNumber");
            return (Criteria) this;
        }

        public Criteria orInvestorNumberBetween(Integer value1, Integer value2) {
            orCriterion("investor_number between", value1, value2, "investorNumber");
            return (Criteria) this;
        }

        public Criteria orInvestorNumberNotBetween(Integer value1, Integer value2) {
            orCriterion("investor_number not between", value1, value2, "investorNumber");
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

        public Criteria andPlannerGroupIsNull() {
            addCriterion("planner_group is null");
            return (Criteria) this;
        }

        public Criteria andPlannerGroupIsNotNull() {
            addCriterion("planner_group is not null");
            return (Criteria) this;
        }

        public Criteria andPlannerGroupEqualTo(Boolean value) {
            addCriterion("planner_group =", value, "plannerGroup");
            return (Criteria) this;
        }

        public Criteria andPlannerGroupNotEqualTo(Boolean value) {
            addCriterion("planner_group <>", value, "plannerGroup");
            return (Criteria) this;
        }

        public Criteria andPlannerGroupGreaterThan(Boolean value) {
            addCriterion("planner_group >", value, "plannerGroup");
            return (Criteria) this;
        }

        public Criteria andPlannerGroupGreaterThanOrEqualTo(Boolean value) {
            addCriterion("planner_group >=", value, "plannerGroup");
            return (Criteria) this;
        }

        public Criteria andPlannerGroupLessThan(Boolean value) {
            addCriterion("planner_group <", value, "plannerGroup");
            return (Criteria) this;
        }

        public Criteria andPlannerGroupLessThanOrEqualTo(Boolean value) {
            addCriterion("planner_group <=", value, "plannerGroup");
            return (Criteria) this;
        }

        public Criteria orPlannerGroupIsNull() {
            orCriterion("planner_group is null");
            return (Criteria) this;
        }

        public Criteria orPlannerGroupIsNotNull() {
            orCriterion("planner_group is not null");
            return (Criteria) this;
        }

        public Criteria orPlannerGroupEqualTo(Boolean value) {
            orCriterion("planner_group =", value, "plannerGroup");
            return (Criteria) this;
        }

        public Criteria orPlannerGroupNotEqualTo(Boolean value) {
            orCriterion("planner_group <>", value, "plannerGroup");
            return (Criteria) this;
        }

        public Criteria orPlannerGroupGreaterThan(Boolean value) {
            orCriterion("planner_group >", value, "plannerGroup");
            return (Criteria) this;
        }

        public Criteria orPlannerGroupGreaterThanOrEqualTo(Boolean value) {
            orCriterion("planner_group >=", value, "plannerGroup");
            return (Criteria) this;
        }

        public Criteria orPlannerGroupLessThan(Boolean value) {
            orCriterion("planner_group <", value, "plannerGroup");
            return (Criteria) this;
        }

        public Criteria orPlannerGroupLessThanOrEqualTo(Boolean value) {
            orCriterion("planner_group <=", value, "plannerGroup");
            return (Criteria) this;
        }

        public Criteria andPlannerGroupIn(List<Boolean> values) {
            addCriterion("planner_group in", values, "plannerGroup");
            return (Criteria) this;
        }

        public Criteria andPlannerGroupNotIn(List<Boolean> values) {
            addCriterion("planner_group not in", values, "plannerGroup");
            return (Criteria) this;
        }

        public Criteria andPlannerGroupBetween(Boolean value1, Boolean value2) {
            addCriterion("planner_group between", value1, value2, "plannerGroup");
            return (Criteria) this;
        }

        public Criteria andPlannerGroupNotBetween(Boolean value1, Boolean value2) {
            addCriterion("planner_group not between", value1, value2, "plannerGroup");
            return (Criteria) this;
        }

        public Criteria orPlannerGroupIn(List<Boolean> values) {
            orCriterion("planner_group in", values, "plannerGroup");
            return (Criteria) this;
        }

        public Criteria orPlannerGroupNotIn(List<Boolean> values) {
            orCriterion("planner_group not in", values, "plannerGroup");
            return (Criteria) this;
        }

        public Criteria orPlannerGroupBetween(Boolean value1, Boolean value2) {
            orCriterion("planner_group between", value1, value2, "plannerGroup");
            return (Criteria) this;
        }

        public Criteria orPlannerGroupNotBetween(Boolean value1, Boolean value2) {
            orCriterion("planner_group not between", value1, value2, "plannerGroup");
            return (Criteria) this;
        }

        public Criteria andSaleAllIsNull() {
            addCriterion("sale_all is null");
            return (Criteria) this;
        }

        public Criteria andSaleAllIsNotNull() {
            addCriterion("sale_all is not null");
            return (Criteria) this;
        }

        public Criteria andSaleAllEqualTo(Boolean value) {
            addCriterion("sale_all =", value, "saleAll");
            return (Criteria) this;
        }

        public Criteria andSaleAllNotEqualTo(Boolean value) {
            addCriterion("sale_all <>", value, "saleAll");
            return (Criteria) this;
        }

        public Criteria andSaleAllGreaterThan(Boolean value) {
            addCriterion("sale_all >", value, "saleAll");
            return (Criteria) this;
        }

        public Criteria andSaleAllGreaterThanOrEqualTo(Boolean value) {
            addCriterion("sale_all >=", value, "saleAll");
            return (Criteria) this;
        }

        public Criteria andSaleAllLessThan(Boolean value) {
            addCriterion("sale_all <", value, "saleAll");
            return (Criteria) this;
        }

        public Criteria andSaleAllLessThanOrEqualTo(Boolean value) {
            addCriterion("sale_all <=", value, "saleAll");
            return (Criteria) this;
        }

        public Criteria orSaleAllIsNull() {
            orCriterion("sale_all is null");
            return (Criteria) this;
        }

        public Criteria orSaleAllIsNotNull() {
            orCriterion("sale_all is not null");
            return (Criteria) this;
        }

        public Criteria orSaleAllEqualTo(Boolean value) {
            orCriterion("sale_all =", value, "saleAll");
            return (Criteria) this;
        }

        public Criteria orSaleAllNotEqualTo(Boolean value) {
            orCriterion("sale_all <>", value, "saleAll");
            return (Criteria) this;
        }

        public Criteria orSaleAllGreaterThan(Boolean value) {
            orCriterion("sale_all >", value, "saleAll");
            return (Criteria) this;
        }

        public Criteria orSaleAllGreaterThanOrEqualTo(Boolean value) {
            orCriterion("sale_all >=", value, "saleAll");
            return (Criteria) this;
        }

        public Criteria orSaleAllLessThan(Boolean value) {
            orCriterion("sale_all <", value, "saleAll");
            return (Criteria) this;
        }

        public Criteria orSaleAllLessThanOrEqualTo(Boolean value) {
            orCriterion("sale_all <=", value, "saleAll");
            return (Criteria) this;
        }

        public Criteria andSaleAllIn(List<Boolean> values) {
            addCriterion("sale_all in", values, "saleAll");
            return (Criteria) this;
        }

        public Criteria andSaleAllNotIn(List<Boolean> values) {
            addCriterion("sale_all not in", values, "saleAll");
            return (Criteria) this;
        }

        public Criteria andSaleAllBetween(Boolean value1, Boolean value2) {
            addCriterion("sale_all between", value1, value2, "saleAll");
            return (Criteria) this;
        }

        public Criteria andSaleAllNotBetween(Boolean value1, Boolean value2) {
            addCriterion("sale_all not between", value1, value2, "saleAll");
            return (Criteria) this;
        }

        public Criteria orSaleAllIn(List<Boolean> values) {
            orCriterion("sale_all in", values, "saleAll");
            return (Criteria) this;
        }

        public Criteria orSaleAllNotIn(List<Boolean> values) {
            orCriterion("sale_all not in", values, "saleAll");
            return (Criteria) this;
        }

        public Criteria orSaleAllBetween(Boolean value1, Boolean value2) {
            orCriterion("sale_all between", value1, value2, "saleAll");
            return (Criteria) this;
        }

        public Criteria orSaleAllNotBetween(Boolean value1, Boolean value2) {
            orCriterion("sale_all not between", value1, value2, "saleAll");
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
     * 该类对应数据库表 employee_group
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
     * 该类对应数据库表 employee_group
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