package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.AlibabaAliqinFcFlowChargeResponse;

/**
 * TOP API: alibaba.aliqin.fc.flow.charge request
 * 
 * @author top auto create
 * @since 1.0, 2017.06.23
 */
public class AlibabaAliqinFcFlowChargeRequest extends BaseTaobaoRequest<AlibabaAliqinFcFlowChargeResponse> {
	
	

	/** 
	* 需要充值的流量
	 */
	private String grade;

	/** 
	* 当scope=0时，is_province=true为指定分省通道。默认值为false
	 */
	private Boolean isProvince;

	/** 
	* 唯一流水号
	 */
	private String outRechargeId;

	/** 
	* 手机号
	 */
	private String phoneNum;

	/** 
	* 充值原因
	 */
	private String reason;

	/** 
	* 0:全国漫游流量  1:省内流量。不填默认值为0
	 */
	private String scope;

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getGrade() {
		return this.grade;
	}

	public void setIsProvince(Boolean isProvince) {
		this.isProvince = isProvince;
	}

	public Boolean getIsProvince() {
		return this.isProvince;
	}

	public void setOutRechargeId(String outRechargeId) {
		this.outRechargeId = outRechargeId;
	}

	public String getOutRechargeId() {
		return this.outRechargeId;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public String getPhoneNum() {
		return this.phoneNum;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getReason() {
		return this.reason;
	}

	public void setScope(String scope) {
		this.scope = scope;
	}

	public String getScope() {
		return this.scope;
	}

	public String getApiMethodName() {
		return "alibaba.aliqin.fc.flow.charge";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("grade", this.grade);
		txtParams.put("is_province", this.isProvince);
		txtParams.put("out_recharge_id", this.outRechargeId);
		txtParams.put("phone_num", this.phoneNum);
		txtParams.put("reason", this.reason);
		txtParams.put("scope", this.scope);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<AlibabaAliqinFcFlowChargeResponse> getResponseClass() {
		return AlibabaAliqinFcFlowChargeResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(grade, "grade");
		RequestCheckUtils.checkNotEmpty(outRechargeId, "outRechargeId");
		RequestCheckUtils.checkNotEmpty(phoneNum, "phoneNum");
	}
	

}