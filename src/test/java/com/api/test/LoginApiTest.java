package com.api.test;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.api.base.AuthService;
import com.api.models.request.LoginRequest;
import com.api.models.response.LoginResponse;

import io.restassured.response.Response;

@Listeners(com.api.listeners.TestListener.class)
public class LoginApiTest {

	@Test(description ="Verify login test")
	public void loginTest()
	{
		
//		Response response = given()
//				.baseUri("http://64.227.160.186:8080")
//				.header("ContentType" ,"application/json")
//				.body("{\r\n"
//				+ "{username: \"seemaqaer@gmail.com\", password: \"Seema@1986\"}")
//				.post("/api/auth/login");
//		System.out.println(response.asPrettyString());
		
		LoginRequest loginRequest = new LoginRequest("seemaqaer@gmail.com", "Seema@1986");
		AuthService authService = new AuthService();
		Response response =authService.login(loginRequest);
		LoginResponse loginResponse =response.as(LoginResponse.class);
		
		System.out.println(response.asPrettyString());
		System.out.println(loginResponse.getToken());
		System.out.println(loginResponse.getId());
		System.out.println(loginResponse.getUsername());
		System.out.println(loginResponse.getEmail());
		
		Assert.assertTrue(loginResponse.getToken() != null);
		Assert.assertEquals(loginResponse.getId(), 6007);
		Assert.assertEquals(loginResponse.getUsername(), "seemaqaer@gmail.com");
		Assert.assertEquals(loginResponse.getEmail(), "seemaqaer@gmail.com");
		
	}
}
