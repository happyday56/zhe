package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.AlibabaAliqinFcIotUseroscontrolResponse;

/**
 * TOP API: alibaba.aliqin.fc.iot.useroscontrol request
 * 
 * @author top auto create
 * @since 1.0, 2017.05.25
 */
public class AlibabaAliqinFcIotUseroscontrolRequest extends BaseTaobaoRequest<AlibabaAliqinFcIotUseroscontrolResponse> {
	
	

	/** 
	* 用户停开的操作类型：MANAGE_RESUME、MANAGE_STOP
	 */
	private String action;

	/** 
	* 物联卡的iccid
	 */
	private String iccid;

	public void setAction(String action) {
		this.action = action;
	}

	public String getAction() {
		return this.action;
	}

	public void setIccid(String iccid) {
		this.iccid = iccid;
	}

	public String getIccid() {
		return this.iccid;
	}

	public String getApiMethodName() {
		return "alibaba.aliqin.fc.iot.useroscontrol";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("action", this.action);
		txtParams.put("iccid", this.iccid);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<AlibabaAliqinFcIotUseroscontrolResponse> getResponseClass() {
		return AlibabaAliqinFcIotUseroscontrolResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(action, "action");
		RequestCheckUtils.checkNotEmpty(iccid, "iccid");
	}
	

}