package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.AlibabaAliqinFcIotModbindResponse;

/**
 * TOP API: alibaba.aliqin.fc.iot.modbind request
 * 
 * @author top auto create
 * @since 1.0, 2017.03.17
 */
public class AlibabaAliqinFcIotModbindRequest extends BaseTaobaoRequest<AlibabaAliqinFcIotModbindResponse> {
	
	

	/** 
	* 物联卡和iccid保持一致
	 */
	private String billReal;

	/** 
	* 物联卡业务：若无特殊为ICCID
	 */
	private String billSource;

	/** 
	* iccid （20位）
	 */
	private String iccid;

	/** 
	* 目前绑定的设备imei
	 */
	private String imei;

	/** 
	* 若无特殊物联卡传入122
	 */
	private String midPatChannel;

	/** 
	* 换绑的时候必传，换的新设备imei
	 */
	private String newimei;

	/** 
	* chgBind：换绑；unBind：解绑
	 */
	private String opionType;

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

	public void setImei(String imei) {
		this.imei = imei;
	}

	public String getImei() {
		return this.imei;
	}

	public void setMidPatChannel(String midPatChannel) {
		this.midPatChannel = midPatChannel;
	}

	public String getMidPatChannel() {
		return this.midPatChannel;
	}

	public void setNewimei(String newimei) {
		this.newimei = newimei;
	}

	public String getNewimei() {
		return this.newimei;
	}

	public void setOpionType(String opionType) {
		this.opionType = opionType;
	}

	public String getOpionType() {
		return this.opionType;
	}

	public String getApiMethodName() {
		return "alibaba.aliqin.fc.iot.modbind";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("bill_real", this.billReal);
		txtParams.put("bill_source", this.billSource);
		txtParams.put("iccid", this.iccid);
		txtParams.put("imei", this.imei);
		txtParams.put("mid_pat_channel", this.midPatChannel);
		txtParams.put("newimei", this.newimei);
		txtParams.put("opion_type", this.opionType);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<AlibabaAliqinFcIotModbindResponse> getResponseClass() {
		return AlibabaAliqinFcIotModbindResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(billReal, "billReal");
		RequestCheckUtils.checkNotEmpty(billSource, "billSource");
		RequestCheckUtils.checkNotEmpty(iccid, "iccid");
		RequestCheckUtils.checkNotEmpty(imei, "imei");
		RequestCheckUtils.checkNotEmpty(midPatChannel, "midPatChannel");
		RequestCheckUtils.checkNotEmpty(opionType, "opionType");
	}
	

}