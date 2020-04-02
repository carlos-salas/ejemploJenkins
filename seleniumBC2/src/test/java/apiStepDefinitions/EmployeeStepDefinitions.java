package apiStepDefinitions;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;

public class EmployeeStepDefinitions {
	Response resp;
	GetEmployees employees;
	int id;
	
	@Given("User set valid auth key")
	public void user_set_valid_auth_key() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Correct Auth");
		}

	@Given("User sends an id of {int}")
	public void user_sends_id(int int1) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Correct Auth");
		}
	
	@When("User send a Get request on {string}")
	public void user_send_a_Get_request_on(String endPoint) {
	    // Write code here that turns the phrase above into concrete actions
		employees = new GetEmployees(endPoint);
	}

	@Then("User should get status code {int}")
	public void user_should_get_status_code(Integer statusCode) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Response: " + employees.resp.asString() );
		Assert.assertTrue(employees.resp.getStatusCode() == statusCode); 
}


}
