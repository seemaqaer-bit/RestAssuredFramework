package com.api.base;

import io.restassured.response.Response;

public class AuthService extends BaseService {
	
	private static final String Base_Path ="/api/auth/";

	public Response login(String payload)
	{
		return postRequest(payload, Base_Path+"login");
		
	}
}
