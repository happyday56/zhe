package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiListField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: alibaba.aliqin.fc.iot.qrycard response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class AlibabaAliqinFcIotQrycardResponse extends TaobaoResponse {

	private static final long serialVersionUID = 4533254288647622243L;

	/** 
	 * 系统自动生成
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
 * model
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class Model extends TaobaoObject {

	private static final long serialVersionUID = 5318769821398291169L;

	/**
		 * 失效时间
		 */
		@ApiField("expire_date")
		private String expireDate;
		/**
		 * 总流量(KB)
		 */
		@ApiField("flow_resource")
		private Long flowResource;
		/**
		 * 已使用流量(KB)
		 */
		@ApiField("flow_used")
		private Long flowUsed;
		/**
		 * 资源名称
		 */
		@ApiField("res_name")
		private String resName;
		/**
		 * 流量类型(6700001:上网流量)
		 */
		@ApiField("resource_type")
		private String resourceType;
		/**
		 * 剩余流量(KB)
		 */
		@ApiField("rest_of_flow")
		private Long restOfFlow;
		/**
		 * 生效时间
		 */
		@ApiField("valid_date")
		private String validDate;
	

	public String getExpireDate() {
			return this.expireDate;
		}
		public void setExpireDate(String expireDate) {
			this.expireDate = expireDate;
		}
		public Long getFlowResource() {
			return this.flowResource;
		}
		public void setFlowResource(Long flowResource) {
			this.flowResource = flowResource;
		}
		public Long getFlowUsed() {
			return this.flowUsed;
		}
		public void setFlowUsed(Long flowUsed) {
			this.flowUsed = flowUsed;
		}
		public String getResName() {
			return this.resName;
		}
		public void setResName(String resName) {
			this.resName = resName;
		}
		public String getResourceType() {
			return this.resourceType;
		}
		public void setResourceType(String resourceType) {
			this.resourceType = resourceType;
		}
		public Long getRestOfFlow() {
			return this.restOfFlow;
		}
		public void setRestOfFlow(Long restOfFlow) {
			this.restOfFlow = restOfFlow;
		}
		public String getValidDate() {
			return this.validDate;
		}
		public void setValidDate(String validDate) {
			this.validDate = validDate;
		}

}

	/**
 * 系统自动生成
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class Result extends TaobaoObject {

	private static final long serialVersionUID = 8185852563842975977L;

	/**
		 * code
		 */
		@ApiField("code")
		private String code;
		/**
		 * model
		 */
		@ApiListField("models")
		@ApiField("model")
		private List<Model> models;
		/**
		 * true返回成功，false返回失败
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
		public Boolean getSuccess() {
			return this.success;
		}
		public void setSuccess(Boolean success) {
			this.success = success;
		}

}



}
