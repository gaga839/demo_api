package com.wocai.jrt.investor.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class InvestorBean {
    /**
     * order by 排序语句
     * 对应数据库表字段 investor
     */
    private String orderBy;

    /**
     * 分页开始记录
     * 对应数据库表字段 investor
     */
    private Integer start;

    /**
     * 分页大小
     * 对应数据库表字段 investor
     */
    private int pageSize = 10;

    /**
     * 是否指定 distinct 去除重复
     * 对应数据库表字段 investor
     */
    private boolean distinct;

    /**
     * 逻辑or语句
     * 对应数据库表字段 investor
     */
    private List<Criteria> oredCriteria;

    /**
     */
    public InvestorBean() {
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
     * 该类对应数据库表 investor
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

        public Criteria andRegisterTimeIsNull() {
            addCriterion("register_time is null");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeIsNotNull() {
            addCriterion("register_time is not null");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeEqualTo(Date value) {
            addCriterion("register_time =", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeNotEqualTo(Date value) {
            addCriterion("register_time <>", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeGreaterThan(Date value) {
            addCriterion("register_time >", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("register_time >=", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeLessThan(Date value) {
            addCriterion("register_time <", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeLessThanOrEqualTo(Date value) {
            addCriterion("register_time <=", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria orRegisterTimeIsNull() {
            orCriterion("register_time is null");
            return (Criteria) this;
        }

        public Criteria orRegisterTimeIsNotNull() {
            orCriterion("register_time is not null");
            return (Criteria) this;
        }

        public Criteria orRegisterTimeEqualTo(Date value) {
            orCriterion("register_time =", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria orRegisterTimeNotEqualTo(Date value) {
            orCriterion("register_time <>", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria orRegisterTimeGreaterThan(Date value) {
            orCriterion("register_time >", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria orRegisterTimeGreaterThanOrEqualTo(Date value) {
            orCriterion("register_time >=", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria orRegisterTimeLessThan(Date value) {
            orCriterion("register_time <", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria orRegisterTimeLessThanOrEqualTo(Date value) {
            orCriterion("register_time <=", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeIn(List<Date> values) {
            addCriterion("register_time in", values, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeNotIn(List<Date> values) {
            addCriterion("register_time not in", values, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeBetween(Date value1, Date value2) {
            addCriterion("register_time between", value1, value2, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeNotBetween(Date value1, Date value2) {
            addCriterion("register_time not between", value1, value2, "registerTime");
            return (Criteria) this;
        }

        public Criteria orRegisterTimeIn(List<Date> values) {
            orCriterion("register_time in", values, "registerTime");
            return (Criteria) this;
        }

        public Criteria orRegisterTimeNotIn(List<Date> values) {
            orCriterion("register_time not in", values, "registerTime");
            return (Criteria) this;
        }

        public Criteria orRegisterTimeBetween(Date value1, Date value2) {
            orCriterion("register_time between", value1, value2, "registerTime");
            return (Criteria) this;
        }

        public Criteria orRegisterTimeNotBetween(Date value1, Date value2) {
            orCriterion("register_time not between", value1, value2, "registerTime");
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

        public Criteria andBirthdayIsNull() {
            addCriterion("birthday is null");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNotNull() {
            addCriterion("birthday is not null");
            return (Criteria) this;
        }

        public Criteria andBirthdayEqualTo(Date value) {
            addCriterion("birthday =", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotEqualTo(Date value) {
            addCriterion("birthday <>", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThan(Date value) {
            addCriterion("birthday >", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThanOrEqualTo(Date value) {
            addCriterion("birthday >=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThan(Date value) {
            addCriterion("birthday <", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThanOrEqualTo(Date value) {
            addCriterion("birthday <=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria orBirthdayIsNull() {
            orCriterion("birthday is null");
            return (Criteria) this;
        }

        public Criteria orBirthdayIsNotNull() {
            orCriterion("birthday is not null");
            return (Criteria) this;
        }

        public Criteria orBirthdayEqualTo(Date value) {
            orCriterion("birthday =", value, "birthday");
            return (Criteria) this;
        }

        public Criteria orBirthdayNotEqualTo(Date value) {
            orCriterion("birthday <>", value, "birthday");
            return (Criteria) this;
        }

        public Criteria orBirthdayGreaterThan(Date value) {
            orCriterion("birthday >", value, "birthday");
            return (Criteria) this;
        }

        public Criteria orBirthdayGreaterThanOrEqualTo(Date value) {
            orCriterion("birthday >=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria orBirthdayLessThan(Date value) {
            orCriterion("birthday <", value, "birthday");
            return (Criteria) this;
        }

        public Criteria orBirthdayLessThanOrEqualTo(Date value) {
            orCriterion("birthday <=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayIn(List<Date> values) {
            addCriterion("birthday in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotIn(List<Date> values) {
            addCriterion("birthday not in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayBetween(Date value1, Date value2) {
            addCriterion("birthday between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotBetween(Date value1, Date value2) {
            addCriterion("birthday not between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria orBirthdayIn(List<Date> values) {
            orCriterion("birthday in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria orBirthdayNotIn(List<Date> values) {
            orCriterion("birthday not in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria orBirthdayBetween(Date value1, Date value2) {
            orCriterion("birthday between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria orBirthdayNotBetween(Date value1, Date value2) {
            orCriterion("birthday not between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria orEmailIsNull() {
            orCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria orEmailIsNotNull() {
            orCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria orEmailEqualTo(String value) {
            orCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria orEmailNotEqualTo(String value) {
            orCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria orEmailGreaterThan(String value) {
            orCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria orEmailGreaterThanOrEqualTo(String value) {
            orCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria orEmailLessThan(String value) {
            orCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria orEmailLessThanOrEqualTo(String value) {
            orCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria orEmailLike(String value) {
            orCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria orEmailNotLike(String value) {
            orCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria orEmailIn(List<String> values) {
            orCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria orEmailNotIn(List<String> values) {
            orCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria orEmailBetween(String value1, String value2) {
            orCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria orEmailNotBetween(String value1, String value2) {
            orCriterion("email not between", value1, value2, "email");
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

        public Criteria andIdcardIsNull() {
            addCriterion("idcard is null");
            return (Criteria) this;
        }

        public Criteria andIdcardIsNotNull() {
            addCriterion("idcard is not null");
            return (Criteria) this;
        }

        public Criteria andIdcardEqualTo(String value) {
            addCriterion("idcard =", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotEqualTo(String value) {
            addCriterion("idcard <>", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardGreaterThan(String value) {
            addCriterion("idcard >", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardGreaterThanOrEqualTo(String value) {
            addCriterion("idcard >=", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardLessThan(String value) {
            addCriterion("idcard <", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardLessThanOrEqualTo(String value) {
            addCriterion("idcard <=", value, "idcard");
            return (Criteria) this;
        }

        public Criteria orIdcardIsNull() {
            orCriterion("idcard is null");
            return (Criteria) this;
        }

        public Criteria orIdcardIsNotNull() {
            orCriterion("idcard is not null");
            return (Criteria) this;
        }

        public Criteria orIdcardEqualTo(String value) {
            orCriterion("idcard =", value, "idcard");
            return (Criteria) this;
        }

        public Criteria orIdcardNotEqualTo(String value) {
            orCriterion("idcard <>", value, "idcard");
            return (Criteria) this;
        }

        public Criteria orIdcardGreaterThan(String value) {
            orCriterion("idcard >", value, "idcard");
            return (Criteria) this;
        }

        public Criteria orIdcardGreaterThanOrEqualTo(String value) {
            orCriterion("idcard >=", value, "idcard");
            return (Criteria) this;
        }

        public Criteria orIdcardLessThan(String value) {
            orCriterion("idcard <", value, "idcard");
            return (Criteria) this;
        }

        public Criteria orIdcardLessThanOrEqualTo(String value) {
            orCriterion("idcard <=", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardLike(String value) {
            addCriterion("idcard like", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotLike(String value) {
            addCriterion("idcard not like", value, "idcard");
            return (Criteria) this;
        }

        public Criteria orIdcardLike(String value) {
            orCriterion("idcard like", value, "idcard");
            return (Criteria) this;
        }

        public Criteria orIdcardNotLike(String value) {
            orCriterion("idcard not like", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardIn(List<String> values) {
            addCriterion("idcard in", values, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotIn(List<String> values) {
            addCriterion("idcard not in", values, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardBetween(String value1, String value2) {
            addCriterion("idcard between", value1, value2, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotBetween(String value1, String value2) {
            addCriterion("idcard not between", value1, value2, "idcard");
            return (Criteria) this;
        }

        public Criteria orIdcardIn(List<String> values) {
            orCriterion("idcard in", values, "idcard");
            return (Criteria) this;
        }

        public Criteria orIdcardNotIn(List<String> values) {
            orCriterion("idcard not in", values, "idcard");
            return (Criteria) this;
        }

        public Criteria orIdcardBetween(String value1, String value2) {
            orCriterion("idcard between", value1, value2, "idcard");
            return (Criteria) this;
        }

        public Criteria orIdcardNotBetween(String value1, String value2) {
            orCriterion("idcard not between", value1, value2, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdTypeIsNull() {
            addCriterion("id_type is null");
            return (Criteria) this;
        }

        public Criteria andIdTypeIsNotNull() {
            addCriterion("id_type is not null");
            return (Criteria) this;
        }

        public Criteria andIdTypeEqualTo(String value) {
            addCriterion("id_type =", value, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeNotEqualTo(String value) {
            addCriterion("id_type <>", value, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeGreaterThan(String value) {
            addCriterion("id_type >", value, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeGreaterThanOrEqualTo(String value) {
            addCriterion("id_type >=", value, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeLessThan(String value) {
            addCriterion("id_type <", value, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeLessThanOrEqualTo(String value) {
            addCriterion("id_type <=", value, "idType");
            return (Criteria) this;
        }

        public Criteria orIdTypeIsNull() {
            orCriterion("id_type is null");
            return (Criteria) this;
        }

        public Criteria orIdTypeIsNotNull() {
            orCriterion("id_type is not null");
            return (Criteria) this;
        }

        public Criteria orIdTypeEqualTo(String value) {
            orCriterion("id_type =", value, "idType");
            return (Criteria) this;
        }

        public Criteria orIdTypeNotEqualTo(String value) {
            orCriterion("id_type <>", value, "idType");
            return (Criteria) this;
        }

        public Criteria orIdTypeGreaterThan(String value) {
            orCriterion("id_type >", value, "idType");
            return (Criteria) this;
        }

        public Criteria orIdTypeGreaterThanOrEqualTo(String value) {
            orCriterion("id_type >=", value, "idType");
            return (Criteria) this;
        }

        public Criteria orIdTypeLessThan(String value) {
            orCriterion("id_type <", value, "idType");
            return (Criteria) this;
        }

        public Criteria orIdTypeLessThanOrEqualTo(String value) {
            orCriterion("id_type <=", value, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeLike(String value) {
            addCriterion("id_type like", value, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeNotLike(String value) {
            addCriterion("id_type not like", value, "idType");
            return (Criteria) this;
        }

        public Criteria orIdTypeLike(String value) {
            orCriterion("id_type like", value, "idType");
            return (Criteria) this;
        }

        public Criteria orIdTypeNotLike(String value) {
            orCriterion("id_type not like", value, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeIn(List<String> values) {
            addCriterion("id_type in", values, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeNotIn(List<String> values) {
            addCriterion("id_type not in", values, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeBetween(String value1, String value2) {
            addCriterion("id_type between", value1, value2, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeNotBetween(String value1, String value2) {
            addCriterion("id_type not between", value1, value2, "idType");
            return (Criteria) this;
        }

        public Criteria orIdTypeIn(List<String> values) {
            orCriterion("id_type in", values, "idType");
            return (Criteria) this;
        }

        public Criteria orIdTypeNotIn(List<String> values) {
            orCriterion("id_type not in", values, "idType");
            return (Criteria) this;
        }

        public Criteria orIdTypeBetween(String value1, String value2) {
            orCriterion("id_type between", value1, value2, "idType");
            return (Criteria) this;
        }

        public Criteria orIdTypeNotBetween(String value1, String value2) {
            orCriterion("id_type not between", value1, value2, "idType");
            return (Criteria) this;
        }

        public Criteria andCompanyIsNull() {
            addCriterion("company is null");
            return (Criteria) this;
        }

        public Criteria andCompanyIsNotNull() {
            addCriterion("company is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyEqualTo(String value) {
            addCriterion("company =", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotEqualTo(String value) {
            addCriterion("company <>", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyGreaterThan(String value) {
            addCriterion("company >", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyGreaterThanOrEqualTo(String value) {
            addCriterion("company >=", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyLessThan(String value) {
            addCriterion("company <", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyLessThanOrEqualTo(String value) {
            addCriterion("company <=", value, "company");
            return (Criteria) this;
        }

        public Criteria orCompanyIsNull() {
            orCriterion("company is null");
            return (Criteria) this;
        }

        public Criteria orCompanyIsNotNull() {
            orCriterion("company is not null");
            return (Criteria) this;
        }

        public Criteria orCompanyEqualTo(String value) {
            orCriterion("company =", value, "company");
            return (Criteria) this;
        }

        public Criteria orCompanyNotEqualTo(String value) {
            orCriterion("company <>", value, "company");
            return (Criteria) this;
        }

        public Criteria orCompanyGreaterThan(String value) {
            orCriterion("company >", value, "company");
            return (Criteria) this;
        }

        public Criteria orCompanyGreaterThanOrEqualTo(String value) {
            orCriterion("company >=", value, "company");
            return (Criteria) this;
        }

        public Criteria orCompanyLessThan(String value) {
            orCriterion("company <", value, "company");
            return (Criteria) this;
        }

        public Criteria orCompanyLessThanOrEqualTo(String value) {
            orCriterion("company <=", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyLike(String value) {
            addCriterion("company like", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotLike(String value) {
            addCriterion("company not like", value, "company");
            return (Criteria) this;
        }

        public Criteria orCompanyLike(String value) {
            orCriterion("company like", value, "company");
            return (Criteria) this;
        }

        public Criteria orCompanyNotLike(String value) {
            orCriterion("company not like", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyIn(List<String> values) {
            addCriterion("company in", values, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotIn(List<String> values) {
            addCriterion("company not in", values, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyBetween(String value1, String value2) {
            addCriterion("company between", value1, value2, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotBetween(String value1, String value2) {
            addCriterion("company not between", value1, value2, "company");
            return (Criteria) this;
        }

        public Criteria orCompanyIn(List<String> values) {
            orCriterion("company in", values, "company");
            return (Criteria) this;
        }

        public Criteria orCompanyNotIn(List<String> values) {
            orCriterion("company not in", values, "company");
            return (Criteria) this;
        }

        public Criteria orCompanyBetween(String value1, String value2) {
            orCriterion("company between", value1, value2, "company");
            return (Criteria) this;
        }

        public Criteria orCompanyNotBetween(String value1, String value2) {
            orCriterion("company not between", value1, value2, "company");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria orAddressIsNull() {
            orCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria orAddressIsNotNull() {
            orCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria orAddressEqualTo(String value) {
            orCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria orAddressNotEqualTo(String value) {
            orCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria orAddressGreaterThan(String value) {
            orCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria orAddressGreaterThanOrEqualTo(String value) {
            orCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria orAddressLessThan(String value) {
            orCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria orAddressLessThanOrEqualTo(String value) {
            orCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria orAddressLike(String value) {
            orCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria orAddressNotLike(String value) {
            orCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria orAddressIn(List<String> values) {
            orCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria orAddressNotIn(List<String> values) {
            orCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria orAddressBetween(String value1, String value2) {
            orCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria orAddressNotBetween(String value1, String value2) {
            orCriterion("address not between", value1, value2, "address");
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

        public Criteria andNickNameIsNull() {
            addCriterion("nick_name is null");
            return (Criteria) this;
        }

        public Criteria andNickNameIsNotNull() {
            addCriterion("nick_name is not null");
            return (Criteria) this;
        }

        public Criteria andNickNameEqualTo(String value) {
            addCriterion("nick_name =", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameNotEqualTo(String value) {
            addCriterion("nick_name <>", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameGreaterThan(String value) {
            addCriterion("nick_name >", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameGreaterThanOrEqualTo(String value) {
            addCriterion("nick_name >=", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameLessThan(String value) {
            addCriterion("nick_name <", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameLessThanOrEqualTo(String value) {
            addCriterion("nick_name <=", value, "nickName");
            return (Criteria) this;
        }

        public Criteria orNickNameIsNull() {
            orCriterion("nick_name is null");
            return (Criteria) this;
        }

        public Criteria orNickNameIsNotNull() {
            orCriterion("nick_name is not null");
            return (Criteria) this;
        }

        public Criteria orNickNameEqualTo(String value) {
            orCriterion("nick_name =", value, "nickName");
            return (Criteria) this;
        }

        public Criteria orNickNameNotEqualTo(String value) {
            orCriterion("nick_name <>", value, "nickName");
            return (Criteria) this;
        }

        public Criteria orNickNameGreaterThan(String value) {
            orCriterion("nick_name >", value, "nickName");
            return (Criteria) this;
        }

        public Criteria orNickNameGreaterThanOrEqualTo(String value) {
            orCriterion("nick_name >=", value, "nickName");
            return (Criteria) this;
        }

        public Criteria orNickNameLessThan(String value) {
            orCriterion("nick_name <", value, "nickName");
            return (Criteria) this;
        }

        public Criteria orNickNameLessThanOrEqualTo(String value) {
            orCriterion("nick_name <=", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameLike(String value) {
            addCriterion("nick_name like", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameNotLike(String value) {
            addCriterion("nick_name not like", value, "nickName");
            return (Criteria) this;
        }

        public Criteria orNickNameLike(String value) {
            orCriterion("nick_name like", value, "nickName");
            return (Criteria) this;
        }

        public Criteria orNickNameNotLike(String value) {
            orCriterion("nick_name not like", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameIn(List<String> values) {
            addCriterion("nick_name in", values, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameNotIn(List<String> values) {
            addCriterion("nick_name not in", values, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameBetween(String value1, String value2) {
            addCriterion("nick_name between", value1, value2, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameNotBetween(String value1, String value2) {
            addCriterion("nick_name not between", value1, value2, "nickName");
            return (Criteria) this;
        }

        public Criteria orNickNameIn(List<String> values) {
            orCriterion("nick_name in", values, "nickName");
            return (Criteria) this;
        }

        public Criteria orNickNameNotIn(List<String> values) {
            orCriterion("nick_name not in", values, "nickName");
            return (Criteria) this;
        }

        public Criteria orNickNameBetween(String value1, String value2) {
            orCriterion("nick_name between", value1, value2, "nickName");
            return (Criteria) this;
        }

        public Criteria orNickNameNotBetween(String value1, String value2) {
            orCriterion("nick_name not between", value1, value2, "nickName");
            return (Criteria) this;
        }

        public Criteria andTelephoneIsNull() {
            addCriterion("telephone is null");
            return (Criteria) this;
        }

        public Criteria andTelephoneIsNotNull() {
            addCriterion("telephone is not null");
            return (Criteria) this;
        }

        public Criteria andTelephoneEqualTo(String value) {
            addCriterion("telephone =", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotEqualTo(String value) {
            addCriterion("telephone <>", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneGreaterThan(String value) {
            addCriterion("telephone >", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneGreaterThanOrEqualTo(String value) {
            addCriterion("telephone >=", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLessThan(String value) {
            addCriterion("telephone <", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLessThanOrEqualTo(String value) {
            addCriterion("telephone <=", value, "telephone");
            return (Criteria) this;
        }

        public Criteria orTelephoneIsNull() {
            orCriterion("telephone is null");
            return (Criteria) this;
        }

        public Criteria orTelephoneIsNotNull() {
            orCriterion("telephone is not null");
            return (Criteria) this;
        }

        public Criteria orTelephoneEqualTo(String value) {
            orCriterion("telephone =", value, "telephone");
            return (Criteria) this;
        }

        public Criteria orTelephoneNotEqualTo(String value) {
            orCriterion("telephone <>", value, "telephone");
            return (Criteria) this;
        }

        public Criteria orTelephoneGreaterThan(String value) {
            orCriterion("telephone >", value, "telephone");
            return (Criteria) this;
        }

        public Criteria orTelephoneGreaterThanOrEqualTo(String value) {
            orCriterion("telephone >=", value, "telephone");
            return (Criteria) this;
        }

        public Criteria orTelephoneLessThan(String value) {
            orCriterion("telephone <", value, "telephone");
            return (Criteria) this;
        }

        public Criteria orTelephoneLessThanOrEqualTo(String value) {
            orCriterion("telephone <=", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLike(String value) {
            addCriterion("telephone like", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotLike(String value) {
            addCriterion("telephone not like", value, "telephone");
            return (Criteria) this;
        }

        public Criteria orTelephoneLike(String value) {
            orCriterion("telephone like", value, "telephone");
            return (Criteria) this;
        }

        public Criteria orTelephoneNotLike(String value) {
            orCriterion("telephone not like", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneIn(List<String> values) {
            addCriterion("telephone in", values, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotIn(List<String> values) {
            addCriterion("telephone not in", values, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneBetween(String value1, String value2) {
            addCriterion("telephone between", value1, value2, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotBetween(String value1, String value2) {
            addCriterion("telephone not between", value1, value2, "telephone");
            return (Criteria) this;
        }

        public Criteria orTelephoneIn(List<String> values) {
            orCriterion("telephone in", values, "telephone");
            return (Criteria) this;
        }

        public Criteria orTelephoneNotIn(List<String> values) {
            orCriterion("telephone not in", values, "telephone");
            return (Criteria) this;
        }

        public Criteria orTelephoneBetween(String value1, String value2) {
            orCriterion("telephone between", value1, value2, "telephone");
            return (Criteria) this;
        }

        public Criteria orTelephoneNotBetween(String value1, String value2) {
            orCriterion("telephone not between", value1, value2, "telephone");
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

        public Criteria andProvinceIsNull() {
            addCriterion("province is null");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNotNull() {
            addCriterion("province is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceEqualTo(String value) {
            addCriterion("province =", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotEqualTo(String value) {
            addCriterion("province <>", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThan(String value) {
            addCriterion("province >", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("province >=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThan(String value) {
            addCriterion("province <", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThanOrEqualTo(String value) {
            addCriterion("province <=", value, "province");
            return (Criteria) this;
        }

        public Criteria orProvinceIsNull() {
            orCriterion("province is null");
            return (Criteria) this;
        }

        public Criteria orProvinceIsNotNull() {
            orCriterion("province is not null");
            return (Criteria) this;
        }

        public Criteria orProvinceEqualTo(String value) {
            orCriterion("province =", value, "province");
            return (Criteria) this;
        }

        public Criteria orProvinceNotEqualTo(String value) {
            orCriterion("province <>", value, "province");
            return (Criteria) this;
        }

        public Criteria orProvinceGreaterThan(String value) {
            orCriterion("province >", value, "province");
            return (Criteria) this;
        }

        public Criteria orProvinceGreaterThanOrEqualTo(String value) {
            orCriterion("province >=", value, "province");
            return (Criteria) this;
        }

        public Criteria orProvinceLessThan(String value) {
            orCriterion("province <", value, "province");
            return (Criteria) this;
        }

        public Criteria orProvinceLessThanOrEqualTo(String value) {
            orCriterion("province <=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLike(String value) {
            addCriterion("province like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotLike(String value) {
            addCriterion("province not like", value, "province");
            return (Criteria) this;
        }

        public Criteria orProvinceLike(String value) {
            orCriterion("province like", value, "province");
            return (Criteria) this;
        }

        public Criteria orProvinceNotLike(String value) {
            orCriterion("province not like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceIn(List<String> values) {
            addCriterion("province in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotIn(List<String> values) {
            addCriterion("province not in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceBetween(String value1, String value2) {
            addCriterion("province between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotBetween(String value1, String value2) {
            addCriterion("province not between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria orProvinceIn(List<String> values) {
            orCriterion("province in", values, "province");
            return (Criteria) this;
        }

        public Criteria orProvinceNotIn(List<String> values) {
            orCriterion("province not in", values, "province");
            return (Criteria) this;
        }

        public Criteria orProvinceBetween(String value1, String value2) {
            orCriterion("province between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria orProvinceNotBetween(String value1, String value2) {
            orCriterion("province not between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andCityIsNull() {
            addCriterion("city is null");
            return (Criteria) this;
        }

        public Criteria andCityIsNotNull() {
            addCriterion("city is not null");
            return (Criteria) this;
        }

        public Criteria andCityEqualTo(String value) {
            addCriterion("city =", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotEqualTo(String value) {
            addCriterion("city <>", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThan(String value) {
            addCriterion("city >", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThanOrEqualTo(String value) {
            addCriterion("city >=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThan(String value) {
            addCriterion("city <", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThanOrEqualTo(String value) {
            addCriterion("city <=", value, "city");
            return (Criteria) this;
        }

        public Criteria orCityIsNull() {
            orCriterion("city is null");
            return (Criteria) this;
        }

        public Criteria orCityIsNotNull() {
            orCriterion("city is not null");
            return (Criteria) this;
        }

        public Criteria orCityEqualTo(String value) {
            orCriterion("city =", value, "city");
            return (Criteria) this;
        }

        public Criteria orCityNotEqualTo(String value) {
            orCriterion("city <>", value, "city");
            return (Criteria) this;
        }

        public Criteria orCityGreaterThan(String value) {
            orCriterion("city >", value, "city");
            return (Criteria) this;
        }

        public Criteria orCityGreaterThanOrEqualTo(String value) {
            orCriterion("city >=", value, "city");
            return (Criteria) this;
        }

        public Criteria orCityLessThan(String value) {
            orCriterion("city <", value, "city");
            return (Criteria) this;
        }

        public Criteria orCityLessThanOrEqualTo(String value) {
            orCriterion("city <=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLike(String value) {
            addCriterion("city like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotLike(String value) {
            addCriterion("city not like", value, "city");
            return (Criteria) this;
        }

        public Criteria orCityLike(String value) {
            orCriterion("city like", value, "city");
            return (Criteria) this;
        }

        public Criteria orCityNotLike(String value) {
            orCriterion("city not like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityIn(List<String> values) {
            addCriterion("city in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotIn(List<String> values) {
            addCriterion("city not in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityBetween(String value1, String value2) {
            addCriterion("city between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotBetween(String value1, String value2) {
            addCriterion("city not between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria orCityIn(List<String> values) {
            orCriterion("city in", values, "city");
            return (Criteria) this;
        }

        public Criteria orCityNotIn(List<String> values) {
            orCriterion("city not in", values, "city");
            return (Criteria) this;
        }

        public Criteria orCityBetween(String value1, String value2) {
            orCriterion("city between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria orCityNotBetween(String value1, String value2) {
            orCriterion("city not between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andDistrictIsNull() {
            addCriterion("district is null");
            return (Criteria) this;
        }

        public Criteria andDistrictIsNotNull() {
            addCriterion("district is not null");
            return (Criteria) this;
        }

        public Criteria andDistrictEqualTo(String value) {
            addCriterion("district =", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictNotEqualTo(String value) {
            addCriterion("district <>", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictGreaterThan(String value) {
            addCriterion("district >", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictGreaterThanOrEqualTo(String value) {
            addCriterion("district >=", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictLessThan(String value) {
            addCriterion("district <", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictLessThanOrEqualTo(String value) {
            addCriterion("district <=", value, "district");
            return (Criteria) this;
        }

        public Criteria orDistrictIsNull() {
            orCriterion("district is null");
            return (Criteria) this;
        }

        public Criteria orDistrictIsNotNull() {
            orCriterion("district is not null");
            return (Criteria) this;
        }

        public Criteria orDistrictEqualTo(String value) {
            orCriterion("district =", value, "district");
            return (Criteria) this;
        }

        public Criteria orDistrictNotEqualTo(String value) {
            orCriterion("district <>", value, "district");
            return (Criteria) this;
        }

        public Criteria orDistrictGreaterThan(String value) {
            orCriterion("district >", value, "district");
            return (Criteria) this;
        }

        public Criteria orDistrictGreaterThanOrEqualTo(String value) {
            orCriterion("district >=", value, "district");
            return (Criteria) this;
        }

        public Criteria orDistrictLessThan(String value) {
            orCriterion("district <", value, "district");
            return (Criteria) this;
        }

        public Criteria orDistrictLessThanOrEqualTo(String value) {
            orCriterion("district <=", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictLike(String value) {
            addCriterion("district like", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictNotLike(String value) {
            addCriterion("district not like", value, "district");
            return (Criteria) this;
        }

        public Criteria orDistrictLike(String value) {
            orCriterion("district like", value, "district");
            return (Criteria) this;
        }

        public Criteria orDistrictNotLike(String value) {
            orCriterion("district not like", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictIn(List<String> values) {
            addCriterion("district in", values, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictNotIn(List<String> values) {
            addCriterion("district not in", values, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictBetween(String value1, String value2) {
            addCriterion("district between", value1, value2, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictNotBetween(String value1, String value2) {
            addCriterion("district not between", value1, value2, "district");
            return (Criteria) this;
        }

        public Criteria orDistrictIn(List<String> values) {
            orCriterion("district in", values, "district");
            return (Criteria) this;
        }

        public Criteria orDistrictNotIn(List<String> values) {
            orCriterion("district not in", values, "district");
            return (Criteria) this;
        }

        public Criteria orDistrictBetween(String value1, String value2) {
            orCriterion("district between", value1, value2, "district");
            return (Criteria) this;
        }

        public Criteria orDistrictNotBetween(String value1, String value2) {
            orCriterion("district not between", value1, value2, "district");
            return (Criteria) this;
        }

        public Criteria andRiskPassIsNull() {
            addCriterion("risk_pass is null");
            return (Criteria) this;
        }

        public Criteria andRiskPassIsNotNull() {
            addCriterion("risk_pass is not null");
            return (Criteria) this;
        }

        public Criteria andRiskPassEqualTo(Byte value) {
            addCriterion("risk_pass =", value, "riskPass");
            return (Criteria) this;
        }

        public Criteria andRiskPassNotEqualTo(Byte value) {
            addCriterion("risk_pass <>", value, "riskPass");
            return (Criteria) this;
        }

        public Criteria andRiskPassGreaterThan(Byte value) {
            addCriterion("risk_pass >", value, "riskPass");
            return (Criteria) this;
        }

        public Criteria andRiskPassGreaterThanOrEqualTo(Byte value) {
            addCriterion("risk_pass >=", value, "riskPass");
            return (Criteria) this;
        }

        public Criteria andRiskPassLessThan(Byte value) {
            addCriterion("risk_pass <", value, "riskPass");
            return (Criteria) this;
        }

        public Criteria andRiskPassLessThanOrEqualTo(Byte value) {
            addCriterion("risk_pass <=", value, "riskPass");
            return (Criteria) this;
        }

        public Criteria orRiskPassIsNull() {
            orCriterion("risk_pass is null");
            return (Criteria) this;
        }

        public Criteria orRiskPassIsNotNull() {
            orCriterion("risk_pass is not null");
            return (Criteria) this;
        }

        public Criteria orRiskPassEqualTo(Byte value) {
            orCriterion("risk_pass =", value, "riskPass");
            return (Criteria) this;
        }

        public Criteria orRiskPassNotEqualTo(Byte value) {
            orCriterion("risk_pass <>", value, "riskPass");
            return (Criteria) this;
        }

        public Criteria orRiskPassGreaterThan(Byte value) {
            orCriterion("risk_pass >", value, "riskPass");
            return (Criteria) this;
        }

        public Criteria orRiskPassGreaterThanOrEqualTo(Byte value) {
            orCriterion("risk_pass >=", value, "riskPass");
            return (Criteria) this;
        }

        public Criteria orRiskPassLessThan(Byte value) {
            orCriterion("risk_pass <", value, "riskPass");
            return (Criteria) this;
        }

        public Criteria orRiskPassLessThanOrEqualTo(Byte value) {
            orCriterion("risk_pass <=", value, "riskPass");
            return (Criteria) this;
        }

        public Criteria andRiskPassIn(List<Byte> values) {
            addCriterion("risk_pass in", values, "riskPass");
            return (Criteria) this;
        }

        public Criteria andRiskPassNotIn(List<Byte> values) {
            addCriterion("risk_pass not in", values, "riskPass");
            return (Criteria) this;
        }

        public Criteria andRiskPassBetween(Byte value1, Byte value2) {
            addCriterion("risk_pass between", value1, value2, "riskPass");
            return (Criteria) this;
        }

        public Criteria andRiskPassNotBetween(Byte value1, Byte value2) {
            addCriterion("risk_pass not between", value1, value2, "riskPass");
            return (Criteria) this;
        }

        public Criteria orRiskPassIn(List<Byte> values) {
            orCriterion("risk_pass in", values, "riskPass");
            return (Criteria) this;
        }

        public Criteria orRiskPassNotIn(List<Byte> values) {
            orCriterion("risk_pass not in", values, "riskPass");
            return (Criteria) this;
        }

        public Criteria orRiskPassBetween(Byte value1, Byte value2) {
            orCriterion("risk_pass between", value1, value2, "riskPass");
            return (Criteria) this;
        }

        public Criteria orRiskPassNotBetween(Byte value1, Byte value2) {
            orCriterion("risk_pass not between", value1, value2, "riskPass");
            return (Criteria) this;
        }

        public Criteria andScoreIsNull() {
            addCriterion("score is null");
            return (Criteria) this;
        }

        public Criteria andScoreIsNotNull() {
            addCriterion("score is not null");
            return (Criteria) this;
        }

        public Criteria andScoreEqualTo(Integer value) {
            addCriterion("score =", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotEqualTo(Integer value) {
            addCriterion("score <>", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThan(Integer value) {
            addCriterion("score >", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("score >=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThan(Integer value) {
            addCriterion("score <", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThanOrEqualTo(Integer value) {
            addCriterion("score <=", value, "score");
            return (Criteria) this;
        }

        public Criteria orScoreIsNull() {
            orCriterion("score is null");
            return (Criteria) this;
        }

        public Criteria orScoreIsNotNull() {
            orCriterion("score is not null");
            return (Criteria) this;
        }

        public Criteria orScoreEqualTo(Integer value) {
            orCriterion("score =", value, "score");
            return (Criteria) this;
        }

        public Criteria orScoreNotEqualTo(Integer value) {
            orCriterion("score <>", value, "score");
            return (Criteria) this;
        }

        public Criteria orScoreGreaterThan(Integer value) {
            orCriterion("score >", value, "score");
            return (Criteria) this;
        }

        public Criteria orScoreGreaterThanOrEqualTo(Integer value) {
            orCriterion("score >=", value, "score");
            return (Criteria) this;
        }

        public Criteria orScoreLessThan(Integer value) {
            orCriterion("score <", value, "score");
            return (Criteria) this;
        }

        public Criteria orScoreLessThanOrEqualTo(Integer value) {
            orCriterion("score <=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreIn(List<Integer> values) {
            addCriterion("score in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotIn(List<Integer> values) {
            addCriterion("score not in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreBetween(Integer value1, Integer value2) {
            addCriterion("score between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("score not between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria orScoreIn(List<Integer> values) {
            orCriterion("score in", values, "score");
            return (Criteria) this;
        }

        public Criteria orScoreNotIn(List<Integer> values) {
            orCriterion("score not in", values, "score");
            return (Criteria) this;
        }

        public Criteria orScoreBetween(Integer value1, Integer value2) {
            orCriterion("score between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria orScoreNotBetween(Integer value1, Integer value2) {
            orCriterion("score not between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andEvaluationTimeIsNull() {
            addCriterion("evaluation_time is null");
            return (Criteria) this;
        }

        public Criteria andEvaluationTimeIsNotNull() {
            addCriterion("evaluation_time is not null");
            return (Criteria) this;
        }

        public Criteria andEvaluationTimeEqualTo(Date value) {
            addCriterion("evaluation_time =", value, "evaluationTime");
            return (Criteria) this;
        }

        public Criteria andEvaluationTimeNotEqualTo(Date value) {
            addCriterion("evaluation_time <>", value, "evaluationTime");
            return (Criteria) this;
        }

        public Criteria andEvaluationTimeGreaterThan(Date value) {
            addCriterion("evaluation_time >", value, "evaluationTime");
            return (Criteria) this;
        }

        public Criteria andEvaluationTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("evaluation_time >=", value, "evaluationTime");
            return (Criteria) this;
        }

        public Criteria andEvaluationTimeLessThan(Date value) {
            addCriterion("evaluation_time <", value, "evaluationTime");
            return (Criteria) this;
        }

        public Criteria andEvaluationTimeLessThanOrEqualTo(Date value) {
            addCriterion("evaluation_time <=", value, "evaluationTime");
            return (Criteria) this;
        }

        public Criteria orEvaluationTimeIsNull() {
            orCriterion("evaluation_time is null");
            return (Criteria) this;
        }

        public Criteria orEvaluationTimeIsNotNull() {
            orCriterion("evaluation_time is not null");
            return (Criteria) this;
        }

        public Criteria orEvaluationTimeEqualTo(Date value) {
            orCriterion("evaluation_time =", value, "evaluationTime");
            return (Criteria) this;
        }

        public Criteria orEvaluationTimeNotEqualTo(Date value) {
            orCriterion("evaluation_time <>", value, "evaluationTime");
            return (Criteria) this;
        }

        public Criteria orEvaluationTimeGreaterThan(Date value) {
            orCriterion("evaluation_time >", value, "evaluationTime");
            return (Criteria) this;
        }

        public Criteria orEvaluationTimeGreaterThanOrEqualTo(Date value) {
            orCriterion("evaluation_time >=", value, "evaluationTime");
            return (Criteria) this;
        }

        public Criteria orEvaluationTimeLessThan(Date value) {
            orCriterion("evaluation_time <", value, "evaluationTime");
            return (Criteria) this;
        }

        public Criteria orEvaluationTimeLessThanOrEqualTo(Date value) {
            orCriterion("evaluation_time <=", value, "evaluationTime");
            return (Criteria) this;
        }

        public Criteria andEvaluationTimeIn(List<Date> values) {
            addCriterion("evaluation_time in", values, "evaluationTime");
            return (Criteria) this;
        }

        public Criteria andEvaluationTimeNotIn(List<Date> values) {
            addCriterion("evaluation_time not in", values, "evaluationTime");
            return (Criteria) this;
        }

        public Criteria andEvaluationTimeBetween(Date value1, Date value2) {
            addCriterion("evaluation_time between", value1, value2, "evaluationTime");
            return (Criteria) this;
        }

        public Criteria andEvaluationTimeNotBetween(Date value1, Date value2) {
            addCriterion("evaluation_time not between", value1, value2, "evaluationTime");
            return (Criteria) this;
        }

        public Criteria orEvaluationTimeIn(List<Date> values) {
            orCriterion("evaluation_time in", values, "evaluationTime");
            return (Criteria) this;
        }

        public Criteria orEvaluationTimeNotIn(List<Date> values) {
            orCriterion("evaluation_time not in", values, "evaluationTime");
            return (Criteria) this;
        }

        public Criteria orEvaluationTimeBetween(Date value1, Date value2) {
            orCriterion("evaluation_time between", value1, value2, "evaluationTime");
            return (Criteria) this;
        }

        public Criteria orEvaluationTimeNotBetween(Date value1, Date value2) {
            orCriterion("evaluation_time not between", value1, value2, "evaluationTime");
            return (Criteria) this;
        }

        public Criteria andInvitationCodeIsNull() {
            addCriterion("invitation_code is null");
            return (Criteria) this;
        }

        public Criteria andInvitationCodeIsNotNull() {
            addCriterion("invitation_code is not null");
            return (Criteria) this;
        }

        public Criteria andInvitationCodeEqualTo(String value) {
            addCriterion("invitation_code =", value, "invitationCode");
            return (Criteria) this;
        }

        public Criteria andInvitationCodeNotEqualTo(String value) {
            addCriterion("invitation_code <>", value, "invitationCode");
            return (Criteria) this;
        }

        public Criteria andInvitationCodeGreaterThan(String value) {
            addCriterion("invitation_code >", value, "invitationCode");
            return (Criteria) this;
        }

        public Criteria andInvitationCodeGreaterThanOrEqualTo(String value) {
            addCriterion("invitation_code >=", value, "invitationCode");
            return (Criteria) this;
        }

        public Criteria andInvitationCodeLessThan(String value) {
            addCriterion("invitation_code <", value, "invitationCode");
            return (Criteria) this;
        }

        public Criteria andInvitationCodeLessThanOrEqualTo(String value) {
            addCriterion("invitation_code <=", value, "invitationCode");
            return (Criteria) this;
        }

        public Criteria orInvitationCodeIsNull() {
            orCriterion("invitation_code is null");
            return (Criteria) this;
        }

        public Criteria orInvitationCodeIsNotNull() {
            orCriterion("invitation_code is not null");
            return (Criteria) this;
        }

        public Criteria orInvitationCodeEqualTo(String value) {
            orCriterion("invitation_code =", value, "invitationCode");
            return (Criteria) this;
        }

        public Criteria orInvitationCodeNotEqualTo(String value) {
            orCriterion("invitation_code <>", value, "invitationCode");
            return (Criteria) this;
        }

        public Criteria orInvitationCodeGreaterThan(String value) {
            orCriterion("invitation_code >", value, "invitationCode");
            return (Criteria) this;
        }

        public Criteria orInvitationCodeGreaterThanOrEqualTo(String value) {
            orCriterion("invitation_code >=", value, "invitationCode");
            return (Criteria) this;
        }

        public Criteria orInvitationCodeLessThan(String value) {
            orCriterion("invitation_code <", value, "invitationCode");
            return (Criteria) this;
        }

        public Criteria orInvitationCodeLessThanOrEqualTo(String value) {
            orCriterion("invitation_code <=", value, "invitationCode");
            return (Criteria) this;
        }

        public Criteria andInvitationCodeLike(String value) {
            addCriterion("invitation_code like", value, "invitationCode");
            return (Criteria) this;
        }

        public Criteria andInvitationCodeNotLike(String value) {
            addCriterion("invitation_code not like", value, "invitationCode");
            return (Criteria) this;
        }

        public Criteria orInvitationCodeLike(String value) {
            orCriterion("invitation_code like", value, "invitationCode");
            return (Criteria) this;
        }

        public Criteria orInvitationCodeNotLike(String value) {
            orCriterion("invitation_code not like", value, "invitationCode");
            return (Criteria) this;
        }

        public Criteria andInvitationCodeIn(List<String> values) {
            addCriterion("invitation_code in", values, "invitationCode");
            return (Criteria) this;
        }

        public Criteria andInvitationCodeNotIn(List<String> values) {
            addCriterion("invitation_code not in", values, "invitationCode");
            return (Criteria) this;
        }

        public Criteria andInvitationCodeBetween(String value1, String value2) {
            addCriterion("invitation_code between", value1, value2, "invitationCode");
            return (Criteria) this;
        }

        public Criteria andInvitationCodeNotBetween(String value1, String value2) {
            addCriterion("invitation_code not between", value1, value2, "invitationCode");
            return (Criteria) this;
        }

        public Criteria orInvitationCodeIn(List<String> values) {
            orCriterion("invitation_code in", values, "invitationCode");
            return (Criteria) this;
        }

        public Criteria orInvitationCodeNotIn(List<String> values) {
            orCriterion("invitation_code not in", values, "invitationCode");
            return (Criteria) this;
        }

        public Criteria orInvitationCodeBetween(String value1, String value2) {
            orCriterion("invitation_code between", value1, value2, "invitationCode");
            return (Criteria) this;
        }

        public Criteria orInvitationCodeNotBetween(String value1, String value2) {
            orCriterion("invitation_code not between", value1, value2, "invitationCode");
            return (Criteria) this;
        }

        public Criteria andVerifyIsNull() {
            addCriterion("verify is null");
            return (Criteria) this;
        }

        public Criteria andVerifyIsNotNull() {
            addCriterion("verify is not null");
            return (Criteria) this;
        }

        public Criteria andVerifyEqualTo(String value) {
            addCriterion("verify =", value, "verify");
            return (Criteria) this;
        }

        public Criteria andVerifyNotEqualTo(String value) {
            addCriterion("verify <>", value, "verify");
            return (Criteria) this;
        }

        public Criteria andVerifyGreaterThan(String value) {
            addCriterion("verify >", value, "verify");
            return (Criteria) this;
        }

        public Criteria andVerifyGreaterThanOrEqualTo(String value) {
            addCriterion("verify >=", value, "verify");
            return (Criteria) this;
        }

        public Criteria andVerifyLessThan(String value) {
            addCriterion("verify <", value, "verify");
            return (Criteria) this;
        }

        public Criteria andVerifyLessThanOrEqualTo(String value) {
            addCriterion("verify <=", value, "verify");
            return (Criteria) this;
        }

        public Criteria orVerifyIsNull() {
            orCriterion("verify is null");
            return (Criteria) this;
        }

        public Criteria orVerifyIsNotNull() {
            orCriterion("verify is not null");
            return (Criteria) this;
        }

        public Criteria orVerifyEqualTo(String value) {
            orCriterion("verify =", value, "verify");
            return (Criteria) this;
        }

        public Criteria orVerifyNotEqualTo(String value) {
            orCriterion("verify <>", value, "verify");
            return (Criteria) this;
        }

        public Criteria orVerifyGreaterThan(String value) {
            orCriterion("verify >", value, "verify");
            return (Criteria) this;
        }

        public Criteria orVerifyGreaterThanOrEqualTo(String value) {
            orCriterion("verify >=", value, "verify");
            return (Criteria) this;
        }

        public Criteria orVerifyLessThan(String value) {
            orCriterion("verify <", value, "verify");
            return (Criteria) this;
        }

        public Criteria orVerifyLessThanOrEqualTo(String value) {
            orCriterion("verify <=", value, "verify");
            return (Criteria) this;
        }

        public Criteria andVerifyLike(String value) {
            addCriterion("verify like", value, "verify");
            return (Criteria) this;
        }

        public Criteria andVerifyNotLike(String value) {
            addCriterion("verify not like", value, "verify");
            return (Criteria) this;
        }

        public Criteria orVerifyLike(String value) {
            orCriterion("verify like", value, "verify");
            return (Criteria) this;
        }

        public Criteria orVerifyNotLike(String value) {
            orCriterion("verify not like", value, "verify");
            return (Criteria) this;
        }

        public Criteria andVerifyIn(List<String> values) {
            addCriterion("verify in", values, "verify");
            return (Criteria) this;
        }

        public Criteria andVerifyNotIn(List<String> values) {
            addCriterion("verify not in", values, "verify");
            return (Criteria) this;
        }

        public Criteria andVerifyBetween(String value1, String value2) {
            addCriterion("verify between", value1, value2, "verify");
            return (Criteria) this;
        }

        public Criteria andVerifyNotBetween(String value1, String value2) {
            addCriterion("verify not between", value1, value2, "verify");
            return (Criteria) this;
        }

        public Criteria orVerifyIn(List<String> values) {
            orCriterion("verify in", values, "verify");
            return (Criteria) this;
        }

        public Criteria orVerifyNotIn(List<String> values) {
            orCriterion("verify not in", values, "verify");
            return (Criteria) this;
        }

        public Criteria orVerifyBetween(String value1, String value2) {
            orCriterion("verify between", value1, value2, "verify");
            return (Criteria) this;
        }

        public Criteria orVerifyNotBetween(String value1, String value2) {
            orCriterion("verify not between", value1, value2, "verify");
            return (Criteria) this;
        }
    }

    /**
     * 该类对应数据库表 investor
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
     * 该类对应数据库表 investor
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