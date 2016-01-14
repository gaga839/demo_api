package com.wocai.jrt.product.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ProductGradeBean {
    /**
     * order by 排序语句
     * 对应数据库表字段 product_grade
     */
    private String orderBy;

    /**
     * 分页开始记录
     * 对应数据库表字段 product_grade
     */
    private Integer start;

    /**
     * 分页大小
     * 对应数据库表字段 product_grade
     */
    private int pageSize = 10;

    /**
     * 是否指定 distinct 去除重复
     * 对应数据库表字段 product_grade
     */
    private boolean distinct;

    /**
     * 逻辑or语句
     * 对应数据库表字段 product_grade
     */
    private List<Criteria> oredCriteria;

    /**
     */
    public ProductGradeBean() {
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
     * 该类对应数据库表 product_grade
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

        public Criteria andGradeIsNull() {
            addCriterion("grade is null");
            return (Criteria) this;
        }

        public Criteria andGradeIsNotNull() {
            addCriterion("grade is not null");
            return (Criteria) this;
        }

        public Criteria andGradeEqualTo(String value) {
            addCriterion("grade =", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotEqualTo(String value) {
            addCriterion("grade <>", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeGreaterThan(String value) {
            addCriterion("grade >", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeGreaterThanOrEqualTo(String value) {
            addCriterion("grade >=", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLessThan(String value) {
            addCriterion("grade <", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLessThanOrEqualTo(String value) {
            addCriterion("grade <=", value, "grade");
            return (Criteria) this;
        }

        public Criteria orGradeIsNull() {
            orCriterion("grade is null");
            return (Criteria) this;
        }

        public Criteria orGradeIsNotNull() {
            orCriterion("grade is not null");
            return (Criteria) this;
        }

        public Criteria orGradeEqualTo(String value) {
            orCriterion("grade =", value, "grade");
            return (Criteria) this;
        }

        public Criteria orGradeNotEqualTo(String value) {
            orCriterion("grade <>", value, "grade");
            return (Criteria) this;
        }

        public Criteria orGradeGreaterThan(String value) {
            orCriterion("grade >", value, "grade");
            return (Criteria) this;
        }

        public Criteria orGradeGreaterThanOrEqualTo(String value) {
            orCriterion("grade >=", value, "grade");
            return (Criteria) this;
        }

        public Criteria orGradeLessThan(String value) {
            orCriterion("grade <", value, "grade");
            return (Criteria) this;
        }

        public Criteria orGradeLessThanOrEqualTo(String value) {
            orCriterion("grade <=", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLike(String value) {
            addCriterion("grade like", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotLike(String value) {
            addCriterion("grade not like", value, "grade");
            return (Criteria) this;
        }

        public Criteria orGradeLike(String value) {
            orCriterion("grade like", value, "grade");
            return (Criteria) this;
        }

        public Criteria orGradeNotLike(String value) {
            orCriterion("grade not like", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeIn(List<String> values) {
            addCriterion("grade in", values, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotIn(List<String> values) {
            addCriterion("grade not in", values, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeBetween(String value1, String value2) {
            addCriterion("grade between", value1, value2, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotBetween(String value1, String value2) {
            addCriterion("grade not between", value1, value2, "grade");
            return (Criteria) this;
        }

        public Criteria orGradeIn(List<String> values) {
            orCriterion("grade in", values, "grade");
            return (Criteria) this;
        }

        public Criteria orGradeNotIn(List<String> values) {
            orCriterion("grade not in", values, "grade");
            return (Criteria) this;
        }

        public Criteria orGradeBetween(String value1, String value2) {
            orCriterion("grade between", value1, value2, "grade");
            return (Criteria) this;
        }

        public Criteria orGradeNotBetween(String value1, String value2) {
            orCriterion("grade not between", value1, value2, "grade");
            return (Criteria) this;
        }

        public Criteria andSubScopeStartIsNull() {
            addCriterion("sub_scope_start is null");
            return (Criteria) this;
        }

        public Criteria andSubScopeStartIsNotNull() {
            addCriterion("sub_scope_start is not null");
            return (Criteria) this;
        }

        public Criteria andSubScopeStartEqualTo(BigDecimal value) {
            addCriterion("sub_scope_start =", value, "subScopeStart");
            return (Criteria) this;
        }

        public Criteria andSubScopeStartNotEqualTo(BigDecimal value) {
            addCriterion("sub_scope_start <>", value, "subScopeStart");
            return (Criteria) this;
        }

        public Criteria andSubScopeStartGreaterThan(BigDecimal value) {
            addCriterion("sub_scope_start >", value, "subScopeStart");
            return (Criteria) this;
        }

        public Criteria andSubScopeStartGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("sub_scope_start >=", value, "subScopeStart");
            return (Criteria) this;
        }

        public Criteria andSubScopeStartLessThan(BigDecimal value) {
            addCriterion("sub_scope_start <", value, "subScopeStart");
            return (Criteria) this;
        }

        public Criteria andSubScopeStartLessThanOrEqualTo(BigDecimal value) {
            addCriterion("sub_scope_start <=", value, "subScopeStart");
            return (Criteria) this;
        }

        public Criteria orSubScopeStartIsNull() {
            orCriterion("sub_scope_start is null");
            return (Criteria) this;
        }

        public Criteria orSubScopeStartIsNotNull() {
            orCriterion("sub_scope_start is not null");
            return (Criteria) this;
        }

        public Criteria orSubScopeStartEqualTo(BigDecimal value) {
            orCriterion("sub_scope_start =", value, "subScopeStart");
            return (Criteria) this;
        }

        public Criteria orSubScopeStartNotEqualTo(BigDecimal value) {
            orCriterion("sub_scope_start <>", value, "subScopeStart");
            return (Criteria) this;
        }

        public Criteria orSubScopeStartGreaterThan(BigDecimal value) {
            orCriterion("sub_scope_start >", value, "subScopeStart");
            return (Criteria) this;
        }

        public Criteria orSubScopeStartGreaterThanOrEqualTo(BigDecimal value) {
            orCriterion("sub_scope_start >=", value, "subScopeStart");
            return (Criteria) this;
        }

        public Criteria orSubScopeStartLessThan(BigDecimal value) {
            orCriterion("sub_scope_start <", value, "subScopeStart");
            return (Criteria) this;
        }

        public Criteria orSubScopeStartLessThanOrEqualTo(BigDecimal value) {
            orCriterion("sub_scope_start <=", value, "subScopeStart");
            return (Criteria) this;
        }

        public Criteria andSubScopeStartIn(List<BigDecimal> values) {
            addCriterion("sub_scope_start in", values, "subScopeStart");
            return (Criteria) this;
        }

        public Criteria andSubScopeStartNotIn(List<BigDecimal> values) {
            addCriterion("sub_scope_start not in", values, "subScopeStart");
            return (Criteria) this;
        }

        public Criteria andSubScopeStartBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sub_scope_start between", value1, value2, "subScopeStart");
            return (Criteria) this;
        }

        public Criteria andSubScopeStartNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sub_scope_start not between", value1, value2, "subScopeStart");
            return (Criteria) this;
        }

        public Criteria orSubScopeStartIn(List<BigDecimal> values) {
            orCriterion("sub_scope_start in", values, "subScopeStart");
            return (Criteria) this;
        }

        public Criteria orSubScopeStartNotIn(List<BigDecimal> values) {
            orCriterion("sub_scope_start not in", values, "subScopeStart");
            return (Criteria) this;
        }

        public Criteria orSubScopeStartBetween(BigDecimal value1, BigDecimal value2) {
            orCriterion("sub_scope_start between", value1, value2, "subScopeStart");
            return (Criteria) this;
        }

        public Criteria orSubScopeStartNotBetween(BigDecimal value1, BigDecimal value2) {
            orCriterion("sub_scope_start not between", value1, value2, "subScopeStart");
            return (Criteria) this;
        }

        public Criteria andSubScopeEndIsNull() {
            addCriterion("sub_scope_end is null");
            return (Criteria) this;
        }

        public Criteria andSubScopeEndIsNotNull() {
            addCriterion("sub_scope_end is not null");
            return (Criteria) this;
        }

        public Criteria andSubScopeEndEqualTo(BigDecimal value) {
            addCriterion("sub_scope_end =", value, "subScopeEnd");
            return (Criteria) this;
        }

        public Criteria andSubScopeEndNotEqualTo(BigDecimal value) {
            addCriterion("sub_scope_end <>", value, "subScopeEnd");
            return (Criteria) this;
        }

        public Criteria andSubScopeEndGreaterThan(BigDecimal value) {
            addCriterion("sub_scope_end >", value, "subScopeEnd");
            return (Criteria) this;
        }

        public Criteria andSubScopeEndGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("sub_scope_end >=", value, "subScopeEnd");
            return (Criteria) this;
        }

        public Criteria andSubScopeEndLessThan(BigDecimal value) {
            addCriterion("sub_scope_end <", value, "subScopeEnd");
            return (Criteria) this;
        }

        public Criteria andSubScopeEndLessThanOrEqualTo(BigDecimal value) {
            addCriterion("sub_scope_end <=", value, "subScopeEnd");
            return (Criteria) this;
        }

        public Criteria orSubScopeEndIsNull() {
            orCriterion("sub_scope_end is null");
            return (Criteria) this;
        }

        public Criteria orSubScopeEndIsNotNull() {
            orCriterion("sub_scope_end is not null");
            return (Criteria) this;
        }

        public Criteria orSubScopeEndEqualTo(BigDecimal value) {
            orCriterion("sub_scope_end =", value, "subScopeEnd");
            return (Criteria) this;
        }

        public Criteria orSubScopeEndNotEqualTo(BigDecimal value) {
            orCriterion("sub_scope_end <>", value, "subScopeEnd");
            return (Criteria) this;
        }

        public Criteria orSubScopeEndGreaterThan(BigDecimal value) {
            orCriterion("sub_scope_end >", value, "subScopeEnd");
            return (Criteria) this;
        }

        public Criteria orSubScopeEndGreaterThanOrEqualTo(BigDecimal value) {
            orCriterion("sub_scope_end >=", value, "subScopeEnd");
            return (Criteria) this;
        }

        public Criteria orSubScopeEndLessThan(BigDecimal value) {
            orCriterion("sub_scope_end <", value, "subScopeEnd");
            return (Criteria) this;
        }

        public Criteria orSubScopeEndLessThanOrEqualTo(BigDecimal value) {
            orCriterion("sub_scope_end <=", value, "subScopeEnd");
            return (Criteria) this;
        }

        public Criteria andSubScopeEndIn(List<BigDecimal> values) {
            addCriterion("sub_scope_end in", values, "subScopeEnd");
            return (Criteria) this;
        }

        public Criteria andSubScopeEndNotIn(List<BigDecimal> values) {
            addCriterion("sub_scope_end not in", values, "subScopeEnd");
            return (Criteria) this;
        }

        public Criteria andSubScopeEndBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sub_scope_end between", value1, value2, "subScopeEnd");
            return (Criteria) this;
        }

        public Criteria andSubScopeEndNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sub_scope_end not between", value1, value2, "subScopeEnd");
            return (Criteria) this;
        }

        public Criteria orSubScopeEndIn(List<BigDecimal> values) {
            orCriterion("sub_scope_end in", values, "subScopeEnd");
            return (Criteria) this;
        }

        public Criteria orSubScopeEndNotIn(List<BigDecimal> values) {
            orCriterion("sub_scope_end not in", values, "subScopeEnd");
            return (Criteria) this;
        }

        public Criteria orSubScopeEndBetween(BigDecimal value1, BigDecimal value2) {
            orCriterion("sub_scope_end between", value1, value2, "subScopeEnd");
            return (Criteria) this;
        }

        public Criteria orSubScopeEndNotBetween(BigDecimal value1, BigDecimal value2) {
            orCriterion("sub_scope_end not between", value1, value2, "subScopeEnd");
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
    }

    /**
     * 该类对应数据库表 product_grade
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
     * 该类对应数据库表 product_grade
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