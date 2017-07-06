package com.taobao.api.request;

import java.util.Date;
import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.AlibabaAliqinFcIotRechargeCardResponse;

/**
 * TOP API: alibaba.aliqin.fc.iot.rechargeCard request
 * 
 * @author top auto create
 * @since 1.0, 2017.06.08
 */
public class AlibabaAliqinFcIotRechargeCardRequest extends BaseTaobaoRequest<AlibabaAliqinFcIotRechargeCardResponse> {
	
	

	/** 
	* iccid的值
	 */
	private String billReal;

	/** 
	* 外部计费号类型：写‘ICCID’
	 */
	private String billSource;

	/** 
	* 生效时间,1000,立即生效; 1010,次月生效;1030,指定时间生效;
	 */
	private String effCode;

	/** 
	* yyyy-MM-dd HH:mm:ss
	 */
	private Date effTime;

	/** 
	* ICCID
	 */
	private String iccid;

	/** 
	* 流量包offerId
	 */
	private String offerId;

	/** 
	* 外部id,用来做幂等
	 */
	private String outRechargeId;

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

	public void setEffCode(String effCode) {
		this.effCode = effCode;
	}

	public String getEffCode() {
		return this.effCode;
	}

	public void setEffTime(Date effTime) {
		this.effTime = effTime;
	}

	public Date getEffTime() {
		return this.effTime;
	}

	public void setIccid(String iccid) {
		this.iccid = iccid;
	}

	public String getIccid() {
		return this.iccid;
	}

	public void setOfferId(String offerId) {
		this.offerId = offerId;
	}

	public String getOfferId() {
		return this.offerId;
	}

	public void setOutRechargeId(String outRechargeId) {
		this.outRechargeId = outRechargeId;
	}

	public String getOutRechargeId() {
		return this.outRechargeId;
	}

	public String getApiMethodName() {
		return "alibaba.aliqin.fc.iot.rechargeCard";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("bill_real", this.billReal);
		txtParams.put("bill_source", this.billSource);
		txtParams.put("eff_code", this.effCode);
		txtParams.put("eff_time", this.effTime);
		txtParams.put("iccid", this.iccid);
		txtParams.put("offer_id", this.offerId);
		txtParams.put("out_recharge_id", this.outRechargeId);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<AlibabaAliqinFcIotRechargeCardResponse> getResponseClass() {
		return AlibabaAliqinFcIotRechargeCardResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(billReal, "billReal");
		RequestCheckUtils.checkNotEmpty(billSource, "billSource");
		RequestCheckUtils.checkNotEmpty(effCode, "effCode");
		RequestCheckUtils.checkNotEmpty(iccid, "iccid");
		RequestCheckUtils.checkNotEmpty(offerId, "offerId");
		RequestCheckUtils.checkNotEmpty(outRechargeId, "outRechargeId");
		RequestCheckUtils.checkMaxLength(outRechargeId, 32, "outRechargeId");
	}
	

}