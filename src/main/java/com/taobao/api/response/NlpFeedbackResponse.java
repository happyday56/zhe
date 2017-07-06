package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.nlp.feedback response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class NlpFeedbackResponse extends TaobaoResponse {

	private static final long serialVersionUID = 1121385412244459716L;

	/** 
	 * 用户的反馈是否成功
	 */
	@ApiField("is_success")
	private Boolean isSuccess;


	public void setIsSuccess(Boolean isSuccess) {
		this.isSuccess = isSuccess;
	}
	public Boolean getIsSuccess( ) {
		return this.isSuccess;
	}
	


}
