package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.baichuan.orderurl.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class BaichuanOrderurlGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 7638796646256146716L;

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
