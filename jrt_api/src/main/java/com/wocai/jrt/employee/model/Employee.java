package com.wocai.jrt.employee.model;

import java.util.Date;

public class Employee {
	private String deptId;
    /**
     * order by 排序语句
     * 对应数据库表字段 employee
     */
    private String orderBy;

    /**
     * 分页开始记录
     * 对应数据库表字段 employee
     */
    private Integer start;

    /**
     * 分页大小
     * 对应数据库表字段 employee
     */
    private int pageSize = 10;

    /**
     * 是否去重
     * 对应数据库表字段 employee
     */
    private boolean distinct;

    /**
     * 对应数据库表字段 employee.employee_id
     */
    private String employeeId;

    /**
     * 对应数据库表字段 employee.account
     */
    private String account;

    /**
     * 对应数据库表字段 employee.name
     */
    private String name;

    /**
     * 对应数据库表字段 employee.mobile
     */
    private String mobile;

    /**
     * 对应数据库表字段 employee.email
     */
    private String email;

    /**
     * 对应数据库表字段 employee.gender
     */
    private Integer gender;

    /**
     * 对应数据库表字段 employee.department
     */
    private String department;

    /**
     * 对应数据库表字段 employee.position
     */
    private String position;

    /**
     * 对应数据库表字段 employee.login_pwd
     */
    private String loginPwd;

    /**
     * 对应数据库表字段 employee.work_pwd
     */
    private String workPwd;

    /**
     * 对应数据库表字段 employee.pos_pad_id
     */
    private String posPadId;

    /**
     * 对应数据库表字段 employee.org_id
     */
    private String orgId;

    /**
     * 对应数据库表字段 employee.planner
     */
    private Boolean planner;

    /**
     * 对应数据库表字段 employee.avatar
     */
    private String avatar;

    /**
     * 对应数据库表字段 employee.admin
     */
    private Integer admin;

    /**
     * 对应数据库表字段 employee.create_time
     */
    private Date createTime;

    /**
     * 对应数据库表字段 employee.employee_no
     */
    private String employeeNo;

    /**
     * 对应数据库表字段 employee.entry_time
     */
    private Date entryTime;

    /**
     * 对应数据库表字段 employee.birthday
     */
    private Date birthday;

    /**
     * 对应数据库表字段 employee.address
     */
    private String address;

    /**
     * 对应数据库表字段 employee.idcard
     */
    private String idcard;
    
    /**
     * 对应数据库表字段 employee.state
     */
    private Integer state; //状态，1正常，0离职

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
     * 获得字段 employee.employee_id 的值
     *
     * @return the value of employee.employee_id
     */
    public String getEmployeeId() {
        return employeeId;
    }

    /**
     * 设置字段 employee.employee_id 的值
     *
     * @param employeeId the value for employee.employee_id
     */
    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    /**
     * 获得字段 employee.account 的值
     *
     * @return the value of employee.account
     */
    public String getAccount() {
        return account;
    }

    /**
     * 设置字段 employee.account 的值
     *
     * @param account the value for employee.account
     */
    public void setAccount(String account) {
        this.account = account;
    }

    /**
     * 获得字段 employee.name 的值
     *
     * @return the value of employee.name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置字段 employee.name 的值
     *
     * @param name the value for employee.name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获得字段 employee.mobile 的值
     *
     * @return the value of employee.mobile
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * 设置字段 employee.mobile 的值
     *
     * @param mobile the value for employee.mobile
     */
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    /**
     * 获得字段 employee.email 的值
     *
     * @return the value of employee.email
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置字段 employee.email 的值
     *
     * @param email the value for employee.email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 获得字段 employee.gender 的值
     *
     * @return the value of employee.gender
     */
    public Integer getGender() {
        return gender;
    }

    /**
     * 设置字段 employee.gender 的值
     *
     * @param gender the value for employee.gender
     */
    public void setGender(Integer gender) {
        this.gender = gender;
    }

    /**
     * 获得字段 employee.department 的值
     *
     * @return the value of employee.department
     */
    public String getDepartment() {
        return department;
    }

    /**
     * 设置字段 employee.department 的值
     *
     * @param department the value for employee.department
     */
    public void setDepartment(String department) {
        this.department = department;
    }

    /**
     * 获得字段 employee.position 的值
     *
     * @return the value of employee.position
     */
    public String getPosition() {
        return position;
    }

    /**
     * 设置字段 employee.position 的值
     *
     * @param position the value for employee.position
     */
    public void setPosition(String position) {
        this.position = position;
    }

    /**
     * 获得字段 employee.login_pwd 的值
     *
     * @return the value of employee.login_pwd
     */
    public String getLoginPwd() {
        return loginPwd;
    }

    /**
     * 设置字段 employee.login_pwd 的值
     *
     * @param loginPwd the value for employee.login_pwd
     */
    public void setLoginPwd(String loginPwd) {
        this.loginPwd = loginPwd;
    }

    /**
     * 获得字段 employee.work_pwd 的值
     *
     * @return the value of employee.work_pwd
     */
    public String getWorkPwd() {
        return workPwd;
    }

    /**
     * 设置字段 employee.work_pwd 的值
     *
     * @param workPwd the value for employee.work_pwd
     */
    public void setWorkPwd(String workPwd) {
        this.workPwd = workPwd;
    }

    /**
     * 获得字段 employee.pos_pad_id 的值
     *
     * @return the value of employee.pos_pad_id
     */
    public String getPosPadId() {
        return posPadId;
    }

    /**
     * 设置字段 employee.pos_pad_id 的值
     *
     * @param posPadId the value for employee.pos_pad_id
     */
    public void setPosPadId(String posPadId) {
        this.posPadId = posPadId;
    }

    /**
     * 获得字段 employee.org_id 的值
     *
     * @return the value of employee.org_id
     */
    public String getOrgId() {
        return orgId;
    }

    /**
     * 设置字段 employee.org_id 的值
     *
     * @param orgId the value for employee.org_id
     */
    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    /**
     * 获得字段 employee.planner 的值
     *
     * @return the value of employee.planner
     */
    public Boolean getPlanner() {
        return planner;
    }

    /**
     * 设置字段 employee.planner 的值
     *
     * @param planner the value for employee.planner
     */
    public void setPlanner(Boolean planner) {
        this.planner = planner;
    }

    /**
     * 获得字段 employee.avatar 的值
     *
     * @return the value of employee.avatar
     */
    public String getAvatar() {
        return avatar;
    }

    /**
     * 设置字段 employee.avatar 的值
     *
     * @param avatar the value for employee.avatar
     */
    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    /**
     * 获得字段 employee.admin 的值
     *
     * @return the value of employee.admin
     */
    public Integer getAdmin() {
        return admin;
    }

    /**
     * 设置字段 employee.admin 的值
     *
     * @param admin the value for employee.admin
     */
    public void setAdmin(Integer admin) {
        this.admin = admin;
    }

    /**
     * 获得字段 employee.create_time 的值
     *
     * @return the value of employee.create_time
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置字段 employee.create_time 的值
     *
     * @param createTime the value for employee.create_time
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获得字段 employee.employee_no 的值
     *
     * @return the value of employee.employee_no
     */
    public String getEmployeeNo() {
        return employeeNo;
    }

    /**
     * 设置字段 employee.employee_no 的值
     *
     * @param employeeNo the value for employee.employee_no
     */
    public void setEmployeeNo(String employeeNo) {
        this.employeeNo = employeeNo;
    }

    /**
     * 获得字段 employee.entry_time 的值
     *
     * @return the value of employee.entry_time
     */
    public Date getEntryTime() {
        return entryTime;
    }

    /**
     * 设置字段 employee.entry_time 的值
     *
     * @param entryTime the value for employee.entry_time
     */
    public void setEntryTime(Date entryTime) {
        this.entryTime = entryTime;
    }

    /**
     * 获得字段 employee.birthday 的值
     *
     * @return the value of employee.birthday
     */
    public Date getBirthday() {
        return birthday;
    }

    /**
     * 设置字段 employee.birthday 的值
     *
     * @param birthday the value for employee.birthday
     */
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    /**
     * 获得字段 employee.address 的值
     *
     * @return the value of employee.address
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置字段 employee.address 的值
     *
     * @param address the value for employee.address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * 获得字段 employee.idcard 的值
     *
     * @return the value of employee.idcard
     */
    public String getIdcard() {
        return idcard;
    }

    /**
     * 设置字段 employee.idcard 的值
     *
     * @param idcard the value for employee.idcard
     */
    public void setIdcard(String idcard) {
        this.idcard = idcard;
    }

	public String getDeptId() {
		return deptId;
	}

	public void setDeptId(String deptId) {
		this.deptId = deptId;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}
}