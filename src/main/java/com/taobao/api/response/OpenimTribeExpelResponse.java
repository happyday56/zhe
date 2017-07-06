package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.openim.tribe.expel response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OpenimTribeExpelResponse extends TaobaoResponse {

	private static final long serialVersionUID = 1894419657442152615L;

	/** 
	 * 群服务code
	 */
	@ApiField("tribe_code")
	private Long tribeCode;


	public void setTribeCode(Long tribeCode) {
		this.tribeCode = tribeCode;
	}
	public Long getTribeCode( ) {
		return this.tribeCode;
	}
	


}
