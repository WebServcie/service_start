package com.bling.service;

import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService
public interface IMyService {
	@WebResult(name="sumResult")
	public int sum(@WebParam(name="a")int a,@WebParam(name="b")int b);
	
	@WebResult(name="minusResult")
	public int minus(@WebParam(name="a")int a,@WebParam(name="b")int b);

	@WebResult(name="loginUser")
	public User login(@WebParam(name="username")String username,@WebParam(name="password")String password);
}
