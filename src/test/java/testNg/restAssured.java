package testNg;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class restAssured {
	@Test
	private void tc01() {

		//to create the object of the request 
		RestAssured.baseURI="https://reqres.in/";
		
		// to create the request object
		RequestSpecification requestSpecification = RestAssured.given();
		
		// to specify the query parameter
		requestSpecification.queryParam("page", "2");
		
		//to create the response object by mention the response 
		Response request = requestSpecification.request(Method.GET,"/api/users");
		
		//to print the response body
		System.out.println(request.getBody().asPrettyString());
		
		
	}
	
}
