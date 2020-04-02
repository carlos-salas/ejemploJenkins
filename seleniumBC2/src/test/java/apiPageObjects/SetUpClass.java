package apiPageObjects;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class SetUpClass {
	public Response resp;
	public RequestSpecification request;
	
	public SetUpClass() {
		RestAssured.baseURI = "https://reqres.in/api/";
		request = RestAssured.given();
	}

}
