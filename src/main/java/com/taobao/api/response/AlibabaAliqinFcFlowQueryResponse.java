package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: alibaba.aliqin.fc.flow.query response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class AlibabaAliqinFcFlowQueryResponse extends TaobaoResponse {

	private static final long serialVersionUID = 4682138323965385293L;

	/** 
	 * 无
	 */
	@ApiField("value")
	private Result value;


	public void setValue(Result value) {
		this.value = value;
	}
	public Result getValue( ) {
		return this.value;
	}
	
	/**
 * 无
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class Result extends TaobaoObject {

	private static final long serialVersionUID = 3426756846297384463L;

	/**
		 * 错误码
		 */
		@ApiField("code")
		private String code;
		/**
		 * id：提交的唯一流水号, time:提交时间, phone:充值号码, error:false成功，true失败, reason:错误原因, status:1充值中，3成功，4失败, flow:流量, operator:运营商
		 */
		@ApiField("model")
		private String model;
		/**
		 * 原因
		 */
		@ApiField("msg")
		private String msg;
		/**
		 * 状态
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
