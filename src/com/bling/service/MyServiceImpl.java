package com.bling.service;

import javax.jws.WebService;


@WebService(endpointInterface="com.bling.service.IMyService")
public class MyServiceImpl implements IMyService {

	@Override
	public int sum(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println(a+"+"+b+" = "+(a+b));
		return a+b;
	}

	@Override
	public int minus(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println(a+"+"+b+" = "+(a-b));
		return a-b;
	}

}
