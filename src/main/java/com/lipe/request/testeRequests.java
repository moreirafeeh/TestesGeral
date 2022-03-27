package com.lipe.request;

import com.lipe.requests.entities.Entities;
import com.lipe.requests.entities.EntitiesDefault;
import com.lipe.requests.utils.HttpRequests;
import com.lipe.requests.utils.Utils;

public class testeRequests {

	public static void main(String[] args) {
		
		String StringContent = "";
		Entities e =  null;
		EntitiesDefault ed = null;
		
		
		HttpRequests request = new HttpRequests("aWS", 1010, "XABLAU", "XABLAU");
		StringContent = request.shouldGetRequestsResponseBody("", 0, "chave<ALTERAR>valor", "chave<ALTERAR>valor");
		//-------------------------JACKSON tranformacao--------
		ed = Utils.transforma_json(StringContent, e);
        //-----------------------------------------------------
	}

}
