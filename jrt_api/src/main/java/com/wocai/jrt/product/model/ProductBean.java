package com.wocai.jrt.product.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProductBean {
    /**
     * order by 排序语句
     * 对应数据库表字段 product
     */
    private String orderBy;

    /**
     * 分页开始记录
     * 对应数据库表字段 product
     */
    private Integer start;

    /**
     * 分页大小
     * 对应数据库表字段 product
     */
    private int pageSize = 10;

    /**
     * 是否指定 distinct 去除重复
     * 对应数据库表字段 product
     */
    private boolean distinct;

    /**
     * 逻辑or语句
     * 对应数据库表字段 product
     */
    private List<Criteria> oredCriteria;

    /**
     */
    public ProductBean() {
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
     * 该类对应数据库表 product
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

        public Criteria orProductNameIsNull() {
            orCriterion("product_name is null");
            return (Criteria) this;
        }

        public Criteria orProductNameIsNotNull() {
            orCriterion("product_name is not null");
            return (Criteria) this;
        }

        public Criteria orProductNameEqualTo(String value) {
            orCriterion("product_name =", value, "productName");
            return (Criteria) this;
        }

        public Criteria orProductNameNotEqualTo(String value) {
            orCriterion("product_name <>", value, "productName");
            return (Criteria) this;
        }

        public Criteria orProductNameGreaterThan(String value) {
            orCriterion("product_name >", value, "productName");
            return (Criteria) this;
        }

        public Criteria orProductNameGreaterThanOrEqualTo(String value) {
            orCriterion("product_name >=", value, "productName");
            return (Criteria) this;
        }

        public Criteria orProductNameLessThan(String value) {
            orCriterion("product_name <", value, "productName");
            return (Criteria) this;
        }

        public Criteria orProductNameLessThanOrEqualTo(String value) {
            orCriterion("product_name <=", value, "productName");
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

        public Criteria orProductNameLike(String value) {
            orCriterion("product_name like", value, "productName");
            return (Criteria) this;
        }

        public Criteria orProductNameNotLike(String value) {
            orCriterion("product_name not like", value, "productName");
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

        public Criteria orProductNameIn(List<String> values) {
            orCriterion("product_name in", values, "productName");
            return (Criteria) this;
        }

        public Criteria orProductNameNotIn(List<String> values) {
            orCriterion("product_name not in", values, "productName");
            return (Criteria) this;
        }

        public Criteria orProductNameBetween(String value1, String value2) {
            orCriterion("product_name between", value1, value2, "productName");
            return (Criteria) this;
        }

        public Criteria orProductNameNotBetween(String value1, String value2) {
            orCriterion("product_name not between", value1, value2, "productName");
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

        public Criteria andProductCodeIsNull() {
            addCriterion("product_code is null");
            return (Criteria) this;
        }

        public Criteria andProductCodeIsNotNull() {
            addCriterion("product_code is not null");
            return (Criteria) this;
        }

        public Criteria andProductCodeEqualTo(String value) {
            addCriterion("product_code =", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeNotEqualTo(String value) {
            addCriterion("product_code <>", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeGreaterThan(String value) {
            addCriterion("product_code >", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeGreaterThanOrEqualTo(String value) {
            addCriterion("product_code >=", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeLessThan(String value) {
            addCriterion("product_code <", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeLessThanOrEqualTo(String value) {
            addCriterion("product_code <=", value, "productCode");
            return (Criteria) this;
        }

        public Criteria orProductCodeIsNull() {
            orCriterion("product_code is null");
            return (Criteria) this;
        }

        public Criteria orProductCodeIsNotNull() {
            orCriterion("product_code is not null");
            return (Criteria) this;
        }

        public Criteria orProductCodeEqualTo(String value) {
            orCriterion("product_code =", value, "productCode");
            return (Criteria) this;
        }

        public Criteria orProductCodeNotEqualTo(String value) {
            orCriterion("product_code <>", value, "productCode");
            return (Criteria) this;
        }

        public Criteria orProductCodeGreaterThan(String value) {
            orCriterion("product_code >", value, "productCode");
            return (Criteria) this;
        }

        public Criteria orProductCodeGreaterThanOrEqualTo(String value) {
            orCriterion("product_code >=", value, "productCode");
            return (Criteria) this;
        }

        public Criteria orProductCodeLessThan(String value) {
            orCriterion("product_code <", value, "productCode");
            return (Criteria) this;
        }

        public Criteria orProductCodeLessThanOrEqualTo(String value) {
            orCriterion("product_code <=", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeLike(String value) {
            addCriterion("product_code like", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeNotLike(String value) {
            addCriterion("product_code not like", value, "productCode");
            return (Criteria) this;
        }

        public Criteria orProductCodeLike(String value) {
            orCriterion("product_code like", value, "productCode");
            return (Criteria) this;
        }

        public Criteria orProductCodeNotLike(String value) {
            orCriterion("product_code not like", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeIn(List<String> values) {
            addCriterion("product_code in", values, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeNotIn(List<String> values) {
            addCriterion("product_code not in", values, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeBetween(String value1, String value2) {
            addCriterion("product_code between", value1, value2, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeNotBetween(String value1, String value2) {
            addCriterion("product_code not between", value1, value2, "productCode");
            return (Criteria) this;
        }

        public Criteria orProductCodeIn(List<String> values) {
            orCriterion("product_code in", values, "productCode");
            return (Criteria) this;
        }

        public Criteria orProductCodeNotIn(List<String> values) {
            orCriterion("product_code not in", values, "productCode");
            return (Criteria) this;
        }

        public Criteria orProductCodeBetween(String value1, String value2) {
            orCriterion("product_code between", value1, value2, "productCode");
            return (Criteria) this;
        }

        public Criteria orProductCodeNotBetween(String value1, String value2) {
            orCriterion("product_code not between", value1, value2, "productCode");
            return (Criteria) this;
        }

        public Criteria andIncomeTypeIsNull() {
            addCriterion("income_type is null");
            return (Criteria) this;
        }

        public Criteria andIncomeTypeIsNotNull() {
            addCriterion("income_type is not null");
            return (Criteria) this;
        }

        public Criteria andIncomeTypeEqualTo(String value) {
            addCriterion("income_type =", value, "incomeType");
            return (Criteria) this;
        }

        public Criteria andIncomeTypeNotEqualTo(String value) {
            addCriterion("income_type <>", value, "incomeType");
            return (Criteria) this;
        }

        public Criteria andIncomeTypeGreaterThan(String value) {
            addCriterion("income_type >", value, "incomeType");
            return (Criteria) this;
        }

        public Criteria andIncomeTypeGreaterThanOrEqualTo(String value) {
            addCriterion("income_type >=", value, "incomeType");
            return (Criteria) this;
        }

        public Criteria andIncomeTypeLessThan(String value) {
            addCriterion("income_type <", value, "incomeType");
            return (Criteria) this;
        }

        public Criteria andIncomeTypeLessThanOrEqualTo(String value) {
            addCriterion("income_type <=", value, "incomeType");
            return (Criteria) this;
        }

        public Criteria orIncomeTypeIsNull() {
            orCriterion("income_type is null");
            return (Criteria) this;
        }

        public Criteria orIncomeTypeIsNotNull() {
            orCriterion("income_type is not null");
            return (Criteria) this;
        }

        public Criteria orIncomeTypeEqualTo(String value) {
            orCriterion("income_type =", value, "incomeType");
            return (Criteria) this;
        }

        public Criteria orIncomeTypeNotEqualTo(String value) {
            orCriterion("income_type <>", value, "incomeType");
            return (Criteria) this;
        }

        public Criteria orIncomeTypeGreaterThan(String value) {
            orCriterion("income_type >", value, "incomeType");
            return (Criteria) this;
        }

        public Criteria orIncomeTypeGreaterThanOrEqualTo(String value) {
            orCriterion("income_type >=", value, "incomeType");
            return (Criteria) this;
        }

        public Criteria orIncomeTypeLessThan(String value) {
            orCriterion("income_type <", value, "incomeType");
            return (Criteria) this;
        }

        public Criteria orIncomeTypeLessThanOrEqualTo(String value) {
            orCriterion("income_type <=", value, "incomeType");
            return (Criteria) this;
        }

        public Criteria andIncomeTypeLike(String value) {
            addCriterion("income_type like", value, "incomeType");
            return (Criteria) this;
        }

        public Criteria andIncomeTypeNotLike(String value) {
            addCriterion("income_type not like", value, "incomeType");
            return (Criteria) this;
        }

        public Criteria orIncomeTypeLike(String value) {
            orCriterion("income_type like", value, "incomeType");
            return (Criteria) this;
        }

        public Criteria orIncomeTypeNotLike(String value) {
            orCriterion("income_type not like", value, "incomeType");
            return (Criteria) this;
        }

        public Criteria andIncomeTypeIn(List<String> values) {
            addCriterion("income_type in", values, "incomeType");
            return (Criteria) this;
        }

        public Criteria andIncomeTypeNotIn(List<String> values) {
            addCriterion("income_type not in", values, "incomeType");
            return (Criteria) this;
        }

        public Criteria andIncomeTypeBetween(String value1, String value2) {
            addCriterion("income_type between", value1, value2, "incomeType");
            return (Criteria) this;
        }

        public Criteria andIncomeTypeNotBetween(String value1, String value2) {
            addCriterion("income_type not between", value1, value2, "incomeType");
            return (Criteria) this;
        }

        public Criteria orIncomeTypeIn(List<String> values) {
            orCriterion("income_type in", values, "incomeType");
            return (Criteria) this;
        }

        public Criteria orIncomeTypeNotIn(List<String> values) {
            orCriterion("income_type not in", values, "incomeType");
            return (Criteria) this;
        }

        public Criteria orIncomeTypeBetween(String value1, String value2) {
            orCriterion("income_type between", value1, value2, "incomeType");
            return (Criteria) this;
        }

        public Criteria orIncomeTypeNotBetween(String value1, String value2) {
            orCriterion("income_type not between", value1, value2, "incomeType");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria orTypeIsNull() {
            orCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria orTypeIsNotNull() {
            orCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria orTypeEqualTo(String value) {
            orCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria orTypeNotEqualTo(String value) {
            orCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria orTypeGreaterThan(String value) {
            orCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria orTypeGreaterThanOrEqualTo(String value) {
            orCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria orTypeLessThan(String value) {
            orCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria orTypeLessThanOrEqualTo(String value) {
            orCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria orTypeLike(String value) {
            orCriterion("type like", value, "type");
            return (Criteria) this;
        }

        public Criteria orTypeNotLike(String value) {
            orCriterion("type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria orTypeIn(List<String> values) {
            orCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria orTypeNotIn(List<String> values) {
            orCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria orTypeBetween(String value1, String value2) {
            orCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria orTypeNotBetween(String value1, String value2) {
            orCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andScaleIsNull() {
            addCriterion("scale is null");
            return (Criteria) this;
        }

        public Criteria andScaleIsNotNull() {
            addCriterion("scale is not null");
            return (Criteria) this;
        }

        public Criteria andScaleEqualTo(Double value) {
            addCriterion("scale =", value, "scale");
            return (Criteria) this;
        }

        public Criteria andScaleNotEqualTo(Double value) {
            addCriterion("scale <>", value, "scale");
            return (Criteria) this;
        }

        public Criteria andScaleGreaterThan(Double value) {
            addCriterion("scale >", value, "scale");
            return (Criteria) this;
        }

        public Criteria andScaleGreaterThanOrEqualTo(Double value) {
            addCriterion("scale >=", value, "scale");
            return (Criteria) this;
        }

        public Criteria andScaleLessThan(Double value) {
            addCriterion("scale <", value, "scale");
            return (Criteria) this;
        }

        public Criteria andScaleLessThanOrEqualTo(Double value) {
            addCriterion("scale <=", value, "scale");
            return (Criteria) this;
        }

        public Criteria orScaleIsNull() {
            orCriterion("scale is null");
            return (Criteria) this;
        }

        public Criteria orScaleIsNotNull() {
            orCriterion("scale is not null");
            return (Criteria) this;
        }

        public Criteria orScaleEqualTo(Double value) {
            orCriterion("scale =", value, "scale");
            return (Criteria) this;
        }

        public Criteria orScaleNotEqualTo(Double value) {
            orCriterion("scale <>", value, "scale");
            return (Criteria) this;
        }

        public Criteria orScaleGreaterThan(Double value) {
            orCriterion("scale >", value, "scale");
            return (Criteria) this;
        }

        public Criteria orScaleGreaterThanOrEqualTo(Double value) {
            orCriterion("scale >=", value, "scale");
            return (Criteria) this;
        }

        public Criteria orScaleLessThan(Double value) {
            orCriterion("scale <", value, "scale");
            return (Criteria) this;
        }

        public Criteria orScaleLessThanOrEqualTo(Double value) {
            orCriterion("scale <=", value, "scale");
            return (Criteria) this;
        }

        public Criteria andScaleIn(List<Double> values) {
            addCriterion("scale in", values, "scale");
            return (Criteria) this;
        }

        public Criteria andScaleNotIn(List<Double> values) {
            addCriterion("scale not in", values, "scale");
            return (Criteria) this;
        }

        public Criteria andScaleBetween(Double value1, Double value2) {
            addCriterion("scale between", value1, value2, "scale");
            return (Criteria) this;
        }

        public Criteria andScaleNotBetween(Double value1, Double value2) {
            addCriterion("scale not between", value1, value2, "scale");
            return (Criteria) this;
        }

        public Criteria orScaleIn(List<Double> values) {
            orCriterion("scale in", values, "scale");
            return (Criteria) this;
        }

        public Criteria orScaleNotIn(List<Double> values) {
            orCriterion("scale not in", values, "scale");
            return (Criteria) this;
        }

        public Criteria orScaleBetween(Double value1, Double value2) {
            orCriterion("scale between", value1, value2, "scale");
            return (Criteria) this;
        }

        public Criteria orScaleNotBetween(Double value1, Double value2) {
            orCriterion("scale not between", value1, value2, "scale");
            return (Criteria) this;
        }

        public Criteria andRecruitStartTimeIsNull() {
            addCriterion("recruit_start_time is null");
            return (Criteria) this;
        }

        public Criteria andRecruitStartTimeIsNotNull() {
            addCriterion("recruit_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andRecruitStartTimeEqualTo(Date value) {
            addCriterion("recruit_start_time =", value, "recruitStartTime");
            return (Criteria) this;
        }

        public Criteria andRecruitStartTimeNotEqualTo(Date value) {
            addCriterion("recruit_start_time <>", value, "recruitStartTime");
            return (Criteria) this;
        }

        public Criteria andRecruitStartTimeGreaterThan(Date value) {
            addCriterion("recruit_start_time >", value, "recruitStartTime");
            return (Criteria) this;
        }

        public Criteria andRecruitStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("recruit_start_time >=", value, "recruitStartTime");
            return (Criteria) this;
        }

        public Criteria andRecruitStartTimeLessThan(Date value) {
            addCriterion("recruit_start_time <", value, "recruitStartTime");
            return (Criteria) this;
        }

        public Criteria andRecruitStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("recruit_start_time <=", value, "recruitStartTime");
            return (Criteria) this;
        }

        public Criteria orRecruitStartTimeIsNull() {
            orCriterion("recruit_start_time is null");
            return (Criteria) this;
        }

        public Criteria orRecruitStartTimeIsNotNull() {
            orCriterion("recruit_start_time is not null");
            return (Criteria) this;
        }

        public Criteria orRecruitStartTimeEqualTo(Date value) {
            orCriterion("recruit_start_time =", value, "recruitStartTime");
            return (Criteria) this;
        }

        public Criteria orRecruitStartTimeNotEqualTo(Date value) {
            orCriterion("recruit_start_time <>", value, "recruitStartTime");
            return (Criteria) this;
        }

        public Criteria orRecruitStartTimeGreaterThan(Date value) {
            orCriterion("recruit_start_time >", value, "recruitStartTime");
            return (Criteria) this;
        }

        public Criteria orRecruitStartTimeGreaterThanOrEqualTo(Date value) {
            orCriterion("recruit_start_time >=", value, "recruitStartTime");
            return (Criteria) this;
        }

        public Criteria orRecruitStartTimeLessThan(Date value) {
            orCriterion("recruit_start_time <", value, "recruitStartTime");
            return (Criteria) this;
        }

        public Criteria orRecruitStartTimeLessThanOrEqualTo(Date value) {
            orCriterion("recruit_start_time <=", value, "recruitStartTime");
            return (Criteria) this;
        }

        public Criteria andRecruitStartTimeIn(List<Date> values) {
            addCriterion("recruit_start_time in", values, "recruitStartTime");
            return (Criteria) this;
        }

        public Criteria andRecruitStartTimeNotIn(List<Date> values) {
            addCriterion("recruit_start_time not in", values, "recruitStartTime");
            return (Criteria) this;
        }

        public Criteria andRecruitStartTimeBetween(Date value1, Date value2) {
            addCriterion("recruit_start_time between", value1, value2, "recruitStartTime");
            return (Criteria) this;
        }

        public Criteria andRecruitStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("recruit_start_time not between", value1, value2, "recruitStartTime");
            return (Criteria) this;
        }

        public Criteria orRecruitStartTimeIn(List<Date> values) {
            orCriterion("recruit_start_time in", values, "recruitStartTime");
            return (Criteria) this;
        }

        public Criteria orRecruitStartTimeNotIn(List<Date> values) {
            orCriterion("recruit_start_time not in", values, "recruitStartTime");
            return (Criteria) this;
        }

        public Criteria orRecruitStartTimeBetween(Date value1, Date value2) {
            orCriterion("recruit_start_time between", value1, value2, "recruitStartTime");
            return (Criteria) this;
        }

        public Criteria orRecruitStartTimeNotBetween(Date value1, Date value2) {
            orCriterion("recruit_start_time not between", value1, value2, "recruitStartTime");
            return (Criteria) this;
        }

        public Criteria andRecruitEndTimeIsNull() {
            addCriterion("recruit_end_time is null");
            return (Criteria) this;
        }

        public Criteria andRecruitEndTimeIsNotNull() {
            addCriterion("recruit_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andRecruitEndTimeEqualTo(Date value) {
            addCriterion("recruit_end_time =", value, "recruitEndTime");
            return (Criteria) this;
        }

        public Criteria andRecruitEndTimeNotEqualTo(Date value) {
            addCriterion("recruit_end_time <>", value, "recruitEndTime");
            return (Criteria) this;
        }

        public Criteria andRecruitEndTimeGreaterThan(Date value) {
            addCriterion("recruit_end_time >", value, "recruitEndTime");
            return (Criteria) this;
        }

        public Criteria andRecruitEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("recruit_end_time >=", value, "recruitEndTime");
            return (Criteria) this;
        }

        public Criteria andRecruitEndTimeLessThan(Date value) {
            addCriterion("recruit_end_time <", value, "recruitEndTime");
            return (Criteria) this;
        }

        public Criteria andRecruitEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("recruit_end_time <=", value, "recruitEndTime");
            return (Criteria) this;
        }

        public Criteria orRecruitEndTimeIsNull() {
            orCriterion("recruit_end_time is null");
            return (Criteria) this;
        }

        public Criteria orRecruitEndTimeIsNotNull() {
            orCriterion("recruit_end_time is not null");
            return (Criteria) this;
        }

        public Criteria orRecruitEndTimeEqualTo(Date value) {
            orCriterion("recruit_end_time =", value, "recruitEndTime");
            return (Criteria) this;
        }

        public Criteria orRecruitEndTimeNotEqualTo(Date value) {
            orCriterion("recruit_end_time <>", value, "recruitEndTime");
            return (Criteria) this;
        }

        public Criteria orRecruitEndTimeGreaterThan(Date value) {
            orCriterion("recruit_end_time >", value, "recruitEndTime");
            return (Criteria) this;
        }

        public Criteria orRecruitEndTimeGreaterThanOrEqualTo(Date value) {
            orCriterion("recruit_end_time >=", value, "recruitEndTime");
            return (Criteria) this;
        }

        public Criteria orRecruitEndTimeLessThan(Date value) {
            orCriterion("recruit_end_time <", value, "recruitEndTime");
            return (Criteria) this;
        }

        public Criteria orRecruitEndTimeLessThanOrEqualTo(Date value) {
            orCriterion("recruit_end_time <=", value, "recruitEndTime");
            return (Criteria) this;
        }

        public Criteria andRecruitEndTimeIn(List<Date> values) {
            addCriterion("recruit_end_time in", values, "recruitEndTime");
            return (Criteria) this;
        }

        public Criteria andRecruitEndTimeNotIn(List<Date> values) {
            addCriterion("recruit_end_time not in", values, "recruitEndTime");
            return (Criteria) this;
        }

        public Criteria andRecruitEndTimeBetween(Date value1, Date value2) {
            addCriterion("recruit_end_time between", value1, value2, "recruitEndTime");
            return (Criteria) this;
        }

        public Criteria andRecruitEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("recruit_end_time not between", value1, value2, "recruitEndTime");
            return (Criteria) this;
        }

        public Criteria orRecruitEndTimeIn(List<Date> values) {
            orCriterion("recruit_end_time in", values, "recruitEndTime");
            return (Criteria) this;
        }

        public Criteria orRecruitEndTimeNotIn(List<Date> values) {
            orCriterion("recruit_end_time not in", values, "recruitEndTime");
            return (Criteria) this;
        }

        public Criteria orRecruitEndTimeBetween(Date value1, Date value2) {
            orCriterion("recruit_end_time between", value1, value2, "recruitEndTime");
            return (Criteria) this;
        }

        public Criteria orRecruitEndTimeNotBetween(Date value1, Date value2) {
            orCriterion("recruit_end_time not between", value1, value2, "recruitEndTime");
            return (Criteria) this;
        }

        public Criteria andFundRaisingIsNull() {
            addCriterion("fund_raising is null");
            return (Criteria) this;
        }

        public Criteria andFundRaisingIsNotNull() {
            addCriterion("fund_raising is not null");
            return (Criteria) this;
        }

        public Criteria andFundRaisingEqualTo(String value) {
            addCriterion("fund_raising =", value, "fundRaising");
            return (Criteria) this;
        }

        public Criteria andFundRaisingNotEqualTo(String value) {
            addCriterion("fund_raising <>", value, "fundRaising");
            return (Criteria) this;
        }

        public Criteria andFundRaisingGreaterThan(String value) {
            addCriterion("fund_raising >", value, "fundRaising");
            return (Criteria) this;
        }

        public Criteria andFundRaisingGreaterThanOrEqualTo(String value) {
            addCriterion("fund_raising >=", value, "fundRaising");
            return (Criteria) this;
        }

        public Criteria andFundRaisingLessThan(String value) {
            addCriterion("fund_raising <", value, "fundRaising");
            return (Criteria) this;
        }

        public Criteria andFundRaisingLessThanOrEqualTo(String value) {
            addCriterion("fund_raising <=", value, "fundRaising");
            return (Criteria) this;
        }

        public Criteria orFundRaisingIsNull() {
            orCriterion("fund_raising is null");
            return (Criteria) this;
        }

        public Criteria orFundRaisingIsNotNull() {
            orCriterion("fund_raising is not null");
            return (Criteria) this;
        }

        public Criteria orFundRaisingEqualTo(String value) {
            orCriterion("fund_raising =", value, "fundRaising");
            return (Criteria) this;
        }

        public Criteria orFundRaisingNotEqualTo(String value) {
            orCriterion("fund_raising <>", value, "fundRaising");
            return (Criteria) this;
        }

        public Criteria orFundRaisingGreaterThan(String value) {
            orCriterion("fund_raising >", value, "fundRaising");
            return (Criteria) this;
        }

        public Criteria orFundRaisingGreaterThanOrEqualTo(String value) {
            orCriterion("fund_raising >=", value, "fundRaising");
            return (Criteria) this;
        }

        public Criteria orFundRaisingLessThan(String value) {
            orCriterion("fund_raising <", value, "fundRaising");
            return (Criteria) this;
        }

        public Criteria orFundRaisingLessThanOrEqualTo(String value) {
            orCriterion("fund_raising <=", value, "fundRaising");
            return (Criteria) this;
        }

        public Criteria andFundRaisingLike(String value) {
            addCriterion("fund_raising like", value, "fundRaising");
            return (Criteria) this;
        }

        public Criteria andFundRaisingNotLike(String value) {
            addCriterion("fund_raising not like", value, "fundRaising");
            return (Criteria) this;
        }

        public Criteria orFundRaisingLike(String value) {
            orCriterion("fund_raising like", value, "fundRaising");
            return (Criteria) this;
        }

        public Criteria orFundRaisingNotLike(String value) {
            orCriterion("fund_raising not like", value, "fundRaising");
            return (Criteria) this;
        }

        public Criteria andFundRaisingIn(List<String> values) {
            addCriterion("fund_raising in", values, "fundRaising");
            return (Criteria) this;
        }

        public Criteria andFundRaisingNotIn(List<String> values) {
            addCriterion("fund_raising not in", values, "fundRaising");
            return (Criteria) this;
        }

        public Criteria andFundRaisingBetween(String value1, String value2) {
            addCriterion("fund_raising between", value1, value2, "fundRaising");
            return (Criteria) this;
        }

        public Criteria andFundRaisingNotBetween(String value1, String value2) {
            addCriterion("fund_raising not between", value1, value2, "fundRaising");
            return (Criteria) this;
        }

        public Criteria orFundRaisingIn(List<String> values) {
            orCriterion("fund_raising in", values, "fundRaising");
            return (Criteria) this;
        }

        public Criteria orFundRaisingNotIn(List<String> values) {
            orCriterion("fund_raising not in", values, "fundRaising");
            return (Criteria) this;
        }

        public Criteria orFundRaisingBetween(String value1, String value2) {
            orCriterion("fund_raising between", value1, value2, "fundRaising");
            return (Criteria) this;
        }

        public Criteria orFundRaisingNotBetween(String value1, String value2) {
            orCriterion("fund_raising not between", value1, value2, "fundRaising");
            return (Criteria) this;
        }

        public Criteria andDurationIsNull() {
            addCriterion("duration is null");
            return (Criteria) this;
        }

        public Criteria andDurationIsNotNull() {
            addCriterion("duration is not null");
            return (Criteria) this;
        }

        public Criteria andDurationEqualTo(Integer value) {
            addCriterion("duration =", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationNotEqualTo(Integer value) {
            addCriterion("duration <>", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationGreaterThan(Integer value) {
            addCriterion("duration >", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationGreaterThanOrEqualTo(Integer value) {
            addCriterion("duration >=", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationLessThan(Integer value) {
            addCriterion("duration <", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationLessThanOrEqualTo(Integer value) {
            addCriterion("duration <=", value, "duration");
            return (Criteria) this;
        }

        public Criteria orDurationIsNull() {
            orCriterion("duration is null");
            return (Criteria) this;
        }

        public Criteria orDurationIsNotNull() {
            orCriterion("duration is not null");
            return (Criteria) this;
        }

        public Criteria orDurationEqualTo(Integer value) {
            orCriterion("duration =", value, "duration");
            return (Criteria) this;
        }

        public Criteria orDurationNotEqualTo(Integer value) {
            orCriterion("duration <>", value, "duration");
            return (Criteria) this;
        }

        public Criteria orDurationGreaterThan(Integer value) {
            orCriterion("duration >", value, "duration");
            return (Criteria) this;
        }

        public Criteria orDurationGreaterThanOrEqualTo(Integer value) {
            orCriterion("duration >=", value, "duration");
            return (Criteria) this;
        }

        public Criteria orDurationLessThan(Integer value) {
            orCriterion("duration <", value, "duration");
            return (Criteria) this;
        }

        public Criteria orDurationLessThanOrEqualTo(Integer value) {
            orCriterion("duration <=", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationIn(List<Integer> values) {
            addCriterion("duration in", values, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationNotIn(List<Integer> values) {
            addCriterion("duration not in", values, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationBetween(Integer value1, Integer value2) {
            addCriterion("duration between", value1, value2, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationNotBetween(Integer value1, Integer value2) {
            addCriterion("duration not between", value1, value2, "duration");
            return (Criteria) this;
        }

        public Criteria orDurationIn(List<Integer> values) {
            orCriterion("duration in", values, "duration");
            return (Criteria) this;
        }

        public Criteria orDurationNotIn(List<Integer> values) {
            orCriterion("duration not in", values, "duration");
            return (Criteria) this;
        }

        public Criteria orDurationBetween(Integer value1, Integer value2) {
            orCriterion("duration between", value1, value2, "duration");
            return (Criteria) this;
        }

        public Criteria orDurationNotBetween(Integer value1, Integer value2) {
            orCriterion("duration not between", value1, value2, "duration");
            return (Criteria) this;
        }

        public Criteria andUnderWriterIsNull() {
            addCriterion("under_writer is null");
            return (Criteria) this;
        }

        public Criteria andUnderWriterIsNotNull() {
            addCriterion("under_writer is not null");
            return (Criteria) this;
        }

        public Criteria andUnderWriterEqualTo(String value) {
            addCriterion("under_writer =", value, "underWriter");
            return (Criteria) this;
        }

        public Criteria andUnderWriterNotEqualTo(String value) {
            addCriterion("under_writer <>", value, "underWriter");
            return (Criteria) this;
        }

        public Criteria andUnderWriterGreaterThan(String value) {
            addCriterion("under_writer >", value, "underWriter");
            return (Criteria) this;
        }

        public Criteria andUnderWriterGreaterThanOrEqualTo(String value) {
            addCriterion("under_writer >=", value, "underWriter");
            return (Criteria) this;
        }

        public Criteria andUnderWriterLessThan(String value) {
            addCriterion("under_writer <", value, "underWriter");
            return (Criteria) this;
        }

        public Criteria andUnderWriterLessThanOrEqualTo(String value) {
            addCriterion("under_writer <=", value, "underWriter");
            return (Criteria) this;
        }

        public Criteria orUnderWriterIsNull() {
            orCriterion("under_writer is null");
            return (Criteria) this;
        }

        public Criteria orUnderWriterIsNotNull() {
            orCriterion("under_writer is not null");
            return (Criteria) this;
        }

        public Criteria orUnderWriterEqualTo(String value) {
            orCriterion("under_writer =", value, "underWriter");
            return (Criteria) this;
        }

        public Criteria orUnderWriterNotEqualTo(String value) {
            orCriterion("under_writer <>", value, "underWriter");
            return (Criteria) this;
        }

        public Criteria orUnderWriterGreaterThan(String value) {
            orCriterion("under_writer >", value, "underWriter");
            return (Criteria) this;
        }

        public Criteria orUnderWriterGreaterThanOrEqualTo(String value) {
            orCriterion("under_writer >=", value, "underWriter");
            return (Criteria) this;
        }

        public Criteria orUnderWriterLessThan(String value) {
            orCriterion("under_writer <", value, "underWriter");
            return (Criteria) this;
        }

        public Criteria orUnderWriterLessThanOrEqualTo(String value) {
            orCriterion("under_writer <=", value, "underWriter");
            return (Criteria) this;
        }

        public Criteria andUnderWriterLike(String value) {
            addCriterion("under_writer like", value, "underWriter");
            return (Criteria) this;
        }

        public Criteria andUnderWriterNotLike(String value) {
            addCriterion("under_writer not like", value, "underWriter");
            return (Criteria) this;
        }

        public Criteria orUnderWriterLike(String value) {
            orCriterion("under_writer like", value, "underWriter");
            return (Criteria) this;
        }

        public Criteria orUnderWriterNotLike(String value) {
            orCriterion("under_writer not like", value, "underWriter");
            return (Criteria) this;
        }

        public Criteria andUnderWriterIn(List<String> values) {
            addCriterion("under_writer in", values, "underWriter");
            return (Criteria) this;
        }

        public Criteria andUnderWriterNotIn(List<String> values) {
            addCriterion("under_writer not in", values, "underWriter");
            return (Criteria) this;
        }

        public Criteria andUnderWriterBetween(String value1, String value2) {
            addCriterion("under_writer between", value1, value2, "underWriter");
            return (Criteria) this;
        }

        public Criteria andUnderWriterNotBetween(String value1, String value2) {
            addCriterion("under_writer not between", value1, value2, "underWriter");
            return (Criteria) this;
        }

        public Criteria orUnderWriterIn(List<String> values) {
            orCriterion("under_writer in", values, "underWriter");
            return (Criteria) this;
        }

        public Criteria orUnderWriterNotIn(List<String> values) {
            orCriterion("under_writer not in", values, "underWriter");
            return (Criteria) this;
        }

        public Criteria orUnderWriterBetween(String value1, String value2) {
            orCriterion("under_writer between", value1, value2, "underWriter");
            return (Criteria) this;
        }

        public Criteria orUnderWriterNotBetween(String value1, String value2) {
            orCriterion("under_writer not between", value1, value2, "underWriter");
            return (Criteria) this;
        }

        public Criteria andInvestLimitIsNull() {
            addCriterion("invest_limit is null");
            return (Criteria) this;
        }

        public Criteria andInvestLimitIsNotNull() {
            addCriterion("invest_limit is not null");
            return (Criteria) this;
        }

        public Criteria andInvestLimitEqualTo(String value) {
            addCriterion("invest_limit =", value, "investLimit");
            return (Criteria) this;
        }

        public Criteria andInvestLimitNotEqualTo(String value) {
            addCriterion("invest_limit <>", value, "investLimit");
            return (Criteria) this;
        }

        public Criteria andInvestLimitGreaterThan(String value) {
            addCriterion("invest_limit >", value, "investLimit");
            return (Criteria) this;
        }

        public Criteria andInvestLimitGreaterThanOrEqualTo(String value) {
            addCriterion("invest_limit >=", value, "investLimit");
            return (Criteria) this;
        }

        public Criteria andInvestLimitLessThan(String value) {
            addCriterion("invest_limit <", value, "investLimit");
            return (Criteria) this;
        }

        public Criteria andInvestLimitLessThanOrEqualTo(String value) {
            addCriterion("invest_limit <=", value, "investLimit");
            return (Criteria) this;
        }

        public Criteria orInvestLimitIsNull() {
            orCriterion("invest_limit is null");
            return (Criteria) this;
        }

        public Criteria orInvestLimitIsNotNull() {
            orCriterion("invest_limit is not null");
            return (Criteria) this;
        }

        public Criteria orInvestLimitEqualTo(String value) {
            orCriterion("invest_limit =", value, "investLimit");
            return (Criteria) this;
        }

        public Criteria orInvestLimitNotEqualTo(String value) {
            orCriterion("invest_limit <>", value, "investLimit");
            return (Criteria) this;
        }

        public Criteria orInvestLimitGreaterThan(String value) {
            orCriterion("invest_limit >", value, "investLimit");
            return (Criteria) this;
        }

        public Criteria orInvestLimitGreaterThanOrEqualTo(String value) {
            orCriterion("invest_limit >=", value, "investLimit");
            return (Criteria) this;
        }

        public Criteria orInvestLimitLessThan(String value) {
            orCriterion("invest_limit <", value, "investLimit");
            return (Criteria) this;
        }

        public Criteria orInvestLimitLessThanOrEqualTo(String value) {
            orCriterion("invest_limit <=", value, "investLimit");
            return (Criteria) this;
        }

        public Criteria andInvestLimitLike(String value) {
            addCriterion("invest_limit like", value, "investLimit");
            return (Criteria) this;
        }

        public Criteria andInvestLimitNotLike(String value) {
            addCriterion("invest_limit not like", value, "investLimit");
            return (Criteria) this;
        }

        public Criteria orInvestLimitLike(String value) {
            orCriterion("invest_limit like", value, "investLimit");
            return (Criteria) this;
        }

        public Criteria orInvestLimitNotLike(String value) {
            orCriterion("invest_limit not like", value, "investLimit");
            return (Criteria) this;
        }

        public Criteria andInvestLimitIn(List<String> values) {
            addCriterion("invest_limit in", values, "investLimit");
            return (Criteria) this;
        }

        public Criteria andInvestLimitNotIn(List<String> values) {
            addCriterion("invest_limit not in", values, "investLimit");
            return (Criteria) this;
        }

        public Criteria andInvestLimitBetween(String value1, String value2) {
            addCriterion("invest_limit between", value1, value2, "investLimit");
            return (Criteria) this;
        }

        public Criteria andInvestLimitNotBetween(String value1, String value2) {
            addCriterion("invest_limit not between", value1, value2, "investLimit");
            return (Criteria) this;
        }

        public Criteria orInvestLimitIn(List<String> values) {
            orCriterion("invest_limit in", values, "investLimit");
            return (Criteria) this;
        }

        public Criteria orInvestLimitNotIn(List<String> values) {
            orCriterion("invest_limit not in", values, "investLimit");
            return (Criteria) this;
        }

        public Criteria orInvestLimitBetween(String value1, String value2) {
            orCriterion("invest_limit between", value1, value2, "investLimit");
            return (Criteria) this;
        }

        public Criteria orInvestLimitNotBetween(String value1, String value2) {
            orCriterion("invest_limit not between", value1, value2, "investLimit");
            return (Criteria) this;
        }

        public Criteria andProspectiveEarningsIsNull() {
            addCriterion("prospective_earnings is null");
            return (Criteria) this;
        }

        public Criteria andProspectiveEarningsIsNotNull() {
            addCriterion("prospective_earnings is not null");
            return (Criteria) this;
        }

        public Criteria andProspectiveEarningsEqualTo(String value) {
            addCriterion("prospective_earnings =", value, "prospectiveEarnings");
            return (Criteria) this;
        }

        public Criteria andProspectiveEarningsNotEqualTo(String value) {
            addCriterion("prospective_earnings <>", value, "prospectiveEarnings");
            return (Criteria) this;
        }

        public Criteria andProspectiveEarningsGreaterThan(String value) {
            addCriterion("prospective_earnings >", value, "prospectiveEarnings");
            return (Criteria) this;
        }

        public Criteria andProspectiveEarningsGreaterThanOrEqualTo(String value) {
            addCriterion("prospective_earnings >=", value, "prospectiveEarnings");
            return (Criteria) this;
        }

        public Criteria andProspectiveEarningsLessThan(String value) {
            addCriterion("prospective_earnings <", value, "prospectiveEarnings");
            return (Criteria) this;
        }

        public Criteria andProspectiveEarningsLessThanOrEqualTo(String value) {
            addCriterion("prospective_earnings <=", value, "prospectiveEarnings");
            return (Criteria) this;
        }

        public Criteria orProspectiveEarningsIsNull() {
            orCriterion("prospective_earnings is null");
            return (Criteria) this;
        }

        public Criteria orProspectiveEarningsIsNotNull() {
            orCriterion("prospective_earnings is not null");
            return (Criteria) this;
        }

        public Criteria orProspectiveEarningsEqualTo(String value) {
            orCriterion("prospective_earnings =", value, "prospectiveEarnings");
            return (Criteria) this;
        }

        public Criteria orProspectiveEarningsNotEqualTo(String value) {
            orCriterion("prospective_earnings <>", value, "prospectiveEarnings");
            return (Criteria) this;
        }

        public Criteria orProspectiveEarningsGreaterThan(String value) {
            orCriterion("prospective_earnings >", value, "prospectiveEarnings");
            return (Criteria) this;
        }

        public Criteria orProspectiveEarningsGreaterThanOrEqualTo(String value) {
            orCriterion("prospective_earnings >=", value, "prospectiveEarnings");
            return (Criteria) this;
        }

        public Criteria orProspectiveEarningsLessThan(String value) {
            orCriterion("prospective_earnings <", value, "prospectiveEarnings");
            return (Criteria) this;
        }

        public Criteria orProspectiveEarningsLessThanOrEqualTo(String value) {
            orCriterion("prospective_earnings <=", value, "prospectiveEarnings");
            return (Criteria) this;
        }

        public Criteria andProspectiveEarningsLike(String value) {
            addCriterion("prospective_earnings like", value, "prospectiveEarnings");
            return (Criteria) this;
        }

        public Criteria andProspectiveEarningsNotLike(String value) {
            addCriterion("prospective_earnings not like", value, "prospectiveEarnings");
            return (Criteria) this;
        }

        public Criteria orProspectiveEarningsLike(String value) {
            orCriterion("prospective_earnings like", value, "prospectiveEarnings");
            return (Criteria) this;
        }

        public Criteria orProspectiveEarningsNotLike(String value) {
            orCriterion("prospective_earnings not like", value, "prospectiveEarnings");
            return (Criteria) this;
        }

        public Criteria andProspectiveEarningsIn(List<String> values) {
            addCriterion("prospective_earnings in", values, "prospectiveEarnings");
            return (Criteria) this;
        }

        public Criteria andProspectiveEarningsNotIn(List<String> values) {
            addCriterion("prospective_earnings not in", values, "prospectiveEarnings");
            return (Criteria) this;
        }

        public Criteria andProspectiveEarningsBetween(String value1, String value2) {
            addCriterion("prospective_earnings between", value1, value2, "prospectiveEarnings");
            return (Criteria) this;
        }

        public Criteria andProspectiveEarningsNotBetween(String value1, String value2) {
            addCriterion("prospective_earnings not between", value1, value2, "prospectiveEarnings");
            return (Criteria) this;
        }

        public Criteria orProspectiveEarningsIn(List<String> values) {
            orCriterion("prospective_earnings in", values, "prospectiveEarnings");
            return (Criteria) this;
        }

        public Criteria orProspectiveEarningsNotIn(List<String> values) {
            orCriterion("prospective_earnings not in", values, "prospectiveEarnings");
            return (Criteria) this;
        }

        public Criteria orProspectiveEarningsBetween(String value1, String value2) {
            orCriterion("prospective_earnings between", value1, value2, "prospectiveEarnings");
            return (Criteria) this;
        }

        public Criteria orProspectiveEarningsNotBetween(String value1, String value2) {
            orCriterion("prospective_earnings not between", value1, value2, "prospectiveEarnings");
            return (Criteria) this;
        }

        public Criteria andFundInvestIsNull() {
            addCriterion("fund_invest is null");
            return (Criteria) this;
        }

        public Criteria andFundInvestIsNotNull() {
            addCriterion("fund_invest is not null");
            return (Criteria) this;
        }

        public Criteria andFundInvestEqualTo(String value) {
            addCriterion("fund_invest =", value, "fundInvest");
            return (Criteria) this;
        }

        public Criteria andFundInvestNotEqualTo(String value) {
            addCriterion("fund_invest <>", value, "fundInvest");
            return (Criteria) this;
        }

        public Criteria andFundInvestGreaterThan(String value) {
            addCriterion("fund_invest >", value, "fundInvest");
            return (Criteria) this;
        }

        public Criteria andFundInvestGreaterThanOrEqualTo(String value) {
            addCriterion("fund_invest >=", value, "fundInvest");
            return (Criteria) this;
        }

        public Criteria andFundInvestLessThan(String value) {
            addCriterion("fund_invest <", value, "fundInvest");
            return (Criteria) this;
        }

        public Criteria andFundInvestLessThanOrEqualTo(String value) {
            addCriterion("fund_invest <=", value, "fundInvest");
            return (Criteria) this;
        }

        public Criteria orFundInvestIsNull() {
            orCriterion("fund_invest is null");
            return (Criteria) this;
        }

        public Criteria orFundInvestIsNotNull() {
            orCriterion("fund_invest is not null");
            return (Criteria) this;
        }

        public Criteria orFundInvestEqualTo(String value) {
            orCriterion("fund_invest =", value, "fundInvest");
            return (Criteria) this;
        }

        public Criteria orFundInvestNotEqualTo(String value) {
            orCriterion("fund_invest <>", value, "fundInvest");
            return (Criteria) this;
        }

        public Criteria orFundInvestGreaterThan(String value) {
            orCriterion("fund_invest >", value, "fundInvest");
            return (Criteria) this;
        }

        public Criteria orFundInvestGreaterThanOrEqualTo(String value) {
            orCriterion("fund_invest >=", value, "fundInvest");
            return (Criteria) this;
        }

        public Criteria orFundInvestLessThan(String value) {
            orCriterion("fund_invest <", value, "fundInvest");
            return (Criteria) this;
        }

        public Criteria orFundInvestLessThanOrEqualTo(String value) {
            orCriterion("fund_invest <=", value, "fundInvest");
            return (Criteria) this;
        }

        public Criteria andFundInvestLike(String value) {
            addCriterion("fund_invest like", value, "fundInvest");
            return (Criteria) this;
        }

        public Criteria andFundInvestNotLike(String value) {
            addCriterion("fund_invest not like", value, "fundInvest");
            return (Criteria) this;
        }

        public Criteria orFundInvestLike(String value) {
            orCriterion("fund_invest like", value, "fundInvest");
            return (Criteria) this;
        }

        public Criteria orFundInvestNotLike(String value) {
            orCriterion("fund_invest not like", value, "fundInvest");
            return (Criteria) this;
        }

        public Criteria andFundInvestIn(List<String> values) {
            addCriterion("fund_invest in", values, "fundInvest");
            return (Criteria) this;
        }

        public Criteria andFundInvestNotIn(List<String> values) {
            addCriterion("fund_invest not in", values, "fundInvest");
            return (Criteria) this;
        }

        public Criteria andFundInvestBetween(String value1, String value2) {
            addCriterion("fund_invest between", value1, value2, "fundInvest");
            return (Criteria) this;
        }

        public Criteria andFundInvestNotBetween(String value1, String value2) {
            addCriterion("fund_invest not between", value1, value2, "fundInvest");
            return (Criteria) this;
        }

        public Criteria orFundInvestIn(List<String> values) {
            orCriterion("fund_invest in", values, "fundInvest");
            return (Criteria) this;
        }

        public Criteria orFundInvestNotIn(List<String> values) {
            orCriterion("fund_invest not in", values, "fundInvest");
            return (Criteria) this;
        }

        public Criteria orFundInvestBetween(String value1, String value2) {
            orCriterion("fund_invest between", value1, value2, "fundInvest");
            return (Criteria) this;
        }

        public Criteria orFundInvestNotBetween(String value1, String value2) {
            orCriterion("fund_invest not between", value1, value2, "fundInvest");
            return (Criteria) this;
        }

        public Criteria andDefaultCommissionSetIsNull() {
            addCriterion("default_commission_set is null");
            return (Criteria) this;
        }

        public Criteria andDefaultCommissionSetIsNotNull() {
            addCriterion("default_commission_set is not null");
            return (Criteria) this;
        }

        public Criteria andDefaultCommissionSetEqualTo(Boolean value) {
            addCriterion("default_commission_set =", value, "defaultCommissionSet");
            return (Criteria) this;
        }

        public Criteria andDefaultCommissionSetNotEqualTo(Boolean value) {
            addCriterion("default_commission_set <>", value, "defaultCommissionSet");
            return (Criteria) this;
        }

        public Criteria andDefaultCommissionSetGreaterThan(Boolean value) {
            addCriterion("default_commission_set >", value, "defaultCommissionSet");
            return (Criteria) this;
        }

        public Criteria andDefaultCommissionSetGreaterThanOrEqualTo(Boolean value) {
            addCriterion("default_commission_set >=", value, "defaultCommissionSet");
            return (Criteria) this;
        }

        public Criteria andDefaultCommissionSetLessThan(Boolean value) {
            addCriterion("default_commission_set <", value, "defaultCommissionSet");
            return (Criteria) this;
        }

        public Criteria andDefaultCommissionSetLessThanOrEqualTo(Boolean value) {
            addCriterion("default_commission_set <=", value, "defaultCommissionSet");
            return (Criteria) this;
        }

        public Criteria orDefaultCommissionSetIsNull() {
            orCriterion("default_commission_set is null");
            return (Criteria) this;
        }

        public Criteria orDefaultCommissionSetIsNotNull() {
            orCriterion("default_commission_set is not null");
            return (Criteria) this;
        }

        public Criteria orDefaultCommissionSetEqualTo(Boolean value) {
            orCriterion("default_commission_set =", value, "defaultCommissionSet");
            return (Criteria) this;
        }

        public Criteria orDefaultCommissionSetNotEqualTo(Boolean value) {
            orCriterion("default_commission_set <>", value, "defaultCommissionSet");
            return (Criteria) this;
        }

        public Criteria orDefaultCommissionSetGreaterThan(Boolean value) {
            orCriterion("default_commission_set >", value, "defaultCommissionSet");
            return (Criteria) this;
        }

        public Criteria orDefaultCommissionSetGreaterThanOrEqualTo(Boolean value) {
            orCriterion("default_commission_set >=", value, "defaultCommissionSet");
            return (Criteria) this;
        }

        public Criteria orDefaultCommissionSetLessThan(Boolean value) {
            orCriterion("default_commission_set <", value, "defaultCommissionSet");
            return (Criteria) this;
        }

        public Criteria orDefaultCommissionSetLessThanOrEqualTo(Boolean value) {
            orCriterion("default_commission_set <=", value, "defaultCommissionSet");
            return (Criteria) this;
        }

        public Criteria andDefaultCommissionSetIn(List<Boolean> values) {
            addCriterion("default_commission_set in", values, "defaultCommissionSet");
            return (Criteria) this;
        }

        public Criteria andDefaultCommissionSetNotIn(List<Boolean> values) {
            addCriterion("default_commission_set not in", values, "defaultCommissionSet");
            return (Criteria) this;
        }

        public Criteria andDefaultCommissionSetBetween(Boolean value1, Boolean value2) {
            addCriterion("default_commission_set between", value1, value2, "defaultCommissionSet");
            return (Criteria) this;
        }

        public Criteria andDefaultCommissionSetNotBetween(Boolean value1, Boolean value2) {
            addCriterion("default_commission_set not between", value1, value2, "defaultCommissionSet");
            return (Criteria) this;
        }

        public Criteria orDefaultCommissionSetIn(List<Boolean> values) {
            orCriterion("default_commission_set in", values, "defaultCommissionSet");
            return (Criteria) this;
        }

        public Criteria orDefaultCommissionSetNotIn(List<Boolean> values) {
            orCriterion("default_commission_set not in", values, "defaultCommissionSet");
            return (Criteria) this;
        }

        public Criteria orDefaultCommissionSetBetween(Boolean value1, Boolean value2) {
            orCriterion("default_commission_set between", value1, value2, "defaultCommissionSet");
            return (Criteria) this;
        }

        public Criteria orDefaultCommissionSetNotBetween(Boolean value1, Boolean value2) {
            orCriterion("default_commission_set not between", value1, value2, "defaultCommissionSet");
            return (Criteria) this;
        }

        public Criteria andDefaultDividendIsNull() {
            addCriterion("default_dividend is null");
            return (Criteria) this;
        }

        public Criteria andDefaultDividendIsNotNull() {
            addCriterion("default_dividend is not null");
            return (Criteria) this;
        }

        public Criteria andDefaultDividendEqualTo(Double value) {
            addCriterion("default_dividend =", value, "defaultDividend");
            return (Criteria) this;
        }

        public Criteria andDefaultDividendNotEqualTo(Double value) {
            addCriterion("default_dividend <>", value, "defaultDividend");
            return (Criteria) this;
        }

        public Criteria andDefaultDividendGreaterThan(Double value) {
            addCriterion("default_dividend >", value, "defaultDividend");
            return (Criteria) this;
        }

        public Criteria andDefaultDividendGreaterThanOrEqualTo(Double value) {
            addCriterion("default_dividend >=", value, "defaultDividend");
            return (Criteria) this;
        }

        public Criteria andDefaultDividendLessThan(Double value) {
            addCriterion("default_dividend <", value, "defaultDividend");
            return (Criteria) this;
        }

        public Criteria andDefaultDividendLessThanOrEqualTo(Double value) {
            addCriterion("default_dividend <=", value, "defaultDividend");
            return (Criteria) this;
        }

        public Criteria orDefaultDividendIsNull() {
            orCriterion("default_dividend is null");
            return (Criteria) this;
        }

        public Criteria orDefaultDividendIsNotNull() {
            orCriterion("default_dividend is not null");
            return (Criteria) this;
        }

        public Criteria orDefaultDividendEqualTo(Double value) {
            orCriterion("default_dividend =", value, "defaultDividend");
            return (Criteria) this;
        }

        public Criteria orDefaultDividendNotEqualTo(Double value) {
            orCriterion("default_dividend <>", value, "defaultDividend");
            return (Criteria) this;
        }

        public Criteria orDefaultDividendGreaterThan(Double value) {
            orCriterion("default_dividend >", value, "defaultDividend");
            return (Criteria) this;
        }

        public Criteria orDefaultDividendGreaterThanOrEqualTo(Double value) {
            orCriterion("default_dividend >=", value, "defaultDividend");
            return (Criteria) this;
        }

        public Criteria orDefaultDividendLessThan(Double value) {
            orCriterion("default_dividend <", value, "defaultDividend");
            return (Criteria) this;
        }

        public Criteria orDefaultDividendLessThanOrEqualTo(Double value) {
            orCriterion("default_dividend <=", value, "defaultDividend");
            return (Criteria) this;
        }

        public Criteria andDefaultDividendIn(List<Double> values) {
            addCriterion("default_dividend in", values, "defaultDividend");
            return (Criteria) this;
        }

        public Criteria andDefaultDividendNotIn(List<Double> values) {
            addCriterion("default_dividend not in", values, "defaultDividend");
            return (Criteria) this;
        }

        public Criteria andDefaultDividendBetween(Double value1, Double value2) {
            addCriterion("default_dividend between", value1, value2, "defaultDividend");
            return (Criteria) this;
        }

        public Criteria andDefaultDividendNotBetween(Double value1, Double value2) {
            addCriterion("default_dividend not between", value1, value2, "defaultDividend");
            return (Criteria) this;
        }

        public Criteria orDefaultDividendIn(List<Double> values) {
            orCriterion("default_dividend in", values, "defaultDividend");
            return (Criteria) this;
        }

        public Criteria orDefaultDividendNotIn(List<Double> values) {
            orCriterion("default_dividend not in", values, "defaultDividend");
            return (Criteria) this;
        }

        public Criteria orDefaultDividendBetween(Double value1, Double value2) {
            orCriterion("default_dividend between", value1, value2, "defaultDividend");
            return (Criteria) this;
        }

        public Criteria orDefaultDividendNotBetween(Double value1, Double value2) {
            orCriterion("default_dividend not between", value1, value2, "defaultDividend");
            return (Criteria) this;
        }

        public Criteria andDefaultCommissionIsNull() {
            addCriterion("default_commission is null");
            return (Criteria) this;
        }

        public Criteria andDefaultCommissionIsNotNull() {
            addCriterion("default_commission is not null");
            return (Criteria) this;
        }

        public Criteria andDefaultCommissionEqualTo(Double value) {
            addCriterion("default_commission =", value, "defaultCommission");
            return (Criteria) this;
        }

        public Criteria andDefaultCommissionNotEqualTo(Double value) {
            addCriterion("default_commission <>", value, "defaultCommission");
            return (Criteria) this;
        }

        public Criteria andDefaultCommissionGreaterThan(Double value) {
            addCriterion("default_commission >", value, "defaultCommission");
            return (Criteria) this;
        }

        public Criteria andDefaultCommissionGreaterThanOrEqualTo(Double value) {
            addCriterion("default_commission >=", value, "defaultCommission");
            return (Criteria) this;
        }

        public Criteria andDefaultCommissionLessThan(Double value) {
            addCriterion("default_commission <", value, "defaultCommission");
            return (Criteria) this;
        }

        public Criteria andDefaultCommissionLessThanOrEqualTo(Double value) {
            addCriterion("default_commission <=", value, "defaultCommission");
            return (Criteria) this;
        }

        public Criteria orDefaultCommissionIsNull() {
            orCriterion("default_commission is null");
            return (Criteria) this;
        }

        public Criteria orDefaultCommissionIsNotNull() {
            orCriterion("default_commission is not null");
            return (Criteria) this;
        }

        public Criteria orDefaultCommissionEqualTo(Double value) {
            orCriterion("default_commission =", value, "defaultCommission");
            return (Criteria) this;
        }

        public Criteria orDefaultCommissionNotEqualTo(Double value) {
            orCriterion("default_commission <>", value, "defaultCommission");
            return (Criteria) this;
        }

        public Criteria orDefaultCommissionGreaterThan(Double value) {
            orCriterion("default_commission >", value, "defaultCommission");
            return (Criteria) this;
        }

        public Criteria orDefaultCommissionGreaterThanOrEqualTo(Double value) {
            orCriterion("default_commission >=", value, "defaultCommission");
            return (Criteria) this;
        }

        public Criteria orDefaultCommissionLessThan(Double value) {
            orCriterion("default_commission <", value, "defaultCommission");
            return (Criteria) this;
        }

        public Criteria orDefaultCommissionLessThanOrEqualTo(Double value) {
            orCriterion("default_commission <=", value, "defaultCommission");
            return (Criteria) this;
        }

        public Criteria andDefaultCommissionIn(List<Double> values) {
            addCriterion("default_commission in", values, "defaultCommission");
            return (Criteria) this;
        }

        public Criteria andDefaultCommissionNotIn(List<Double> values) {
            addCriterion("default_commission not in", values, "defaultCommission");
            return (Criteria) this;
        }

        public Criteria andDefaultCommissionBetween(Double value1, Double value2) {
            addCriterion("default_commission between", value1, value2, "defaultCommission");
            return (Criteria) this;
        }

        public Criteria andDefaultCommissionNotBetween(Double value1, Double value2) {
            addCriterion("default_commission not between", value1, value2, "defaultCommission");
            return (Criteria) this;
        }

        public Criteria orDefaultCommissionIn(List<Double> values) {
            orCriterion("default_commission in", values, "defaultCommission");
            return (Criteria) this;
        }

        public Criteria orDefaultCommissionNotIn(List<Double> values) {
            orCriterion("default_commission not in", values, "defaultCommission");
            return (Criteria) this;
        }

        public Criteria orDefaultCommissionBetween(Double value1, Double value2) {
            orCriterion("default_commission between", value1, value2, "defaultCommission");
            return (Criteria) this;
        }

        public Criteria orDefaultCommissionNotBetween(Double value1, Double value2) {
            orCriterion("default_commission not between", value1, value2, "defaultCommission");
            return (Criteria) this;
        }

        public Criteria andOperationModeIsNull() {
            addCriterion("operation_mode is null");
            return (Criteria) this;
        }

        public Criteria andOperationModeIsNotNull() {
            addCriterion("operation_mode is not null");
            return (Criteria) this;
        }

        public Criteria andOperationModeEqualTo(String value) {
            addCriterion("operation_mode =", value, "operationMode");
            return (Criteria) this;
        }

        public Criteria andOperationModeNotEqualTo(String value) {
            addCriterion("operation_mode <>", value, "operationMode");
            return (Criteria) this;
        }

        public Criteria andOperationModeGreaterThan(String value) {
            addCriterion("operation_mode >", value, "operationMode");
            return (Criteria) this;
        }

        public Criteria andOperationModeGreaterThanOrEqualTo(String value) {
            addCriterion("operation_mode >=", value, "operationMode");
            return (Criteria) this;
        }

        public Criteria andOperationModeLessThan(String value) {
            addCriterion("operation_mode <", value, "operationMode");
            return (Criteria) this;
        }

        public Criteria andOperationModeLessThanOrEqualTo(String value) {
            addCriterion("operation_mode <=", value, "operationMode");
            return (Criteria) this;
        }

        public Criteria orOperationModeIsNull() {
            orCriterion("operation_mode is null");
            return (Criteria) this;
        }

        public Criteria orOperationModeIsNotNull() {
            orCriterion("operation_mode is not null");
            return (Criteria) this;
        }

        public Criteria orOperationModeEqualTo(String value) {
            orCriterion("operation_mode =", value, "operationMode");
            return (Criteria) this;
        }

        public Criteria orOperationModeNotEqualTo(String value) {
            orCriterion("operation_mode <>", value, "operationMode");
            return (Criteria) this;
        }

        public Criteria orOperationModeGreaterThan(String value) {
            orCriterion("operation_mode >", value, "operationMode");
            return (Criteria) this;
        }

        public Criteria orOperationModeGreaterThanOrEqualTo(String value) {
            orCriterion("operation_mode >=", value, "operationMode");
            return (Criteria) this;
        }

        public Criteria orOperationModeLessThan(String value) {
            orCriterion("operation_mode <", value, "operationMode");
            return (Criteria) this;
        }

        public Criteria orOperationModeLessThanOrEqualTo(String value) {
            orCriterion("operation_mode <=", value, "operationMode");
            return (Criteria) this;
        }

        public Criteria andOperationModeLike(String value) {
            addCriterion("operation_mode like", value, "operationMode");
            return (Criteria) this;
        }

        public Criteria andOperationModeNotLike(String value) {
            addCriterion("operation_mode not like", value, "operationMode");
            return (Criteria) this;
        }

        public Criteria orOperationModeLike(String value) {
            orCriterion("operation_mode like", value, "operationMode");
            return (Criteria) this;
        }

        public Criteria orOperationModeNotLike(String value) {
            orCriterion("operation_mode not like", value, "operationMode");
            return (Criteria) this;
        }

        public Criteria andOperationModeIn(List<String> values) {
            addCriterion("operation_mode in", values, "operationMode");
            return (Criteria) this;
        }

        public Criteria andOperationModeNotIn(List<String> values) {
            addCriterion("operation_mode not in", values, "operationMode");
            return (Criteria) this;
        }

        public Criteria andOperationModeBetween(String value1, String value2) {
            addCriterion("operation_mode between", value1, value2, "operationMode");
            return (Criteria) this;
        }

        public Criteria andOperationModeNotBetween(String value1, String value2) {
            addCriterion("operation_mode not between", value1, value2, "operationMode");
            return (Criteria) this;
        }

        public Criteria orOperationModeIn(List<String> values) {
            orCriterion("operation_mode in", values, "operationMode");
            return (Criteria) this;
        }

        public Criteria orOperationModeNotIn(List<String> values) {
            orCriterion("operation_mode not in", values, "operationMode");
            return (Criteria) this;
        }

        public Criteria orOperationModeBetween(String value1, String value2) {
            orCriterion("operation_mode between", value1, value2, "operationMode");
            return (Criteria) this;
        }

        public Criteria orOperationModeNotBetween(String value1, String value2) {
            orCriterion("operation_mode not between", value1, value2, "operationMode");
            return (Criteria) this;
        }

        public Criteria andFundManagerIsNull() {
            addCriterion("fund_manager is null");
            return (Criteria) this;
        }

        public Criteria andFundManagerIsNotNull() {
            addCriterion("fund_manager is not null");
            return (Criteria) this;
        }

        public Criteria andFundManagerEqualTo(String value) {
            addCriterion("fund_manager =", value, "fundManager");
            return (Criteria) this;
        }

        public Criteria andFundManagerNotEqualTo(String value) {
            addCriterion("fund_manager <>", value, "fundManager");
            return (Criteria) this;
        }

        public Criteria andFundManagerGreaterThan(String value) {
            addCriterion("fund_manager >", value, "fundManager");
            return (Criteria) this;
        }

        public Criteria andFundManagerGreaterThanOrEqualTo(String value) {
            addCriterion("fund_manager >=", value, "fundManager");
            return (Criteria) this;
        }

        public Criteria andFundManagerLessThan(String value) {
            addCriterion("fund_manager <", value, "fundManager");
            return (Criteria) this;
        }

        public Criteria andFundManagerLessThanOrEqualTo(String value) {
            addCriterion("fund_manager <=", value, "fundManager");
            return (Criteria) this;
        }

        public Criteria orFundManagerIsNull() {
            orCriterion("fund_manager is null");
            return (Criteria) this;
        }

        public Criteria orFundManagerIsNotNull() {
            orCriterion("fund_manager is not null");
            return (Criteria) this;
        }

        public Criteria orFundManagerEqualTo(String value) {
            orCriterion("fund_manager =", value, "fundManager");
            return (Criteria) this;
        }

        public Criteria orFundManagerNotEqualTo(String value) {
            orCriterion("fund_manager <>", value, "fundManager");
            return (Criteria) this;
        }

        public Criteria orFundManagerGreaterThan(String value) {
            orCriterion("fund_manager >", value, "fundManager");
            return (Criteria) this;
        }

        public Criteria orFundManagerGreaterThanOrEqualTo(String value) {
            orCriterion("fund_manager >=", value, "fundManager");
            return (Criteria) this;
        }

        public Criteria orFundManagerLessThan(String value) {
            orCriterion("fund_manager <", value, "fundManager");
            return (Criteria) this;
        }

        public Criteria orFundManagerLessThanOrEqualTo(String value) {
            orCriterion("fund_manager <=", value, "fundManager");
            return (Criteria) this;
        }

        public Criteria andFundManagerLike(String value) {
            addCriterion("fund_manager like", value, "fundManager");
            return (Criteria) this;
        }

        public Criteria andFundManagerNotLike(String value) {
            addCriterion("fund_manager not like", value, "fundManager");
            return (Criteria) this;
        }

        public Criteria orFundManagerLike(String value) {
            orCriterion("fund_manager like", value, "fundManager");
            return (Criteria) this;
        }

        public Criteria orFundManagerNotLike(String value) {
            orCriterion("fund_manager not like", value, "fundManager");
            return (Criteria) this;
        }

        public Criteria andFundManagerIn(List<String> values) {
            addCriterion("fund_manager in", values, "fundManager");
            return (Criteria) this;
        }

        public Criteria andFundManagerNotIn(List<String> values) {
            addCriterion("fund_manager not in", values, "fundManager");
            return (Criteria) this;
        }

        public Criteria andFundManagerBetween(String value1, String value2) {
            addCriterion("fund_manager between", value1, value2, "fundManager");
            return (Criteria) this;
        }

        public Criteria andFundManagerNotBetween(String value1, String value2) {
            addCriterion("fund_manager not between", value1, value2, "fundManager");
            return (Criteria) this;
        }

        public Criteria orFundManagerIn(List<String> values) {
            orCriterion("fund_manager in", values, "fundManager");
            return (Criteria) this;
        }

        public Criteria orFundManagerNotIn(List<String> values) {
            orCriterion("fund_manager not in", values, "fundManager");
            return (Criteria) this;
        }

        public Criteria orFundManagerBetween(String value1, String value2) {
            orCriterion("fund_manager between", value1, value2, "fundManager");
            return (Criteria) this;
        }

        public Criteria orFundManagerNotBetween(String value1, String value2) {
            orCriterion("fund_manager not between", value1, value2, "fundManager");
            return (Criteria) this;
        }

        public Criteria andFundTrusteeIsNull() {
            addCriterion("fund_trustee is null");
            return (Criteria) this;
        }

        public Criteria andFundTrusteeIsNotNull() {
            addCriterion("fund_trustee is not null");
            return (Criteria) this;
        }

        public Criteria andFundTrusteeEqualTo(String value) {
            addCriterion("fund_trustee =", value, "fundTrustee");
            return (Criteria) this;
        }

        public Criteria andFundTrusteeNotEqualTo(String value) {
            addCriterion("fund_trustee <>", value, "fundTrustee");
            return (Criteria) this;
        }

        public Criteria andFundTrusteeGreaterThan(String value) {
            addCriterion("fund_trustee >", value, "fundTrustee");
            return (Criteria) this;
        }

        public Criteria andFundTrusteeGreaterThanOrEqualTo(String value) {
            addCriterion("fund_trustee >=", value, "fundTrustee");
            return (Criteria) this;
        }

        public Criteria andFundTrusteeLessThan(String value) {
            addCriterion("fund_trustee <", value, "fundTrustee");
            return (Criteria) this;
        }

        public Criteria andFundTrusteeLessThanOrEqualTo(String value) {
            addCriterion("fund_trustee <=", value, "fundTrustee");
            return (Criteria) this;
        }

        public Criteria orFundTrusteeIsNull() {
            orCriterion("fund_trustee is null");
            return (Criteria) this;
        }

        public Criteria orFundTrusteeIsNotNull() {
            orCriterion("fund_trustee is not null");
            return (Criteria) this;
        }

        public Criteria orFundTrusteeEqualTo(String value) {
            orCriterion("fund_trustee =", value, "fundTrustee");
            return (Criteria) this;
        }

        public Criteria orFundTrusteeNotEqualTo(String value) {
            orCriterion("fund_trustee <>", value, "fundTrustee");
            return (Criteria) this;
        }

        public Criteria orFundTrusteeGreaterThan(String value) {
            orCriterion("fund_trustee >", value, "fundTrustee");
            return (Criteria) this;
        }

        public Criteria orFundTrusteeGreaterThanOrEqualTo(String value) {
            orCriterion("fund_trustee >=", value, "fundTrustee");
            return (Criteria) this;
        }

        public Criteria orFundTrusteeLessThan(String value) {
            orCriterion("fund_trustee <", value, "fundTrustee");
            return (Criteria) this;
        }

        public Criteria orFundTrusteeLessThanOrEqualTo(String value) {
            orCriterion("fund_trustee <=", value, "fundTrustee");
            return (Criteria) this;
        }

        public Criteria andFundTrusteeLike(String value) {
            addCriterion("fund_trustee like", value, "fundTrustee");
            return (Criteria) this;
        }

        public Criteria andFundTrusteeNotLike(String value) {
            addCriterion("fund_trustee not like", value, "fundTrustee");
            return (Criteria) this;
        }

        public Criteria orFundTrusteeLike(String value) {
            orCriterion("fund_trustee like", value, "fundTrustee");
            return (Criteria) this;
        }

        public Criteria orFundTrusteeNotLike(String value) {
            orCriterion("fund_trustee not like", value, "fundTrustee");
            return (Criteria) this;
        }

        public Criteria andFundTrusteeIn(List<String> values) {
            addCriterion("fund_trustee in", values, "fundTrustee");
            return (Criteria) this;
        }

        public Criteria andFundTrusteeNotIn(List<String> values) {
            addCriterion("fund_trustee not in", values, "fundTrustee");
            return (Criteria) this;
        }

        public Criteria andFundTrusteeBetween(String value1, String value2) {
            addCriterion("fund_trustee between", value1, value2, "fundTrustee");
            return (Criteria) this;
        }

        public Criteria andFundTrusteeNotBetween(String value1, String value2) {
            addCriterion("fund_trustee not between", value1, value2, "fundTrustee");
            return (Criteria) this;
        }

        public Criteria orFundTrusteeIn(List<String> values) {
            orCriterion("fund_trustee in", values, "fundTrustee");
            return (Criteria) this;
        }

        public Criteria orFundTrusteeNotIn(List<String> values) {
            orCriterion("fund_trustee not in", values, "fundTrustee");
            return (Criteria) this;
        }

        public Criteria orFundTrusteeBetween(String value1, String value2) {
            orCriterion("fund_trustee between", value1, value2, "fundTrustee");
            return (Criteria) this;
        }

        public Criteria orFundTrusteeNotBetween(String value1, String value2) {
            orCriterion("fund_trustee not between", value1, value2, "fundTrustee");
            return (Criteria) this;
        }

        public Criteria andSubFeeIsNull() {
            addCriterion("sub_fee is null");
            return (Criteria) this;
        }

        public Criteria andSubFeeIsNotNull() {
            addCriterion("sub_fee is not null");
            return (Criteria) this;
        }

        public Criteria andSubFeeEqualTo(Double value) {
            addCriterion("sub_fee =", value, "subFee");
            return (Criteria) this;
        }

        public Criteria andSubFeeNotEqualTo(Double value) {
            addCriterion("sub_fee <>", value, "subFee");
            return (Criteria) this;
        }

        public Criteria andSubFeeGreaterThan(Double value) {
            addCriterion("sub_fee >", value, "subFee");
            return (Criteria) this;
        }

        public Criteria andSubFeeGreaterThanOrEqualTo(Double value) {
            addCriterion("sub_fee >=", value, "subFee");
            return (Criteria) this;
        }

        public Criteria andSubFeeLessThan(Double value) {
            addCriterion("sub_fee <", value, "subFee");
            return (Criteria) this;
        }

        public Criteria andSubFeeLessThanOrEqualTo(Double value) {
            addCriterion("sub_fee <=", value, "subFee");
            return (Criteria) this;
        }

        public Criteria orSubFeeIsNull() {
            orCriterion("sub_fee is null");
            return (Criteria) this;
        }

        public Criteria orSubFeeIsNotNull() {
            orCriterion("sub_fee is not null");
            return (Criteria) this;
        }

        public Criteria orSubFeeEqualTo(Double value) {
            orCriterion("sub_fee =", value, "subFee");
            return (Criteria) this;
        }

        public Criteria orSubFeeNotEqualTo(Double value) {
            orCriterion("sub_fee <>", value, "subFee");
            return (Criteria) this;
        }

        public Criteria orSubFeeGreaterThan(Double value) {
            orCriterion("sub_fee >", value, "subFee");
            return (Criteria) this;
        }

        public Criteria orSubFeeGreaterThanOrEqualTo(Double value) {
            orCriterion("sub_fee >=", value, "subFee");
            return (Criteria) this;
        }

        public Criteria orSubFeeLessThan(Double value) {
            orCriterion("sub_fee <", value, "subFee");
            return (Criteria) this;
        }

        public Criteria orSubFeeLessThanOrEqualTo(Double value) {
            orCriterion("sub_fee <=", value, "subFee");
            return (Criteria) this;
        }

        public Criteria andSubFeeIn(List<Double> values) {
            addCriterion("sub_fee in", values, "subFee");
            return (Criteria) this;
        }

        public Criteria andSubFeeNotIn(List<Double> values) {
            addCriterion("sub_fee not in", values, "subFee");
            return (Criteria) this;
        }

        public Criteria andSubFeeBetween(Double value1, Double value2) {
            addCriterion("sub_fee between", value1, value2, "subFee");
            return (Criteria) this;
        }

        public Criteria andSubFeeNotBetween(Double value1, Double value2) {
            addCriterion("sub_fee not between", value1, value2, "subFee");
            return (Criteria) this;
        }

        public Criteria orSubFeeIn(List<Double> values) {
            orCriterion("sub_fee in", values, "subFee");
            return (Criteria) this;
        }

        public Criteria orSubFeeNotIn(List<Double> values) {
            orCriterion("sub_fee not in", values, "subFee");
            return (Criteria) this;
        }

        public Criteria orSubFeeBetween(Double value1, Double value2) {
            orCriterion("sub_fee between", value1, value2, "subFee");
            return (Criteria) this;
        }

        public Criteria orSubFeeNotBetween(Double value1, Double value2) {
            orCriterion("sub_fee not between", value1, value2, "subFee");
            return (Criteria) this;
        }

        public Criteria andManageFeeIsNull() {
            addCriterion("manage_fee is null");
            return (Criteria) this;
        }

        public Criteria andManageFeeIsNotNull() {
            addCriterion("manage_fee is not null");
            return (Criteria) this;
        }

        public Criteria andManageFeeEqualTo(Double value) {
            addCriterion("manage_fee =", value, "manageFee");
            return (Criteria) this;
        }

        public Criteria andManageFeeNotEqualTo(Double value) {
            addCriterion("manage_fee <>", value, "manageFee");
            return (Criteria) this;
        }

        public Criteria andManageFeeGreaterThan(Double value) {
            addCriterion("manage_fee >", value, "manageFee");
            return (Criteria) this;
        }

        public Criteria andManageFeeGreaterThanOrEqualTo(Double value) {
            addCriterion("manage_fee >=", value, "manageFee");
            return (Criteria) this;
        }

        public Criteria andManageFeeLessThan(Double value) {
            addCriterion("manage_fee <", value, "manageFee");
            return (Criteria) this;
        }

        public Criteria andManageFeeLessThanOrEqualTo(Double value) {
            addCriterion("manage_fee <=", value, "manageFee");
            return (Criteria) this;
        }

        public Criteria orManageFeeIsNull() {
            orCriterion("manage_fee is null");
            return (Criteria) this;
        }

        public Criteria orManageFeeIsNotNull() {
            orCriterion("manage_fee is not null");
            return (Criteria) this;
        }

        public Criteria orManageFeeEqualTo(Double value) {
            orCriterion("manage_fee =", value, "manageFee");
            return (Criteria) this;
        }

        public Criteria orManageFeeNotEqualTo(Double value) {
            orCriterion("manage_fee <>", value, "manageFee");
            return (Criteria) this;
        }

        public Criteria orManageFeeGreaterThan(Double value) {
            orCriterion("manage_fee >", value, "manageFee");
            return (Criteria) this;
        }

        public Criteria orManageFeeGreaterThanOrEqualTo(Double value) {
            orCriterion("manage_fee >=", value, "manageFee");
            return (Criteria) this;
        }

        public Criteria orManageFeeLessThan(Double value) {
            orCriterion("manage_fee <", value, "manageFee");
            return (Criteria) this;
        }

        public Criteria orManageFeeLessThanOrEqualTo(Double value) {
            orCriterion("manage_fee <=", value, "manageFee");
            return (Criteria) this;
        }

        public Criteria andManageFeeIn(List<Double> values) {
            addCriterion("manage_fee in", values, "manageFee");
            return (Criteria) this;
        }

        public Criteria andManageFeeNotIn(List<Double> values) {
            addCriterion("manage_fee not in", values, "manageFee");
            return (Criteria) this;
        }

        public Criteria andManageFeeBetween(Double value1, Double value2) {
            addCriterion("manage_fee between", value1, value2, "manageFee");
            return (Criteria) this;
        }

        public Criteria andManageFeeNotBetween(Double value1, Double value2) {
            addCriterion("manage_fee not between", value1, value2, "manageFee");
            return (Criteria) this;
        }

        public Criteria orManageFeeIn(List<Double> values) {
            orCriterion("manage_fee in", values, "manageFee");
            return (Criteria) this;
        }

        public Criteria orManageFeeNotIn(List<Double> values) {
            orCriterion("manage_fee not in", values, "manageFee");
            return (Criteria) this;
        }

        public Criteria orManageFeeBetween(Double value1, Double value2) {
            orCriterion("manage_fee between", value1, value2, "manageFee");
            return (Criteria) this;
        }

        public Criteria orManageFeeNotBetween(Double value1, Double value2) {
            orCriterion("manage_fee not between", value1, value2, "manageFee");
            return (Criteria) this;
        }

        public Criteria andSubStartIsNull() {
            addCriterion("sub_start is null");
            return (Criteria) this;
        }

        public Criteria andSubStartIsNotNull() {
            addCriterion("sub_start is not null");
            return (Criteria) this;
        }

        public Criteria andSubStartEqualTo(Double value) {
            addCriterion("sub_start =", value, "subStart");
            return (Criteria) this;
        }

        public Criteria andSubStartNotEqualTo(Double value) {
            addCriterion("sub_start <>", value, "subStart");
            return (Criteria) this;
        }

        public Criteria andSubStartGreaterThan(Double value) {
            addCriterion("sub_start >", value, "subStart");
            return (Criteria) this;
        }

        public Criteria andSubStartGreaterThanOrEqualTo(Double value) {
            addCriterion("sub_start >=", value, "subStart");
            return (Criteria) this;
        }

        public Criteria andSubStartLessThan(Double value) {
            addCriterion("sub_start <", value, "subStart");
            return (Criteria) this;
        }

        public Criteria andSubStartLessThanOrEqualTo(Double value) {
            addCriterion("sub_start <=", value, "subStart");
            return (Criteria) this;
        }

        public Criteria orSubStartIsNull() {
            orCriterion("sub_start is null");
            return (Criteria) this;
        }

        public Criteria orSubStartIsNotNull() {
            orCriterion("sub_start is not null");
            return (Criteria) this;
        }

        public Criteria orSubStartEqualTo(Double value) {
            orCriterion("sub_start =", value, "subStart");
            return (Criteria) this;
        }

        public Criteria orSubStartNotEqualTo(Double value) {
            orCriterion("sub_start <>", value, "subStart");
            return (Criteria) this;
        }

        public Criteria orSubStartGreaterThan(Double value) {
            orCriterion("sub_start >", value, "subStart");
            return (Criteria) this;
        }

        public Criteria orSubStartGreaterThanOrEqualTo(Double value) {
            orCriterion("sub_start >=", value, "subStart");
            return (Criteria) this;
        }

        public Criteria orSubStartLessThan(Double value) {
            orCriterion("sub_start <", value, "subStart");
            return (Criteria) this;
        }

        public Criteria orSubStartLessThanOrEqualTo(Double value) {
            orCriterion("sub_start <=", value, "subStart");
            return (Criteria) this;
        }

        public Criteria andSubStartIn(List<Double> values) {
            addCriterion("sub_start in", values, "subStart");
            return (Criteria) this;
        }

        public Criteria andSubStartNotIn(List<Double> values) {
            addCriterion("sub_start not in", values, "subStart");
            return (Criteria) this;
        }

        public Criteria andSubStartBetween(Double value1, Double value2) {
            addCriterion("sub_start between", value1, value2, "subStart");
            return (Criteria) this;
        }

        public Criteria andSubStartNotBetween(Double value1, Double value2) {
            addCriterion("sub_start not between", value1, value2, "subStart");
            return (Criteria) this;
        }

        public Criteria orSubStartIn(List<Double> values) {
            orCriterion("sub_start in", values, "subStart");
            return (Criteria) this;
        }

        public Criteria orSubStartNotIn(List<Double> values) {
            orCriterion("sub_start not in", values, "subStart");
            return (Criteria) this;
        }

        public Criteria orSubStartBetween(Double value1, Double value2) {
            orCriterion("sub_start between", value1, value2, "subStart");
            return (Criteria) this;
        }

        public Criteria orSubStartNotBetween(Double value1, Double value2) {
            orCriterion("sub_start not between", value1, value2, "subStart");
            return (Criteria) this;
        }

        public Criteria andIncreaseAmountIsNull() {
            addCriterion("increase_amount is null");
            return (Criteria) this;
        }

        public Criteria andIncreaseAmountIsNotNull() {
            addCriterion("increase_amount is not null");
            return (Criteria) this;
        }

        public Criteria andIncreaseAmountEqualTo(Double value) {
            addCriterion("increase_amount =", value, "increaseAmount");
            return (Criteria) this;
        }

        public Criteria andIncreaseAmountNotEqualTo(Double value) {
            addCriterion("increase_amount <>", value, "increaseAmount");
            return (Criteria) this;
        }

        public Criteria andIncreaseAmountGreaterThan(Double value) {
            addCriterion("increase_amount >", value, "increaseAmount");
            return (Criteria) this;
        }

        public Criteria andIncreaseAmountGreaterThanOrEqualTo(Double value) {
            addCriterion("increase_amount >=", value, "increaseAmount");
            return (Criteria) this;
        }

        public Criteria andIncreaseAmountLessThan(Double value) {
            addCriterion("increase_amount <", value, "increaseAmount");
            return (Criteria) this;
        }

        public Criteria andIncreaseAmountLessThanOrEqualTo(Double value) {
            addCriterion("increase_amount <=", value, "increaseAmount");
            return (Criteria) this;
        }

        public Criteria orIncreaseAmountIsNull() {
            orCriterion("increase_amount is null");
            return (Criteria) this;
        }

        public Criteria orIncreaseAmountIsNotNull() {
            orCriterion("increase_amount is not null");
            return (Criteria) this;
        }

        public Criteria orIncreaseAmountEqualTo(Double value) {
            orCriterion("increase_amount =", value, "increaseAmount");
            return (Criteria) this;
        }

        public Criteria orIncreaseAmountNotEqualTo(Double value) {
            orCriterion("increase_amount <>", value, "increaseAmount");
            return (Criteria) this;
        }

        public Criteria orIncreaseAmountGreaterThan(Double value) {
            orCriterion("increase_amount >", value, "increaseAmount");
            return (Criteria) this;
        }

        public Criteria orIncreaseAmountGreaterThanOrEqualTo(Double value) {
            orCriterion("increase_amount >=", value, "increaseAmount");
            return (Criteria) this;
        }

        public Criteria orIncreaseAmountLessThan(Double value) {
            orCriterion("increase_amount <", value, "increaseAmount");
            return (Criteria) this;
        }

        public Criteria orIncreaseAmountLessThanOrEqualTo(Double value) {
            orCriterion("increase_amount <=", value, "increaseAmount");
            return (Criteria) this;
        }

        public Criteria andIncreaseAmountIn(List<Double> values) {
            addCriterion("increase_amount in", values, "increaseAmount");
            return (Criteria) this;
        }

        public Criteria andIncreaseAmountNotIn(List<Double> values) {
            addCriterion("increase_amount not in", values, "increaseAmount");
            return (Criteria) this;
        }

        public Criteria andIncreaseAmountBetween(Double value1, Double value2) {
            addCriterion("increase_amount between", value1, value2, "increaseAmount");
            return (Criteria) this;
        }

        public Criteria andIncreaseAmountNotBetween(Double value1, Double value2) {
            addCriterion("increase_amount not between", value1, value2, "increaseAmount");
            return (Criteria) this;
        }

        public Criteria orIncreaseAmountIn(List<Double> values) {
            orCriterion("increase_amount in", values, "increaseAmount");
            return (Criteria) this;
        }

        public Criteria orIncreaseAmountNotIn(List<Double> values) {
            orCriterion("increase_amount not in", values, "increaseAmount");
            return (Criteria) this;
        }

        public Criteria orIncreaseAmountBetween(Double value1, Double value2) {
            orCriterion("increase_amount between", value1, value2, "increaseAmount");
            return (Criteria) this;
        }

        public Criteria orIncreaseAmountNotBetween(Double value1, Double value2) {
            orCriterion("increase_amount not between", value1, value2, "increaseAmount");
            return (Criteria) this;
        }

        public Criteria andOpenCycleIsNull() {
            addCriterion("open_cycle is null");
            return (Criteria) this;
        }

        public Criteria andOpenCycleIsNotNull() {
            addCriterion("open_cycle is not null");
            return (Criteria) this;
        }

        public Criteria andOpenCycleEqualTo(String value) {
            addCriterion("open_cycle =", value, "openCycle");
            return (Criteria) this;
        }

        public Criteria andOpenCycleNotEqualTo(String value) {
            addCriterion("open_cycle <>", value, "openCycle");
            return (Criteria) this;
        }

        public Criteria andOpenCycleGreaterThan(String value) {
            addCriterion("open_cycle >", value, "openCycle");
            return (Criteria) this;
        }

        public Criteria andOpenCycleGreaterThanOrEqualTo(String value) {
            addCriterion("open_cycle >=", value, "openCycle");
            return (Criteria) this;
        }

        public Criteria andOpenCycleLessThan(String value) {
            addCriterion("open_cycle <", value, "openCycle");
            return (Criteria) this;
        }

        public Criteria andOpenCycleLessThanOrEqualTo(String value) {
            addCriterion("open_cycle <=", value, "openCycle");
            return (Criteria) this;
        }

        public Criteria orOpenCycleIsNull() {
            orCriterion("open_cycle is null");
            return (Criteria) this;
        }

        public Criteria orOpenCycleIsNotNull() {
            orCriterion("open_cycle is not null");
            return (Criteria) this;
        }

        public Criteria orOpenCycleEqualTo(String value) {
            orCriterion("open_cycle =", value, "openCycle");
            return (Criteria) this;
        }

        public Criteria orOpenCycleNotEqualTo(String value) {
            orCriterion("open_cycle <>", value, "openCycle");
            return (Criteria) this;
        }

        public Criteria orOpenCycleGreaterThan(String value) {
            orCriterion("open_cycle >", value, "openCycle");
            return (Criteria) this;
        }

        public Criteria orOpenCycleGreaterThanOrEqualTo(String value) {
            orCriterion("open_cycle >=", value, "openCycle");
            return (Criteria) this;
        }

        public Criteria orOpenCycleLessThan(String value) {
            orCriterion("open_cycle <", value, "openCycle");
            return (Criteria) this;
        }

        public Criteria orOpenCycleLessThanOrEqualTo(String value) {
            orCriterion("open_cycle <=", value, "openCycle");
            return (Criteria) this;
        }

        public Criteria andOpenCycleLike(String value) {
            addCriterion("open_cycle like", value, "openCycle");
            return (Criteria) this;
        }

        public Criteria andOpenCycleNotLike(String value) {
            addCriterion("open_cycle not like", value, "openCycle");
            return (Criteria) this;
        }

        public Criteria orOpenCycleLike(String value) {
            orCriterion("open_cycle like", value, "openCycle");
            return (Criteria) this;
        }

        public Criteria orOpenCycleNotLike(String value) {
            orCriterion("open_cycle not like", value, "openCycle");
            return (Criteria) this;
        }

        public Criteria andOpenCycleIn(List<String> values) {
            addCriterion("open_cycle in", values, "openCycle");
            return (Criteria) this;
        }

        public Criteria andOpenCycleNotIn(List<String> values) {
            addCriterion("open_cycle not in", values, "openCycle");
            return (Criteria) this;
        }

        public Criteria andOpenCycleBetween(String value1, String value2) {
            addCriterion("open_cycle between", value1, value2, "openCycle");
            return (Criteria) this;
        }

        public Criteria andOpenCycleNotBetween(String value1, String value2) {
            addCriterion("open_cycle not between", value1, value2, "openCycle");
            return (Criteria) this;
        }

        public Criteria orOpenCycleIn(List<String> values) {
            orCriterion("open_cycle in", values, "openCycle");
            return (Criteria) this;
        }

        public Criteria orOpenCycleNotIn(List<String> values) {
            orCriterion("open_cycle not in", values, "openCycle");
            return (Criteria) this;
        }

        public Criteria orOpenCycleBetween(String value1, String value2) {
            orCriterion("open_cycle between", value1, value2, "openCycle");
            return (Criteria) this;
        }

        public Criteria orOpenCycleNotBetween(String value1, String value2) {
            orCriterion("open_cycle not between", value1, value2, "openCycle");
            return (Criteria) this;
        }

        public Criteria andOpenDateIsNull() {
            addCriterion("open_date is null");
            return (Criteria) this;
        }

        public Criteria andOpenDateIsNotNull() {
            addCriterion("open_date is not null");
            return (Criteria) this;
        }

        public Criteria andOpenDateEqualTo(String value) {
            addCriterion("open_date =", value, "openDate");
            return (Criteria) this;
        }

        public Criteria andOpenDateNotEqualTo(String value) {
            addCriterion("open_date <>", value, "openDate");
            return (Criteria) this;
        }

        public Criteria andOpenDateGreaterThan(String value) {
            addCriterion("open_date >", value, "openDate");
            return (Criteria) this;
        }

        public Criteria andOpenDateGreaterThanOrEqualTo(String value) {
            addCriterion("open_date >=", value, "openDate");
            return (Criteria) this;
        }

        public Criteria andOpenDateLessThan(String value) {
            addCriterion("open_date <", value, "openDate");
            return (Criteria) this;
        }

        public Criteria andOpenDateLessThanOrEqualTo(String value) {
            addCriterion("open_date <=", value, "openDate");
            return (Criteria) this;
        }

        public Criteria orOpenDateIsNull() {
            orCriterion("open_date is null");
            return (Criteria) this;
        }

        public Criteria orOpenDateIsNotNull() {
            orCriterion("open_date is not null");
            return (Criteria) this;
        }

        public Criteria orOpenDateEqualTo(String value) {
            orCriterion("open_date =", value, "openDate");
            return (Criteria) this;
        }

        public Criteria orOpenDateNotEqualTo(String value) {
            orCriterion("open_date <>", value, "openDate");
            return (Criteria) this;
        }

        public Criteria orOpenDateGreaterThan(String value) {
            orCriterion("open_date >", value, "openDate");
            return (Criteria) this;
        }

        public Criteria orOpenDateGreaterThanOrEqualTo(String value) {
            orCriterion("open_date >=", value, "openDate");
            return (Criteria) this;
        }

        public Criteria orOpenDateLessThan(String value) {
            orCriterion("open_date <", value, "openDate");
            return (Criteria) this;
        }

        public Criteria orOpenDateLessThanOrEqualTo(String value) {
            orCriterion("open_date <=", value, "openDate");
            return (Criteria) this;
        }

        public Criteria andOpenDateLike(String value) {
            addCriterion("open_date like", value, "openDate");
            return (Criteria) this;
        }

        public Criteria andOpenDateNotLike(String value) {
            addCriterion("open_date not like", value, "openDate");
            return (Criteria) this;
        }

        public Criteria orOpenDateLike(String value) {
            orCriterion("open_date like", value, "openDate");
            return (Criteria) this;
        }

        public Criteria orOpenDateNotLike(String value) {
            orCriterion("open_date not like", value, "openDate");
            return (Criteria) this;
        }

        public Criteria andOpenDateIn(List<String> values) {
            addCriterion("open_date in", values, "openDate");
            return (Criteria) this;
        }

        public Criteria andOpenDateNotIn(List<String> values) {
            addCriterion("open_date not in", values, "openDate");
            return (Criteria) this;
        }

        public Criteria andOpenDateBetween(String value1, String value2) {
            addCriterion("open_date between", value1, value2, "openDate");
            return (Criteria) this;
        }

        public Criteria andOpenDateNotBetween(String value1, String value2) {
            addCriterion("open_date not between", value1, value2, "openDate");
            return (Criteria) this;
        }

        public Criteria orOpenDateIn(List<String> values) {
            orCriterion("open_date in", values, "openDate");
            return (Criteria) this;
        }

        public Criteria orOpenDateNotIn(List<String> values) {
            orCriterion("open_date not in", values, "openDate");
            return (Criteria) this;
        }

        public Criteria orOpenDateBetween(String value1, String value2) {
            orCriterion("open_date between", value1, value2, "openDate");
            return (Criteria) this;
        }

        public Criteria orOpenDateNotBetween(String value1, String value2) {
            orCriterion("open_date not between", value1, value2, "openDate");
            return (Criteria) this;
        }

        public Criteria andBuyFeeIsNull() {
            addCriterion("buy_fee is null");
            return (Criteria) this;
        }

        public Criteria andBuyFeeIsNotNull() {
            addCriterion("buy_fee is not null");
            return (Criteria) this;
        }

        public Criteria andBuyFeeEqualTo(Double value) {
            addCriterion("buy_fee =", value, "buyFee");
            return (Criteria) this;
        }

        public Criteria andBuyFeeNotEqualTo(Double value) {
            addCriterion("buy_fee <>", value, "buyFee");
            return (Criteria) this;
        }

        public Criteria andBuyFeeGreaterThan(Double value) {
            addCriterion("buy_fee >", value, "buyFee");
            return (Criteria) this;
        }

        public Criteria andBuyFeeGreaterThanOrEqualTo(Double value) {
            addCriterion("buy_fee >=", value, "buyFee");
            return (Criteria) this;
        }

        public Criteria andBuyFeeLessThan(Double value) {
            addCriterion("buy_fee <", value, "buyFee");
            return (Criteria) this;
        }

        public Criteria andBuyFeeLessThanOrEqualTo(Double value) {
            addCriterion("buy_fee <=", value, "buyFee");
            return (Criteria) this;
        }

        public Criteria orBuyFeeIsNull() {
            orCriterion("buy_fee is null");
            return (Criteria) this;
        }

        public Criteria orBuyFeeIsNotNull() {
            orCriterion("buy_fee is not null");
            return (Criteria) this;
        }

        public Criteria orBuyFeeEqualTo(Double value) {
            orCriterion("buy_fee =", value, "buyFee");
            return (Criteria) this;
        }

        public Criteria orBuyFeeNotEqualTo(Double value) {
            orCriterion("buy_fee <>", value, "buyFee");
            return (Criteria) this;
        }

        public Criteria orBuyFeeGreaterThan(Double value) {
            orCriterion("buy_fee >", value, "buyFee");
            return (Criteria) this;
        }

        public Criteria orBuyFeeGreaterThanOrEqualTo(Double value) {
            orCriterion("buy_fee >=", value, "buyFee");
            return (Criteria) this;
        }

        public Criteria orBuyFeeLessThan(Double value) {
            orCriterion("buy_fee <", value, "buyFee");
            return (Criteria) this;
        }

        public Criteria orBuyFeeLessThanOrEqualTo(Double value) {
            orCriterion("buy_fee <=", value, "buyFee");
            return (Criteria) this;
        }

        public Criteria andBuyFeeIn(List<Double> values) {
            addCriterion("buy_fee in", values, "buyFee");
            return (Criteria) this;
        }

        public Criteria andBuyFeeNotIn(List<Double> values) {
            addCriterion("buy_fee not in", values, "buyFee");
            return (Criteria) this;
        }

        public Criteria andBuyFeeBetween(Double value1, Double value2) {
            addCriterion("buy_fee between", value1, value2, "buyFee");
            return (Criteria) this;
        }

        public Criteria andBuyFeeNotBetween(Double value1, Double value2) {
            addCriterion("buy_fee not between", value1, value2, "buyFee");
            return (Criteria) this;
        }

        public Criteria orBuyFeeIn(List<Double> values) {
            orCriterion("buy_fee in", values, "buyFee");
            return (Criteria) this;
        }

        public Criteria orBuyFeeNotIn(List<Double> values) {
            orCriterion("buy_fee not in", values, "buyFee");
            return (Criteria) this;
        }

        public Criteria orBuyFeeBetween(Double value1, Double value2) {
            orCriterion("buy_fee between", value1, value2, "buyFee");
            return (Criteria) this;
        }

        public Criteria orBuyFeeNotBetween(Double value1, Double value2) {
            orCriterion("buy_fee not between", value1, value2, "buyFee");
            return (Criteria) this;
        }

        public Criteria andRedeemFeeIsNull() {
            addCriterion("redeem_fee is null");
            return (Criteria) this;
        }

        public Criteria andRedeemFeeIsNotNull() {
            addCriterion("redeem_fee is not null");
            return (Criteria) this;
        }

        public Criteria andRedeemFeeEqualTo(Double value) {
            addCriterion("redeem_fee =", value, "redeemFee");
            return (Criteria) this;
        }

        public Criteria andRedeemFeeNotEqualTo(Double value) {
            addCriterion("redeem_fee <>", value, "redeemFee");
            return (Criteria) this;
        }

        public Criteria andRedeemFeeGreaterThan(Double value) {
            addCriterion("redeem_fee >", value, "redeemFee");
            return (Criteria) this;
        }

        public Criteria andRedeemFeeGreaterThanOrEqualTo(Double value) {
            addCriterion("redeem_fee >=", value, "redeemFee");
            return (Criteria) this;
        }

        public Criteria andRedeemFeeLessThan(Double value) {
            addCriterion("redeem_fee <", value, "redeemFee");
            return (Criteria) this;
        }

        public Criteria andRedeemFeeLessThanOrEqualTo(Double value) {
            addCriterion("redeem_fee <=", value, "redeemFee");
            return (Criteria) this;
        }

        public Criteria orRedeemFeeIsNull() {
            orCriterion("redeem_fee is null");
            return (Criteria) this;
        }

        public Criteria orRedeemFeeIsNotNull() {
            orCriterion("redeem_fee is not null");
            return (Criteria) this;
        }

        public Criteria orRedeemFeeEqualTo(Double value) {
            orCriterion("redeem_fee =", value, "redeemFee");
            return (Criteria) this;
        }

        public Criteria orRedeemFeeNotEqualTo(Double value) {
            orCriterion("redeem_fee <>", value, "redeemFee");
            return (Criteria) this;
        }

        public Criteria orRedeemFeeGreaterThan(Double value) {
            orCriterion("redeem_fee >", value, "redeemFee");
            return (Criteria) this;
        }

        public Criteria orRedeemFeeGreaterThanOrEqualTo(Double value) {
            orCriterion("redeem_fee >=", value, "redeemFee");
            return (Criteria) this;
        }

        public Criteria orRedeemFeeLessThan(Double value) {
            orCriterion("redeem_fee <", value, "redeemFee");
            return (Criteria) this;
        }

        public Criteria orRedeemFeeLessThanOrEqualTo(Double value) {
            orCriterion("redeem_fee <=", value, "redeemFee");
            return (Criteria) this;
        }

        public Criteria andRedeemFeeIn(List<Double> values) {
            addCriterion("redeem_fee in", values, "redeemFee");
            return (Criteria) this;
        }

        public Criteria andRedeemFeeNotIn(List<Double> values) {
            addCriterion("redeem_fee not in", values, "redeemFee");
            return (Criteria) this;
        }

        public Criteria andRedeemFeeBetween(Double value1, Double value2) {
            addCriterion("redeem_fee between", value1, value2, "redeemFee");
            return (Criteria) this;
        }

        public Criteria andRedeemFeeNotBetween(Double value1, Double value2) {
            addCriterion("redeem_fee not between", value1, value2, "redeemFee");
            return (Criteria) this;
        }

        public Criteria orRedeemFeeIn(List<Double> values) {
            orCriterion("redeem_fee in", values, "redeemFee");
            return (Criteria) this;
        }

        public Criteria orRedeemFeeNotIn(List<Double> values) {
            orCriterion("redeem_fee not in", values, "redeemFee");
            return (Criteria) this;
        }

        public Criteria orRedeemFeeBetween(Double value1, Double value2) {
            orCriterion("redeem_fee between", value1, value2, "redeemFee");
            return (Criteria) this;
        }

        public Criteria orRedeemFeeNotBetween(Double value1, Double value2) {
            orCriterion("redeem_fee not between", value1, value2, "redeemFee");
            return (Criteria) this;
        }

        public Criteria andIncomeDivideIsNull() {
            addCriterion("income_divide is null");
            return (Criteria) this;
        }

        public Criteria andIncomeDivideIsNotNull() {
            addCriterion("income_divide is not null");
            return (Criteria) this;
        }

        public Criteria andIncomeDivideEqualTo(String value) {
            addCriterion("income_divide =", value, "incomeDivide");
            return (Criteria) this;
        }

        public Criteria andIncomeDivideNotEqualTo(String value) {
            addCriterion("income_divide <>", value, "incomeDivide");
            return (Criteria) this;
        }

        public Criteria andIncomeDivideGreaterThan(String value) {
            addCriterion("income_divide >", value, "incomeDivide");
            return (Criteria) this;
        }

        public Criteria andIncomeDivideGreaterThanOrEqualTo(String value) {
            addCriterion("income_divide >=", value, "incomeDivide");
            return (Criteria) this;
        }

        public Criteria andIncomeDivideLessThan(String value) {
            addCriterion("income_divide <", value, "incomeDivide");
            return (Criteria) this;
        }

        public Criteria andIncomeDivideLessThanOrEqualTo(String value) {
            addCriterion("income_divide <=", value, "incomeDivide");
            return (Criteria) this;
        }

        public Criteria orIncomeDivideIsNull() {
            orCriterion("income_divide is null");
            return (Criteria) this;
        }

        public Criteria orIncomeDivideIsNotNull() {
            orCriterion("income_divide is not null");
            return (Criteria) this;
        }

        public Criteria orIncomeDivideEqualTo(String value) {
            orCriterion("income_divide =", value, "incomeDivide");
            return (Criteria) this;
        }

        public Criteria orIncomeDivideNotEqualTo(String value) {
            orCriterion("income_divide <>", value, "incomeDivide");
            return (Criteria) this;
        }

        public Criteria orIncomeDivideGreaterThan(String value) {
            orCriterion("income_divide >", value, "incomeDivide");
            return (Criteria) this;
        }

        public Criteria orIncomeDivideGreaterThanOrEqualTo(String value) {
            orCriterion("income_divide >=", value, "incomeDivide");
            return (Criteria) this;
        }

        public Criteria orIncomeDivideLessThan(String value) {
            orCriterion("income_divide <", value, "incomeDivide");
            return (Criteria) this;
        }

        public Criteria orIncomeDivideLessThanOrEqualTo(String value) {
            orCriterion("income_divide <=", value, "incomeDivide");
            return (Criteria) this;
        }

        public Criteria andIncomeDivideLike(String value) {
            addCriterion("income_divide like", value, "incomeDivide");
            return (Criteria) this;
        }

        public Criteria andIncomeDivideNotLike(String value) {
            addCriterion("income_divide not like", value, "incomeDivide");
            return (Criteria) this;
        }

        public Criteria orIncomeDivideLike(String value) {
            orCriterion("income_divide like", value, "incomeDivide");
            return (Criteria) this;
        }

        public Criteria orIncomeDivideNotLike(String value) {
            orCriterion("income_divide not like", value, "incomeDivide");
            return (Criteria) this;
        }

        public Criteria andIncomeDivideIn(List<String> values) {
            addCriterion("income_divide in", values, "incomeDivide");
            return (Criteria) this;
        }

        public Criteria andIncomeDivideNotIn(List<String> values) {
            addCriterion("income_divide not in", values, "incomeDivide");
            return (Criteria) this;
        }

        public Criteria andIncomeDivideBetween(String value1, String value2) {
            addCriterion("income_divide between", value1, value2, "incomeDivide");
            return (Criteria) this;
        }

        public Criteria andIncomeDivideNotBetween(String value1, String value2) {
            addCriterion("income_divide not between", value1, value2, "incomeDivide");
            return (Criteria) this;
        }

        public Criteria orIncomeDivideIn(List<String> values) {
            orCriterion("income_divide in", values, "incomeDivide");
            return (Criteria) this;
        }

        public Criteria orIncomeDivideNotIn(List<String> values) {
            orCriterion("income_divide not in", values, "incomeDivide");
            return (Criteria) this;
        }

        public Criteria orIncomeDivideBetween(String value1, String value2) {
            orCriterion("income_divide between", value1, value2, "incomeDivide");
            return (Criteria) this;
        }

        public Criteria orIncomeDivideNotBetween(String value1, String value2) {
            orCriterion("income_divide not between", value1, value2, "incomeDivide");
            return (Criteria) this;
        }

        public Criteria andRiskControlIsNull() {
            addCriterion("risk_control is null");
            return (Criteria) this;
        }

        public Criteria andRiskControlIsNotNull() {
            addCriterion("risk_control is not null");
            return (Criteria) this;
        }

        public Criteria andRiskControlEqualTo(String value) {
            addCriterion("risk_control =", value, "riskControl");
            return (Criteria) this;
        }

        public Criteria andRiskControlNotEqualTo(String value) {
            addCriterion("risk_control <>", value, "riskControl");
            return (Criteria) this;
        }

        public Criteria andRiskControlGreaterThan(String value) {
            addCriterion("risk_control >", value, "riskControl");
            return (Criteria) this;
        }

        public Criteria andRiskControlGreaterThanOrEqualTo(String value) {
            addCriterion("risk_control >=", value, "riskControl");
            return (Criteria) this;
        }

        public Criteria andRiskControlLessThan(String value) {
            addCriterion("risk_control <", value, "riskControl");
            return (Criteria) this;
        }

        public Criteria andRiskControlLessThanOrEqualTo(String value) {
            addCriterion("risk_control <=", value, "riskControl");
            return (Criteria) this;
        }

        public Criteria orRiskControlIsNull() {
            orCriterion("risk_control is null");
            return (Criteria) this;
        }

        public Criteria orRiskControlIsNotNull() {
            orCriterion("risk_control is not null");
            return (Criteria) this;
        }

        public Criteria orRiskControlEqualTo(String value) {
            orCriterion("risk_control =", value, "riskControl");
            return (Criteria) this;
        }

        public Criteria orRiskControlNotEqualTo(String value) {
            orCriterion("risk_control <>", value, "riskControl");
            return (Criteria) this;
        }

        public Criteria orRiskControlGreaterThan(String value) {
            orCriterion("risk_control >", value, "riskControl");
            return (Criteria) this;
        }

        public Criteria orRiskControlGreaterThanOrEqualTo(String value) {
            orCriterion("risk_control >=", value, "riskControl");
            return (Criteria) this;
        }

        public Criteria orRiskControlLessThan(String value) {
            orCriterion("risk_control <", value, "riskControl");
            return (Criteria) this;
        }

        public Criteria orRiskControlLessThanOrEqualTo(String value) {
            orCriterion("risk_control <=", value, "riskControl");
            return (Criteria) this;
        }

        public Criteria andRiskControlLike(String value) {
            addCriterion("risk_control like", value, "riskControl");
            return (Criteria) this;
        }

        public Criteria andRiskControlNotLike(String value) {
            addCriterion("risk_control not like", value, "riskControl");
            return (Criteria) this;
        }

        public Criteria orRiskControlLike(String value) {
            orCriterion("risk_control like", value, "riskControl");
            return (Criteria) this;
        }

        public Criteria orRiskControlNotLike(String value) {
            orCriterion("risk_control not like", value, "riskControl");
            return (Criteria) this;
        }

        public Criteria andRiskControlIn(List<String> values) {
            addCriterion("risk_control in", values, "riskControl");
            return (Criteria) this;
        }

        public Criteria andRiskControlNotIn(List<String> values) {
            addCriterion("risk_control not in", values, "riskControl");
            return (Criteria) this;
        }

        public Criteria andRiskControlBetween(String value1, String value2) {
            addCriterion("risk_control between", value1, value2, "riskControl");
            return (Criteria) this;
        }

        public Criteria andRiskControlNotBetween(String value1, String value2) {
            addCriterion("risk_control not between", value1, value2, "riskControl");
            return (Criteria) this;
        }

        public Criteria orRiskControlIn(List<String> values) {
            orCriterion("risk_control in", values, "riskControl");
            return (Criteria) this;
        }

        public Criteria orRiskControlNotIn(List<String> values) {
            orCriterion("risk_control not in", values, "riskControl");
            return (Criteria) this;
        }

        public Criteria orRiskControlBetween(String value1, String value2) {
            orCriterion("risk_control between", value1, value2, "riskControl");
            return (Criteria) this;
        }

        public Criteria orRiskControlNotBetween(String value1, String value2) {
            orCriterion("risk_control not between", value1, value2, "riskControl");
            return (Criteria) this;
        }

        public Criteria andConsultPhoneIsNull() {
            addCriterion("consult_phone is null");
            return (Criteria) this;
        }

        public Criteria andConsultPhoneIsNotNull() {
            addCriterion("consult_phone is not null");
            return (Criteria) this;
        }

        public Criteria andConsultPhoneEqualTo(String value) {
            addCriterion("consult_phone =", value, "consultPhone");
            return (Criteria) this;
        }

        public Criteria andConsultPhoneNotEqualTo(String value) {
            addCriterion("consult_phone <>", value, "consultPhone");
            return (Criteria) this;
        }

        public Criteria andConsultPhoneGreaterThan(String value) {
            addCriterion("consult_phone >", value, "consultPhone");
            return (Criteria) this;
        }

        public Criteria andConsultPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("consult_phone >=", value, "consultPhone");
            return (Criteria) this;
        }

        public Criteria andConsultPhoneLessThan(String value) {
            addCriterion("consult_phone <", value, "consultPhone");
            return (Criteria) this;
        }

        public Criteria andConsultPhoneLessThanOrEqualTo(String value) {
            addCriterion("consult_phone <=", value, "consultPhone");
            return (Criteria) this;
        }

        public Criteria orConsultPhoneIsNull() {
            orCriterion("consult_phone is null");
            return (Criteria) this;
        }

        public Criteria orConsultPhoneIsNotNull() {
            orCriterion("consult_phone is not null");
            return (Criteria) this;
        }

        public Criteria orConsultPhoneEqualTo(String value) {
            orCriterion("consult_phone =", value, "consultPhone");
            return (Criteria) this;
        }

        public Criteria orConsultPhoneNotEqualTo(String value) {
            orCriterion("consult_phone <>", value, "consultPhone");
            return (Criteria) this;
        }

        public Criteria orConsultPhoneGreaterThan(String value) {
            orCriterion("consult_phone >", value, "consultPhone");
            return (Criteria) this;
        }

        public Criteria orConsultPhoneGreaterThanOrEqualTo(String value) {
            orCriterion("consult_phone >=", value, "consultPhone");
            return (Criteria) this;
        }

        public Criteria orConsultPhoneLessThan(String value) {
            orCriterion("consult_phone <", value, "consultPhone");
            return (Criteria) this;
        }

        public Criteria orConsultPhoneLessThanOrEqualTo(String value) {
            orCriterion("consult_phone <=", value, "consultPhone");
            return (Criteria) this;
        }

        public Criteria andConsultPhoneLike(String value) {
            addCriterion("consult_phone like", value, "consultPhone");
            return (Criteria) this;
        }

        public Criteria andConsultPhoneNotLike(String value) {
            addCriterion("consult_phone not like", value, "consultPhone");
            return (Criteria) this;
        }

        public Criteria orConsultPhoneLike(String value) {
            orCriterion("consult_phone like", value, "consultPhone");
            return (Criteria) this;
        }

        public Criteria orConsultPhoneNotLike(String value) {
            orCriterion("consult_phone not like", value, "consultPhone");
            return (Criteria) this;
        }

        public Criteria andConsultPhoneIn(List<String> values) {
            addCriterion("consult_phone in", values, "consultPhone");
            return (Criteria) this;
        }

        public Criteria andConsultPhoneNotIn(List<String> values) {
            addCriterion("consult_phone not in", values, "consultPhone");
            return (Criteria) this;
        }

        public Criteria andConsultPhoneBetween(String value1, String value2) {
            addCriterion("consult_phone between", value1, value2, "consultPhone");
            return (Criteria) this;
        }

        public Criteria andConsultPhoneNotBetween(String value1, String value2) {
            addCriterion("consult_phone not between", value1, value2, "consultPhone");
            return (Criteria) this;
        }

        public Criteria orConsultPhoneIn(List<String> values) {
            orCriterion("consult_phone in", values, "consultPhone");
            return (Criteria) this;
        }

        public Criteria orConsultPhoneNotIn(List<String> values) {
            orCriterion("consult_phone not in", values, "consultPhone");
            return (Criteria) this;
        }

        public Criteria orConsultPhoneBetween(String value1, String value2) {
            orCriterion("consult_phone between", value1, value2, "consultPhone");
            return (Criteria) this;
        }

        public Criteria orConsultPhoneNotBetween(String value1, String value2) {
            orCriterion("consult_phone not between", value1, value2, "consultPhone");
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

        public Criteria orBankDepositIsNull() {
            orCriterion("bank_deposit is null");
            return (Criteria) this;
        }

        public Criteria orBankDepositIsNotNull() {
            orCriterion("bank_deposit is not null");
            return (Criteria) this;
        }

        public Criteria orBankDepositEqualTo(String value) {
            orCriterion("bank_deposit =", value, "bankDeposit");
            return (Criteria) this;
        }

        public Criteria orBankDepositNotEqualTo(String value) {
            orCriterion("bank_deposit <>", value, "bankDeposit");
            return (Criteria) this;
        }

        public Criteria orBankDepositGreaterThan(String value) {
            orCriterion("bank_deposit >", value, "bankDeposit");
            return (Criteria) this;
        }

        public Criteria orBankDepositGreaterThanOrEqualTo(String value) {
            orCriterion("bank_deposit >=", value, "bankDeposit");
            return (Criteria) this;
        }

        public Criteria orBankDepositLessThan(String value) {
            orCriterion("bank_deposit <", value, "bankDeposit");
            return (Criteria) this;
        }

        public Criteria orBankDepositLessThanOrEqualTo(String value) {
            orCriterion("bank_deposit <=", value, "bankDeposit");
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

        public Criteria orBankDepositLike(String value) {
            orCriterion("bank_deposit like", value, "bankDeposit");
            return (Criteria) this;
        }

        public Criteria orBankDepositNotLike(String value) {
            orCriterion("bank_deposit not like", value, "bankDeposit");
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

        public Criteria orBankDepositIn(List<String> values) {
            orCriterion("bank_deposit in", values, "bankDeposit");
            return (Criteria) this;
        }

        public Criteria orBankDepositNotIn(List<String> values) {
            orCriterion("bank_deposit not in", values, "bankDeposit");
            return (Criteria) this;
        }

        public Criteria orBankDepositBetween(String value1, String value2) {
            orCriterion("bank_deposit between", value1, value2, "bankDeposit");
            return (Criteria) this;
        }

        public Criteria orBankDepositNotBetween(String value1, String value2) {
            orCriterion("bank_deposit not between", value1, value2, "bankDeposit");
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

        public Criteria orBankNameIsNull() {
            orCriterion("bank_name is null");
            return (Criteria) this;
        }

        public Criteria orBankNameIsNotNull() {
            orCriterion("bank_name is not null");
            return (Criteria) this;
        }

        public Criteria orBankNameEqualTo(String value) {
            orCriterion("bank_name =", value, "bankName");
            return (Criteria) this;
        }

        public Criteria orBankNameNotEqualTo(String value) {
            orCriterion("bank_name <>", value, "bankName");
            return (Criteria) this;
        }

        public Criteria orBankNameGreaterThan(String value) {
            orCriterion("bank_name >", value, "bankName");
            return (Criteria) this;
        }

        public Criteria orBankNameGreaterThanOrEqualTo(String value) {
            orCriterion("bank_name >=", value, "bankName");
            return (Criteria) this;
        }

        public Criteria orBankNameLessThan(String value) {
            orCriterion("bank_name <", value, "bankName");
            return (Criteria) this;
        }

        public Criteria orBankNameLessThanOrEqualTo(String value) {
            orCriterion("bank_name <=", value, "bankName");
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

        public Criteria orBankNameLike(String value) {
            orCriterion("bank_name like", value, "bankName");
            return (Criteria) this;
        }

        public Criteria orBankNameNotLike(String value) {
            orCriterion("bank_name not like", value, "bankName");
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

        public Criteria orBankNameIn(List<String> values) {
            orCriterion("bank_name in", values, "bankName");
            return (Criteria) this;
        }

        public Criteria orBankNameNotIn(List<String> values) {
            orCriterion("bank_name not in", values, "bankName");
            return (Criteria) this;
        }

        public Criteria orBankNameBetween(String value1, String value2) {
            orCriterion("bank_name between", value1, value2, "bankName");
            return (Criteria) this;
        }

        public Criteria orBankNameNotBetween(String value1, String value2) {
            orCriterion("bank_name not between", value1, value2, "bankName");
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

        public Criteria orBankAccountIsNull() {
            orCriterion("bank_account is null");
            return (Criteria) this;
        }

        public Criteria orBankAccountIsNotNull() {
            orCriterion("bank_account is not null");
            return (Criteria) this;
        }

        public Criteria orBankAccountEqualTo(String value) {
            orCriterion("bank_account =", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria orBankAccountNotEqualTo(String value) {
            orCriterion("bank_account <>", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria orBankAccountGreaterThan(String value) {
            orCriterion("bank_account >", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria orBankAccountGreaterThanOrEqualTo(String value) {
            orCriterion("bank_account >=", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria orBankAccountLessThan(String value) {
            orCriterion("bank_account <", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria orBankAccountLessThanOrEqualTo(String value) {
            orCriterion("bank_account <=", value, "bankAccount");
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

        public Criteria orBankAccountLike(String value) {
            orCriterion("bank_account like", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria orBankAccountNotLike(String value) {
            orCriterion("bank_account not like", value, "bankAccount");
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

        public Criteria orBankAccountIn(List<String> values) {
            orCriterion("bank_account in", values, "bankAccount");
            return (Criteria) this;
        }

        public Criteria orBankAccountNotIn(List<String> values) {
            orCriterion("bank_account not in", values, "bankAccount");
            return (Criteria) this;
        }

        public Criteria orBankAccountBetween(String value1, String value2) {
            orCriterion("bank_account between", value1, value2, "bankAccount");
            return (Criteria) this;
        }

        public Criteria orBankAccountNotBetween(String value1, String value2) {
            orCriterion("bank_account not between", value1, value2, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andThumbnailIsNull() {
            addCriterion("thumbnail is null");
            return (Criteria) this;
        }

        public Criteria andThumbnailIsNotNull() {
            addCriterion("thumbnail is not null");
            return (Criteria) this;
        }

        public Criteria andThumbnailEqualTo(String value) {
            addCriterion("thumbnail =", value, "thumbnail");
            return (Criteria) this;
        }

        public Criteria andThumbnailNotEqualTo(String value) {
            addCriterion("thumbnail <>", value, "thumbnail");
            return (Criteria) this;
        }

        public Criteria andThumbnailGreaterThan(String value) {
            addCriterion("thumbnail >", value, "thumbnail");
            return (Criteria) this;
        }

        public Criteria andThumbnailGreaterThanOrEqualTo(String value) {
            addCriterion("thumbnail >=", value, "thumbnail");
            return (Criteria) this;
        }

        public Criteria andThumbnailLessThan(String value) {
            addCriterion("thumbnail <", value, "thumbnail");
            return (Criteria) this;
        }

        public Criteria andThumbnailLessThanOrEqualTo(String value) {
            addCriterion("thumbnail <=", value, "thumbnail");
            return (Criteria) this;
        }

        public Criteria orThumbnailIsNull() {
            orCriterion("thumbnail is null");
            return (Criteria) this;
        }

        public Criteria orThumbnailIsNotNull() {
            orCriterion("thumbnail is not null");
            return (Criteria) this;
        }

        public Criteria orThumbnailEqualTo(String value) {
            orCriterion("thumbnail =", value, "thumbnail");
            return (Criteria) this;
        }

        public Criteria orThumbnailNotEqualTo(String value) {
            orCriterion("thumbnail <>", value, "thumbnail");
            return (Criteria) this;
        }

        public Criteria orThumbnailGreaterThan(String value) {
            orCriterion("thumbnail >", value, "thumbnail");
            return (Criteria) this;
        }

        public Criteria orThumbnailGreaterThanOrEqualTo(String value) {
            orCriterion("thumbnail >=", value, "thumbnail");
            return (Criteria) this;
        }

        public Criteria orThumbnailLessThan(String value) {
            orCriterion("thumbnail <", value, "thumbnail");
            return (Criteria) this;
        }

        public Criteria orThumbnailLessThanOrEqualTo(String value) {
            orCriterion("thumbnail <=", value, "thumbnail");
            return (Criteria) this;
        }

        public Criteria andThumbnailLike(String value) {
            addCriterion("thumbnail like", value, "thumbnail");
            return (Criteria) this;
        }

        public Criteria andThumbnailNotLike(String value) {
            addCriterion("thumbnail not like", value, "thumbnail");
            return (Criteria) this;
        }

        public Criteria orThumbnailLike(String value) {
            orCriterion("thumbnail like", value, "thumbnail");
            return (Criteria) this;
        }

        public Criteria orThumbnailNotLike(String value) {
            orCriterion("thumbnail not like", value, "thumbnail");
            return (Criteria) this;
        }

        public Criteria andThumbnailIn(List<String> values) {
            addCriterion("thumbnail in", values, "thumbnail");
            return (Criteria) this;
        }

        public Criteria andThumbnailNotIn(List<String> values) {
            addCriterion("thumbnail not in", values, "thumbnail");
            return (Criteria) this;
        }

        public Criteria andThumbnailBetween(String value1, String value2) {
            addCriterion("thumbnail between", value1, value2, "thumbnail");
            return (Criteria) this;
        }

        public Criteria andThumbnailNotBetween(String value1, String value2) {
            addCriterion("thumbnail not between", value1, value2, "thumbnail");
            return (Criteria) this;
        }

        public Criteria orThumbnailIn(List<String> values) {
            orCriterion("thumbnail in", values, "thumbnail");
            return (Criteria) this;
        }

        public Criteria orThumbnailNotIn(List<String> values) {
            orCriterion("thumbnail not in", values, "thumbnail");
            return (Criteria) this;
        }

        public Criteria orThumbnailBetween(String value1, String value2) {
            orCriterion("thumbnail between", value1, value2, "thumbnail");
            return (Criteria) this;
        }

        public Criteria orThumbnailNotBetween(String value1, String value2) {
            orCriterion("thumbnail not between", value1, value2, "thumbnail");
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

        public Criteria andAvailableIsNull() {
            addCriterion("available is null");
            return (Criteria) this;
        }

        public Criteria andAvailableIsNotNull() {
            addCriterion("available is not null");
            return (Criteria) this;
        }

        public Criteria andAvailableEqualTo(Double value) {
            addCriterion("available =", value, "available");
            return (Criteria) this;
        }

        public Criteria andAvailableNotEqualTo(Double value) {
            addCriterion("available <>", value, "available");
            return (Criteria) this;
        }

        public Criteria andAvailableGreaterThan(Double value) {
            addCriterion("available >", value, "available");
            return (Criteria) this;
        }

        public Criteria andAvailableGreaterThanOrEqualTo(Double value) {
            addCriterion("available >=", value, "available");
            return (Criteria) this;
        }

        public Criteria andAvailableLessThan(Double value) {
            addCriterion("available <", value, "available");
            return (Criteria) this;
        }

        public Criteria andAvailableLessThanOrEqualTo(Double value) {
            addCriterion("available <=", value, "available");
            return (Criteria) this;
        }

        public Criteria orAvailableIsNull() {
            orCriterion("available is null");
            return (Criteria) this;
        }

        public Criteria orAvailableIsNotNull() {
            orCriterion("available is not null");
            return (Criteria) this;
        }

        public Criteria orAvailableEqualTo(Double value) {
            orCriterion("available =", value, "available");
            return (Criteria) this;
        }

        public Criteria orAvailableNotEqualTo(Double value) {
            orCriterion("available <>", value, "available");
            return (Criteria) this;
        }

        public Criteria orAvailableGreaterThan(Double value) {
            orCriterion("available >", value, "available");
            return (Criteria) this;
        }

        public Criteria orAvailableGreaterThanOrEqualTo(Double value) {
            orCriterion("available >=", value, "available");
            return (Criteria) this;
        }

        public Criteria orAvailableLessThan(Double value) {
            orCriterion("available <", value, "available");
            return (Criteria) this;
        }

        public Criteria orAvailableLessThanOrEqualTo(Double value) {
            orCriterion("available <=", value, "available");
            return (Criteria) this;
        }

        public Criteria andAvailableIn(List<Double> values) {
            addCriterion("available in", values, "available");
            return (Criteria) this;
        }

        public Criteria andAvailableNotIn(List<Double> values) {
            addCriterion("available not in", values, "available");
            return (Criteria) this;
        }

        public Criteria andAvailableBetween(Double value1, Double value2) {
            addCriterion("available between", value1, value2, "available");
            return (Criteria) this;
        }

        public Criteria andAvailableNotBetween(Double value1, Double value2) {
            addCriterion("available not between", value1, value2, "available");
            return (Criteria) this;
        }

        public Criteria orAvailableIn(List<Double> values) {
            orCriterion("available in", values, "available");
            return (Criteria) this;
        }

        public Criteria orAvailableNotIn(List<Double> values) {
            orCriterion("available not in", values, "available");
            return (Criteria) this;
        }

        public Criteria orAvailableBetween(Double value1, Double value2) {
            orCriterion("available between", value1, value2, "available");
            return (Criteria) this;
        }

        public Criteria orAvailableNotBetween(Double value1, Double value2) {
            orCriterion("available not between", value1, value2, "available");
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

        public Criteria andContactFileIsNull() {
            addCriterion("contact_file is null");
            return (Criteria) this;
        }

        public Criteria andContactFileIsNotNull() {
            addCriterion("contact_file is not null");
            return (Criteria) this;
        }

        public Criteria andContactFileEqualTo(String value) {
            addCriterion("contact_file =", value, "contactFile");
            return (Criteria) this;
        }

        public Criteria andContactFileNotEqualTo(String value) {
            addCriterion("contact_file <>", value, "contactFile");
            return (Criteria) this;
        }

        public Criteria andContactFileGreaterThan(String value) {
            addCriterion("contact_file >", value, "contactFile");
            return (Criteria) this;
        }

        public Criteria andContactFileGreaterThanOrEqualTo(String value) {
            addCriterion("contact_file >=", value, "contactFile");
            return (Criteria) this;
        }

        public Criteria andContactFileLessThan(String value) {
            addCriterion("contact_file <", value, "contactFile");
            return (Criteria) this;
        }

        public Criteria andContactFileLessThanOrEqualTo(String value) {
            addCriterion("contact_file <=", value, "contactFile");
            return (Criteria) this;
        }

        public Criteria orContactFileIsNull() {
            orCriterion("contact_file is null");
            return (Criteria) this;
        }

        public Criteria orContactFileIsNotNull() {
            orCriterion("contact_file is not null");
            return (Criteria) this;
        }

        public Criteria orContactFileEqualTo(String value) {
            orCriterion("contact_file =", value, "contactFile");
            return (Criteria) this;
        }

        public Criteria orContactFileNotEqualTo(String value) {
            orCriterion("contact_file <>", value, "contactFile");
            return (Criteria) this;
        }

        public Criteria orContactFileGreaterThan(String value) {
            orCriterion("contact_file >", value, "contactFile");
            return (Criteria) this;
        }

        public Criteria orContactFileGreaterThanOrEqualTo(String value) {
            orCriterion("contact_file >=", value, "contactFile");
            return (Criteria) this;
        }

        public Criteria orContactFileLessThan(String value) {
            orCriterion("contact_file <", value, "contactFile");
            return (Criteria) this;
        }

        public Criteria orContactFileLessThanOrEqualTo(String value) {
            orCriterion("contact_file <=", value, "contactFile");
            return (Criteria) this;
        }

        public Criteria andContactFileLike(String value) {
            addCriterion("contact_file like", value, "contactFile");
            return (Criteria) this;
        }

        public Criteria andContactFileNotLike(String value) {
            addCriterion("contact_file not like", value, "contactFile");
            return (Criteria) this;
        }

        public Criteria orContactFileLike(String value) {
            orCriterion("contact_file like", value, "contactFile");
            return (Criteria) this;
        }

        public Criteria orContactFileNotLike(String value) {
            orCriterion("contact_file not like", value, "contactFile");
            return (Criteria) this;
        }

        public Criteria andContactFileIn(List<String> values) {
            addCriterion("contact_file in", values, "contactFile");
            return (Criteria) this;
        }

        public Criteria andContactFileNotIn(List<String> values) {
            addCriterion("contact_file not in", values, "contactFile");
            return (Criteria) this;
        }

        public Criteria andContactFileBetween(String value1, String value2) {
            addCriterion("contact_file between", value1, value2, "contactFile");
            return (Criteria) this;
        }

        public Criteria andContactFileNotBetween(String value1, String value2) {
            addCriterion("contact_file not between", value1, value2, "contactFile");
            return (Criteria) this;
        }

        public Criteria orContactFileIn(List<String> values) {
            orCriterion("contact_file in", values, "contactFile");
            return (Criteria) this;
        }

        public Criteria orContactFileNotIn(List<String> values) {
            orCriterion("contact_file not in", values, "contactFile");
            return (Criteria) this;
        }

        public Criteria orContactFileBetween(String value1, String value2) {
            orCriterion("contact_file between", value1, value2, "contactFile");
            return (Criteria) this;
        }

        public Criteria orContactFileNotBetween(String value1, String value2) {
            orCriterion("contact_file not between", value1, value2, "contactFile");
            return (Criteria) this;
        }

        public Criteria andOrdersIsNull() {
            addCriterion("orders is null");
            return (Criteria) this;
        }

        public Criteria andOrdersIsNotNull() {
            addCriterion("orders is not null");
            return (Criteria) this;
        }

        public Criteria andOrdersEqualTo(Integer value) {
            addCriterion("orders =", value, "orders");
            return (Criteria) this;
        }

        public Criteria andOrdersNotEqualTo(Integer value) {
            addCriterion("orders <>", value, "orders");
            return (Criteria) this;
        }

        public Criteria andOrdersGreaterThan(Integer value) {
            addCriterion("orders >", value, "orders");
            return (Criteria) this;
        }

        public Criteria andOrdersGreaterThanOrEqualTo(Integer value) {
            addCriterion("orders >=", value, "orders");
            return (Criteria) this;
        }

        public Criteria andOrdersLessThan(Integer value) {
            addCriterion("orders <", value, "orders");
            return (Criteria) this;
        }

        public Criteria andOrdersLessThanOrEqualTo(Integer value) {
            addCriterion("orders <=", value, "orders");
            return (Criteria) this;
        }

        public Criteria orOrdersIsNull() {
            orCriterion("orders is null");
            return (Criteria) this;
        }

        public Criteria orOrdersIsNotNull() {
            orCriterion("orders is not null");
            return (Criteria) this;
        }

        public Criteria orOrdersEqualTo(Integer value) {
            orCriterion("orders =", value, "orders");
            return (Criteria) this;
        }

        public Criteria orOrdersNotEqualTo(Integer value) {
            orCriterion("orders <>", value, "orders");
            return (Criteria) this;
        }

        public Criteria orOrdersGreaterThan(Integer value) {
            orCriterion("orders >", value, "orders");
            return (Criteria) this;
        }

        public Criteria orOrdersGreaterThanOrEqualTo(Integer value) {
            orCriterion("orders >=", value, "orders");
            return (Criteria) this;
        }

        public Criteria orOrdersLessThan(Integer value) {
            orCriterion("orders <", value, "orders");
            return (Criteria) this;
        }

        public Criteria orOrdersLessThanOrEqualTo(Integer value) {
            orCriterion("orders <=", value, "orders");
            return (Criteria) this;
        }

        public Criteria andOrdersIn(List<Integer> values) {
            addCriterion("orders in", values, "orders");
            return (Criteria) this;
        }

        public Criteria andOrdersNotIn(List<Integer> values) {
            addCriterion("orders not in", values, "orders");
            return (Criteria) this;
        }

        public Criteria andOrdersBetween(Integer value1, Integer value2) {
            addCriterion("orders between", value1, value2, "orders");
            return (Criteria) this;
        }

        public Criteria andOrdersNotBetween(Integer value1, Integer value2) {
            addCriterion("orders not between", value1, value2, "orders");
            return (Criteria) this;
        }

        public Criteria orOrdersIn(List<Integer> values) {
            orCriterion("orders in", values, "orders");
            return (Criteria) this;
        }

        public Criteria orOrdersNotIn(List<Integer> values) {
            orCriterion("orders not in", values, "orders");
            return (Criteria) this;
        }

        public Criteria orOrdersBetween(Integer value1, Integer value2) {
            orCriterion("orders between", value1, value2, "orders");
            return (Criteria) this;
        }

        public Criteria orOrdersNotBetween(Integer value1, Integer value2) {
            orCriterion("orders not between", value1, value2, "orders");
            return (Criteria) this;
        }

        public Criteria andHandlingFeeIsNull() {
            addCriterion("handling_fee is null");
            return (Criteria) this;
        }

        public Criteria andHandlingFeeIsNotNull() {
            addCriterion("handling_fee is not null");
            return (Criteria) this;
        }

        public Criteria andHandlingFeeEqualTo(Double value) {
            addCriterion("handling_fee =", value, "handlingFee");
            return (Criteria) this;
        }

        public Criteria andHandlingFeeNotEqualTo(Double value) {
            addCriterion("handling_fee <>", value, "handlingFee");
            return (Criteria) this;
        }

        public Criteria andHandlingFeeGreaterThan(Double value) {
            addCriterion("handling_fee >", value, "handlingFee");
            return (Criteria) this;
        }

        public Criteria andHandlingFeeGreaterThanOrEqualTo(Double value) {
            addCriterion("handling_fee >=", value, "handlingFee");
            return (Criteria) this;
        }

        public Criteria andHandlingFeeLessThan(Double value) {
            addCriterion("handling_fee <", value, "handlingFee");
            return (Criteria) this;
        }

        public Criteria andHandlingFeeLessThanOrEqualTo(Double value) {
            addCriterion("handling_fee <=", value, "handlingFee");
            return (Criteria) this;
        }

        public Criteria orHandlingFeeIsNull() {
            orCriterion("handling_fee is null");
            return (Criteria) this;
        }

        public Criteria orHandlingFeeIsNotNull() {
            orCriterion("handling_fee is not null");
            return (Criteria) this;
        }

        public Criteria orHandlingFeeEqualTo(Double value) {
            orCriterion("handling_fee =", value, "handlingFee");
            return (Criteria) this;
        }

        public Criteria orHandlingFeeNotEqualTo(Double value) {
            orCriterion("handling_fee <>", value, "handlingFee");
            return (Criteria) this;
        }

        public Criteria orHandlingFeeGreaterThan(Double value) {
            orCriterion("handling_fee >", value, "handlingFee");
            return (Criteria) this;
        }

        public Criteria orHandlingFeeGreaterThanOrEqualTo(Double value) {
            orCriterion("handling_fee >=", value, "handlingFee");
            return (Criteria) this;
        }

        public Criteria orHandlingFeeLessThan(Double value) {
            orCriterion("handling_fee <", value, "handlingFee");
            return (Criteria) this;
        }

        public Criteria orHandlingFeeLessThanOrEqualTo(Double value) {
            orCriterion("handling_fee <=", value, "handlingFee");
            return (Criteria) this;
        }

        public Criteria andHandlingFeeIn(List<Double> values) {
            addCriterion("handling_fee in", values, "handlingFee");
            return (Criteria) this;
        }

        public Criteria andHandlingFeeNotIn(List<Double> values) {
            addCriterion("handling_fee not in", values, "handlingFee");
            return (Criteria) this;
        }

        public Criteria andHandlingFeeBetween(Double value1, Double value2) {
            addCriterion("handling_fee between", value1, value2, "handlingFee");
            return (Criteria) this;
        }

        public Criteria andHandlingFeeNotBetween(Double value1, Double value2) {
            addCriterion("handling_fee not between", value1, value2, "handlingFee");
            return (Criteria) this;
        }

        public Criteria orHandlingFeeIn(List<Double> values) {
            orCriterion("handling_fee in", values, "handlingFee");
            return (Criteria) this;
        }

        public Criteria orHandlingFeeNotIn(List<Double> values) {
            orCriterion("handling_fee not in", values, "handlingFee");
            return (Criteria) this;
        }

        public Criteria orHandlingFeeBetween(Double value1, Double value2) {
            orCriterion("handling_fee between", value1, value2, "handlingFee");
            return (Criteria) this;
        }

        public Criteria orHandlingFeeNotBetween(Double value1, Double value2) {
            orCriterion("handling_fee not between", value1, value2, "handlingFee");
            return (Criteria) this;
        }

        public Criteria andLevelIsNull() {
            addCriterion("level is null");
            return (Criteria) this;
        }

        public Criteria andLevelIsNotNull() {
            addCriterion("level is not null");
            return (Criteria) this;
        }

        public Criteria andLevelEqualTo(String value) {
            addCriterion("level =", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotEqualTo(String value) {
            addCriterion("level <>", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThan(String value) {
            addCriterion("level >", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThanOrEqualTo(String value) {
            addCriterion("level >=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThan(String value) {
            addCriterion("level <", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThanOrEqualTo(String value) {
            addCriterion("level <=", value, "level");
            return (Criteria) this;
        }

        public Criteria orLevelIsNull() {
            orCriterion("level is null");
            return (Criteria) this;
        }

        public Criteria orLevelIsNotNull() {
            orCriterion("level is not null");
            return (Criteria) this;
        }

        public Criteria orLevelEqualTo(String value) {
            orCriterion("level =", value, "level");
            return (Criteria) this;
        }

        public Criteria orLevelNotEqualTo(String value) {
            orCriterion("level <>", value, "level");
            return (Criteria) this;
        }

        public Criteria orLevelGreaterThan(String value) {
            orCriterion("level >", value, "level");
            return (Criteria) this;
        }

        public Criteria orLevelGreaterThanOrEqualTo(String value) {
            orCriterion("level >=", value, "level");
            return (Criteria) this;
        }

        public Criteria orLevelLessThan(String value) {
            orCriterion("level <", value, "level");
            return (Criteria) this;
        }

        public Criteria orLevelLessThanOrEqualTo(String value) {
            orCriterion("level <=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLike(String value) {
            addCriterion("level like", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotLike(String value) {
            addCriterion("level not like", value, "level");
            return (Criteria) this;
        }

        public Criteria orLevelLike(String value) {
            orCriterion("level like", value, "level");
            return (Criteria) this;
        }

        public Criteria orLevelNotLike(String value) {
            orCriterion("level not like", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelIn(List<String> values) {
            addCriterion("level in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotIn(List<String> values) {
            addCriterion("level not in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelBetween(String value1, String value2) {
            addCriterion("level between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotBetween(String value1, String value2) {
            addCriterion("level not between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria orLevelIn(List<String> values) {
            orCriterion("level in", values, "level");
            return (Criteria) this;
        }

        public Criteria orLevelNotIn(List<String> values) {
            orCriterion("level not in", values, "level");
            return (Criteria) this;
        }

        public Criteria orLevelBetween(String value1, String value2) {
            orCriterion("level between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria orLevelNotBetween(String value1, String value2) {
            orCriterion("level not between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andInvestScopeIsNull() {
            addCriterion("invest_scope is null");
            return (Criteria) this;
        }

        public Criteria andInvestScopeIsNotNull() {
            addCriterion("invest_scope is not null");
            return (Criteria) this;
        }

        public Criteria andInvestScopeEqualTo(String value) {
            addCriterion("invest_scope =", value, "investScope");
            return (Criteria) this;
        }

        public Criteria andInvestScopeNotEqualTo(String value) {
            addCriterion("invest_scope <>", value, "investScope");
            return (Criteria) this;
        }

        public Criteria andInvestScopeGreaterThan(String value) {
            addCriterion("invest_scope >", value, "investScope");
            return (Criteria) this;
        }

        public Criteria andInvestScopeGreaterThanOrEqualTo(String value) {
            addCriterion("invest_scope >=", value, "investScope");
            return (Criteria) this;
        }

        public Criteria andInvestScopeLessThan(String value) {
            addCriterion("invest_scope <", value, "investScope");
            return (Criteria) this;
        }

        public Criteria andInvestScopeLessThanOrEqualTo(String value) {
            addCriterion("invest_scope <=", value, "investScope");
            return (Criteria) this;
        }

        public Criteria orInvestScopeIsNull() {
            orCriterion("invest_scope is null");
            return (Criteria) this;
        }

        public Criteria orInvestScopeIsNotNull() {
            orCriterion("invest_scope is not null");
            return (Criteria) this;
        }

        public Criteria orInvestScopeEqualTo(String value) {
            orCriterion("invest_scope =", value, "investScope");
            return (Criteria) this;
        }

        public Criteria orInvestScopeNotEqualTo(String value) {
            orCriterion("invest_scope <>", value, "investScope");
            return (Criteria) this;
        }

        public Criteria orInvestScopeGreaterThan(String value) {
            orCriterion("invest_scope >", value, "investScope");
            return (Criteria) this;
        }

        public Criteria orInvestScopeGreaterThanOrEqualTo(String value) {
            orCriterion("invest_scope >=", value, "investScope");
            return (Criteria) this;
        }

        public Criteria orInvestScopeLessThan(String value) {
            orCriterion("invest_scope <", value, "investScope");
            return (Criteria) this;
        }

        public Criteria orInvestScopeLessThanOrEqualTo(String value) {
            orCriterion("invest_scope <=", value, "investScope");
            return (Criteria) this;
        }

        public Criteria andInvestScopeLike(String value) {
            addCriterion("invest_scope like", value, "investScope");
            return (Criteria) this;
        }

        public Criteria andInvestScopeNotLike(String value) {
            addCriterion("invest_scope not like", value, "investScope");
            return (Criteria) this;
        }

        public Criteria orInvestScopeLike(String value) {
            orCriterion("invest_scope like", value, "investScope");
            return (Criteria) this;
        }

        public Criteria orInvestScopeNotLike(String value) {
            orCriterion("invest_scope not like", value, "investScope");
            return (Criteria) this;
        }

        public Criteria andInvestScopeIn(List<String> values) {
            addCriterion("invest_scope in", values, "investScope");
            return (Criteria) this;
        }

        public Criteria andInvestScopeNotIn(List<String> values) {
            addCriterion("invest_scope not in", values, "investScope");
            return (Criteria) this;
        }

        public Criteria andInvestScopeBetween(String value1, String value2) {
            addCriterion("invest_scope between", value1, value2, "investScope");
            return (Criteria) this;
        }

        public Criteria andInvestScopeNotBetween(String value1, String value2) {
            addCriterion("invest_scope not between", value1, value2, "investScope");
            return (Criteria) this;
        }

        public Criteria orInvestScopeIn(List<String> values) {
            orCriterion("invest_scope in", values, "investScope");
            return (Criteria) this;
        }

        public Criteria orInvestScopeNotIn(List<String> values) {
            orCriterion("invest_scope not in", values, "investScope");
            return (Criteria) this;
        }

        public Criteria orInvestScopeBetween(String value1, String value2) {
            orCriterion("invest_scope between", value1, value2, "investScope");
            return (Criteria) this;
        }

        public Criteria orInvestScopeNotBetween(String value1, String value2) {
            orCriterion("invest_scope not between", value1, value2, "investScope");
            return (Criteria) this;
        }
    }

    /**
     * 该类对应数据库表 product
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
     * 该类对应数据库表 product
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