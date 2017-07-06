package com.taobao.api.response;

import com.taobao.api.internal.util.json.JSONValidatingReader;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: alibaba.aliqin.fc.iot.cardStatus response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class AlibabaAliqinFcIotCardStatusResponse extends TaobaoResponse {

	private static final long serialVersionUID = 8745577454543794399L;

	/** 
	 * 结果对象
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
 * 结果对象
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class Result extends TaobaoObject {

	private static final long serialVersionUID = 8784946483953858621L;

	/**
		 * 1.成功；2.失败
		 */
		@ApiField("code")
		private String code;
		/**
		 * "MsisdnStatus":"卡状态","MSISDN":"MSISDN号","ICCID":"ICCID号"
		 */
		@ApiField("model")
		private String model;
		/**
		 * 错误信息
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
		public void setModelString(String model) {
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
