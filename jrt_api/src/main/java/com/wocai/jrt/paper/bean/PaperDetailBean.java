package com.wocai.jrt.paper.bean;

import java.util.List;

public class PaperDetailBean {
	
	private List<QuesDetailBean> questionList;
	
	private String id;
	
	private String title;
	
	private String orgId;

	public List<QuesDetailBean> getQuestionList() {
		return questionList;
	}

	public void setQuestionList(List<QuesDetailBean> quesDetailList) {
		this.questionList = quesDetailList;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getOrgId() {
		return orgId;
	}

	public void setOrgId(String orgId) {
		this.orgId = orgId;
	}

	
}
