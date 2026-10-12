package com.api.base;

import java.util.HashMap;

import com.api.models.request.LoginRequest;
import com.api.models.request.SignUpRequest;

import io.restassured.response.Response;

public class AuthService extends BaseService {
	
	private static final String Base_Path = "/api/auth/";

	public Response login(LoginRequest payload)
	{
		return postRequest(payload, Base_Path+"login");
		
	}
	
	public Response signup(SignUpRequest payload)
	{
		return postRequest(payload, Base_Path+"signup");
		
	}
	
	public Response forgotPassword(String emailAddress)
	{
		HashMap<String , String> payload = new HashMap<>();
		payload.put("email" ,emailAddress);
		return postRequest(payload, Base_Path+"forgot-password");
		
	}
}
