package com.wocai.jrt.version.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class VersionBean {
    /**
     * order by 排序语句
     * 对应数据库表字段 version
     */
    private String orderBy;

    /**
     * 分页开始记录
     * 对应数据库表字段 version
     */
    private Integer start;

    /**
     * 分页大小
     * 对应数据库表字段 version
     */
    private int pageSize = 10;

    /**
     * 是否指定 distinct 去除重复
     * 对应数据库表字段 version
     */
    private boolean distinct;

    /**
     * 逻辑or语句
     * 对应数据库表字段 version
     */
    private List<Criteria> oredCriteria;

    /**
     */
    public VersionBean() {
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



	public Integer getStart() {
		return start;
	}

	public void setStart(Integer start) {
		this.start = start;
	}



	/**
     * 该类对应数据库表 version
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

        public Criteria andProductSoftnameIsNull() {
            addCriterion("product_softname is null");
            return (Criteria) this;
        }

        public Criteria andProductSoftnameIsNotNull() {
            addCriterion("product_softname is not null");
            return (Criteria) this;
        }

        public Criteria andProductSoftnameEqualTo(String value) {
            addCriterion("product_softname =", value, "productSoftname");
            return (Criteria) this;
        }

        public Criteria andProductSoftnameNotEqualTo(String value) {
            addCriterion("product_softname <>", value, "productSoftname");
            return (Criteria) this;
        }

        public Criteria andProductSoftnameGreaterThan(String value) {
            addCriterion("product_softname >", value, "productSoftname");
            return (Criteria) this;
        }

        public Criteria andProductSoftnameGreaterThanOrEqualTo(String value) {
            addCriterion("product_softname >=", value, "productSoftname");
            return (Criteria) this;
        }

        public Criteria andProductSoftnameLessThan(String value) {
            addCriterion("product_softname <", value, "productSoftname");
            return (Criteria) this;
        }

        public Criteria andProductSoftnameLessThanOrEqualTo(String value) {
            addCriterion("product_softname <=", value, "productSoftname");
            return (Criteria) this;
        }

        public Criteria andProductSoftnameLike(String value) {
            addCriterion("product_softname like", value, "productSoftname");
            return (Criteria) this;
        }

        public Criteria andProductSoftnameNotLike(String value) {
            addCriterion("product_softname not like", value, "productSoftname");
            return (Criteria) this;
        }

        public Criteria andProductSoftnameIn(List<String> values) {
            addCriterion("product_softname in", values, "productSoftname");
            return (Criteria) this;
        }

        public Criteria andProductSoftnameNotIn(List<String> values) {
            addCriterion("product_softname not in", values, "productSoftname");
            return (Criteria) this;
        }

        public Criteria andProductSoftnameBetween(String value1, String value2) {
            addCriterion("product_softname between", value1, value2, "productSoftname");
            return (Criteria) this;
        }

        public Criteria andProductSoftnameNotBetween(String value1, String value2) {
            addCriterion("product_softname not between", value1, value2, "productSoftname");
            return (Criteria) this;
        }

        public Criteria andProductSerialIsNull() {
            addCriterion("product_serial is null");
            return (Criteria) this;
        }

        public Criteria andProductSerialIsNotNull() {
            addCriterion("product_serial is not null");
            return (Criteria) this;
        }

        public Criteria andProductSerialEqualTo(String value) {
            addCriterion("product_serial =", value, "productSerial");
            return (Criteria) this;
        }

        public Criteria andProductSerialNotEqualTo(String value) {
            addCriterion("product_serial <>", value, "productSerial");
            return (Criteria) this;
        }

        public Criteria andProductSerialGreaterThan(String value) {
            addCriterion("product_serial >", value, "productSerial");
            return (Criteria) this;
        }

        public Criteria andProductSerialGreaterThanOrEqualTo(String value) {
            addCriterion("product_serial >=", value, "productSerial");
            return (Criteria) this;
        }

        public Criteria andProductSerialLessThan(String value) {
            addCriterion("product_serial <", value, "productSerial");
            return (Criteria) this;
        }

        public Criteria andProductSerialLessThanOrEqualTo(String value) {
            addCriterion("product_serial <=", value, "productSerial");
            return (Criteria) this;
        }

        public Criteria andProductSerialLike(String value) {
            addCriterion("product_serial like", value, "productSerial");
            return (Criteria) this;
        }

        public Criteria andProductSerialNotLike(String value) {
            addCriterion("product_serial not like", value, "productSerial");
            return (Criteria) this;
        }

        public Criteria andProductSerialIn(List<String> values) {
            addCriterion("product_serial in", values, "productSerial");
            return (Criteria) this;
        }

        public Criteria andProductSerialNotIn(List<String> values) {
            addCriterion("product_serial not in", values, "productSerial");
            return (Criteria) this;
        }

        public Criteria andProductSerialBetween(String value1, String value2) {
            addCriterion("product_serial between", value1, value2, "productSerial");
            return (Criteria) this;
        }

        public Criteria andProductSerialNotBetween(String value1, String value2) {
            addCriterion("product_serial not between", value1, value2, "productSerial");
            return (Criteria) this;
        }

        public Criteria andVersionNumberIsNull() {
            addCriterion("version_number is null");
            return (Criteria) this;
        }

        public Criteria andVersionNumberIsNotNull() {
            addCriterion("version_number is not null");
            return (Criteria) this;
        }

        public Criteria andVersionNumberEqualTo(String value) {
            addCriterion("version_number =", value, "versionNumber");
            return (Criteria) this;
        }

        public Criteria andVersionNumberNotEqualTo(String value) {
            addCriterion("version_number <>", value, "versionNumber");
            return (Criteria) this;
        }

        public Criteria andVersionNumberGreaterThan(String value) {
            addCriterion("version_number >", value, "versionNumber");
            return (Criteria) this;
        }

        public Criteria andVersionNumberGreaterThanOrEqualTo(String value) {
            addCriterion("version_number >=", value, "versionNumber");
            return (Criteria) this;
        }

        public Criteria andVersionNumberLessThan(String value) {
            addCriterion("version_number <", value, "versionNumber");
            return (Criteria) this;
        }

        public Criteria andVersionNumberLessThanOrEqualTo(String value) {
            addCriterion("version_number <=", value, "versionNumber");
            return (Criteria) this;
        }

        public Criteria andVersionNumberLike(String value) {
            addCriterion("version_number like", value, "versionNumber");
            return (Criteria) this;
        }

        public Criteria andVersionNumberNotLike(String value) {
            addCriterion("version_number not like", value, "versionNumber");
            return (Criteria) this;
        }

        public Criteria andVersionNumberIn(List<String> values) {
            addCriterion("version_number in", values, "versionNumber");
            return (Criteria) this;
        }

        public Criteria andVersionNumberNotIn(List<String> values) {
            addCriterion("version_number not in", values, "versionNumber");
            return (Criteria) this;
        }

        public Criteria andVersionNumberBetween(String value1, String value2) {
            addCriterion("version_number between", value1, value2, "versionNumber");
            return (Criteria) this;
        }

        public Criteria andVersionNumberNotBetween(String value1, String value2) {
            addCriterion("version_number not between", value1, value2, "versionNumber");
            return (Criteria) this;
        }

        public Criteria andUpdateDescriptionIsNull() {
            addCriterion("update_description is null");
            return (Criteria) this;
        }

        public Criteria andUpdateDescriptionIsNotNull() {
            addCriterion("update_description is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateDescriptionEqualTo(String value) {
            addCriterion("update_description =", value, "updateDescription");
            return (Criteria) this;
        }

        public Criteria andUpdateDescriptionNotEqualTo(String value) {
            addCriterion("update_description <>", value, "updateDescription");
            return (Criteria) this;
        }

        public Criteria andUpdateDescriptionGreaterThan(String value) {
            addCriterion("update_description >", value, "updateDescription");
            return (Criteria) this;
        }

        public Criteria andUpdateDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("update_description >=", value, "updateDescription");
            return (Criteria) this;
        }

        public Criteria andUpdateDescriptionLessThan(String value) {
            addCriterion("update_description <", value, "updateDescription");
            return (Criteria) this;
        }

        public Criteria andUpdateDescriptionLessThanOrEqualTo(String value) {
            addCriterion("update_description <=", value, "updateDescription");
            return (Criteria) this;
        }

        public Criteria andUpdateDescriptionLike(String value) {
            addCriterion("update_description like", value, "updateDescription");
            return (Criteria) this;
        }

        public Criteria andUpdateDescriptionNotLike(String value) {
            addCriterion("update_description not like", value, "updateDescription");
            return (Criteria) this;
        }

        public Criteria andUpdateDescriptionIn(List<String> values) {
            addCriterion("update_description in", values, "updateDescription");
            return (Criteria) this;
        }

        public Criteria andUpdateDescriptionNotIn(List<String> values) {
            addCriterion("update_description not in", values, "updateDescription");
            return (Criteria) this;
        }

        public Criteria andUpdateDescriptionBetween(String value1, String value2) {
            addCriterion("update_description between", value1, value2, "updateDescription");
            return (Criteria) this;
        }

        public Criteria andUpdateDescriptionNotBetween(String value1, String value2) {
            addCriterion("update_description not between", value1, value2, "updateDescription");
            return (Criteria) this;
        }

        public Criteria andDownloadUrlIsNull() {
            addCriterion("download_url is null");
            return (Criteria) this;
        }

        public Criteria andDownloadUrlIsNotNull() {
            addCriterion("download_url is not null");
            return (Criteria) this;
        }

        public Criteria andDownloadUrlEqualTo(String value) {
            addCriterion("download_url =", value, "downloadUrl");
            return (Criteria) this;
        }

        public Criteria andDownloadUrlNotEqualTo(String value) {
            addCriterion("download_url <>", value, "downloadUrl");
            return (Criteria) this;
        }

        public Criteria andDownloadUrlGreaterThan(String value) {
            addCriterion("download_url >", value, "downloadUrl");
            return (Criteria) this;
        }

        public Criteria andDownloadUrlGreaterThanOrEqualTo(String value) {
            addCriterion("download_url >=", value, "downloadUrl");
            return (Criteria) this;
        }

        public Criteria andDownloadUrlLessThan(String value) {
            addCriterion("download_url <", value, "downloadUrl");
            return (Criteria) this;
        }

        public Criteria andDownloadUrlLessThanOrEqualTo(String value) {
            addCriterion("download_url <=", value, "downloadUrl");
            return (Criteria) this;
        }

        public Criteria andDownloadUrlLike(String value) {
            addCriterion("download_url like", value, "downloadUrl");
            return (Criteria) this;
        }

        public Criteria andDownloadUrlNotLike(String value) {
            addCriterion("download_url not like", value, "downloadUrl");
            return (Criteria) this;
        }

        public Criteria andDownloadUrlIn(List<String> values) {
            addCriterion("download_url in", values, "downloadUrl");
            return (Criteria) this;
        }

        public Criteria andDownloadUrlNotIn(List<String> values) {
            addCriterion("download_url not in", values, "downloadUrl");
            return (Criteria) this;
        }

        public Criteria andDownloadUrlBetween(String value1, String value2) {
            addCriterion("download_url between", value1, value2, "downloadUrl");
            return (Criteria) this;
        }

        public Criteria andDownloadUrlNotBetween(String value1, String value2) {
            addCriterion("download_url not between", value1, value2, "downloadUrl");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateLowestVersionIsNull() {
            addCriterion("update_lowest_version is null");
            return (Criteria) this;
        }

        public Criteria andUpdateLowestVersionIsNotNull() {
            addCriterion("update_lowest_version is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateLowestVersionEqualTo(String value) {
            addCriterion("update_lowest_version =", value, "updateLowestVersion");
            return (Criteria) this;
        }

        public Criteria andUpdateLowestVersionNotEqualTo(String value) {
            addCriterion("update_lowest_version <>", value, "updateLowestVersion");
            return (Criteria) this;
        }

        public Criteria andUpdateLowestVersionGreaterThan(String value) {
            addCriterion("update_lowest_version >", value, "updateLowestVersion");
            return (Criteria) this;
        }

        public Criteria andUpdateLowestVersionGreaterThanOrEqualTo(String value) {
            addCriterion("update_lowest_version >=", value, "updateLowestVersion");
            return (Criteria) this;
        }

        public Criteria andUpdateLowestVersionLessThan(String value) {
            addCriterion("update_lowest_version <", value, "updateLowestVersion");
            return (Criteria) this;
        }

        public Criteria andUpdateLowestVersionLessThanOrEqualTo(String value) {
            addCriterion("update_lowest_version <=", value, "updateLowestVersion");
            return (Criteria) this;
        }

        public Criteria andUpdateLowestVersionLike(String value) {
            addCriterion("update_lowest_version like", value, "updateLowestVersion");
            return (Criteria) this;
        }

        public Criteria andUpdateLowestVersionNotLike(String value) {
            addCriterion("update_lowest_version not like", value, "updateLowestVersion");
            return (Criteria) this;
        }

        public Criteria andUpdateLowestVersionIn(List<String> values) {
            addCriterion("update_lowest_version in", values, "updateLowestVersion");
            return (Criteria) this;
        }

        public Criteria andUpdateLowestVersionNotIn(List<String> values) {
            addCriterion("update_lowest_version not in", values, "updateLowestVersion");
            return (Criteria) this;
        }

        public Criteria andUpdateLowestVersionBetween(String value1, String value2) {
            addCriterion("update_lowest_version between", value1, value2, "updateLowestVersion");
            return (Criteria) this;
        }

        public Criteria andUpdateLowestVersionNotBetween(String value1, String value2) {
            addCriterion("update_lowest_version not between", value1, value2, "updateLowestVersion");
            return (Criteria) this;
        }

        public Criteria andTipsIsNull() {
            addCriterion("tips is null");
            return (Criteria) this;
        }

        public Criteria andTipsIsNotNull() {
            addCriterion("tips is not null");
            return (Criteria) this;
        }

        public Criteria andTipsEqualTo(Boolean value) {
            addCriterion("tips =", value, "tips");
            return (Criteria) this;
        }

        public Criteria andTipsNotEqualTo(Boolean value) {
            addCriterion("tips <>", value, "tips");
            return (Criteria) this;
        }

        public Criteria andTipsGreaterThan(Boolean value) {
            addCriterion("tips >", value, "tips");
            return (Criteria) this;
        }

        public Criteria andTipsGreaterThanOrEqualTo(Boolean value) {
            addCriterion("tips >=", value, "tips");
            return (Criteria) this;
        }

        public Criteria andTipsLessThan(Boolean value) {
            addCriterion("tips <", value, "tips");
            return (Criteria) this;
        }

        public Criteria andTipsLessThanOrEqualTo(Boolean value) {
            addCriterion("tips <=", value, "tips");
            return (Criteria) this;
        }

        public Criteria andTipsIn(List<Boolean> values) {
            addCriterion("tips in", values, "tips");
            return (Criteria) this;
        }

        public Criteria andTipsNotIn(List<Boolean> values) {
            addCriterion("tips not in", values, "tips");
            return (Criteria) this;
        }

        public Criteria andTipsBetween(Boolean value1, Boolean value2) {
            addCriterion("tips between", value1, value2, "tips");
            return (Criteria) this;
        }

        public Criteria andTipsNotBetween(Boolean value1, Boolean value2) {
            addCriterion("tips not between", value1, value2, "tips");
            return (Criteria) this;
        }
    }

    /**
     * 该类对应数据库表 version
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * 该类对应数据库表 version
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