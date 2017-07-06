package com.taobao.api.response;

import com.taobao.api.internal.util.json.JSONValidatingReader;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: alibaba.baichuan.appcontent.upload response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class AlibabaBaichuanAppcontentUploadResponse extends TaobaoResponse {

	private static final long serialVersionUID = 8297676417236146872L;

	/** 
	 * 接口返回model
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
 * 接口返回model
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class Result extends TaobaoObject {

	private static final long serialVersionUID = 3659524131955342897L;

	/**
		 * 错误码
		 */
		@ApiField("error_code")
		private String errorCode;
		/**
		 * 错误信息
		 */
		@ApiField("error_msg")
		private String errorMsg;
		/**
		 * 预留属性扩展
		 */
		@ApiField("extra")
		private String extra;
		/**
		 * 返回的信息
		 */
		@ApiField("message")
		private String message;
		/**
		 * 具体返回的内容
		 */
		@ApiField("result_value")
		private String resultValue;
		/**
		 * 标识成功或失败
		 */
		@ApiField("success")
		private Boolean success;
		/**
		 * 预留信息
		 */
		@ApiField("tracker")
		private String tracker;
	

	public String getErrorCode() {
			return this.errorCode;
		}
		public void setErrorCode(String errorCode) {
			this.errorCode = errorCode;
		}
		public String getErrorMsg() {
			return this.errorMsg;
		}
		public void setErrorMsg(String errorMsg) {
			this.errorMsg = errorMsg;
		}
		public String getExtra() {
			return this.extra;
		}
		public void setExtra(String extra) {
			this.extra = extra;
		}
		public void setExtraString(String extra) {
			this.extra = extra;
		}
		
		public String getMessage() {
			return this.message;
		}
		public void setMessage(String message) {
			this.message = message;
		}
		public String getResultValue() {
			return this.resultValue;
		}
		public void setResultValue(String resultValue) {
			this.resultValue = resultValue;
		}
		public void setResultValueString(String resultValue) {
			this.resultValue = resultValue;
		}
		
		public Boolean getSuccess() {
			return this.success;
		}
		public void setSuccess(Boolean success) {
			this.success = success;
		}
		public String getTracker() {
			return this.tracker;
		}
		public void setTracker(String tracker) {
			this.tracker = tracker;
		}

}



}