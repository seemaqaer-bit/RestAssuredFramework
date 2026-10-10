package com.api.base;

import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class BaseService {

	private static final String BASE_URL = "http://64.227.160.186:8080";
	private RequestSpecification requestSpec;
	
	public BaseService()
	{
		this.requestSpec = given()
				.baseUri(BASE_URL);
	}
	
	protected Response postRequest(String payload, String endpoint)
	{
		return requestSpec.contentType(ContentType.JSON).body(payload).put(endpoint);
	}
	
	
	
	
}
