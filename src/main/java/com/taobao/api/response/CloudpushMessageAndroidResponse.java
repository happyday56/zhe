package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.cloudpush.message.android response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class CloudpushMessageAndroidResponse extends TaobaoResponse {

	private static final long serialVersionUID = 8512968747456844251L;

	/** 
	 * 请求是否成功.
	 */
	@ApiField("is_success")
	private Boolean isSuccess;

	/** 
	 * 若请求失败，则返回对应的error code.
	 */
	@ApiField("request_error_code")
	private Long requestErrorCode;

	/** 
	 * 请求失败后返回的错误信息.
	 */
	@ApiField("request_error_msg")
	private String requestErrorMsg;


	public void setIsSuccess(Boolean isSuccess) {
		this.isSuccess = isSuccess;
	}
	public Boolean getIsSuccess( ) {
		return this.isSuccess;
	}

	public void setRequestErrorCode(Long requestErrorCode) {
		this.requestErrorCode = requestErrorCode;
	}
	public Long getRequestErrorCode( ) {
		return this.requestErrorCode;
	}

	public void setRequestErrorMsg(String requestErrorMsg) {
		this.requestErrorMsg = requestErrorMsg;
	}
	public String getRequestErrorMsg( ) {
		return this.requestErrorMsg;
	}
	


}
