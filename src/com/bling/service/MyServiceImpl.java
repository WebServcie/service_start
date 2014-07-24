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

	@Override
	public User login(String username, String password) {
		// TODO Auto-generated method stub
		System.out.println(username+" is logining");
		User user = new User();
		user.setId(1);
		user.setUsername(username);
		user.setPassword(password);
		return user;
	}

}
