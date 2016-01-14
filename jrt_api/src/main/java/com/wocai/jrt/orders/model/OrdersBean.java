package com.wocai.jrt.orders.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrdersBean {
    /**
     * order by 排序语句
     * 对应数据库表字段 orders
     */
    private String orderBy;

    /**
     * 分页开始记录
     * 对应数据库表字段 orders
     */
    private Integer start;

    /**
     * 分页大小
     * 对应数据库表字段 orders
     */
    private int pageSize = 10;

    /**
     * 是否指定 distinct 去除重复
     * 对应数据库表字段 orders
     */
    private boolean distinct;

    /**
     * 逻辑or语句
     * 对应数据库表字段 orders
     */
    private List<Criteria> oredCriteria;

    /**
     */
    public OrdersBean() {
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
     * 新建逻辑或or语句
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
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
     * 该类对应数据库表 orders
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

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
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

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
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

        public Criteria andOrderIdLike(String value) {
            addCriterion("order_id like", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotLike(String value) {
            addCriterion("order_id not like", value, "orderId");
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

        public Criteria andInvestorIdLike(String value) {
            addCriterion("investor_id like", value, "investorId");
            return (Criteria) this;
        }

        public Criteria andInvestorIdNotLike(String value) {
            addCriterion("investor_id not like", value, "investorId");
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

        public Criteria andProductIdIsNull() {
            addCriterion("product_id is null");
            return (Criteria) this;
        }

        public Criteria andProductIdIsNotNull() {
            addCriterion("product_id is not null");
            return (Criteria) this;
        }

        public Criteria andProductIdEqualTo(String value) {
            addCriterion("product_id =", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotEqualTo(String value) {
            addCriterion("product_id <>", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThan(String value) {
            addCriterion("product_id >", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThanOrEqualTo(String value) {
            addCriterion("product_id >=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThan(String value) {
            addCriterion("product_id <", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThanOrEqualTo(String value) {
            addCriterion("product_id <=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLike(String value) {
            addCriterion("product_id like", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotLike(String value) {
            addCriterion("product_id not like", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdIn(List<String> values) {
            addCriterion("product_id in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotIn(List<String> values) {
            addCriterion("product_id not in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdBetween(String value1, String value2) {
            addCriterion("product_id between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotBetween(String value1, String value2) {
            addCriterion("product_id not between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andProductNameIsNull() {
            addCriterion("product_name is null");
            return (Criteria) this;
        }

        public Criteria andProductNameIsNotNull() {
            addCriterion("product_name is not null");
            return (Criteria) this;
        }

        public Criteria andProductNameEqualTo(String value) {
            addCriterion("product_name =", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotEqualTo(String value) {
            addCriterion("product_name <>", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameGreaterThan(String value) {
            addCriterion("product_name >", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameGreaterThanOrEqualTo(String value) {
            addCriterion("product_name >=", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLessThan(String value) {
            addCriterion("product_name <", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLessThanOrEqualTo(String value) {
            addCriterion("product_name <=", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLike(String value) {
            addCriterion("product_name like", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotLike(String value) {
            addCriterion("product_name not like", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameIn(List<String> values) {
            addCriterion("product_name in", values, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotIn(List<String> values) {
            addCriterion("product_name not in", values, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameBetween(String value1, String value2) {
            addCriterion("product_name between", value1, value2, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotBetween(String value1, String value2) {
            addCriterion("product_name not between", value1, value2, "productName");
            return (Criteria) this;
        }

        public Criteria andProductBriefNameIsNull() {
            addCriterion("product_brief_name is null");
            return (Criteria) this;
        }

        public Criteria andProductBriefNameIsNotNull() {
            addCriterion("product_brief_name is not null");
            return (Criteria) this;
        }

        public Criteria andProductBriefNameEqualTo(String value) {
            addCriterion("product_brief_name =", value, "productBriefName");
            return (Criteria) this;
        }

        public Criteria andProductBriefNameNotEqualTo(String value) {
            addCriterion("product_brief_name <>", value, "productBriefName");
            return (Criteria) this;
        }

        public Criteria andProductBriefNameGreaterThan(String value) {
            addCriterion("product_brief_name >", value, "productBriefName");
            return (Criteria) this;
        }

        public Criteria andProductBriefNameGreaterThanOrEqualTo(String value) {
            addCriterion("product_brief_name >=", value, "productBriefName");
            return (Criteria) this;
        }

        public Criteria andProductBriefNameLessThan(String value) {
            addCriterion("product_brief_name <", value, "productBriefName");
            return (Criteria) this;
        }

        public Criteria andProductBriefNameLessThanOrEqualTo(String value) {
            addCriterion("product_brief_name <=", value, "productBriefName");
            return (Criteria) this;
        }

        public Criteria andProductBriefNameLike(String value) {
            addCriterion("product_brief_name like", value, "productBriefName");
            return (Criteria) this;
        }

        public Criteria andProductBriefNameNotLike(String value) {
            addCriterion("product_brief_name not like", value, "productBriefName");
            return (Criteria) this;
        }

        public Criteria andProductBriefNameIn(List<String> values) {
            addCriterion("product_brief_name in", values, "productBriefName");
            return (Criteria) this;
        }

        public Criteria andProductBriefNameNotIn(List<String> values) {
            addCriterion("product_brief_name not in", values, "productBriefName");
            return (Criteria) this;
        }

        public Criteria andProductBriefNameBetween(String value1, String value2) {
            addCriterion("product_brief_name between", value1, value2, "productBriefName");
            return (Criteria) this;
        }

        public Criteria andProductBriefNameNotBetween(String value1, String value2) {
            addCriterion("product_brief_name not between", value1, value2, "productBriefName");
            return (Criteria) this;
        }

        public Criteria andOrderAmountIsNull() {
            addCriterion("order_amount is null");
            return (Criteria) this;
        }

        public Criteria andOrderAmountIsNotNull() {
            addCriterion("order_amount is not null");
            return (Criteria) this;
        }

        public Criteria andOrderAmountEqualTo(BigDecimal value) {
            addCriterion("order_amount =", value, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountNotEqualTo(BigDecimal value) {
            addCriterion("order_amount <>", value, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountGreaterThan(BigDecimal value) {
            addCriterion("order_amount >", value, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("order_amount >=", value, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountLessThan(BigDecimal value) {
            addCriterion("order_amount <", value, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("order_amount <=", value, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountIn(List<BigDecimal> values) {
            addCriterion("order_amount in", values, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountNotIn(List<BigDecimal> values) {
            addCriterion("order_amount not in", values, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("order_amount between", value1, value2, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("order_amount not between", value1, value2, "orderAmount");
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

        public Criteria andEmployeeIdLike(String value) {
            addCriterion("employee_id like", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdNotLike(String value) {
            addCriterion("employee_id not like", value, "employeeId");
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

        public Criteria andEmployeeNameLike(String value) {
            addCriterion("employee_name like", value, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameNotLike(String value) {
            addCriterion("employee_name not like", value, "employeeName");
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

        public Criteria andOrderTimeIsNull() {
            addCriterion("order_time is null");
            return (Criteria) this;
        }

        public Criteria andOrderTimeIsNotNull() {
            addCriterion("order_time is not null");
            return (Criteria) this;
        }

        public Criteria andOrderTimeEqualTo(Date value) {
            addCriterion("order_time =", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeNotEqualTo(Date value) {
            addCriterion("order_time <>", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeGreaterThan(Date value) {
            addCriterion("order_time >", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("order_time >=", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeLessThan(Date value) {
            addCriterion("order_time <", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeLessThanOrEqualTo(Date value) {
            addCriterion("order_time <=", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeIn(List<Date> values) {
            addCriterion("order_time in", values, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeNotIn(List<Date> values) {
            addCriterion("order_time not in", values, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeBetween(Date value1, Date value2) {
            addCriterion("order_time between", value1, value2, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeNotBetween(Date value1, Date value2) {
            addCriterion("order_time not between", value1, value2, "orderTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeIsNull() {
            addCriterion("pay_time is null");
            return (Criteria) this;
        }

        public Criteria andPayTimeIsNotNull() {
            addCriterion("pay_time is not null");
            return (Criteria) this;
        }

        public Criteria andPayTimeEqualTo(Date value) {
            addCriterion("pay_time =", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeNotEqualTo(Date value) {
            addCriterion("pay_time <>", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeGreaterThan(Date value) {
            addCriterion("pay_time >", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("pay_time >=", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeLessThan(Date value) {
            addCriterion("pay_time <", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeLessThanOrEqualTo(Date value) {
            addCriterion("pay_time <=", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeIn(List<Date> values) {
            addCriterion("pay_time in", values, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeNotIn(List<Date> values) {
            addCriterion("pay_time not in", values, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeBetween(Date value1, Date value2) {
            addCriterion("pay_time between", value1, value2, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeNotBetween(Date value1, Date value2) {
            addCriterion("pay_time not between", value1, value2, "payTime");
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

        public Criteria andPadIdLike(String value) {
            addCriterion("pad_id like", value, "padId");
            return (Criteria) this;
        }

        public Criteria andPadIdNotLike(String value) {
            addCriterion("pad_id not like", value, "padId");
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

        public Criteria andPosIdLike(String value) {
            addCriterion("pos_id like", value, "posId");
            return (Criteria) this;
        }

        public Criteria andPosIdNotLike(String value) {
            addCriterion("pos_id not like", value, "posId");
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

        public Criteria andOrgIdLike(String value) {
            addCriterion("org_id like", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdNotLike(String value) {
            addCriterion("org_id not like", value, "orgId");
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

        public Criteria andPaidAmountIsNull() {
            addCriterion("paid_amount is null");
            return (Criteria) this;
        }

        public Criteria andPaidAmountIsNotNull() {
            addCriterion("paid_amount is not null");
            return (Criteria) this;
        }

        public Criteria andPaidAmountEqualTo(BigDecimal value) {
            addCriterion("paid_amount =", value, "paidAmount");
            return (Criteria) this;
        }

        public Criteria andPaidAmountNotEqualTo(BigDecimal value) {
            addCriterion("paid_amount <>", value, "paidAmount");
            return (Criteria) this;
        }

        public Criteria andPaidAmountGreaterThan(BigDecimal value) {
            addCriterion("paid_amount >", value, "paidAmount");
            return (Criteria) this;
        }

        public Criteria andPaidAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("paid_amount >=", value, "paidAmount");
            return (Criteria) this;
        }

        public Criteria andPaidAmountLessThan(BigDecimal value) {
            addCriterion("paid_amount <", value, "paidAmount");
            return (Criteria) this;
        }

        public Criteria andPaidAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("paid_amount <=", value, "paidAmount");
            return (Criteria) this;
        }

        public Criteria andPaidAmountIn(List<BigDecimal> values) {
            addCriterion("paid_amount in", values, "paidAmount");
            return (Criteria) this;
        }

        public Criteria andPaidAmountNotIn(List<BigDecimal> values) {
            addCriterion("paid_amount not in", values, "paidAmount");
            return (Criteria) this;
        }

        public Criteria andPaidAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("paid_amount between", value1, value2, "paidAmount");
            return (Criteria) this;
        }

        public Criteria andPaidAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("paid_amount not between", value1, value2, "paidAmount");
            return (Criteria) this;
        }

        public Criteria andIdcardFrontIsNull() {
            addCriterion("idcard_front is null");
            return (Criteria) this;
        }

        public Criteria andIdcardFrontIsNotNull() {
            addCriterion("idcard_front is not null");
            return (Criteria) this;
        }

        public Criteria andIdcardFrontEqualTo(String value) {
            addCriterion("idcard_front =", value, "idcardFront");
            return (Criteria) this;
        }

        public Criteria andIdcardFrontNotEqualTo(String value) {
            addCriterion("idcard_front <>", value, "idcardFront");
            return (Criteria) this;
        }

        public Criteria andIdcardFrontGreaterThan(String value) {
            addCriterion("idcard_front >", value, "idcardFront");
            return (Criteria) this;
        }

        public Criteria andIdcardFrontGreaterThanOrEqualTo(String value) {
            addCriterion("idcard_front >=", value, "idcardFront");
            return (Criteria) this;
        }

        public Criteria andIdcardFrontLessThan(String value) {
            addCriterion("idcard_front <", value, "idcardFront");
            return (Criteria) this;
        }

        public Criteria andIdcardFrontLessThanOrEqualTo(String value) {
            addCriterion("idcard_front <=", value, "idcardFront");
            return (Criteria) this;
        }

        public Criteria andIdcardFrontLike(String value) {
            addCriterion("idcard_front like", value, "idcardFront");
            return (Criteria) this;
        }

        public Criteria andIdcardFrontNotLike(String value) {
            addCriterion("idcard_front not like", value, "idcardFront");
            return (Criteria) this;
        }

        public Criteria andIdcardFrontIn(List<String> values) {
            addCriterion("idcard_front in", values, "idcardFront");
            return (Criteria) this;
        }

        public Criteria andIdcardFrontNotIn(List<String> values) {
            addCriterion("idcard_front not in", values, "idcardFront");
            return (Criteria) this;
        }

        public Criteria andIdcardFrontBetween(String value1, String value2) {
            addCriterion("idcard_front between", value1, value2, "idcardFront");
            return (Criteria) this;
        }

        public Criteria andIdcardFrontNotBetween(String value1, String value2) {
            addCriterion("idcard_front not between", value1, value2, "idcardFront");
            return (Criteria) this;
        }

        public Criteria andIdcardBackIsNull() {
            addCriterion("idcard_back is null");
            return (Criteria) this;
        }

        public Criteria andIdcardBackIsNotNull() {
            addCriterion("idcard_back is not null");
            return (Criteria) this;
        }

        public Criteria andIdcardBackEqualTo(String value) {
            addCriterion("idcard_back =", value, "idcardBack");
            return (Criteria) this;
        }

        public Criteria andIdcardBackNotEqualTo(String value) {
            addCriterion("idcard_back <>", value, "idcardBack");
            return (Criteria) this;
        }

        public Criteria andIdcardBackGreaterThan(String value) {
            addCriterion("idcard_back >", value, "idcardBack");
            return (Criteria) this;
        }

        public Criteria andIdcardBackGreaterThanOrEqualTo(String value) {
            addCriterion("idcard_back >=", value, "idcardBack");
            return (Criteria) this;
        }

        public Criteria andIdcardBackLessThan(String value) {
            addCriterion("idcard_back <", value, "idcardBack");
            return (Criteria) this;
        }

        public Criteria andIdcardBackLessThanOrEqualTo(String value) {
            addCriterion("idcard_back <=", value, "idcardBack");
            return (Criteria) this;
        }

        public Criteria andIdcardBackLike(String value) {
            addCriterion("idcard_back like", value, "idcardBack");
            return (Criteria) this;
        }

        public Criteria andIdcardBackNotLike(String value) {
            addCriterion("idcard_back not like", value, "idcardBack");
            return (Criteria) this;
        }

        public Criteria andIdcardBackIn(List<String> values) {
            addCriterion("idcard_back in", values, "idcardBack");
            return (Criteria) this;
        }

        public Criteria andIdcardBackNotIn(List<String> values) {
            addCriterion("idcard_back not in", values, "idcardBack");
            return (Criteria) this;
        }

        public Criteria andIdcardBackBetween(String value1, String value2) {
            addCriterion("idcard_back between", value1, value2, "idcardBack");
            return (Criteria) this;
        }

        public Criteria andIdcardBackNotBetween(String value1, String value2) {
            addCriterion("idcard_back not between", value1, value2, "idcardBack");
            return (Criteria) this;
        }

        public Criteria andContactSignManagerIsNull() {
            addCriterion("contact_sign_manager is null");
            return (Criteria) this;
        }

        public Criteria andContactSignManagerIsNotNull() {
            addCriterion("contact_sign_manager is not null");
            return (Criteria) this;
        }

        public Criteria andContactSignManagerEqualTo(String value) {
            addCriterion("contact_sign_manager =", value, "contactSignManager");
            return (Criteria) this;
        }

        public Criteria andContactSignManagerNotEqualTo(String value) {
            addCriterion("contact_sign_manager <>", value, "contactSignManager");
            return (Criteria) this;
        }

        public Criteria andContactSignManagerGreaterThan(String value) {
            addCriterion("contact_sign_manager >", value, "contactSignManager");
            return (Criteria) this;
        }

        public Criteria andContactSignManagerGreaterThanOrEqualTo(String value) {
            addCriterion("contact_sign_manager >=", value, "contactSignManager");
            return (Criteria) this;
        }

        public Criteria andContactSignManagerLessThan(String value) {
            addCriterion("contact_sign_manager <", value, "contactSignManager");
            return (Criteria) this;
        }

        public Criteria andContactSignManagerLessThanOrEqualTo(String value) {
            addCriterion("contact_sign_manager <=", value, "contactSignManager");
            return (Criteria) this;
        }

        public Criteria andContactSignManagerLike(String value) {
            addCriterion("contact_sign_manager like", value, "contactSignManager");
            return (Criteria) this;
        }

        public Criteria andContactSignManagerNotLike(String value) {
            addCriterion("contact_sign_manager not like", value, "contactSignManager");
            return (Criteria) this;
        }

        public Criteria andContactSignManagerIn(List<String> values) {
            addCriterion("contact_sign_manager in", values, "contactSignManager");
            return (Criteria) this;
        }

        public Criteria andContactSignManagerNotIn(List<String> values) {
            addCriterion("contact_sign_manager not in", values, "contactSignManager");
            return (Criteria) this;
        }

        public Criteria andContactSignManagerBetween(String value1, String value2) {
            addCriterion("contact_sign_manager between", value1, value2, "contactSignManager");
            return (Criteria) this;
        }

        public Criteria andContactSignManagerNotBetween(String value1, String value2) {
            addCriterion("contact_sign_manager not between", value1, value2, "contactSignManager");
            return (Criteria) this;
        }

        public Criteria andContactSignUserIsNull() {
            addCriterion("contact_sign_user is null");
            return (Criteria) this;
        }

        public Criteria andContactSignUserIsNotNull() {
            addCriterion("contact_sign_user is not null");
            return (Criteria) this;
        }

        public Criteria andContactSignUserEqualTo(String value) {
            addCriterion("contact_sign_user =", value, "contactSignUser");
            return (Criteria) this;
        }

        public Criteria andContactSignUserNotEqualTo(String value) {
            addCriterion("contact_sign_user <>", value, "contactSignUser");
            return (Criteria) this;
        }

        public Criteria andContactSignUserGreaterThan(String value) {
            addCriterion("contact_sign_user >", value, "contactSignUser");
            return (Criteria) this;
        }

        public Criteria andContactSignUserGreaterThanOrEqualTo(String value) {
            addCriterion("contact_sign_user >=", value, "contactSignUser");
            return (Criteria) this;
        }

        public Criteria andContactSignUserLessThan(String value) {
            addCriterion("contact_sign_user <", value, "contactSignUser");
            return (Criteria) this;
        }

        public Criteria andContactSignUserLessThanOrEqualTo(String value) {
            addCriterion("contact_sign_user <=", value, "contactSignUser");
            return (Criteria) this;
        }

        public Criteria andContactSignUserLike(String value) {
            addCriterion("contact_sign_user like", value, "contactSignUser");
            return (Criteria) this;
        }

        public Criteria andContactSignUserNotLike(String value) {
            addCriterion("contact_sign_user not like", value, "contactSignUser");
            return (Criteria) this;
        }

        public Criteria andContactSignUserIn(List<String> values) {
            addCriterion("contact_sign_user in", values, "contactSignUser");
            return (Criteria) this;
        }

        public Criteria andContactSignUserNotIn(List<String> values) {
            addCriterion("contact_sign_user not in", values, "contactSignUser");
            return (Criteria) this;
        }

        public Criteria andContactSignUserBetween(String value1, String value2) {
            addCriterion("contact_sign_user between", value1, value2, "contactSignUser");
            return (Criteria) this;
        }

        public Criteria andContactSignUserNotBetween(String value1, String value2) {
            addCriterion("contact_sign_user not between", value1, value2, "contactSignUser");
            return (Criteria) this;
        }

        public Criteria andPaySignManagerIsNull() {
            addCriterion("pay_sign_manager is null");
            return (Criteria) this;
        }

        public Criteria andPaySignManagerIsNotNull() {
            addCriterion("pay_sign_manager is not null");
            return (Criteria) this;
        }

        public Criteria andPaySignManagerEqualTo(String value) {
            addCriterion("pay_sign_manager =", value, "paySignManager");
            return (Criteria) this;
        }

        public Criteria andPaySignManagerNotEqualTo(String value) {
            addCriterion("pay_sign_manager <>", value, "paySignManager");
            return (Criteria) this;
        }

        public Criteria andPaySignManagerGreaterThan(String value) {
            addCriterion("pay_sign_manager >", value, "paySignManager");
            return (Criteria) this;
        }

        public Criteria andPaySignManagerGreaterThanOrEqualTo(String value) {
            addCriterion("pay_sign_manager >=", value, "paySignManager");
            return (Criteria) this;
        }

        public Criteria andPaySignManagerLessThan(String value) {
            addCriterion("pay_sign_manager <", value, "paySignManager");
            return (Criteria) this;
        }

        public Criteria andPaySignManagerLessThanOrEqualTo(String value) {
            addCriterion("pay_sign_manager <=", value, "paySignManager");
            return (Criteria) this;
        }

        public Criteria andPaySignManagerLike(String value) {
            addCriterion("pay_sign_manager like", value, "paySignManager");
            return (Criteria) this;
        }

        public Criteria andPaySignManagerNotLike(String value) {
            addCriterion("pay_sign_manager not like", value, "paySignManager");
            return (Criteria) this;
        }

        public Criteria andPaySignManagerIn(List<String> values) {
            addCriterion("pay_sign_manager in", values, "paySignManager");
            return (Criteria) this;
        }

        public Criteria andPaySignManagerNotIn(List<String> values) {
            addCriterion("pay_sign_manager not in", values, "paySignManager");
            return (Criteria) this;
        }

        public Criteria andPaySignManagerBetween(String value1, String value2) {
            addCriterion("pay_sign_manager between", value1, value2, "paySignManager");
            return (Criteria) this;
        }

        public Criteria andPaySignManagerNotBetween(String value1, String value2) {
            addCriterion("pay_sign_manager not between", value1, value2, "paySignManager");
            return (Criteria) this;
        }

        public Criteria andPaySignUserIsNull() {
            addCriterion("pay_sign_user is null");
            return (Criteria) this;
        }

        public Criteria andPaySignUserIsNotNull() {
            addCriterion("pay_sign_user is not null");
            return (Criteria) this;
        }

        public Criteria andPaySignUserEqualTo(String value) {
            addCriterion("pay_sign_user =", value, "paySignUser");
            return (Criteria) this;
        }

        public Criteria andPaySignUserNotEqualTo(String value) {
            addCriterion("pay_sign_user <>", value, "paySignUser");
            return (Criteria) this;
        }

        public Criteria andPaySignUserGreaterThan(String value) {
            addCriterion("pay_sign_user >", value, "paySignUser");
            return (Criteria) this;
        }

        public Criteria andPaySignUserGreaterThanOrEqualTo(String value) {
            addCriterion("pay_sign_user >=", value, "paySignUser");
            return (Criteria) this;
        }

        public Criteria andPaySignUserLessThan(String value) {
            addCriterion("pay_sign_user <", value, "paySignUser");
            return (Criteria) this;
        }

        public Criteria andPaySignUserLessThanOrEqualTo(String value) {
            addCriterion("pay_sign_user <=", value, "paySignUser");
            return (Criteria) this;
        }

        public Criteria andPaySignUserLike(String value) {
            addCriterion("pay_sign_user like", value, "paySignUser");
            return (Criteria) this;
        }

        public Criteria andPaySignUserNotLike(String value) {
            addCriterion("pay_sign_user not like", value, "paySignUser");
            return (Criteria) this;
        }

        public Criteria andPaySignUserIn(List<String> values) {
            addCriterion("pay_sign_user in", values, "paySignUser");
            return (Criteria) this;
        }

        public Criteria andPaySignUserNotIn(List<String> values) {
            addCriterion("pay_sign_user not in", values, "paySignUser");
            return (Criteria) this;
        }

        public Criteria andPaySignUserBetween(String value1, String value2) {
            addCriterion("pay_sign_user between", value1, value2, "paySignUser");
            return (Criteria) this;
        }

        public Criteria andPaySignUserNotBetween(String value1, String value2) {
            addCriterion("pay_sign_user not between", value1, value2, "paySignUser");
            return (Criteria) this;
        }

        public Criteria andVideoUserIsNull() {
            addCriterion("video_user is null");
            return (Criteria) this;
        }

        public Criteria andVideoUserIsNotNull() {
            addCriterion("video_user is not null");
            return (Criteria) this;
        }

        public Criteria andVideoUserEqualTo(String value) {
            addCriterion("video_user =", value, "videoUser");
            return (Criteria) this;
        }

        public Criteria andVideoUserNotEqualTo(String value) {
            addCriterion("video_user <>", value, "videoUser");
            return (Criteria) this;
        }

        public Criteria andVideoUserGreaterThan(String value) {
            addCriterion("video_user >", value, "videoUser");
            return (Criteria) this;
        }

        public Criteria andVideoUserGreaterThanOrEqualTo(String value) {
            addCriterion("video_user >=", value, "videoUser");
            return (Criteria) this;
        }

        public Criteria andVideoUserLessThan(String value) {
            addCriterion("video_user <", value, "videoUser");
            return (Criteria) this;
        }

        public Criteria andVideoUserLessThanOrEqualTo(String value) {
            addCriterion("video_user <=", value, "videoUser");
            return (Criteria) this;
        }

        public Criteria andVideoUserLike(String value) {
            addCriterion("video_user like", value, "videoUser");
            return (Criteria) this;
        }

        public Criteria andVideoUserNotLike(String value) {
            addCriterion("video_user not like", value, "videoUser");
            return (Criteria) this;
        }

        public Criteria andVideoUserIn(List<String> values) {
            addCriterion("video_user in", values, "videoUser");
            return (Criteria) this;
        }

        public Criteria andVideoUserNotIn(List<String> values) {
            addCriterion("video_user not in", values, "videoUser");
            return (Criteria) this;
        }

        public Criteria andVideoUserBetween(String value1, String value2) {
            addCriterion("video_user between", value1, value2, "videoUser");
            return (Criteria) this;
        }

        public Criteria andVideoUserNotBetween(String value1, String value2) {
            addCriterion("video_user not between", value1, value2, "videoUser");
            return (Criteria) this;
        }

        public Criteria andVideoManagerIsNull() {
            addCriterion("video_manager is null");
            return (Criteria) this;
        }

        public Criteria andVideoManagerIsNotNull() {
            addCriterion("video_manager is not null");
            return (Criteria) this;
        }

        public Criteria andVideoManagerEqualTo(String value) {
            addCriterion("video_manager =", value, "videoManager");
            return (Criteria) this;
        }

        public Criteria andVideoManagerNotEqualTo(String value) {
            addCriterion("video_manager <>", value, "videoManager");
            return (Criteria) this;
        }

        public Criteria andVideoManagerGreaterThan(String value) {
            addCriterion("video_manager >", value, "videoManager");
            return (Criteria) this;
        }

        public Criteria andVideoManagerGreaterThanOrEqualTo(String value) {
            addCriterion("video_manager >=", value, "videoManager");
            return (Criteria) this;
        }

        public Criteria andVideoManagerLessThan(String value) {
            addCriterion("video_manager <", value, "videoManager");
            return (Criteria) this;
        }

        public Criteria andVideoManagerLessThanOrEqualTo(String value) {
            addCriterion("video_manager <=", value, "videoManager");
            return (Criteria) this;
        }

        public Criteria andVideoManagerLike(String value) {
            addCriterion("video_manager like", value, "videoManager");
            return (Criteria) this;
        }

        public Criteria andVideoManagerNotLike(String value) {
            addCriterion("video_manager not like", value, "videoManager");
            return (Criteria) this;
        }

        public Criteria andVideoManagerIn(List<String> values) {
            addCriterion("video_manager in", values, "videoManager");
            return (Criteria) this;
        }

        public Criteria andVideoManagerNotIn(List<String> values) {
            addCriterion("video_manager not in", values, "videoManager");
            return (Criteria) this;
        }

        public Criteria andVideoManagerBetween(String value1, String value2) {
            addCriterion("video_manager between", value1, value2, "videoManager");
            return (Criteria) this;
        }

        public Criteria andVideoManagerNotBetween(String value1, String value2) {
            addCriterion("video_manager not between", value1, value2, "videoManager");
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

        public Criteria andBankDepositIsNull() {
            addCriterion("bank_deposit is null");
            return (Criteria) this;
        }

        public Criteria andBankDepositIsNotNull() {
            addCriterion("bank_deposit is not null");
            return (Criteria) this;
        }

        public Criteria andBankDepositEqualTo(String value) {
            addCriterion("bank_deposit =", value, "bankDeposit");
            return (Criteria) this;
        }

        public Criteria andBankDepositNotEqualTo(String value) {
            addCriterion("bank_deposit <>", value, "bankDeposit");
            return (Criteria) this;
        }

        public Criteria andBankDepositGreaterThan(String value) {
            addCriterion("bank_deposit >", value, "bankDeposit");
            return (Criteria) this;
        }

        public Criteria andBankDepositGreaterThanOrEqualTo(String value) {
            addCriterion("bank_deposit >=", value, "bankDeposit");
            return (Criteria) this;
        }

        public Criteria andBankDepositLessThan(String value) {
            addCriterion("bank_deposit <", value, "bankDeposit");
            return (Criteria) this;
        }

        public Criteria andBankDepositLessThanOrEqualTo(String value) {
            addCriterion("bank_deposit <=", value, "bankDeposit");
            return (Criteria) this;
        }

        public Criteria andBankDepositLike(String value) {
            addCriterion("bank_deposit like", value, "bankDeposit");
            return (Criteria) this;
        }

        public Criteria andBankDepositNotLike(String value) {
            addCriterion("bank_deposit not like", value, "bankDeposit");
            return (Criteria) this;
        }

        public Criteria andBankDepositIn(List<String> values) {
            addCriterion("bank_deposit in", values, "bankDeposit");
            return (Criteria) this;
        }

        public Criteria andBankDepositNotIn(List<String> values) {
            addCriterion("bank_deposit not in", values, "bankDeposit");
            return (Criteria) this;
        }

        public Criteria andBankDepositBetween(String value1, String value2) {
            addCriterion("bank_deposit between", value1, value2, "bankDeposit");
            return (Criteria) this;
        }

        public Criteria andBankDepositNotBetween(String value1, String value2) {
            addCriterion("bank_deposit not between", value1, value2, "bankDeposit");
            return (Criteria) this;
        }

        public Criteria andBankAccountIsNull() {
            addCriterion("bank_account is null");
            return (Criteria) this;
        }

        public Criteria andBankAccountIsNotNull() {
            addCriterion("bank_account is not null");
            return (Criteria) this;
        }

        public Criteria andBankAccountEqualTo(String value) {
            addCriterion("bank_account =", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountNotEqualTo(String value) {
            addCriterion("bank_account <>", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountGreaterThan(String value) {
            addCriterion("bank_account >", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountGreaterThanOrEqualTo(String value) {
            addCriterion("bank_account >=", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountLessThan(String value) {
            addCriterion("bank_account <", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountLessThanOrEqualTo(String value) {
            addCriterion("bank_account <=", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountLike(String value) {
            addCriterion("bank_account like", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountNotLike(String value) {
            addCriterion("bank_account not like", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountIn(List<String> values) {
            addCriterion("bank_account in", values, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountNotIn(List<String> values) {
            addCriterion("bank_account not in", values, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountBetween(String value1, String value2) {
            addCriterion("bank_account between", value1, value2, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountNotBetween(String value1, String value2) {
            addCriterion("bank_account not between", value1, value2, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankNameIsNull() {
            addCriterion("bank_name is null");
            return (Criteria) this;
        }

        public Criteria andBankNameIsNotNull() {
            addCriterion("bank_name is not null");
            return (Criteria) this;
        }

        public Criteria andBankNameEqualTo(String value) {
            addCriterion("bank_name =", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotEqualTo(String value) {
            addCriterion("bank_name <>", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameGreaterThan(String value) {
            addCriterion("bank_name >", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameGreaterThanOrEqualTo(String value) {
            addCriterion("bank_name >=", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameLessThan(String value) {
            addCriterion("bank_name <", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameLessThanOrEqualTo(String value) {
            addCriterion("bank_name <=", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameLike(String value) {
            addCriterion("bank_name like", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotLike(String value) {
            addCriterion("bank_name not like", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameIn(List<String> values) {
            addCriterion("bank_name in", values, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotIn(List<String> values) {
            addCriterion("bank_name not in", values, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameBetween(String value1, String value2) {
            addCriterion("bank_name between", value1, value2, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotBetween(String value1, String value2) {
            addCriterion("bank_name not between", value1, value2, "bankName");
            return (Criteria) this;
        }
    }

    /**
     * 该类对应数据库表 orders
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * 该类对应数据库表 orders
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

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
    }
}