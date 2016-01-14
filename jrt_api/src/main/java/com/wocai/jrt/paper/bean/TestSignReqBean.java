package com.wocai.jrt.paper.bean;

import org.springframework.web.multipart.MultipartFile;

public class TestSignReqBean {
	 /**
	 * 投资人id
	 */
	 private String id;
	 /**
	 * 机构id
	 */
	 private String orgId;
	 /**
	 * 试卷id
	 */
	 private String paperId;
	 /**
	 * 投资人id
	 */
	 private MultipartFile signImage;
	 
	 
	public String getPaperId() {
		return paperId;
	}

	public void setPaperId(String paperId) {
		this.paperId = paperId;
	}

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

	public MultipartFile getSignImage() {
		return signImage;
	}

	public void setSignImage(MultipartFile signImage) {
		this.signImage = signImage;
	}
	 
 
}
