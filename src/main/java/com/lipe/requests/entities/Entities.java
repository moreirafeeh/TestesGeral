package com.lipe.requests.entities;

import java.util.List;
import java.util.Map;

import com.ipe.teste.jackson.doorsMap;

public class Entities implements EntitiesDefault{
	
	String origin;
	String url;
	public Map<String, String> headers;
	public Map<String, String> args;
	
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public Map<String, String> getHeaders() {
		return headers;
	}
	public void setHeaders(Map<String, String> headers) {
		this.headers = headers;
	}
	public Map<String, String> getArgs() {
		return args;
	}
	public void setArgs(Map<String, String> args) {
		this.args = args;
	}

}
