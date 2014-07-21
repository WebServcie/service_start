package com.bling.service;

import javax.xml.ws.Endpoint;

public class MyService {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String address = "http://localhost:8888/ws";
		Endpoint.publish(address, new MyServiceImpl());
	}

}
