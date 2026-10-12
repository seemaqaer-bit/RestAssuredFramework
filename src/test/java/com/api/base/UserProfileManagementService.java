package com.api.base;

import io.restassured.response.Response;

public class UserProfileManagementService extends BaseService {
	
	private static final String Base_PATH ="/api/users/";
	
	public Response getProfile(String token)
	{
		setAuthToken(token);
		return getRequest(Base_PATH+"/profile");
	}

	



}
