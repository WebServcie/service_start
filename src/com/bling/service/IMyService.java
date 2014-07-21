package com.bling.service;

import javax.jws.WebService;

@WebService
public interface IMyService {
	public int sum(int a,int b);
	
	public int minus(int a,int b);
}
