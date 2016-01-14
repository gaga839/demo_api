package com.wocai.jrt.ads.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AdsBean {
    /**
     * order by 排序语句
     * 对应数据库表字段 ads
     */
    private String orderBy;

    /**
     * 分页开始记录
     * 对应数据库表字段 ads
     */
    private Integer start;

    /**
     * 分页大小
     * 对应数据库表字段 ads
     */
    private int pageSize = 10;

    /**
     * 是否指定 distinct 去除重复
     * 对应数据库表字段 ads
     */
    private boolean distinct;

    /**
     * 逻辑or语句
     * 对应数据库表字段 ads
     */
    private List<Criteria> oredCriteria;

    /**
     */
    public AdsBean() {
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
     * 该类对应数据库表 ads
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

        public Criteria andAdsNameIsNull() {
            addCriterion("ads_name is null");
            return (Criteria) this;
        }

        public Criteria andAdsNameIsNotNull() {
            addCriterion("ads_name is not null");
            return (Criteria) this;
        }

        public Criteria andAdsNameEqualTo(String value) {
            addCriterion("ads_name =", value, "adsName");
            return (Criteria) this;
        }

        public Criteria andAdsNameNotEqualTo(String value) {
            addCriterion("ads_name <>", value, "adsName");
            return (Criteria) this;
        }

        public Criteria andAdsNameGreaterThan(String value) {
            addCriterion("ads_name >", value, "adsName");
            return (Criteria) this;
        }

        public Criteria andAdsNameGreaterThanOrEqualTo(String value) {
            addCriterion("ads_name >=", value, "adsName");
            return (Criteria) this;
        }

        public Criteria andAdsNameLessThan(String value) {
            addCriterion("ads_name <", value, "adsName");
            return (Criteria) this;
        }

        public Criteria andAdsNameLessThanOrEqualTo(String value) {
            addCriterion("ads_name <=", value, "adsName");
            return (Criteria) this;
        }

        public Criteria orAdsNameIsNull() {
            orCriterion("ads_name is null");
            return (Criteria) this;
        }

        public Criteria orAdsNameIsNotNull() {
            orCriterion("ads_name is not null");
            return (Criteria) this;
        }

        public Criteria orAdsNameEqualTo(String value) {
            orCriterion("ads_name =", value, "adsName");
            return (Criteria) this;
        }

        public Criteria orAdsNameNotEqualTo(String value) {
            orCriterion("ads_name <>", value, "adsName");
            return (Criteria) this;
        }

        public Criteria orAdsNameGreaterThan(String value) {
            orCriterion("ads_name >", value, "adsName");
            return (Criteria) this;
        }

        public Criteria orAdsNameGreaterThanOrEqualTo(String value) {
            orCriterion("ads_name >=", value, "adsName");
            return (Criteria) this;
        }

        public Criteria orAdsNameLessThan(String value) {
            orCriterion("ads_name <", value, "adsName");
            return (Criteria) this;
        }

        public Criteria orAdsNameLessThanOrEqualTo(String value) {
            orCriterion("ads_name <=", value, "adsName");
            return (Criteria) this;
        }

        public Criteria andAdsNameLike(String value) {
            addCriterion("ads_name like", value, "adsName");
            return (Criteria) this;
        }

        public Criteria andAdsNameNotLike(String value) {
            addCriterion("ads_name not like", value, "adsName");
            return (Criteria) this;
        }

        public Criteria orAdsNameLike(String value) {
            orCriterion("ads_name like", value, "adsName");
            return (Criteria) this;
        }

        public Criteria orAdsNameNotLike(String value) {
            orCriterion("ads_name not like", value, "adsName");
            return (Criteria) this;
        }

        public Criteria andAdsNameIn(List<String> values) {
            addCriterion("ads_name in", values, "adsName");
            return (Criteria) this;
        }

        public Criteria andAdsNameNotIn(List<String> values) {
            addCriterion("ads_name not in", values, "adsName");
            return (Criteria) this;
        }

        public Criteria andAdsNameBetween(String value1, String value2) {
            addCriterion("ads_name between", value1, value2, "adsName");
            return (Criteria) this;
        }

        public Criteria andAdsNameNotBetween(String value1, String value2) {
            addCriterion("ads_name not between", value1, value2, "adsName");
            return (Criteria) this;
        }

        public Criteria orAdsNameIn(List<String> values) {
            orCriterion("ads_name in", values, "adsName");
            return (Criteria) this;
        }

        public Criteria orAdsNameNotIn(List<String> values) {
            orCriterion("ads_name not in", values, "adsName");
            return (Criteria) this;
        }

        public Criteria orAdsNameBetween(String value1, String value2) {
            orCriterion("ads_name between", value1, value2, "adsName");
            return (Criteria) this;
        }

        public Criteria orAdsNameNotBetween(String value1, String value2) {
            orCriterion("ads_name not between", value1, value2, "adsName");
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

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(Boolean value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Boolean value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Boolean value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Boolean value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Boolean value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Boolean value) {
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

        public Criteria orStateEqualTo(Boolean value) {
            orCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria orStateNotEqualTo(Boolean value) {
            orCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria orStateGreaterThan(Boolean value) {
            orCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria orStateGreaterThanOrEqualTo(Boolean value) {
            orCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria orStateLessThan(Boolean value) {
            orCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria orStateLessThanOrEqualTo(Boolean value) {
            orCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Boolean> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Boolean> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Boolean value1, Boolean value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Boolean value1, Boolean value2) {
            addCriterion("state not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria orStateIn(List<Boolean> values) {
            orCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria orStateNotIn(List<Boolean> values) {
            orCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria orStateBetween(Boolean value1, Boolean value2) {
            orCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria orStateNotBetween(Boolean value1, Boolean value2) {
            orCriterion("state not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andPublishTimeIsNull() {
            addCriterion("publish_time is null");
            return (Criteria) this;
        }

        public Criteria andPublishTimeIsNotNull() {
            addCriterion("publish_time is not null");
            return (Criteria) this;
        }

        public Criteria andPublishTimeEqualTo(Date value) {
            addCriterion("publish_time =", value, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeNotEqualTo(Date value) {
            addCriterion("publish_time <>", value, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeGreaterThan(Date value) {
            addCriterion("publish_time >", value, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("publish_time >=", value, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeLessThan(Date value) {
            addCriterion("publish_time <", value, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeLessThanOrEqualTo(Date value) {
            addCriterion("publish_time <=", value, "publishTime");
            return (Criteria) this;
        }

        public Criteria orPublishTimeIsNull() {
            orCriterion("publish_time is null");
            return (Criteria) this;
        }

        public Criteria orPublishTimeIsNotNull() {
            orCriterion("publish_time is not null");
            return (Criteria) this;
        }

        public Criteria orPublishTimeEqualTo(Date value) {
            orCriterion("publish_time =", value, "publishTime");
            return (Criteria) this;
        }

        public Criteria orPublishTimeNotEqualTo(Date value) {
            orCriterion("publish_time <>", value, "publishTime");
            return (Criteria) this;
        }

        public Criteria orPublishTimeGreaterThan(Date value) {
            orCriterion("publish_time >", value, "publishTime");
            return (Criteria) this;
        }

        public Criteria orPublishTimeGreaterThanOrEqualTo(Date value) {
            orCriterion("publish_time >=", value, "publishTime");
            return (Criteria) this;
        }

        public Criteria orPublishTimeLessThan(Date value) {
            orCriterion("publish_time <", value, "publishTime");
            return (Criteria) this;
        }

        public Criteria orPublishTimeLessThanOrEqualTo(Date value) {
            orCriterion("publish_time <=", value, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeIn(List<Date> values) {
            addCriterion("publish_time in", values, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeNotIn(List<Date> values) {
            addCriterion("publish_time not in", values, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeBetween(Date value1, Date value2) {
            addCriterion("publish_time between", value1, value2, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeNotBetween(Date value1, Date value2) {
            addCriterion("publish_time not between", value1, value2, "publishTime");
            return (Criteria) this;
        }

        public Criteria orPublishTimeIn(List<Date> values) {
            orCriterion("publish_time in", values, "publishTime");
            return (Criteria) this;
        }

        public Criteria orPublishTimeNotIn(List<Date> values) {
            orCriterion("publish_time not in", values, "publishTime");
            return (Criteria) this;
        }

        public Criteria orPublishTimeBetween(Date value1, Date value2) {
            orCriterion("publish_time between", value1, value2, "publishTime");
            return (Criteria) this;
        }

        public Criteria orPublishTimeNotBetween(Date value1, Date value2) {
            orCriterion("publish_time not between", value1, value2, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPlatformIsNull() {
            addCriterion("platform is null");
            return (Criteria) this;
        }

        public Criteria andPlatformIsNotNull() {
            addCriterion("platform is not null");
            return (Criteria) this;
        }

        public Criteria andPlatformEqualTo(Integer value) {
            addCriterion("platform =", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformNotEqualTo(Integer value) {
            addCriterion("platform <>", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformGreaterThan(Integer value) {
            addCriterion("platform >", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformGreaterThanOrEqualTo(Integer value) {
            addCriterion("platform >=", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformLessThan(Integer value) {
            addCriterion("platform <", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformLessThanOrEqualTo(Integer value) {
            addCriterion("platform <=", value, "platform");
            return (Criteria) this;
        }

        public Criteria orPlatformIsNull() {
            orCriterion("platform is null");
            return (Criteria) this;
        }

        public Criteria orPlatformIsNotNull() {
            orCriterion("platform is not null");
            return (Criteria) this;
        }

        public Criteria orPlatformEqualTo(Integer value) {
            orCriterion("platform =", value, "platform");
            return (Criteria) this;
        }

        public Criteria orPlatformNotEqualTo(Integer value) {
            orCriterion("platform <>", value, "platform");
            return (Criteria) this;
        }

        public Criteria orPlatformGreaterThan(Integer value) {
            orCriterion("platform >", value, "platform");
            return (Criteria) this;
        }

        public Criteria orPlatformGreaterThanOrEqualTo(Integer value) {
            orCriterion("platform >=", value, "platform");
            return (Criteria) this;
        }

        public Criteria orPlatformLessThan(Integer value) {
            orCriterion("platform <", value, "platform");
            return (Criteria) this;
        }

        public Criteria orPlatformLessThanOrEqualTo(Integer value) {
            orCriterion("platform <=", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformIn(List<Integer> values) {
            addCriterion("platform in", values, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformNotIn(List<Integer> values) {
            addCriterion("platform not in", values, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformBetween(Integer value1, Integer value2) {
            addCriterion("platform between", value1, value2, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformNotBetween(Integer value1, Integer value2) {
            addCriterion("platform not between", value1, value2, "platform");
            return (Criteria) this;
        }

        public Criteria orPlatformIn(List<Integer> values) {
            orCriterion("platform in", values, "platform");
            return (Criteria) this;
        }

        public Criteria orPlatformNotIn(List<Integer> values) {
            orCriterion("platform not in", values, "platform");
            return (Criteria) this;
        }

        public Criteria orPlatformBetween(Integer value1, Integer value2) {
            orCriterion("platform between", value1, value2, "platform");
            return (Criteria) this;
        }

        public Criteria orPlatformNotBetween(Integer value1, Integer value2) {
            orCriterion("platform not between", value1, value2, "platform");
            return (Criteria) this;
        }

        public Criteria andUrlIsNull() {
            addCriterion("url is null");
            return (Criteria) this;
        }

        public Criteria andUrlIsNotNull() {
            addCriterion("url is not null");
            return (Criteria) this;
        }

        public Criteria andUrlEqualTo(String value) {
            addCriterion("url =", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotEqualTo(String value) {
            addCriterion("url <>", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThan(String value) {
            addCriterion("url >", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThanOrEqualTo(String value) {
            addCriterion("url >=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThan(String value) {
            addCriterion("url <", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThanOrEqualTo(String value) {
            addCriterion("url <=", value, "url");
            return (Criteria) this;
        }

        public Criteria orUrlIsNull() {
            orCriterion("url is null");
            return (Criteria) this;
        }

        public Criteria orUrlIsNotNull() {
            orCriterion("url is not null");
            return (Criteria) this;
        }

        public Criteria orUrlEqualTo(String value) {
            orCriterion("url =", value, "url");
            return (Criteria) this;
        }

        public Criteria orUrlNotEqualTo(String value) {
            orCriterion("url <>", value, "url");
            return (Criteria) this;
        }

        public Criteria orUrlGreaterThan(String value) {
            orCriterion("url >", value, "url");
            return (Criteria) this;
        }

        public Criteria orUrlGreaterThanOrEqualTo(String value) {
            orCriterion("url >=", value, "url");
            return (Criteria) this;
        }

        public Criteria orUrlLessThan(String value) {
            orCriterion("url <", value, "url");
            return (Criteria) this;
        }

        public Criteria orUrlLessThanOrEqualTo(String value) {
            orCriterion("url <=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLike(String value) {
            addCriterion("url like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotLike(String value) {
            addCriterion("url not like", value, "url");
            return (Criteria) this;
        }

        public Criteria orUrlLike(String value) {
            orCriterion("url like", value, "url");
            return (Criteria) this;
        }

        public Criteria orUrlNotLike(String value) {
            orCriterion("url not like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlIn(List<String> values) {
            addCriterion("url in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotIn(List<String> values) {
            addCriterion("url not in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlBetween(String value1, String value2) {
            addCriterion("url between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotBetween(String value1, String value2) {
            addCriterion("url not between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria orUrlIn(List<String> values) {
            orCriterion("url in", values, "url");
            return (Criteria) this;
        }

        public Criteria orUrlNotIn(List<String> values) {
            orCriterion("url not in", values, "url");
            return (Criteria) this;
        }

        public Criteria orUrlBetween(String value1, String value2) {
            orCriterion("url between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria orUrlNotBetween(String value1, String value2) {
            orCriterion("url not between", value1, value2, "url");
            return (Criteria) this;
        }
    }

    /**
     * 该类对应数据库表 ads
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
     * 该类对应数据库表 ads
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