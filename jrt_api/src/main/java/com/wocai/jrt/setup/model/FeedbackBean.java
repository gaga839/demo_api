package com.wocai.jrt.setup.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FeedbackBean {
    /**
     * order by 排序语句
     * 对应数据库表字段 feedback
     */
    private String orderBy;

    /**
     * 分页开始记录
     * 对应数据库表字段 feedback
     */
    private Integer start;

    /**
     * 分页大小
     * 对应数据库表字段 feedback
     */
    private int pageSize = 10;

    /**
     * 是否指定 distinct 去除重复
     * 对应数据库表字段 feedback
     */
    private boolean distinct;

    /**
     * 逻辑or语句
     * 对应数据库表字段 feedback
     */
    private List<Criteria> oredCriteria;

    /**
     */
    public FeedbackBean() {
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
     * 该类对应数据库表 feedback
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

        public Criteria andContentIsNull() {
            addCriterion("content is null");
            return (Criteria) this;
        }

        public Criteria andContentIsNotNull() {
            addCriterion("content is not null");
            return (Criteria) this;
        }

        public Criteria andContentEqualTo(String value) {
            addCriterion("content =", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotEqualTo(String value) {
            addCriterion("content <>", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThan(String value) {
            addCriterion("content >", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThanOrEqualTo(String value) {
            addCriterion("content >=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThan(String value) {
            addCriterion("content <", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThanOrEqualTo(String value) {
            addCriterion("content <=", value, "content");
            return (Criteria) this;
        }

        public Criteria orContentIsNull() {
            orCriterion("content is null");
            return (Criteria) this;
        }

        public Criteria orContentIsNotNull() {
            orCriterion("content is not null");
            return (Criteria) this;
        }

        public Criteria orContentEqualTo(String value) {
            orCriterion("content =", value, "content");
            return (Criteria) this;
        }

        public Criteria orContentNotEqualTo(String value) {
            orCriterion("content <>", value, "content");
            return (Criteria) this;
        }

        public Criteria orContentGreaterThan(String value) {
            orCriterion("content >", value, "content");
            return (Criteria) this;
        }

        public Criteria orContentGreaterThanOrEqualTo(String value) {
            orCriterion("content >=", value, "content");
            return (Criteria) this;
        }

        public Criteria orContentLessThan(String value) {
            orCriterion("content <", value, "content");
            return (Criteria) this;
        }

        public Criteria orContentLessThanOrEqualTo(String value) {
            orCriterion("content <=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLike(String value) {
            addCriterion("content like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotLike(String value) {
            addCriterion("content not like", value, "content");
            return (Criteria) this;
        }

        public Criteria orContentLike(String value) {
            orCriterion("content like", value, "content");
            return (Criteria) this;
        }

        public Criteria orContentNotLike(String value) {
            orCriterion("content not like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentIn(List<String> values) {
            addCriterion("content in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotIn(List<String> values) {
            addCriterion("content not in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentBetween(String value1, String value2) {
            addCriterion("content between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotBetween(String value1, String value2) {
            addCriterion("content not between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria orContentIn(List<String> values) {
            orCriterion("content in", values, "content");
            return (Criteria) this;
        }

        public Criteria orContentNotIn(List<String> values) {
            orCriterion("content not in", values, "content");
            return (Criteria) this;
        }

        public Criteria orContentBetween(String value1, String value2) {
            orCriterion("content between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria orContentNotBetween(String value1, String value2) {
            orCriterion("content not between", value1, value2, "content");
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

        public Criteria andSourceIsNull() {
            addCriterion("source is null");
            return (Criteria) this;
        }

        public Criteria andSourceIsNotNull() {
            addCriterion("source is not null");
            return (Criteria) this;
        }

        public Criteria andSourceEqualTo(String value) {
            addCriterion("source =", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotEqualTo(String value) {
            addCriterion("source <>", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThan(String value) {
            addCriterion("source >", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThanOrEqualTo(String value) {
            addCriterion("source >=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThan(String value) {
            addCriterion("source <", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThanOrEqualTo(String value) {
            addCriterion("source <=", value, "source");
            return (Criteria) this;
        }

        public Criteria orSourceIsNull() {
            orCriterion("source is null");
            return (Criteria) this;
        }

        public Criteria orSourceIsNotNull() {
            orCriterion("source is not null");
            return (Criteria) this;
        }

        public Criteria orSourceEqualTo(String value) {
            orCriterion("source =", value, "source");
            return (Criteria) this;
        }

        public Criteria orSourceNotEqualTo(String value) {
            orCriterion("source <>", value, "source");
            return (Criteria) this;
        }

        public Criteria orSourceGreaterThan(String value) {
            orCriterion("source >", value, "source");
            return (Criteria) this;
        }

        public Criteria orSourceGreaterThanOrEqualTo(String value) {
            orCriterion("source >=", value, "source");
            return (Criteria) this;
        }

        public Criteria orSourceLessThan(String value) {
            orCriterion("source <", value, "source");
            return (Criteria) this;
        }

        public Criteria orSourceLessThanOrEqualTo(String value) {
            orCriterion("source <=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLike(String value) {
            addCriterion("source like", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotLike(String value) {
            addCriterion("source not like", value, "source");
            return (Criteria) this;
        }

        public Criteria orSourceLike(String value) {
            orCriterion("source like", value, "source");
            return (Criteria) this;
        }

        public Criteria orSourceNotLike(String value) {
            orCriterion("source not like", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceIn(List<String> values) {
            addCriterion("source in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotIn(List<String> values) {
            addCriterion("source not in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceBetween(String value1, String value2) {
            addCriterion("source between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotBetween(String value1, String value2) {
            addCriterion("source not between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria orSourceIn(List<String> values) {
            orCriterion("source in", values, "source");
            return (Criteria) this;
        }

        public Criteria orSourceNotIn(List<String> values) {
            orCriterion("source not in", values, "source");
            return (Criteria) this;
        }

        public Criteria orSourceBetween(String value1, String value2) {
            orCriterion("source between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria orSourceNotBetween(String value1, String value2) {
            orCriterion("source not between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andReplyIsNull() {
            addCriterion("reply is null");
            return (Criteria) this;
        }

        public Criteria andReplyIsNotNull() {
            addCriterion("reply is not null");
            return (Criteria) this;
        }

        public Criteria andReplyEqualTo(Boolean value) {
            addCriterion("reply =", value, "reply");
            return (Criteria) this;
        }

        public Criteria andReplyNotEqualTo(Boolean value) {
            addCriterion("reply <>", value, "reply");
            return (Criteria) this;
        }

        public Criteria andReplyGreaterThan(Boolean value) {
            addCriterion("reply >", value, "reply");
            return (Criteria) this;
        }

        public Criteria andReplyGreaterThanOrEqualTo(Boolean value) {
            addCriterion("reply >=", value, "reply");
            return (Criteria) this;
        }

        public Criteria andReplyLessThan(Boolean value) {
            addCriterion("reply <", value, "reply");
            return (Criteria) this;
        }

        public Criteria andReplyLessThanOrEqualTo(Boolean value) {
            addCriterion("reply <=", value, "reply");
            return (Criteria) this;
        }

        public Criteria orReplyIsNull() {
            orCriterion("reply is null");
            return (Criteria) this;
        }

        public Criteria orReplyIsNotNull() {
            orCriterion("reply is not null");
            return (Criteria) this;
        }

        public Criteria orReplyEqualTo(Boolean value) {
            orCriterion("reply =", value, "reply");
            return (Criteria) this;
        }

        public Criteria orReplyNotEqualTo(Boolean value) {
            orCriterion("reply <>", value, "reply");
            return (Criteria) this;
        }

        public Criteria orReplyGreaterThan(Boolean value) {
            orCriterion("reply >", value, "reply");
            return (Criteria) this;
        }

        public Criteria orReplyGreaterThanOrEqualTo(Boolean value) {
            orCriterion("reply >=", value, "reply");
            return (Criteria) this;
        }

        public Criteria orReplyLessThan(Boolean value) {
            orCriterion("reply <", value, "reply");
            return (Criteria) this;
        }

        public Criteria orReplyLessThanOrEqualTo(Boolean value) {
            orCriterion("reply <=", value, "reply");
            return (Criteria) this;
        }

        public Criteria andReplyIn(List<Boolean> values) {
            addCriterion("reply in", values, "reply");
            return (Criteria) this;
        }

        public Criteria andReplyNotIn(List<Boolean> values) {
            addCriterion("reply not in", values, "reply");
            return (Criteria) this;
        }

        public Criteria andReplyBetween(Boolean value1, Boolean value2) {
            addCriterion("reply between", value1, value2, "reply");
            return (Criteria) this;
        }

        public Criteria andReplyNotBetween(Boolean value1, Boolean value2) {
            addCriterion("reply not between", value1, value2, "reply");
            return (Criteria) this;
        }

        public Criteria orReplyIn(List<Boolean> values) {
            orCriterion("reply in", values, "reply");
            return (Criteria) this;
        }

        public Criteria orReplyNotIn(List<Boolean> values) {
            orCriterion("reply not in", values, "reply");
            return (Criteria) this;
        }

        public Criteria orReplyBetween(Boolean value1, Boolean value2) {
            orCriterion("reply between", value1, value2, "reply");
            return (Criteria) this;
        }

        public Criteria orReplyNotBetween(Boolean value1, Boolean value2) {
            orCriterion("reply not between", value1, value2, "reply");
            return (Criteria) this;
        }

        public Criteria andSubmitPlatformIsNull() {
            addCriterion("submit_platform is null");
            return (Criteria) this;
        }

        public Criteria andSubmitPlatformIsNotNull() {
            addCriterion("submit_platform is not null");
            return (Criteria) this;
        }

        public Criteria andSubmitPlatformEqualTo(Boolean value) {
            addCriterion("submit_platform =", value, "submitPlatform");
            return (Criteria) this;
        }

        public Criteria andSubmitPlatformNotEqualTo(Boolean value) {
            addCriterion("submit_platform <>", value, "submitPlatform");
            return (Criteria) this;
        }

        public Criteria andSubmitPlatformGreaterThan(Boolean value) {
            addCriterion("submit_platform >", value, "submitPlatform");
            return (Criteria) this;
        }

        public Criteria andSubmitPlatformGreaterThanOrEqualTo(Boolean value) {
            addCriterion("submit_platform >=", value, "submitPlatform");
            return (Criteria) this;
        }

        public Criteria andSubmitPlatformLessThan(Boolean value) {
            addCriterion("submit_platform <", value, "submitPlatform");
            return (Criteria) this;
        }

        public Criteria andSubmitPlatformLessThanOrEqualTo(Boolean value) {
            addCriterion("submit_platform <=", value, "submitPlatform");
            return (Criteria) this;
        }

        public Criteria orSubmitPlatformIsNull() {
            orCriterion("submit_platform is null");
            return (Criteria) this;
        }

        public Criteria orSubmitPlatformIsNotNull() {
            orCriterion("submit_platform is not null");
            return (Criteria) this;
        }

        public Criteria orSubmitPlatformEqualTo(Boolean value) {
            orCriterion("submit_platform =", value, "submitPlatform");
            return (Criteria) this;
        }

        public Criteria orSubmitPlatformNotEqualTo(Boolean value) {
            orCriterion("submit_platform <>", value, "submitPlatform");
            return (Criteria) this;
        }

        public Criteria orSubmitPlatformGreaterThan(Boolean value) {
            orCriterion("submit_platform >", value, "submitPlatform");
            return (Criteria) this;
        }

        public Criteria orSubmitPlatformGreaterThanOrEqualTo(Boolean value) {
            orCriterion("submit_platform >=", value, "submitPlatform");
            return (Criteria) this;
        }

        public Criteria orSubmitPlatformLessThan(Boolean value) {
            orCriterion("submit_platform <", value, "submitPlatform");
            return (Criteria) this;
        }

        public Criteria orSubmitPlatformLessThanOrEqualTo(Boolean value) {
            orCriterion("submit_platform <=", value, "submitPlatform");
            return (Criteria) this;
        }

        public Criteria andSubmitPlatformIn(List<Boolean> values) {
            addCriterion("submit_platform in", values, "submitPlatform");
            return (Criteria) this;
        }

        public Criteria andSubmitPlatformNotIn(List<Boolean> values) {
            addCriterion("submit_platform not in", values, "submitPlatform");
            return (Criteria) this;
        }

        public Criteria andSubmitPlatformBetween(Boolean value1, Boolean value2) {
            addCriterion("submit_platform between", value1, value2, "submitPlatform");
            return (Criteria) this;
        }

        public Criteria andSubmitPlatformNotBetween(Boolean value1, Boolean value2) {
            addCriterion("submit_platform not between", value1, value2, "submitPlatform");
            return (Criteria) this;
        }

        public Criteria orSubmitPlatformIn(List<Boolean> values) {
            orCriterion("submit_platform in", values, "submitPlatform");
            return (Criteria) this;
        }

        public Criteria orSubmitPlatformNotIn(List<Boolean> values) {
            orCriterion("submit_platform not in", values, "submitPlatform");
            return (Criteria) this;
        }

        public Criteria orSubmitPlatformBetween(Boolean value1, Boolean value2) {
            orCriterion("submit_platform between", value1, value2, "submitPlatform");
            return (Criteria) this;
        }

        public Criteria orSubmitPlatformNotBetween(Boolean value1, Boolean value2) {
            orCriterion("submit_platform not between", value1, value2, "submitPlatform");
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
    }

    /**
     * 该类对应数据库表 feedback
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
     * 该类对应数据库表 feedback
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