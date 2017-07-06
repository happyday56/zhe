package com.taobao.api.response;

import com.taobao.api.domain.BizResult;
import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: alibaba.aliqin.fc.iot.sms.send response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class AlibabaAliqinFcIotSmsSendResponse extends TaobaoResponse {

	private static final long serialVersionUID = 8636124287675483285L;

	/** 
	 * 返回值
	 */
	@ApiField("result")
	private BizResult result;


	public void setResult(BizResult result) {
		this.result = result;
	}
	public BizResult getResult( ) {
		return this.result;
	}
	


}
