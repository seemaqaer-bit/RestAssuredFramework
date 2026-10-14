package com.api.test;

import org.testng.annotations.Test;

import com.api.base.AuthService;
import com.api.base.UserProfileManagementService;
import com.api.models.request.LoginRequest;
import com.api.models.response.LoginResponse;
import com.api.models.response.UserProfileResponse;

import io.restassured.response.Response;

public class GetProfileRequestTest {
	
	@Test
	public void getProfileInfoTest()
	{
		AuthService authService = new AuthService();
		Response response =authService.login(new LoginRequest("seemaqaer@gmail.com", "Seema@1986"));
		
		LoginResponse loginRespose =response.as(LoginResponse.class);
		
			System.out.println(loginRespose.getToken());
		
		
		
		
		UserProfileManagementService userProfileManagementService = new UserProfileManagementService();
		
		response =  userProfileManagementService.getProfile(loginRespose.getToken());
		UserProfileResponse userProfileResponse =response.as(UserProfileResponse.class);
		System.out.println(userProfileResponse.getUsername()); 
		
	}

}
