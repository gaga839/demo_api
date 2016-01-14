package com.wocai.jrt.product.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GroupProductBean {
    /**
     * order by 排序语句
     * 对应数据库表字段 group_product
     */
    private String orderBy;

    /**
     * 分页开始记录
     * 对应数据库表字段 group_product
     */
    private Integer start;

    /**
     * 分页大小
     * 对应数据库表字段 group_product
     */
    private int pageSize = 10;

    /**
     * 是否指定 distinct 去除重复
     * 对应数据库表字段 group_product
     */
    private boolean distinct;

    /**
     * 逻辑or语句
     * 对应数据库表字段 group_product
     */
    private List<Criteria> oredCriteria;

    /**
     */
    public GroupProductBean() {
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
     * 该类对应数据库表 group_product
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

        public Criteria andGroupIdIsNull() {
            addCriterion("group_id is null");
            return (Criteria) this;
        }

        public Criteria andGroupIdIsNotNull() {
            addCriterion("group_id is not null");
            return (Criteria) this;
        }

        public Criteria andGroupIdEqualTo(String value) {
            addCriterion("group_id =", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotEqualTo(String value) {
            addCriterion("group_id <>", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdGreaterThan(String value) {
            addCriterion("group_id >", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdGreaterThanOrEqualTo(String value) {
            addCriterion("group_id >=", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdLessThan(String value) {
            addCriterion("group_id <", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdLessThanOrEqualTo(String value) {
            addCriterion("group_id <=", value, "groupId");
            return (Criteria) this;
        }

        public Criteria orGroupIdIsNull() {
            orCriterion("group_id is null");
            return (Criteria) this;
        }

        public Criteria orGroupIdIsNotNull() {
            orCriterion("group_id is not null");
            return (Criteria) this;
        }

        public Criteria orGroupIdEqualTo(String value) {
            orCriterion("group_id =", value, "groupId");
            return (Criteria) this;
        }

        public Criteria orGroupIdNotEqualTo(String value) {
            orCriterion("group_id <>", value, "groupId");
            return (Criteria) this;
        }

        public Criteria orGroupIdGreaterThan(String value) {
            orCriterion("group_id >", value, "groupId");
            return (Criteria) this;
        }

        public Criteria orGroupIdGreaterThanOrEqualTo(String value) {
            orCriterion("group_id >=", value, "groupId");
            return (Criteria) this;
        }

        public Criteria orGroupIdLessThan(String value) {
            orCriterion("group_id <", value, "groupId");
            return (Criteria) this;
        }

        public Criteria orGroupIdLessThanOrEqualTo(String value) {
            orCriterion("group_id <=", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdLike(String value) {
            addCriterion("group_id like", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotLike(String value) {
            addCriterion("group_id not like", value, "groupId");
            return (Criteria) this;
        }

        public Criteria orGroupIdLike(String value) {
            orCriterion("group_id like", value, "groupId");
            return (Criteria) this;
        }

        public Criteria orGroupIdNotLike(String value) {
            orCriterion("group_id not like", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdIn(List<String> values) {
            addCriterion("group_id in", values, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotIn(List<String> values) {
            addCriterion("group_id not in", values, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdBetween(String value1, String value2) {
            addCriterion("group_id between", value1, value2, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotBetween(String value1, String value2) {
            addCriterion("group_id not between", value1, value2, "groupId");
            return (Criteria) this;
        }

        public Criteria orGroupIdIn(List<String> values) {
            orCriterion("group_id in", values, "groupId");
            return (Criteria) this;
        }

        public Criteria orGroupIdNotIn(List<String> values) {
            orCriterion("group_id not in", values, "groupId");
            return (Criteria) this;
        }

        public Criteria orGroupIdBetween(String value1, String value2) {
            orCriterion("group_id between", value1, value2, "groupId");
            return (Criteria) this;
        }

        public Criteria orGroupIdNotBetween(String value1, String value2) {
            orCriterion("group_id not between", value1, value2, "groupId");
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

        public Criteria orProductIdIsNull() {
            orCriterion("product_id is null");
            return (Criteria) this;
        }

        public Criteria orProductIdIsNotNull() {
            orCriterion("product_id is not null");
            return (Criteria) this;
        }

        public Criteria orProductIdEqualTo(String value) {
            orCriterion("product_id =", value, "productId");
            return (Criteria) this;
        }

        public Criteria orProductIdNotEqualTo(String value) {
            orCriterion("product_id <>", value, "productId");
            return (Criteria) this;
        }

        public Criteria orProductIdGreaterThan(String value) {
            orCriterion("product_id >", value, "productId");
            return (Criteria) this;
        }

        public Criteria orProductIdGreaterThanOrEqualTo(String value) {
            orCriterion("product_id >=", value, "productId");
            return (Criteria) this;
        }

        public Criteria orProductIdLessThan(String value) {
            orCriterion("product_id <", value, "productId");
            return (Criteria) this;
        }

        public Criteria orProductIdLessThanOrEqualTo(String value) {
            orCriterion("product_id <=", value, "productId");
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

        public Criteria orProductIdLike(String value) {
            orCriterion("product_id like", value, "productId");
            return (Criteria) this;
        }

        public Criteria orProductIdNotLike(String value) {
            orCriterion("product_id not like", value, "productId");
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

        public Criteria orProductIdIn(List<String> values) {
            orCriterion("product_id in", values, "productId");
            return (Criteria) this;
        }

        public Criteria orProductIdNotIn(List<String> values) {
            orCriterion("product_id not in", values, "productId");
            return (Criteria) this;
        }

        public Criteria orProductIdBetween(String value1, String value2) {
            orCriterion("product_id between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria orProductIdNotBetween(String value1, String value2) {
            orCriterion("product_id not between", value1, value2, "productId");
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
    }

    /**
     * 该类对应数据库表 group_product
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
     * 该类对应数据库表 group_product
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