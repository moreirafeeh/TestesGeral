package com.lipe.requests.utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;

import org.apache.http.HttpEntity;
import org.apache.http.HttpHost;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.Credentials;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.client.HttpClient;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.BasicCredentialsProvider;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.conn.DefaultProxyRoutePlanner;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

public class HttpRequests {
	
	String proxy;
	Integer port;
	String user;
	String password;
	
	

	public HttpRequests(String proxy, Integer port, String user, String password) {
		super();
		this.proxy = proxy;
		this.port = port;
		this.user = user;
		this.password = password;
	}

	public String shouldGetRequestsResponseBody(String url, Integer proxyEnable, String requestheaders, String requestBody){
		String StringContent = null;
		HttpClient httpclient = null;
		
		
		HttpGet httpget = new HttpGet("url");
		httpget.setHeader(password, StringContent);
		
		if(proxyEnable == 1) {
			HttpHost proxyName = new HttpHost(proxy, port, "http");
			DefaultProxyRoutePlanner routePlanner = new DefaultProxyRoutePlanner(proxyName);
			
			CredentialsProvider credentialsProvider = new BasicCredentialsProvider();
			credentialsProvider.setCredentials(new AuthScope(proxyName), new UsernamePasswordCredentials(user, password));
			
			//RequestConfig config = RequestConfig.custom().setProxy( proxyName ).build();          
			//httpget.setConfig(config);
			
			httpclient = HttpClients.custom()
					.setRoutePlanner(routePlanner)
					.setDefaultCredentialsProvider(credentialsProvider)
					.build();
		}
		
		else {
			httpclient = HttpClients.createDefault();
		}
		
		
		try {
		    HttpResponse response = httpclient.execute(httpget);
		    HttpEntity entity = response.getEntity();
		    System.out.println("Tamanho: "+ entity.getContentLength() );
		    System.out.println("Content-type: "+entity.getContentType().getValue() );
		                  
		    InputStream in = entity.getContent();
		    
		    Scanner scan = new Scanner( in );
		    while( scan.hasNext() ){
		       //System.out.println(scan.nextLine());
		       StringContent = StringContent + scan.nextLine();
		       System.out.println(StringContent);
		    } 
		    
		  
		} catch (ClientProtocolException e) {
		    e.printStackTrace();
		} catch (IOException e) {
		    e.printStackTrace();
		} finally {
		    httpget.releaseConnection();;
		}
		
		return StringContent;
		
	}
	
	public void shouldpostRequestResponseBody(String url, Integer proxyEnable, String headers, String Bodies) {
		
		HttpClient httpclient = null;
		HttpPost httppost = new HttpPost(url);
		httppost.setHeader(null, null);
		
		if(proxyEnable == 1) {
			HttpHost proxyName = new HttpHost(proxy, port, "http");
			DefaultProxyRoutePlanner routePlanner = new DefaultProxyRoutePlanner(proxyName);
			
			CredentialsProvider credentialsProvider = new BasicCredentialsProvider();
			credentialsProvider.setCredentials(new AuthScope(proxyName), new UsernamePasswordCredentials(user, password));
			
			//RequestConfig config = RequestConfig.custom().setProxy( proxyName ).build();          
			//httpget.setConfig(config);
			
			httpclient = HttpClients.custom()
					.setRoutePlanner(routePlanner)
					.setDefaultCredentialsProvider(credentialsProvider)
					.build();
		}
		
		else {
			httpclient = HttpClients.createDefault();
		}
		
		
		try { 
		    ArrayList<NameValuePair> valores = new ArrayList<NameValuePair>();
		    
		    valores.add(new BasicNameValuePair("nome", "rodrigo"));
		              
		    httppost.setEntity( new UrlEncodedFormEntity( valores ) );
		    HttpResponse response = httpclient.execute( httppost );
		               
		    HttpEntity entity = response.getEntity();
		    String content = EntityUtils.toString(entity);
		    System.out.println( content );
		              
		} catch (ClientProtocolException e) {
		    e.printStackTrace();
		} catch (IOException e) {
		    e.printStackTrace();
		} finally {
		    httppost.releaseConnection();;
		}
	}
	
}
