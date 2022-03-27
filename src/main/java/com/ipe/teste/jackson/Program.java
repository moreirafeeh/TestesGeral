package com.ipe.teste.jackson;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.lipe.requests.entities.Entities;

public class Program {
	
	public static void main(String args[]) throws JsonParseException, IOException{

		//---------------------------TESTANDO JACKSON LIB----------------------
		String carJson = "{ \"brand\" : \"Mercedes\", \"doors\" : [ {\"porta\": 1, \"roda\": \"caminhao\"},{\"porta\": 3, \"roda\": \"carro\"} ] }";

		//----------------------------VERSAO JACKSON HARD------
//		JsonFactory factory = new JsonFactory();
//		JsonParser  parser  = factory.createParser(carJson);
//
//		while(!parser.isClosed()){
//		    JsonToken jsonToken = parser.nextToken();
//		    
//		    
//		    if(JsonToken.FIELD_NAME.equals(jsonToken)){
//		        String fieldName = parser.getCurrentName();
//		        System.out.println(fieldName);
//
//		        jsonToken = parser.nextToken();
//
//		        if("brand".equals(fieldName)){
//		            String brand = parser.getValueAsString();
//		        } else if ("doors".equals(fieldName)){
//		            int door = parser.getValueAsInt();
//		        }
//		    }
//		    
//		    //System.out.println("parser = " + parser.getValueAsString());
//		    System.out.println("jsonToken = " + jsonToken.FIELD_NAME);
//		}
		//----------------------------VERSAO JACKSON BASIC COM JSON ARRAYS------
		
		ObjectMapper objectMapper = new ObjectMapper();

		try {
		    jacksonMapper map = objectMapper.readValue(carJson, jacksonMapper.class);

		    //System.out.println("car brand = " + map.getBrand());
		    System.out.println("car doors = " + map.doors.get(1).roda);
		    //System.out.println("car brand = " + map.getBrand());
		    System.out.println("car brands = " + map.getBrand());
		} catch (IOException e) {
		    e.printStackTrace();
		}
		
		//------------------------------------------------------------------------
		
	}
}
