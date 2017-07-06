package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.AlibabaAliqinFcFlowGradeResponse;

/**
 * TOP API: alibaba.aliqin.fc.flow.grade request
 * 
 * @author top auto create
 * @since 1.0, 2017.02.27
 */
public class AlibabaAliqinFcFlowGradeRequest extends BaseTaobaoRequest<AlibabaAliqinFcFlowGradeResponse> {
	
	

	/** 
	* 手机号码。如果未填手机号码，返回所有运营商的档位信息。如果填了手机号码，则返回此手机号码所属运营商的档位，如果手机号码对应的运营商未知，则返回所有档位
	 */
	private Long phoneNum;

	public void setPhoneNum(Long phoneNum) {
		this.phoneNum = phoneNum;
	}

	public Long getPhoneNum() {
		return this.phoneNum;
	}

	public String getApiMethodName() {
		return "alibaba.aliqin.fc.flow.grade";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("phone_num", this.phoneNum);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<AlibabaAliqinFcFlowGradeResponse> getResponseClass() {
		return AlibabaAliqinFcFlowGradeResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	

}