package apiStepDefinitions;

import apiPageObjects.SetUpClass;

public class GetEmployees extends SetUpClass{
	public GetEmployees(String endPoint) {
		super();
		runApi(endPoint);
		
	}
	public GetEmployees(String endPoint, int id) {
		super();
		runApi(endPoint, id);
		
	}

	private void runApi(String endPoint) {
		resp = request
				.given()
				.when()
				.get(endPoint);
	}
	private void runApi(String endPoint, int id) {
		resp = request
				.given()
				.pathParam("id", id)
				.when()
				.get(endPoint);		
	}
}
