package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.AlibabaAliqinFcIotQryPersoninfoResponse;

/**
 * TOP API: alibaba.aliqin.fc.iot.qry.personinfo request
 * 
 * @author top auto create
 * @since 1.0, 2017.03.03
 */
public class AlibabaAliqinFcIotQryPersoninfoRequest extends BaseTaobaoRequest<AlibabaAliqinFcIotQryPersoninfoResponse> {
	
	

	/** 
	* 需要查询的iccid
	 */
	private String iccid;

	/** 
	* 由系统根据业务分配
	 */
	private String midPatChannel;

	/** 
	* 指定查询某userid
	 */
	private String userid;

	public void setIccid(String iccid) {
		this.iccid = iccid;
	}

	public String getIccid() {
		return this.iccid;
	}

	public void setMidPatChannel(String midPatChannel) {
		this.midPatChannel = midPatChannel;
	}

	public String getMidPatChannel() {
		return this.midPatChannel;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getUserid() {
		return this.userid;
	}

	public String getApiMethodName() {
		return "alibaba.aliqin.fc.iot.qry.personinfo";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("iccid", this.iccid);
		txtParams.put("mid_pat_channel", this.midPatChannel);
		txtParams.put("userid", this.userid);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<AlibabaAliqinFcIotQryPersoninfoResponse> getResponseClass() {
		return AlibabaAliqinFcIotQryPersoninfoResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(iccid, "iccid");
		RequestCheckUtils.checkNotEmpty(midPatChannel, "midPatChannel");
	}
	

}