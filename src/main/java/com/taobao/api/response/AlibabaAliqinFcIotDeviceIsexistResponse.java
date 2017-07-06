package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: alibaba.aliqin.fc.iot.device.isexist response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class AlibabaAliqinFcIotDeviceIsexistResponse extends TaobaoResponse {

	private static final long serialVersionUID = 4897717554523419111L;

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

	private static final long serialVersionUID = 7219924593598544593L;

	/**
		 * code
		 */
		@ApiField("code")
		private String code;
		/**
		 * 是否存在
		 */
		@ApiField("model")
		private Boolean model;
		/**
		 * 返回描述
		 */
		@ApiField("msg")
		private String msg;
		/**
		 * 是否异常
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
