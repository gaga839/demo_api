package com.wocai.jrt.paper.bean;

import java.util.ArrayList;
import java.util.List;

public class AnswerReqBean {
	
	private String id;
	
	private String orgId;
	
	private String paperId;
	
	private List<AnswerBean> answerList = new ArrayList<AnswerBean>();

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getOrgId() {
		return orgId;
	}

	public void setOrgId(String orgId) {
		this.orgId = orgId;
	}

	public String getPaperId() {
		return paperId;
	}

	public void setPaperId(String paperId) {
		this.paperId = paperId;
	}

	public List<AnswerBean> getAnswerList() {
		return answerList;
	}

	public void setAnswerList(List<AnswerBean> answerList) {
		this.answerList = answerList;
	}

	
}
