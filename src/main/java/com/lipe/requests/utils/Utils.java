package com.lipe.requests.utils;

import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.lipe.requests.entities.EntitiesDefault;

public class Utils {
	
	public static EntitiesDefault transforma_json(String content, EntitiesDefault entitie) {
		
		ObjectMapper objectMapper = new ObjectMapper();
		EntitiesDefault map = null;

		try {
		    map = objectMapper.readValue(content, entitie.getClass());
		    //System.out.println("car brand = " + map.getBrand());
		    //System.out.println("car doors = " + map.getOrigin());
		    //System.out.println("car brand = " + map.getHeaders().get("Accept-Encoding"));
		    //System.out.println("car brands = " + map.getUrl());
		    return map;
		} catch (IOException e) {
		    e.printStackTrace();
		}
		return map;	
	}
}
