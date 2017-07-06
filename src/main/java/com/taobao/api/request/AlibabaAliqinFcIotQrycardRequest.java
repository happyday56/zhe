package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.AlibabaAliqinFcIotQrycardResponse;

/**
 * TOP API: alibaba.aliqin.fc.iot.qrycard request
 * 
 * @author top auto create
 * @since 1.0, 2017.03.14
 */
public class AlibabaAliqinFcIotQrycardRequest extends BaseTaobaoRequest<AlibabaAliqinFcIotQrycardResponse> {
	
	

	/** 
	* 外部计费号
	 */
	private String billReal;

	/** 
	* 外部计费来源
	 */
	private String billSource;

	/** 
	* ICCID
	 */
	private String iccid;

	public void setBillReal(String billReal) {
		this.billReal = billReal;
	}

	public String getBillReal() {
		return this.billReal;
	}

	public void setBillSource(String billSource) {
		this.billSource = billSource;
	}

	public String getBillSource() {
		return this.billSource;
	}

	public void setIccid(String iccid) {
		this.iccid = iccid;
	}

	public String getIccid() {
		return this.iccid;
	}

	public String getApiMethodName() {
		return "alibaba.aliqin.fc.iot.qrycard";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("bill_real", this.billReal);
		txtParams.put("bill_source", this.billSource);
		txtParams.put("iccid", this.iccid);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<AlibabaAliqinFcIotQrycardResponse> getResponseClass() {
		return AlibabaAliqinFcIotQrycardResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(billReal, "billReal");
		RequestCheckUtils.checkNotEmpty(billSource, "billSource");
		RequestCheckUtils.checkNotEmpty(iccid, "iccid");
	}
	

}