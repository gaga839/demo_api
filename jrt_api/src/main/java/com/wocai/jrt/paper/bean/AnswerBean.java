package com.wocai.jrt.paper.bean;

import java.util.List;

public class AnswerBean {
	
	private String questionId;
	
	private List<String> optionsList;

	public String getQuestionId() {
		return questionId;
	}

	public void setQuestionId(String questionId) {
		this.questionId = questionId;
	}

	public List<String> getOptionsList() {
		return optionsList;
	}

	public void setOptionsList(List<String> optionsList) {
		this.optionsList = optionsList;
	}
	
	
}
