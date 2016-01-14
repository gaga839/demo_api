package com.wocai.jrt.employee.model;

public class EmployeeGroup {
    /**
     * order by 排序语句
     * 对应数据库表字段 employee_group
     */
    private String orderBy;

    /**
     * 分页开始记录
     * 对应数据库表字段 employee_group
     */
    private Integer start;

    /**
     * 分页大小
     * 对应数据库表字段 employee_group
     */
    private int pageSize = 10;

    /**
     * 是否去重
     * 对应数据库表字段 employee_group
     */
    private boolean distinct;

    /**
     * 对应数据库表字段 employee_group.id
     */
    private String id;

    /**
     * 对应数据库表字段 employee_group.code
     */
    private String code;

    /**
     * 对应数据库表字段 employee_group.group_name
     */
    private String groupName;

    /**
     * 对应数据库表字段 employee_group.employee_id
     */
    private String employeeId;

    /**
     * 对应数据库表字段 employee_group.employee_name
     */
    private String employeeName;

    /**
     * 对应数据库表字段 employee_group.parent
     */
    private String parent;

    /**
     * 对应数据库表字段 employee_group.member_number
     */
    private Integer memberNumber;

    /**
     * 对应数据库表字段 employee_group.product_number
     */
    private Integer productNumber;

    /**
     * 对应数据库表字段 employee_group.investor_number
     */
    private Integer investorNumber;

    /**
     * 对应数据库表字段 employee_group.org_id
     */
    private String orgId;

    /**
     * 对应数据库表字段 employee_group.planner_group
     */
    private Boolean plannerGroup;

    /**
     * 对应数据库表字段 employee_group.sale_all
     */
    private Boolean saleAll;

    /**
     * 对应数据库表字段 employee_group.deleted
     */
    private Boolean deleted;

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
     * 设置 distinct，是否去重
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * 获得 distinct，是否去重
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * 获得字段 employee_group.id 的值
     *
     * @return the value of employee_group.id
     */
    public String getId() {
        return id;
    }

    /**
     * 设置字段 employee_group.id 的值
     *
     * @param id the value for employee_group.id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获得字段 employee_group.code 的值
     *
     * @return the value of employee_group.code
     */
    public String getCode() {
        return code;
    }

    /**
     * 设置字段 employee_group.code 的值
     *
     * @param code the value for employee_group.code
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * 获得字段 employee_group.group_name 的值
     *
     * @return the value of employee_group.group_name
     */
    public String getGroupName() {
        return groupName;
    }

    /**
     * 设置字段 employee_group.group_name 的值
     *
     * @param groupName the value for employee_group.group_name
     */
    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    /**
     * 获得字段 employee_group.employee_id 的值
     *
     * @return the value of employee_group.employee_id
     */
    public String getEmployeeId() {
        return employeeId;
    }

    /**
     * 设置字段 employee_group.employee_id 的值
     *
     * @param employeeId the value for employee_group.employee_id
     */
    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    /**
     * 获得字段 employee_group.employee_name 的值
     *
     * @return the value of employee_group.employee_name
     */
    public String getEmployeeName() {
        return employeeName;
    }

    /**
     * 设置字段 employee_group.employee_name 的值
     *
     * @param employeeName the value for employee_group.employee_name
     */
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    /**
     * 获得字段 employee_group.parent 的值
     *
     * @return the value of employee_group.parent
     */
    public String getParent() {
        return parent;
    }

    /**
     * 设置字段 employee_group.parent 的值
     *
     * @param parent the value for employee_group.parent
     */
    public void setParent(String parent) {
        this.parent = parent;
    }

    /**
     * 获得字段 employee_group.member_number 的值
     *
     * @return the value of employee_group.member_number
     */
    public Integer getMemberNumber() {
        return memberNumber;
    }

    /**
     * 设置字段 employee_group.member_number 的值
     *
     * @param memberNumber the value for employee_group.member_number
     */
    public void setMemberNumber(Integer memberNumber) {
        this.memberNumber = memberNumber;
    }

    /**
     * 获得字段 employee_group.product_number 的值
     *
     * @return the value of employee_group.product_number
     */
    public Integer getProductNumber() {
        return productNumber;
    }

    /**
     * 设置字段 employee_group.product_number 的值
     *
     * @param productNumber the value for employee_group.product_number
     */
    public void setProductNumber(Integer productNumber) {
        this.productNumber = productNumber;
    }

    /**
     * 获得字段 employee_group.investor_number 的值
     *
     * @return the value of employee_group.investor_number
     */
    public Integer getInvestorNumber() {
        return investorNumber;
    }

    /**
     * 设置字段 employee_group.investor_number 的值
     *
     * @param investorNumber the value for employee_group.investor_number
     */
    public void setInvestorNumber(Integer investorNumber) {
        this.investorNumber = investorNumber;
    }

    /**
     * 获得字段 employee_group.org_id 的值
     *
     * @return the value of employee_group.org_id
     */
    public String getOrgId() {
        return orgId;
    }

    /**
     * 设置字段 employee_group.org_id 的值
     *
     * @param orgId the value for employee_group.org_id
     */
    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    /**
     * 获得字段 employee_group.planner_group 的值
     *
     * @return the value of employee_group.planner_group
     */
    public Boolean getPlannerGroup() {
        return plannerGroup;
    }

    /**
     * 设置字段 employee_group.planner_group 的值
     *
     * @param plannerGroup the value for employee_group.planner_group
     */
    public void setPlannerGroup(Boolean plannerGroup) {
        this.plannerGroup = plannerGroup;
    }

    /**
     * 获得字段 employee_group.sale_all 的值
     *
     * @return the value of employee_group.sale_all
     */
    public Boolean getSaleAll() {
        return saleAll;
    }

    /**
     * 设置字段 employee_group.sale_all 的值
     *
     * @param saleAll the value for employee_group.sale_all
     */
    public void setSaleAll(Boolean saleAll) {
        this.saleAll = saleAll;
    }

    /**
     * 获得字段 employee_group.deleted 的值
     *
     * @return the value of employee_group.deleted
     */
    public Boolean getDeleted() {
        return deleted;
    }

    /**
     * 设置字段 employee_group.deleted 的值
     *
     * @param deleted the value for employee_group.deleted
     */
    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }
}