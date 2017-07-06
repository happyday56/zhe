package com.taobao.api.response;

import com.taobao.api.internal.util.json.JSONValidatingReader;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.openim.userservice.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OpenimUserserviceGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 5463557861274234873L;

	/** 
	 * 根据站点名称查询产品
	 */
	@ApiField("result")
	private ApiResult result;


	public void setResult(ApiResult result) {
		this.result = result;
	}
	public ApiResult getResult( ) {
		return this.result;
	}
	
	/**
 * 根据站点名称查询产品
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class ApiResult extends TaobaoObject {

	private static final long serialVersionUID = 3451841943797866292L;

	/**
		 * 执行成功
		 */
		@ApiField("code")
		private Long code;
		/**
		 * 执行成功后的结果<br> startTime: 聊天开始时间，现在去敏感数据，精确到天<br> eserviceId：客服nick<br> area：客户所在区域<br> eserviceSendMsgNum：客服发送消息数<br> userSource：用户来源，比如ios, android<br> userSendMsgNum：用户发送消息数<br> channel：客户来源渠道<br> loadingPage：load页面<br> openId：客户nick
		 */
		@ApiField("data")
		private String data;
		/**
		 * 错误信息
		 */
		@ApiField("error_msg")
		private String errorMsg;
	

	public Long getCode() {
			return this.code;
		}
		public void setCode(Long code) {
			this.code = code;
		}
		public String getData() {
			return this.data;
		}
		public void setData(String data) {
			this.data = data;
		}
		public void setDataString(String data) {
			this.data = data;
		}
		
		public String getErrorMsg() {
			return this.errorMsg;
		}
		public void setErrorMsg(String errorMsg) {
			this.errorMsg = errorMsg;
		}

}



}
