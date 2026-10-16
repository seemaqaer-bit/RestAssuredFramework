package com.api.test;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import com.api.base.AuthService;

import io.restassured.response.Response;

public class ForgotPasswordTest {
	
	@Test(description ="Verify if Forgot Password api is working")
	public void forgotPassswordTest()
	{
		AuthService authservice = new AuthService();
		Response response =authservice.forgotPassword("seemaqaer@gmail.com");
		System.out.println(response.asPrettyString());
		
		
	}
}
