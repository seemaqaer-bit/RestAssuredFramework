package com.api.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.api.base.AuthService;
import com.api.models.request.SignUpRequest;

import io.restassured.response.Response;

public class AccountCreationTest {

	@Test(description ="Sign up User for login")
	public void createAccountTest() {
		
		SignUpRequest signUpRequest =	new SignUpRequest.Builder()
		.username("Test1234")
		.password("Test@1234")
		.email("Test4@gmail.dd")
		.firstName("Test4")
		.lastName("API")
		.mobileNumber("9800000003").build();
		
		AuthService authService = new AuthService();
		Response response =authService.signup(signUpRequest);
		System.out.println(response.asPrettyString());
		Assert.assertEquals(response.statusCode(),200);
	}
}
