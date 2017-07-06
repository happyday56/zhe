package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.AlibabaAliqinFcIotCardofferResponse;

/**
 * TOP API: alibaba.aliqin.fc.iot.cardoffer request
 * 
 * @author top auto create
 * @since 1.0, 2017.04.21
 */
public class AlibabaAliqinFcIotCardofferRequest extends BaseTaobaoRequest<AlibabaAliqinFcIotCardofferResponse> {
	
	

	/** 
	* 具体ICCID的值
	 */
	private String billreal;

	/** 
	* ICCID
	 */
	private String billsource;

	public void setBillreal(String billreal) {
		this.billreal = billreal;
	}

	public String getBillreal() {
		return this.billreal;
	}

	public void setBillsource(String billsource) {
		this.billsource = billsource;
	}

	public String getBillsource() {
		return this.billsource;
	}

	public String getApiMethodName() {
		return "alibaba.aliqin.fc.iot.cardoffer";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("billreal", this.billreal);
		txtParams.put("billsource", this.billsource);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<AlibabaAliqinFcIotCardofferResponse> getResponseClass() {
		return AlibabaAliqinFcIotCardofferResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(billreal, "billreal");
		RequestCheckUtils.checkNotEmpty(billsource, "billsource");
	}
	

}