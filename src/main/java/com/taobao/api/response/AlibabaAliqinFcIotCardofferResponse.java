package com.taobao.api.response;

import java.util.List;
import java.util.Date;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiListField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: alibaba.aliqin.fc.iot.cardoffer response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class AlibabaAliqinFcIotCardofferResponse extends TaobaoResponse {

	private static final long serialVersionUID = 7231223993553872546L;

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
public static class Model extends TaobaoObject {

	private static final long serialVersionUID = 2142236912985183739L;

	/**
		 * 生效时间
		 */
		@ApiField("effective_time")
		private Date effectiveTime;
		/**
		 * 失效时间
		 */
		@ApiField("expire_time")
		private Date expireTime;
		/**
		 * 商品ID
		 */
		@ApiField("offer_id")
		private String offerId;
		/**
		 * 商品名称
		 */
		@ApiField("offer_name")
		private String offerName;
		/**
		 * 订购时间
		 */
		@ApiField("order_time")
		private String orderTime;
	

	public Date getEffectiveTime() {
			return this.effectiveTime;
		}
		public void setEffectiveTime(Date effectiveTime) {
			this.effectiveTime = effectiveTime;
		}
		public Date getExpireTime() {
			return this.expireTime;
		}
		public void setExpireTime(Date expireTime) {
			this.expireTime = expireTime;
		}
		public String getOfferId() {
			return this.offerId;
		}
		public void setOfferId(String offerId) {
			this.offerId = offerId;
		}
		public String getOfferName() {
			return this.offerName;
		}
		public void setOfferName(String offerName) {
			this.offerName = offerName;
		}
		public String getOrderTime() {
			return this.orderTime;
		}
		public void setOrderTime(String orderTime) {
			this.orderTime = orderTime;
		}

}

	/**
 * 结果对象
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class Result extends TaobaoObject {

	private static final long serialVersionUID = 5558747816263637155L;

	/**
		 * 1.成功；2.失败
		 */
		@ApiField("code")
		private String code;
		/**
		 * 结果对象
		 */
		@ApiListField("models")
		@ApiField("model")
		private List<Model> models;
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
		public List<Model> getModels() {
			return this.models;
		}
		public void setModels(List<Model> models) {
			this.models = models;
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
