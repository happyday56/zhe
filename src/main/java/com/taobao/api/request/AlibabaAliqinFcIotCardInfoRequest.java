package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.AlibabaAliqinFcIotCardInfoResponse;

/**
 * TOP API: alibaba.aliqin.fc.iot.cardInfo request
 * 
 * @author top auto create
 * @since 1.0, 2017.03.09
 */
public class AlibabaAliqinFcIotCardInfoRequest extends BaseTaobaoRequest<AlibabaAliqinFcIotCardInfoResponse> {
	
	

	/** 
	* SIM卡号
	 */
	private String iccid;

	public void setIccid(String iccid) {
		this.iccid = iccid;
	}

	public String getIccid() {
		return this.iccid;
	}

	public String getApiMethodName() {
		return "alibaba.aliqin.fc.iot.cardInfo";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("iccid", this.iccid);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<AlibabaAliqinFcIotCardInfoResponse> getResponseClass() {
		return AlibabaAliqinFcIotCardInfoResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(iccid, "iccid");
	}
	

}