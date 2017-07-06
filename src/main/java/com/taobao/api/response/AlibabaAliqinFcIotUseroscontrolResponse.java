package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: alibaba.aliqin.fc.iot.useroscontrol response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class AlibabaAliqinFcIotUseroscontrolResponse extends TaobaoResponse {

	private static final long serialVersionUID = 1597783475211845336L;

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

	private static final long serialVersionUID = 5864594357624522683L;

	/**
		 * 停开结果编码
		 */
		@ApiField("code")
		private String code;
		/**
		 * 停开结果描述
		 */
		@ApiField("model")
		private String model;
		/**
		 * 描述信息
		 */
		@ApiField("msg")
		private String msg;
		/**
		 * 是否成功
		 */
		@ApiField("success")
		private Boolean success;
	

	public String getCode() {
			return this.code;
		}
		public void setCode(String code) {
			this.code = code;
		}
		public String getModel() {
			return this.model;
		}
		public void setModel(String model) {
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
