package stepDefinitions;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.When;
import pageObjects.LogInPage;
public class WhenTest {
	LogInPage lg;
	public static WebDriver driver = GivenTest.driver;
	
	@When("User enters username as {string}")
	public void user_enters_username_as(String email) {
		lg = new LogInPage(driver);
		lg.sendEmail(email);
	}

	@When("User enters password as {string}")
	public void user_enters_password_as(String password) {
		lg.sendPass(password);
	}

	@When("User clicks on sign in button")
	public void user_clicks_on_sign_in_button() {
		lg.clickSubmit();
	}
	
	@When("User clicks on the home button")
	public void user_clicks_on_the_home_button() {
		lg = new LogInPage(driver);
		lg.clickHome();
	}
	
	@When("User selects dress")
	public void user_selects_dress() {
		lg.clickProduct(driver);
	}
	@When("User adds to cart")
	public void user_adds_to_cart() {
		lg.clickAdd(); 
	}
	
	@When("User proceeds to checkout and fills info")
	public void user_proceeds_to_checkout() {
		lg.clickProceed();
	}
	
	@When("User confirms order")
	public void user_confirms_order() {
		lg.clickConfirm();
	}
}