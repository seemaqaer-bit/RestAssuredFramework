package com.api.base;

import static io.restassured.RestAssured.*;

import com.api.models.request.LoginRequest;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class BaseService {

	private static final String BASE_URL = "https://swift.techwithjatin.com/";
	
	private RequestSpecification requestSpec;
	
	public BaseService()
	{
		this.requestSpec = given().baseUri(BASE_URL);
	}
	

	protected Response postRequest(Object payload, String endpoint)
	{
		return requestSpec.contentType(ContentType.JSON).body(payload).post(endpoint);
	}
	
	
	
	
	
	
}
