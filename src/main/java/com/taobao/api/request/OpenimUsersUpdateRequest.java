package com.taobao.api.request;

import java.util.List;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.domain.Userinfos;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.json.JSONWriter;
import com.taobao.api.response.OpenimUsersUpdateResponse;

/**
 * TOP API: taobao.openim.users.update request
 * 
 * @author top auto create
 * @since 1.0, 2016.04.11
 */
public class OpenimUsersUpdateRequest extends BaseTaobaoRequest<OpenimUsersUpdateResponse> {
	
	

	/** 
	* 用户信息列表
	 */
	private String userinfos;

	public void setUserinfos(String userinfos) {
		this.userinfos = userinfos;
	}

	public void setUserinfos(List<Userinfos> userinfos) {
		this.userinfos = new JSONWriter(false,true).write(userinfos);
	}

	public String getUserinfos() {
		return this.userinfos;
	}

	public String getApiMethodName() {
		return "taobao.openim.users.update";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("userinfos", this.userinfos);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OpenimUsersUpdateResponse> getResponseClass() {
		return OpenimUsersUpdateResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkObjectMaxListSize(userinfos, 100, "userinfos");
	}
	

}