package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.AlibabaAliqinFcIotDeviceIsexistResponse;

/**
 * TOP API: alibaba.aliqin.fc.iot.device.isexist request
 * 
 * @author top auto create
 * @since 1.0, 2017.03.13
 */
public class AlibabaAliqinFcIotDeviceIsexistRequest extends BaseTaobaoRequest<AlibabaAliqinFcIotDeviceIsexistResponse> {
	
	

	/** 
	* 设备类型（预留将来扩展）
	 */
	private String deviceType;

	/** 
	* 设备编号
	 */
	private String imei;

	/** 
	* 渠道扩展编码（预留）
	 */
	private String midPatChannel;

	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
	}

	public String getDeviceType() {
		return this.deviceType;
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

	public String getApiMethodName() {
		return "alibaba.aliqin.fc.iot.device.isexist";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("device_type", this.deviceType);
		txtParams.put("imei", this.imei);
		txtParams.put("mid_pat_channel", this.midPatChannel);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<AlibabaAliqinFcIotDeviceIsexistResponse> getResponseClass() {
		return AlibabaAliqinFcIotDeviceIsexistResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(imei, "imei");
	}
	

}