package com.taobao.api.request;

import java.util.List;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.domain.OpenAccount;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.json.JSONWriter;
import com.taobao.api.response.OpenAccountUpdateResponse;

/**
 * TOP API: taobao.open.account.update request
 * 
 * @author top auto create
 * @since 1.0, 2015.11.16
 */
public class OpenAccountUpdateRequest extends BaseTaobaoRequest<OpenAccountUpdateResponse> {
	
	

	/** 
	* Open Account
	 */
	private String paramList;

	public void setParamList(String paramList) {
		this.paramList = paramList;
	}

	public void setParamList(List<OpenAccount> paramList) {
		this.paramList = new JSONWriter(false,true).write(paramList);
	}

	public String getParamList() {
		return this.paramList;
	}

	public String getApiMethodName() {
		return "taobao.open.account.update";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("param_list", this.paramList);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OpenAccountUpdateResponse> getResponseClass() {
		return OpenAccountUpdateResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkObjectMaxListSize(paramList, 20, "paramList");
	}
	

}