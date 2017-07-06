package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: alibaba.aliqin.fc.iot.rechargeCard response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class AlibabaAliqinFcIotRechargeCardResponse extends TaobaoResponse {

	private static final long serialVersionUID = 3773766399118221671L;

	/** 
	 * result
	 */
	@ApiField("result")
	private Result result;


	public void setResult(Result result) {
		this.result = result;
	}
	public Result getResult( ) {
		return this.result;
	}
	
	/**
 * result
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class Result extends TaobaoObject {

	private static final long serialVersionUID = 2632573871721878274L;

	/**
		 * code
		 */
		@ApiField("code")
		private String code;
		/**
		 * model
		 */
		@ApiField("model")
		private Boolean model;
		/**
		 * msg
		 */
		@ApiField("msg")
		private String msg;
		/**
		 * success
		 */
		@ApiField("success")
		private Boolean success;
	

	public String getCode() {
			return this.code;
		}
		public void setCode(String code) {
			this.code = code;
		}
		public Boolean getModel() {
			return this.model;
		}
		public void setModel(Boolean model) {
			this.model = model;
		}
		public String getMsg() {
			return this.msg;
		}
		public void setMsg(String msg) {
			this.msg = msg;
		}
		public Boolean getSuccess() {
			return this.success;
		}
		public void setSuccess(Boolean success) {
			this.success = success;
		}

}



}
