package stepDefinitions;


import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import pageObjects.LogInPage;
public class GivenTest {
	public static WebDriver driver = SetUpClass.driver;
	
	LogInPage lg;
	@Given("User is on login page")
	public void user_is_on_login_page() {
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		driver.manage().window().maximize();
	}
	
	@Given("User is logged in with username {string} and password {string}")
	public void user_is_logged_in_with_username_and_password_(String email, String password){
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		driver.manage().window().maximize();
		lg = new LogInPage(driver);
		lg.sendEmail(email);
		lg.sendPass(password);
		lg.clickSubmit();
	}
}
