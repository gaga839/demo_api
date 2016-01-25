package com.wocai.jrt.paper.bean;

import java.util.ArrayList;
import java.util.List;

import com.wocai.jrt.paper.model.Options;
import com.wocai.jrt.paper.model.Question;


public class QuestionDetailBean {
	
	
	private Question question;
	
	private List<Options> optList;
	
	public Question getQuestion() {
		return question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}

	public List<Options> getOptList() {
		return optList;
	}
	
	public void setOptList(List<Options> optList) {
		this.optList = optList;
	}
	
	public boolean  addOptions(Options options) {
		if(optList == null){
			optList = new ArrayList<Options>();
		}
		return optList.add(options);
	}
	
}
