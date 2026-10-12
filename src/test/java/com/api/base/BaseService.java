package com.api.base;

import static io.restassured.RestAssured.*;
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
	
	protected void setAuthToken(String token)
	{
		requestSpecification.header("Authorization", "Barear " + token);
	}
	
	protected Response getRequest(String endpoint)
	{
		return requestSpec.get(endpoint);
	}
	
	
	
	
	
	
}
