package com.api.test;

import org.testng.annotations.Test;

import com.api.base.AuthService;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;





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
//		
		AuthService authService = new AuthService();
		Response response =authService.login("{username: \"uday1234\", password: \"uday1234\"}");
		System.out.println(response.asPrettyString());
		
		
	}
}
