package com.wocai.jrt.paper.bean;

import java.util.ArrayList;
import java.util.List;

import com.wocai.jrt.paper.model.Options;


public class QuesDetailBean {
	
	private String id;
	
	private String  title;
	
	private Integer  no;
	
	private Boolean  options;

	private List<Options> optionsList;
	
	
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

	public Integer getNo() {
		return no;
	}

	public void setNo(Integer no) {
		this.no = no;
	}

	public Boolean getOptions() {
		return options;
	}

	public void setOptions(Boolean options) {
		this.options = options;
	}
	
	public List<Options> getOptionsList() {
		return optionsList;
	}

	public void setOptionsList(List<Options> optionsList) {
		this.optionsList = optionsList;
	}

	public boolean  addOptions(Options options) {
		if(optionsList == null){
			optionsList = new ArrayList<Options>();
		}
		return optionsList.add(options);
	}
}
