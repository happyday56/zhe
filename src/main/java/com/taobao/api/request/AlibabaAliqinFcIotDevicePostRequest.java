package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.AlibabaAliqinFcIotDevicePostResponse;

/**
 * TOP API: alibaba.aliqin.fc.iot.device.post request
 * 
 * @author top auto create
 * @since 1.0, 2017.03.15
 */
public class AlibabaAliqinFcIotDevicePostRequest extends BaseTaobaoRequest<AlibabaAliqinFcIotDevicePostResponse> {
	
	

	/** 
	* 备注
	 */
	private String comments;

	/** 
	* 设备类型（将来扩展）
	 */
	private String deviceType;

	/** 
	* 15位imei号
	 */
	private String imei;

	/** 
	* 扩展字段
	 */
	private String midPatChannel;

	public void setComments(String comments) {
		this.comments = comments;
	}

	public String getComments() {
		return this.comments;
	}

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
		return "alibaba.aliqin.fc.iot.device.post";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("comments", this.comments);
		txtParams.put("device_type", this.deviceType);
		txtParams.put("imei", this.imei);
		txtParams.put("mid_pat_channel", this.midPatChannel);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<AlibabaAliqinFcIotDevicePostResponse> getResponseClass() {
		return AlibabaAliqinFcIotDevicePostResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(imei, "imei");
	}
	

}