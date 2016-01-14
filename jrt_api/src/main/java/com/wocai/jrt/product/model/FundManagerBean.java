package com.wocai.jrt.product.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FundManagerBean {
    /**
     * order by 排序语句
     * 对应数据库表字段 fund_manager
     */
    private String orderBy;

    /**
     * 分页开始记录
     * 对应数据库表字段 fund_manager
     */
    private Integer start;

    /**
     * 分页大小
     * 对应数据库表字段 fund_manager
     */
    private int pageSize = 10;

    /**
     * 是否指定 distinct 去除重复
     * 对应数据库表字段 fund_manager
     */
    private boolean distinct;

    /**
     * 逻辑or语句
     * 对应数据库表字段 fund_manager
     */
    private List<Criteria> oredCriteria;

    /**
     */
    public FundManagerBean() {
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
     * 该类对应数据库表 fund_manager
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

        public Criteria andAvatarIsNull() {
            addCriterion("avatar is null");
            return (Criteria) this;
        }

        public Criteria andAvatarIsNotNull() {
            addCriterion("avatar is not null");
            return (Criteria) this;
        }

        public Criteria andAvatarEqualTo(String value) {
            addCriterion("avatar =", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarNotEqualTo(String value) {
            addCriterion("avatar <>", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarGreaterThan(String value) {
            addCriterion("avatar >", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarGreaterThanOrEqualTo(String value) {
            addCriterion("avatar >=", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarLessThan(String value) {
            addCriterion("avatar <", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarLessThanOrEqualTo(String value) {
            addCriterion("avatar <=", value, "avatar");
            return (Criteria) this;
        }

        public Criteria orAvatarIsNull() {
            orCriterion("avatar is null");
            return (Criteria) this;
        }

        public Criteria orAvatarIsNotNull() {
            orCriterion("avatar is not null");
            return (Criteria) this;
        }

        public Criteria orAvatarEqualTo(String value) {
            orCriterion("avatar =", value, "avatar");
            return (Criteria) this;
        }

        public Criteria orAvatarNotEqualTo(String value) {
            orCriterion("avatar <>", value, "avatar");
            return (Criteria) this;
        }

        public Criteria orAvatarGreaterThan(String value) {
            orCriterion("avatar >", value, "avatar");
            return (Criteria) this;
        }

        public Criteria orAvatarGreaterThanOrEqualTo(String value) {
            orCriterion("avatar >=", value, "avatar");
            return (Criteria) this;
        }

        public Criteria orAvatarLessThan(String value) {
            orCriterion("avatar <", value, "avatar");
            return (Criteria) this;
        }

        public Criteria orAvatarLessThanOrEqualTo(String value) {
            orCriterion("avatar <=", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarLike(String value) {
            addCriterion("avatar like", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarNotLike(String value) {
            addCriterion("avatar not like", value, "avatar");
            return (Criteria) this;
        }

        public Criteria orAvatarLike(String value) {
            orCriterion("avatar like", value, "avatar");
            return (Criteria) this;
        }

        public Criteria orAvatarNotLike(String value) {
            orCriterion("avatar not like", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarIn(List<String> values) {
            addCriterion("avatar in", values, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarNotIn(List<String> values) {
            addCriterion("avatar not in", values, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarBetween(String value1, String value2) {
            addCriterion("avatar between", value1, value2, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarNotBetween(String value1, String value2) {
            addCriterion("avatar not between", value1, value2, "avatar");
            return (Criteria) this;
        }

        public Criteria orAvatarIn(List<String> values) {
            orCriterion("avatar in", values, "avatar");
            return (Criteria) this;
        }

        public Criteria orAvatarNotIn(List<String> values) {
            orCriterion("avatar not in", values, "avatar");
            return (Criteria) this;
        }

        public Criteria orAvatarBetween(String value1, String value2) {
            orCriterion("avatar between", value1, value2, "avatar");
            return (Criteria) this;
        }

        public Criteria orAvatarNotBetween(String value1, String value2) {
            orCriterion("avatar not between", value1, value2, "avatar");
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

        public Criteria andGenderIsNull() {
            addCriterion("gender is null");
            return (Criteria) this;
        }

        public Criteria andGenderIsNotNull() {
            addCriterion("gender is not null");
            return (Criteria) this;
        }

        public Criteria andGenderEqualTo(Integer value) {
            addCriterion("gender =", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotEqualTo(Integer value) {
            addCriterion("gender <>", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThan(Integer value) {
            addCriterion("gender >", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThanOrEqualTo(Integer value) {
            addCriterion("gender >=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThan(Integer value) {
            addCriterion("gender <", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThanOrEqualTo(Integer value) {
            addCriterion("gender <=", value, "gender");
            return (Criteria) this;
        }

        public Criteria orGenderIsNull() {
            orCriterion("gender is null");
            return (Criteria) this;
        }

        public Criteria orGenderIsNotNull() {
            orCriterion("gender is not null");
            return (Criteria) this;
        }

        public Criteria orGenderEqualTo(Integer value) {
            orCriterion("gender =", value, "gender");
            return (Criteria) this;
        }

        public Criteria orGenderNotEqualTo(Integer value) {
            orCriterion("gender <>", value, "gender");
            return (Criteria) this;
        }

        public Criteria orGenderGreaterThan(Integer value) {
            orCriterion("gender >", value, "gender");
            return (Criteria) this;
        }

        public Criteria orGenderGreaterThanOrEqualTo(Integer value) {
            orCriterion("gender >=", value, "gender");
            return (Criteria) this;
        }

        public Criteria orGenderLessThan(Integer value) {
            orCriterion("gender <", value, "gender");
            return (Criteria) this;
        }

        public Criteria orGenderLessThanOrEqualTo(Integer value) {
            orCriterion("gender <=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderIn(List<Integer> values) {
            addCriterion("gender in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotIn(List<Integer> values) {
            addCriterion("gender not in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderBetween(Integer value1, Integer value2) {
            addCriterion("gender between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotBetween(Integer value1, Integer value2) {
            addCriterion("gender not between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria orGenderIn(List<Integer> values) {
            orCriterion("gender in", values, "gender");
            return (Criteria) this;
        }

        public Criteria orGenderNotIn(List<Integer> values) {
            orCriterion("gender not in", values, "gender");
            return (Criteria) this;
        }

        public Criteria orGenderBetween(Integer value1, Integer value2) {
            orCriterion("gender between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria orGenderNotBetween(Integer value1, Integer value2) {
            orCriterion("gender not between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andFundNumberIsNull() {
            addCriterion("fund_number is null");
            return (Criteria) this;
        }

        public Criteria andFundNumberIsNotNull() {
            addCriterion("fund_number is not null");
            return (Criteria) this;
        }

        public Criteria andFundNumberEqualTo(Integer value) {
            addCriterion("fund_number =", value, "fundNumber");
            return (Criteria) this;
        }

        public Criteria andFundNumberNotEqualTo(Integer value) {
            addCriterion("fund_number <>", value, "fundNumber");
            return (Criteria) this;
        }

        public Criteria andFundNumberGreaterThan(Integer value) {
            addCriterion("fund_number >", value, "fundNumber");
            return (Criteria) this;
        }

        public Criteria andFundNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("fund_number >=", value, "fundNumber");
            return (Criteria) this;
        }

        public Criteria andFundNumberLessThan(Integer value) {
            addCriterion("fund_number <", value, "fundNumber");
            return (Criteria) this;
        }

        public Criteria andFundNumberLessThanOrEqualTo(Integer value) {
            addCriterion("fund_number <=", value, "fundNumber");
            return (Criteria) this;
        }

        public Criteria orFundNumberIsNull() {
            orCriterion("fund_number is null");
            return (Criteria) this;
        }

        public Criteria orFundNumberIsNotNull() {
            orCriterion("fund_number is not null");
            return (Criteria) this;
        }

        public Criteria orFundNumberEqualTo(Integer value) {
            orCriterion("fund_number =", value, "fundNumber");
            return (Criteria) this;
        }

        public Criteria orFundNumberNotEqualTo(Integer value) {
            orCriterion("fund_number <>", value, "fundNumber");
            return (Criteria) this;
        }

        public Criteria orFundNumberGreaterThan(Integer value) {
            orCriterion("fund_number >", value, "fundNumber");
            return (Criteria) this;
        }

        public Criteria orFundNumberGreaterThanOrEqualTo(Integer value) {
            orCriterion("fund_number >=", value, "fundNumber");
            return (Criteria) this;
        }

        public Criteria orFundNumberLessThan(Integer value) {
            orCriterion("fund_number <", value, "fundNumber");
            return (Criteria) this;
        }

        public Criteria orFundNumberLessThanOrEqualTo(Integer value) {
            orCriterion("fund_number <=", value, "fundNumber");
            return (Criteria) this;
        }

        public Criteria andFundNumberIn(List<Integer> values) {
            addCriterion("fund_number in", values, "fundNumber");
            return (Criteria) this;
        }

        public Criteria andFundNumberNotIn(List<Integer> values) {
            addCriterion("fund_number not in", values, "fundNumber");
            return (Criteria) this;
        }

        public Criteria andFundNumberBetween(Integer value1, Integer value2) {
            addCriterion("fund_number between", value1, value2, "fundNumber");
            return (Criteria) this;
        }

        public Criteria andFundNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("fund_number not between", value1, value2, "fundNumber");
            return (Criteria) this;
        }

        public Criteria orFundNumberIn(List<Integer> values) {
            orCriterion("fund_number in", values, "fundNumber");
            return (Criteria) this;
        }

        public Criteria orFundNumberNotIn(List<Integer> values) {
            orCriterion("fund_number not in", values, "fundNumber");
            return (Criteria) this;
        }

        public Criteria orFundNumberBetween(Integer value1, Integer value2) {
            orCriterion("fund_number between", value1, value2, "fundNumber");
            return (Criteria) this;
        }

        public Criteria orFundNumberNotBetween(Integer value1, Integer value2) {
            orCriterion("fund_number not between", value1, value2, "fundNumber");
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
     * 该类对应数据库表 fund_manager
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
     * 该类对应数据库表 fund_manager
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