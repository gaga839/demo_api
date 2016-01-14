package com.wocai.jrt.employee.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class CheckinBean {
    /**
     * order by 排序语句
     * 对应数据库表字段 checkin
     */
    private String orderBy;

    /**
     * 分页开始记录
     * 对应数据库表字段 checkin
     */
    private Integer start;

    /**
     * 分页大小
     * 对应数据库表字段 checkin
     */
    private int pageSize = 10;

    /**
     * 是否指定 distinct 去除重复
     * 对应数据库表字段 checkin
     */
    private boolean distinct;

    /**
     * 逻辑or语句
     * 对应数据库表字段 checkin
     */
    private List<Criteria> oredCriteria;

    /**
     */
    public CheckinBean() {
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
     * 该类对应数据库表 checkin
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

        public Criteria andSignTimeIsNull() {
            addCriterion("sign_time is null");
            return (Criteria) this;
        }

        public Criteria andSignTimeIsNotNull() {
            addCriterion("sign_time is not null");
            return (Criteria) this;
        }

        public Criteria andSignTimeEqualTo(Date value) {
            addCriterion("sign_time =", value, "signTime");
            return (Criteria) this;
        }

        public Criteria andSignTimeNotEqualTo(Date value) {
            addCriterion("sign_time <>", value, "signTime");
            return (Criteria) this;
        }

        public Criteria andSignTimeGreaterThan(Date value) {
            addCriterion("sign_time >", value, "signTime");
            return (Criteria) this;
        }

        public Criteria andSignTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("sign_time >=", value, "signTime");
            return (Criteria) this;
        }

        public Criteria andSignTimeLessThan(Date value) {
            addCriterion("sign_time <", value, "signTime");
            return (Criteria) this;
        }

        public Criteria andSignTimeLessThanOrEqualTo(Date value) {
            addCriterion("sign_time <=", value, "signTime");
            return (Criteria) this;
        }

        public Criteria orSignTimeIsNull() {
            orCriterion("sign_time is null");
            return (Criteria) this;
        }

        public Criteria orSignTimeIsNotNull() {
            orCriterion("sign_time is not null");
            return (Criteria) this;
        }

        public Criteria orSignTimeEqualTo(Date value) {
            orCriterion("sign_time =", value, "signTime");
            return (Criteria) this;
        }

        public Criteria orSignTimeNotEqualTo(Date value) {
            orCriterion("sign_time <>", value, "signTime");
            return (Criteria) this;
        }

        public Criteria orSignTimeGreaterThan(Date value) {
            orCriterion("sign_time >", value, "signTime");
            return (Criteria) this;
        }

        public Criteria orSignTimeGreaterThanOrEqualTo(Date value) {
            orCriterion("sign_time >=", value, "signTime");
            return (Criteria) this;
        }

        public Criteria orSignTimeLessThan(Date value) {
            orCriterion("sign_time <", value, "signTime");
            return (Criteria) this;
        }

        public Criteria orSignTimeLessThanOrEqualTo(Date value) {
            orCriterion("sign_time <=", value, "signTime");
            return (Criteria) this;
        }

        public Criteria andSignTimeIn(List<Date> values) {
            addCriterion("sign_time in", values, "signTime");
            return (Criteria) this;
        }

        public Criteria andSignTimeNotIn(List<Date> values) {
            addCriterion("sign_time not in", values, "signTime");
            return (Criteria) this;
        }

        public Criteria andSignTimeBetween(Date value1, Date value2) {
            addCriterion("sign_time between", value1, value2, "signTime");
            return (Criteria) this;
        }

        public Criteria andSignTimeNotBetween(Date value1, Date value2) {
            addCriterion("sign_time not between", value1, value2, "signTime");
            return (Criteria) this;
        }

        public Criteria orSignTimeIn(List<Date> values) {
            orCriterion("sign_time in", values, "signTime");
            return (Criteria) this;
        }

        public Criteria orSignTimeNotIn(List<Date> values) {
            orCriterion("sign_time not in", values, "signTime");
            return (Criteria) this;
        }

        public Criteria orSignTimeBetween(Date value1, Date value2) {
            orCriterion("sign_time between", value1, value2, "signTime");
            return (Criteria) this;
        }

        public Criteria orSignTimeNotBetween(Date value1, Date value2) {
            orCriterion("sign_time not between", value1, value2, "signTime");
            return (Criteria) this;
        }

        public Criteria andSignOutTimeIsNull() {
            addCriterion("sign_out_time is null");
            return (Criteria) this;
        }

        public Criteria andSignOutTimeIsNotNull() {
            addCriterion("sign_out_time is not null");
            return (Criteria) this;
        }

        public Criteria andSignOutTimeEqualTo(Date value) {
            addCriterion("sign_out_time =", value, "signOutTime");
            return (Criteria) this;
        }

        public Criteria andSignOutTimeNotEqualTo(Date value) {
            addCriterion("sign_out_time <>", value, "signOutTime");
            return (Criteria) this;
        }

        public Criteria andSignOutTimeGreaterThan(Date value) {
            addCriterion("sign_out_time >", value, "signOutTime");
            return (Criteria) this;
        }

        public Criteria andSignOutTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("sign_out_time >=", value, "signOutTime");
            return (Criteria) this;
        }

        public Criteria andSignOutTimeLessThan(Date value) {
            addCriterion("sign_out_time <", value, "signOutTime");
            return (Criteria) this;
        }

        public Criteria andSignOutTimeLessThanOrEqualTo(Date value) {
            addCriterion("sign_out_time <=", value, "signOutTime");
            return (Criteria) this;
        }

        public Criteria orSignOutTimeIsNull() {
            orCriterion("sign_out_time is null");
            return (Criteria) this;
        }

        public Criteria orSignOutTimeIsNotNull() {
            orCriterion("sign_out_time is not null");
            return (Criteria) this;
        }

        public Criteria orSignOutTimeEqualTo(Date value) {
            orCriterion("sign_out_time =", value, "signOutTime");
            return (Criteria) this;
        }

        public Criteria orSignOutTimeNotEqualTo(Date value) {
            orCriterion("sign_out_time <>", value, "signOutTime");
            return (Criteria) this;
        }

        public Criteria orSignOutTimeGreaterThan(Date value) {
            orCriterion("sign_out_time >", value, "signOutTime");
            return (Criteria) this;
        }

        public Criteria orSignOutTimeGreaterThanOrEqualTo(Date value) {
            orCriterion("sign_out_time >=", value, "signOutTime");
            return (Criteria) this;
        }

        public Criteria orSignOutTimeLessThan(Date value) {
            orCriterion("sign_out_time <", value, "signOutTime");
            return (Criteria) this;
        }

        public Criteria orSignOutTimeLessThanOrEqualTo(Date value) {
            orCriterion("sign_out_time <=", value, "signOutTime");
            return (Criteria) this;
        }

        public Criteria andSignOutTimeIn(List<Date> values) {
            addCriterion("sign_out_time in", values, "signOutTime");
            return (Criteria) this;
        }

        public Criteria andSignOutTimeNotIn(List<Date> values) {
            addCriterion("sign_out_time not in", values, "signOutTime");
            return (Criteria) this;
        }

        public Criteria andSignOutTimeBetween(Date value1, Date value2) {
            addCriterion("sign_out_time between", value1, value2, "signOutTime");
            return (Criteria) this;
        }

        public Criteria andSignOutTimeNotBetween(Date value1, Date value2) {
            addCriterion("sign_out_time not between", value1, value2, "signOutTime");
            return (Criteria) this;
        }

        public Criteria orSignOutTimeIn(List<Date> values) {
            orCriterion("sign_out_time in", values, "signOutTime");
            return (Criteria) this;
        }

        public Criteria orSignOutTimeNotIn(List<Date> values) {
            orCriterion("sign_out_time not in", values, "signOutTime");
            return (Criteria) this;
        }

        public Criteria orSignOutTimeBetween(Date value1, Date value2) {
            orCriterion("sign_out_time between", value1, value2, "signOutTime");
            return (Criteria) this;
        }

        public Criteria orSignOutTimeNotBetween(Date value1, Date value2) {
            orCriterion("sign_out_time not between", value1, value2, "signOutTime");
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

        public Criteria andPxIsNull() {
            addCriterion("px is null");
            return (Criteria) this;
        }

        public Criteria andPxIsNotNull() {
            addCriterion("px is not null");
            return (Criteria) this;
        }

        public Criteria andPxEqualTo(BigDecimal value) {
            addCriterion("px =", value, "px");
            return (Criteria) this;
        }

        public Criteria andPxNotEqualTo(BigDecimal value) {
            addCriterion("px <>", value, "px");
            return (Criteria) this;
        }

        public Criteria andPxGreaterThan(BigDecimal value) {
            addCriterion("px >", value, "px");
            return (Criteria) this;
        }

        public Criteria andPxGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("px >=", value, "px");
            return (Criteria) this;
        }

        public Criteria andPxLessThan(BigDecimal value) {
            addCriterion("px <", value, "px");
            return (Criteria) this;
        }

        public Criteria andPxLessThanOrEqualTo(BigDecimal value) {
            addCriterion("px <=", value, "px");
            return (Criteria) this;
        }

        public Criteria orPxIsNull() {
            orCriterion("px is null");
            return (Criteria) this;
        }

        public Criteria orPxIsNotNull() {
            orCriterion("px is not null");
            return (Criteria) this;
        }

        public Criteria orPxEqualTo(BigDecimal value) {
            orCriterion("px =", value, "px");
            return (Criteria) this;
        }

        public Criteria orPxNotEqualTo(BigDecimal value) {
            orCriterion("px <>", value, "px");
            return (Criteria) this;
        }

        public Criteria orPxGreaterThan(BigDecimal value) {
            orCriterion("px >", value, "px");
            return (Criteria) this;
        }

        public Criteria orPxGreaterThanOrEqualTo(BigDecimal value) {
            orCriterion("px >=", value, "px");
            return (Criteria) this;
        }

        public Criteria orPxLessThan(BigDecimal value) {
            orCriterion("px <", value, "px");
            return (Criteria) this;
        }

        public Criteria orPxLessThanOrEqualTo(BigDecimal value) {
            orCriterion("px <=", value, "px");
            return (Criteria) this;
        }

        public Criteria andPxIn(List<BigDecimal> values) {
            addCriterion("px in", values, "px");
            return (Criteria) this;
        }

        public Criteria andPxNotIn(List<BigDecimal> values) {
            addCriterion("px not in", values, "px");
            return (Criteria) this;
        }

        public Criteria andPxBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("px between", value1, value2, "px");
            return (Criteria) this;
        }

        public Criteria andPxNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("px not between", value1, value2, "px");
            return (Criteria) this;
        }

        public Criteria orPxIn(List<BigDecimal> values) {
            orCriterion("px in", values, "px");
            return (Criteria) this;
        }

        public Criteria orPxNotIn(List<BigDecimal> values) {
            orCriterion("px not in", values, "px");
            return (Criteria) this;
        }

        public Criteria orPxBetween(BigDecimal value1, BigDecimal value2) {
            orCriterion("px between", value1, value2, "px");
            return (Criteria) this;
        }

        public Criteria orPxNotBetween(BigDecimal value1, BigDecimal value2) {
            orCriterion("px not between", value1, value2, "px");
            return (Criteria) this;
        }

        public Criteria andPyIsNull() {
            addCriterion("py is null");
            return (Criteria) this;
        }

        public Criteria andPyIsNotNull() {
            addCriterion("py is not null");
            return (Criteria) this;
        }

        public Criteria andPyEqualTo(BigDecimal value) {
            addCriterion("py =", value, "py");
            return (Criteria) this;
        }

        public Criteria andPyNotEqualTo(BigDecimal value) {
            addCriterion("py <>", value, "py");
            return (Criteria) this;
        }

        public Criteria andPyGreaterThan(BigDecimal value) {
            addCriterion("py >", value, "py");
            return (Criteria) this;
        }

        public Criteria andPyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("py >=", value, "py");
            return (Criteria) this;
        }

        public Criteria andPyLessThan(BigDecimal value) {
            addCriterion("py <", value, "py");
            return (Criteria) this;
        }

        public Criteria andPyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("py <=", value, "py");
            return (Criteria) this;
        }

        public Criteria orPyIsNull() {
            orCriterion("py is null");
            return (Criteria) this;
        }

        public Criteria orPyIsNotNull() {
            orCriterion("py is not null");
            return (Criteria) this;
        }

        public Criteria orPyEqualTo(BigDecimal value) {
            orCriterion("py =", value, "py");
            return (Criteria) this;
        }

        public Criteria orPyNotEqualTo(BigDecimal value) {
            orCriterion("py <>", value, "py");
            return (Criteria) this;
        }

        public Criteria orPyGreaterThan(BigDecimal value) {
            orCriterion("py >", value, "py");
            return (Criteria) this;
        }

        public Criteria orPyGreaterThanOrEqualTo(BigDecimal value) {
            orCriterion("py >=", value, "py");
            return (Criteria) this;
        }

        public Criteria orPyLessThan(BigDecimal value) {
            orCriterion("py <", value, "py");
            return (Criteria) this;
        }

        public Criteria orPyLessThanOrEqualTo(BigDecimal value) {
            orCriterion("py <=", value, "py");
            return (Criteria) this;
        }

        public Criteria andPyIn(List<BigDecimal> values) {
            addCriterion("py in", values, "py");
            return (Criteria) this;
        }

        public Criteria andPyNotIn(List<BigDecimal> values) {
            addCriterion("py not in", values, "py");
            return (Criteria) this;
        }

        public Criteria andPyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("py between", value1, value2, "py");
            return (Criteria) this;
        }

        public Criteria andPyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("py not between", value1, value2, "py");
            return (Criteria) this;
        }

        public Criteria orPyIn(List<BigDecimal> values) {
            orCriterion("py in", values, "py");
            return (Criteria) this;
        }

        public Criteria orPyNotIn(List<BigDecimal> values) {
            orCriterion("py not in", values, "py");
            return (Criteria) this;
        }

        public Criteria orPyBetween(BigDecimal value1, BigDecimal value2) {
            orCriterion("py between", value1, value2, "py");
            return (Criteria) this;
        }

        public Criteria orPyNotBetween(BigDecimal value1, BigDecimal value2) {
            orCriterion("py not between", value1, value2, "py");
            return (Criteria) this;
        }

        public Criteria andLocationIsNull() {
            addCriterion("location is null");
            return (Criteria) this;
        }

        public Criteria andLocationIsNotNull() {
            addCriterion("location is not null");
            return (Criteria) this;
        }

        public Criteria andLocationEqualTo(String value) {
            addCriterion("location =", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotEqualTo(String value) {
            addCriterion("location <>", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationGreaterThan(String value) {
            addCriterion("location >", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationGreaterThanOrEqualTo(String value) {
            addCriterion("location >=", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLessThan(String value) {
            addCriterion("location <", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLessThanOrEqualTo(String value) {
            addCriterion("location <=", value, "location");
            return (Criteria) this;
        }

        public Criteria orLocationIsNull() {
            orCriterion("location is null");
            return (Criteria) this;
        }

        public Criteria orLocationIsNotNull() {
            orCriterion("location is not null");
            return (Criteria) this;
        }

        public Criteria orLocationEqualTo(String value) {
            orCriterion("location =", value, "location");
            return (Criteria) this;
        }

        public Criteria orLocationNotEqualTo(String value) {
            orCriterion("location <>", value, "location");
            return (Criteria) this;
        }

        public Criteria orLocationGreaterThan(String value) {
            orCriterion("location >", value, "location");
            return (Criteria) this;
        }

        public Criteria orLocationGreaterThanOrEqualTo(String value) {
            orCriterion("location >=", value, "location");
            return (Criteria) this;
        }

        public Criteria orLocationLessThan(String value) {
            orCriterion("location <", value, "location");
            return (Criteria) this;
        }

        public Criteria orLocationLessThanOrEqualTo(String value) {
            orCriterion("location <=", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLike(String value) {
            addCriterion("location like", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotLike(String value) {
            addCriterion("location not like", value, "location");
            return (Criteria) this;
        }

        public Criteria orLocationLike(String value) {
            orCriterion("location like", value, "location");
            return (Criteria) this;
        }

        public Criteria orLocationNotLike(String value) {
            orCriterion("location not like", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationIn(List<String> values) {
            addCriterion("location in", values, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotIn(List<String> values) {
            addCriterion("location not in", values, "location");
            return (Criteria) this;
        }

        public Criteria andLocationBetween(String value1, String value2) {
            addCriterion("location between", value1, value2, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotBetween(String value1, String value2) {
            addCriterion("location not between", value1, value2, "location");
            return (Criteria) this;
        }

        public Criteria orLocationIn(List<String> values) {
            orCriterion("location in", values, "location");
            return (Criteria) this;
        }

        public Criteria orLocationNotIn(List<String> values) {
            orCriterion("location not in", values, "location");
            return (Criteria) this;
        }

        public Criteria orLocationBetween(String value1, String value2) {
            orCriterion("location between", value1, value2, "location");
            return (Criteria) this;
        }

        public Criteria orLocationNotBetween(String value1, String value2) {
            orCriterion("location not between", value1, value2, "location");
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

        public Criteria andSignDateIsNull() {
            addCriterion("sign_date is null");
            return (Criteria) this;
        }

        public Criteria andSignDateIsNotNull() {
            addCriterion("sign_date is not null");
            return (Criteria) this;
        }

        public Criteria andSignDateEqualTo(Date value) {
            addCriterionForJDBCDate("sign_date =", value, "signDate");
            return (Criteria) this;
        }

        public Criteria andSignDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("sign_date <>", value, "signDate");
            return (Criteria) this;
        }

        public Criteria andSignDateGreaterThan(Date value) {
            addCriterionForJDBCDate("sign_date >", value, "signDate");
            return (Criteria) this;
        }

        public Criteria andSignDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("sign_date >=", value, "signDate");
            return (Criteria) this;
        }

        public Criteria andSignDateLessThan(Date value) {
            addCriterionForJDBCDate("sign_date <", value, "signDate");
            return (Criteria) this;
        }

        public Criteria andSignDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("sign_date <=", value, "signDate");
            return (Criteria) this;
        }

        public Criteria orSignDateIsNull() {
            orCriterion("sign_date is null");
            return (Criteria) this;
        }

        public Criteria orSignDateIsNotNull() {
            orCriterion("sign_date is not null");
            return (Criteria) this;
        }

        public Criteria orSignDateEqualTo(Date value) {
            addCriterionForJDBCDate("sign_date =", value, "signDate");
            return (Criteria) this;
        }

        public Criteria orSignDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("sign_date <>", value, "signDate");
            return (Criteria) this;
        }

        public Criteria orSignDateGreaterThan(Date value) {
            addCriterionForJDBCDate("sign_date >", value, "signDate");
            return (Criteria) this;
        }

        public Criteria orSignDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("sign_date >=", value, "signDate");
            return (Criteria) this;
        }

        public Criteria orSignDateLessThan(Date value) {
            addCriterionForJDBCDate("sign_date <", value, "signDate");
            return (Criteria) this;
        }

        public Criteria orSignDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("sign_date <=", value, "signDate");
            return (Criteria) this;
        }

        public Criteria andSignDateIn(List<Date> values) {
            addCriterionForJDBCDate("sign_date in", values, "signDate");
            return (Criteria) this;
        }

        public Criteria andSignDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("sign_date not in", values, "signDate");
            return (Criteria) this;
        }

        public Criteria andSignDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("sign_date between", value1, value2, "signDate");
            return (Criteria) this;
        }

        public Criteria andSignDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("sign_date not between", value1, value2, "signDate");
            return (Criteria) this;
        }

        public Criteria orSignDateIn(List<Date> values) {
            addCriterionForJDBCDate("sign_date in", values, "signDate");
            return (Criteria) this;
        }

        public Criteria orSignDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("sign_date not in", values, "signDate");
            return (Criteria) this;
        }

        public Criteria orSignDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("sign_date between", value1, value2, "signDate");
            return (Criteria) this;
        }

        public Criteria orSignDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("sign_date not between", value1, value2, "signDate");
            return (Criteria) this;
        }
    }

    /**
     * 该类对应数据库表 checkin
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
     * 该类对应数据库表 checkin
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