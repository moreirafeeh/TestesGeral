package com.lipe.request;

import com.lipe.requests.entities.Entities;
import com.lipe.requests.entities.EntitiesDefault;
import com.lipe.requests.utils.HttpRequests;
import com.lipe.requests.utils.Utils;

public class testeRequests {

	public static void main(String[] args) {
		String authRequestHeader = "";
		String authRequestBody = "";
		String StringContent = "";
		Entities e =  null;
		EntitiesDefault ed = null;
		
		
		HttpRequests request = new HttpRequests("aWS", 1010, "XABLAU", "XABLAU");
		StringContent = request.shouldGetRequestsResponseBody("", 0, authRequestHeader, authRequestBody);
		//-------------------------JACKSON tranformacao--------
		ed = Utils.transforma_json(StringContent, e);
        //-----------------------------------------------------
	}

}
