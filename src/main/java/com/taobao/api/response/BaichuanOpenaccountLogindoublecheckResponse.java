package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.baichuan.openaccount.logindoublecheck response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class BaichuanOpenaccountLogindoublecheckResponse extends TaobaoResponse {

	private static final long serialVersionUID = 8719248637838719223L;

	/** 
	 * name
	 */
	@ApiField("name")
	private String name;


	public void setName(String name) {
		this.name = name;
	}
	public String getName( ) {
		return this.name;
	}
	


}
