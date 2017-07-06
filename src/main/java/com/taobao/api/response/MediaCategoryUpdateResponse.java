package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.media.category.update response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class MediaCategoryUpdateResponse extends TaobaoResponse {

	private static final long serialVersionUID = 5199155624714931751L;

	/** 
	 * 更新是否成功标志
	 */
	@ApiField("success")
	private Boolean success;


	public void setSuccess(Boolean success) {
		this.success = success;
	}
	public Boolean getSuccess( ) {
		return this.success;
	}
	


}
