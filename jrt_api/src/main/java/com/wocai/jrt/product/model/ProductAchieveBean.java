package com.wocai.jrt.product.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProductAchieveBean {
    /**
     * order by 排序语句
     * 对应数据库表字段 product_achieve
     */
    private String orderBy;

    /**
     * 分页开始记录
     * 对应数据库表字段 product_achieve
     */
    private Integer start;

    /**
     * 分页大小
     * 对应数据库表字段 product_achieve
     */
    private int pageSize = 10;

    /**
     * 是否指定 distinct 去除重复
     * 对应数据库表字段 product_achieve
     */
    private boolean distinct;

    /**
     * 逻辑or语句
     * 对应数据库表字段 product_achieve
     */
    private List<Criteria> oredCriteria;

    /**
     */
    public ProductAchieveBean() {
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
     * 该类对应数据库表 product_achieve
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

        public Criteria andThisYearIsNull() {
            addCriterion("this_year is null");
            return (Criteria) this;
        }

        public Criteria andThisYearIsNotNull() {
            addCriterion("this_year is not null");
            return (Criteria) this;
        }

        public Criteria andThisYearEqualTo(Double value) {
            addCriterion("this_year =", value, "thisYear");
            return (Criteria) this;
        }

        public Criteria andThisYearNotEqualTo(Double value) {
            addCriterion("this_year <>", value, "thisYear");
            return (Criteria) this;
        }

        public Criteria andThisYearGreaterThan(Double value) {
            addCriterion("this_year >", value, "thisYear");
            return (Criteria) this;
        }

        public Criteria andThisYearGreaterThanOrEqualTo(Double value) {
            addCriterion("this_year >=", value, "thisYear");
            return (Criteria) this;
        }

        public Criteria andThisYearLessThan(Double value) {
            addCriterion("this_year <", value, "thisYear");
            return (Criteria) this;
        }

        public Criteria andThisYearLessThanOrEqualTo(Double value) {
            addCriterion("this_year <=", value, "thisYear");
            return (Criteria) this;
        }

        public Criteria andThisYearIn(List<Double> values) {
            addCriterion("this_year in", values, "thisYear");
            return (Criteria) this;
        }

        public Criteria andThisYearNotIn(List<Double> values) {
            addCriterion("this_year not in", values, "thisYear");
            return (Criteria) this;
        }

        public Criteria andThisYearBetween(Double value1, Double value2) {
            addCriterion("this_year between", value1, value2, "thisYear");
            return (Criteria) this;
        }

        public Criteria andThisYearNotBetween(Double value1, Double value2) {
            addCriterion("this_year not between", value1, value2, "thisYear");
            return (Criteria) this;
        }

        public Criteria andOneMonthIsNull() {
            addCriterion("one_month is null");
            return (Criteria) this;
        }

        public Criteria andOneMonthIsNotNull() {
            addCriterion("one_month is not null");
            return (Criteria) this;
        }

        public Criteria andOneMonthEqualTo(Double value) {
            addCriterion("one_month =", value, "oneMonth");
            return (Criteria) this;
        }

        public Criteria andOneMonthNotEqualTo(Double value) {
            addCriterion("one_month <>", value, "oneMonth");
            return (Criteria) this;
        }

        public Criteria andOneMonthGreaterThan(Double value) {
            addCriterion("one_month >", value, "oneMonth");
            return (Criteria) this;
        }

        public Criteria andOneMonthGreaterThanOrEqualTo(Double value) {
            addCriterion("one_month >=", value, "oneMonth");
            return (Criteria) this;
        }

        public Criteria andOneMonthLessThan(Double value) {
            addCriterion("one_month <", value, "oneMonth");
            return (Criteria) this;
        }

        public Criteria andOneMonthLessThanOrEqualTo(Double value) {
            addCriterion("one_month <=", value, "oneMonth");
            return (Criteria) this;
        }

        public Criteria andOneMonthIn(List<Double> values) {
            addCriterion("one_month in", values, "oneMonth");
            return (Criteria) this;
        }

        public Criteria andOneMonthNotIn(List<Double> values) {
            addCriterion("one_month not in", values, "oneMonth");
            return (Criteria) this;
        }

        public Criteria andOneMonthBetween(Double value1, Double value2) {
            addCriterion("one_month between", value1, value2, "oneMonth");
            return (Criteria) this;
        }

        public Criteria andOneMonthNotBetween(Double value1, Double value2) {
            addCriterion("one_month not between", value1, value2, "oneMonth");
            return (Criteria) this;
        }

        public Criteria andSixMonthIsNull() {
            addCriterion("six_month is null");
            return (Criteria) this;
        }

        public Criteria andSixMonthIsNotNull() {
            addCriterion("six_month is not null");
            return (Criteria) this;
        }

        public Criteria andSixMonthEqualTo(Double value) {
            addCriterion("six_month =", value, "sixMonth");
            return (Criteria) this;
        }

        public Criteria andSixMonthNotEqualTo(Double value) {
            addCriterion("six_month <>", value, "sixMonth");
            return (Criteria) this;
        }

        public Criteria andSixMonthGreaterThan(Double value) {
            addCriterion("six_month >", value, "sixMonth");
            return (Criteria) this;
        }

        public Criteria andSixMonthGreaterThanOrEqualTo(Double value) {
            addCriterion("six_month >=", value, "sixMonth");
            return (Criteria) this;
        }

        public Criteria andSixMonthLessThan(Double value) {
            addCriterion("six_month <", value, "sixMonth");
            return (Criteria) this;
        }

        public Criteria andSixMonthLessThanOrEqualTo(Double value) {
            addCriterion("six_month <=", value, "sixMonth");
            return (Criteria) this;
        }

        public Criteria andSixMonthIn(List<Double> values) {
            addCriterion("six_month in", values, "sixMonth");
            return (Criteria) this;
        }

        public Criteria andSixMonthNotIn(List<Double> values) {
            addCriterion("six_month not in", values, "sixMonth");
            return (Criteria) this;
        }

        public Criteria andSixMonthBetween(Double value1, Double value2) {
            addCriterion("six_month between", value1, value2, "sixMonth");
            return (Criteria) this;
        }

        public Criteria andSixMonthNotBetween(Double value1, Double value2) {
            addCriterion("six_month not between", value1, value2, "sixMonth");
            return (Criteria) this;
        }

        public Criteria andOneYearIsNull() {
            addCriterion("one_year is null");
            return (Criteria) this;
        }

        public Criteria andOneYearIsNotNull() {
            addCriterion("one_year is not null");
            return (Criteria) this;
        }

        public Criteria andOneYearEqualTo(Double value) {
            addCriterion("one_year =", value, "oneYear");
            return (Criteria) this;
        }

        public Criteria andOneYearNotEqualTo(Double value) {
            addCriterion("one_year <>", value, "oneYear");
            return (Criteria) this;
        }

        public Criteria andOneYearGreaterThan(Double value) {
            addCriterion("one_year >", value, "oneYear");
            return (Criteria) this;
        }

        public Criteria andOneYearGreaterThanOrEqualTo(Double value) {
            addCriterion("one_year >=", value, "oneYear");
            return (Criteria) this;
        }

        public Criteria andOneYearLessThan(Double value) {
            addCriterion("one_year <", value, "oneYear");
            return (Criteria) this;
        }

        public Criteria andOneYearLessThanOrEqualTo(Double value) {
            addCriterion("one_year <=", value, "oneYear");
            return (Criteria) this;
        }

        public Criteria andOneYearIn(List<Double> values) {
            addCriterion("one_year in", values, "oneYear");
            return (Criteria) this;
        }

        public Criteria andOneYearNotIn(List<Double> values) {
            addCriterion("one_year not in", values, "oneYear");
            return (Criteria) this;
        }

        public Criteria andOneYearBetween(Double value1, Double value2) {
            addCriterion("one_year between", value1, value2, "oneYear");
            return (Criteria) this;
        }

        public Criteria andOneYearNotBetween(Double value1, Double value2) {
            addCriterion("one_year not between", value1, value2, "oneYear");
            return (Criteria) this;
        }

        public Criteria andTwoYearIsNull() {
            addCriterion("two_year is null");
            return (Criteria) this;
        }

        public Criteria andTwoYearIsNotNull() {
            addCriterion("two_year is not null");
            return (Criteria) this;
        }

        public Criteria andTwoYearEqualTo(Double value) {
            addCriterion("two_year =", value, "twoYear");
            return (Criteria) this;
        }

        public Criteria andTwoYearNotEqualTo(Double value) {
            addCriterion("two_year <>", value, "twoYear");
            return (Criteria) this;
        }

        public Criteria andTwoYearGreaterThan(Double value) {
            addCriterion("two_year >", value, "twoYear");
            return (Criteria) this;
        }

        public Criteria andTwoYearGreaterThanOrEqualTo(Double value) {
            addCriterion("two_year >=", value, "twoYear");
            return (Criteria) this;
        }

        public Criteria andTwoYearLessThan(Double value) {
            addCriterion("two_year <", value, "twoYear");
            return (Criteria) this;
        }

        public Criteria andTwoYearLessThanOrEqualTo(Double value) {
            addCriterion("two_year <=", value, "twoYear");
            return (Criteria) this;
        }

        public Criteria andTwoYearIn(List<Double> values) {
            addCriterion("two_year in", values, "twoYear");
            return (Criteria) this;
        }

        public Criteria andTwoYearNotIn(List<Double> values) {
            addCriterion("two_year not in", values, "twoYear");
            return (Criteria) this;
        }

        public Criteria andTwoYearBetween(Double value1, Double value2) {
            addCriterion("two_year between", value1, value2, "twoYear");
            return (Criteria) this;
        }

        public Criteria andTwoYearNotBetween(Double value1, Double value2) {
            addCriterion("two_year not between", value1, value2, "twoYear");
            return (Criteria) this;
        }

        public Criteria andThreeYearIsNull() {
            addCriterion("three_year is null");
            return (Criteria) this;
        }

        public Criteria andThreeYearIsNotNull() {
            addCriterion("three_year is not null");
            return (Criteria) this;
        }

        public Criteria andThreeYearEqualTo(Double value) {
            addCriterion("three_year =", value, "threeYear");
            return (Criteria) this;
        }

        public Criteria andThreeYearNotEqualTo(Double value) {
            addCriterion("three_year <>", value, "threeYear");
            return (Criteria) this;
        }

        public Criteria andThreeYearGreaterThan(Double value) {
            addCriterion("three_year >", value, "threeYear");
            return (Criteria) this;
        }

        public Criteria andThreeYearGreaterThanOrEqualTo(Double value) {
            addCriterion("three_year >=", value, "threeYear");
            return (Criteria) this;
        }

        public Criteria andThreeYearLessThan(Double value) {
            addCriterion("three_year <", value, "threeYear");
            return (Criteria) this;
        }

        public Criteria andThreeYearLessThanOrEqualTo(Double value) {
            addCriterion("three_year <=", value, "threeYear");
            return (Criteria) this;
        }

        public Criteria andThreeYearIn(List<Double> values) {
            addCriterion("three_year in", values, "threeYear");
            return (Criteria) this;
        }

        public Criteria andThreeYearNotIn(List<Double> values) {
            addCriterion("three_year not in", values, "threeYear");
            return (Criteria) this;
        }

        public Criteria andThreeYearBetween(Double value1, Double value2) {
            addCriterion("three_year between", value1, value2, "threeYear");
            return (Criteria) this;
        }

        public Criteria andThreeYearNotBetween(Double value1, Double value2) {
            addCriterion("three_year not between", value1, value2, "threeYear");
            return (Criteria) this;
        }

        public Criteria andFiveYearIsNull() {
            addCriterion("five_year is null");
            return (Criteria) this;
        }

        public Criteria andFiveYearIsNotNull() {
            addCriterion("five_year is not null");
            return (Criteria) this;
        }

        public Criteria andFiveYearEqualTo(Double value) {
            addCriterion("five_year =", value, "fiveYear");
            return (Criteria) this;
        }

        public Criteria andFiveYearNotEqualTo(Double value) {
            addCriterion("five_year <>", value, "fiveYear");
            return (Criteria) this;
        }

        public Criteria andFiveYearGreaterThan(Double value) {
            addCriterion("five_year >", value, "fiveYear");
            return (Criteria) this;
        }

        public Criteria andFiveYearGreaterThanOrEqualTo(Double value) {
            addCriterion("five_year >=", value, "fiveYear");
            return (Criteria) this;
        }

        public Criteria andFiveYearLessThan(Double value) {
            addCriterion("five_year <", value, "fiveYear");
            return (Criteria) this;
        }

        public Criteria andFiveYearLessThanOrEqualTo(Double value) {
            addCriterion("five_year <=", value, "fiveYear");
            return (Criteria) this;
        }

        public Criteria andFiveYearIn(List<Double> values) {
            addCriterion("five_year in", values, "fiveYear");
            return (Criteria) this;
        }

        public Criteria andFiveYearNotIn(List<Double> values) {
            addCriterion("five_year not in", values, "fiveYear");
            return (Criteria) this;
        }

        public Criteria andFiveYearBetween(Double value1, Double value2) {
            addCriterion("five_year between", value1, value2, "fiveYear");
            return (Criteria) this;
        }

        public Criteria andFiveYearNotBetween(Double value1, Double value2) {
            addCriterion("five_year not between", value1, value2, "fiveYear");
            return (Criteria) this;
        }

        public Criteria andFromFoundedIsNull() {
            addCriterion("from_founded is null");
            return (Criteria) this;
        }

        public Criteria andFromFoundedIsNotNull() {
            addCriterion("from_founded is not null");
            return (Criteria) this;
        }

        public Criteria andFromFoundedEqualTo(Double value) {
            addCriterion("from_founded =", value, "fromFounded");
            return (Criteria) this;
        }

        public Criteria andFromFoundedNotEqualTo(Double value) {
            addCriterion("from_founded <>", value, "fromFounded");
            return (Criteria) this;
        }

        public Criteria andFromFoundedGreaterThan(Double value) {
            addCriterion("from_founded >", value, "fromFounded");
            return (Criteria) this;
        }

        public Criteria andFromFoundedGreaterThanOrEqualTo(Double value) {
            addCriterion("from_founded >=", value, "fromFounded");
            return (Criteria) this;
        }

        public Criteria andFromFoundedLessThan(Double value) {
            addCriterion("from_founded <", value, "fromFounded");
            return (Criteria) this;
        }

        public Criteria andFromFoundedLessThanOrEqualTo(Double value) {
            addCriterion("from_founded <=", value, "fromFounded");
            return (Criteria) this;
        }

        public Criteria andFromFoundedIn(List<Double> values) {
            addCriterion("from_founded in", values, "fromFounded");
            return (Criteria) this;
        }

        public Criteria andFromFoundedNotIn(List<Double> values) {
            addCriterion("from_founded not in", values, "fromFounded");
            return (Criteria) this;
        }

        public Criteria andFromFoundedBetween(Double value1, Double value2) {
            addCriterion("from_founded between", value1, value2, "fromFounded");
            return (Criteria) this;
        }

        public Criteria andFromFoundedNotBetween(Double value1, Double value2) {
            addCriterion("from_founded not between", value1, value2, "fromFounded");
            return (Criteria) this;
        }

        public Criteria andPublishDateIsNull() {
            addCriterion("publish_date is null");
            return (Criteria) this;
        }

        public Criteria andPublishDateIsNotNull() {
            addCriterion("publish_date is not null");
            return (Criteria) this;
        }

        public Criteria andPublishDateEqualTo(Date value) {
            addCriterion("publish_date =", value, "publishDate");
            return (Criteria) this;
        }

        public Criteria andPublishDateNotEqualTo(Date value) {
            addCriterion("publish_date <>", value, "publishDate");
            return (Criteria) this;
        }

        public Criteria andPublishDateGreaterThan(Date value) {
            addCriterion("publish_date >", value, "publishDate");
            return (Criteria) this;
        }

        public Criteria andPublishDateGreaterThanOrEqualTo(Date value) {
            addCriterion("publish_date >=", value, "publishDate");
            return (Criteria) this;
        }

        public Criteria andPublishDateLessThan(Date value) {
            addCriterion("publish_date <", value, "publishDate");
            return (Criteria) this;
        }

        public Criteria andPublishDateLessThanOrEqualTo(Date value) {
            addCriterion("publish_date <=", value, "publishDate");
            return (Criteria) this;
        }

        public Criteria andPublishDateIn(List<Date> values) {
            addCriterion("publish_date in", values, "publishDate");
            return (Criteria) this;
        }

        public Criteria andPublishDateNotIn(List<Date> values) {
            addCriterion("publish_date not in", values, "publishDate");
            return (Criteria) this;
        }

        public Criteria andPublishDateBetween(Date value1, Date value2) {
            addCriterion("publish_date between", value1, value2, "publishDate");
            return (Criteria) this;
        }

        public Criteria andPublishDateNotBetween(Date value1, Date value2) {
            addCriterion("publish_date not between", value1, value2, "publishDate");
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
    }

    /**
     * 该类对应数据库表 product_achieve
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * 该类对应数据库表 product_achieve
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