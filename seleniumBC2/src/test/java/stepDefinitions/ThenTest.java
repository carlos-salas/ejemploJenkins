package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import io.cucumber.java.en.Then;
import pageObjects.LogInPage;

public class ThenTest {
	LogInPage lg;
	WebDriver driver = WhenTest.driver;
	@Then("User should be logged correclty")
	public void user_should_be_logged_correclty() {
		// Write code here that turns the phrase above into concrete actions
		Assert.assertTrue(driver.getCurrentUrl().equals("http://automationpractice.com/index.php?controller=my-account"));
		
	}
	@Then("User should recieve the followong error message: {string}")
	public void user_should_recieve_the_followong_error_message(String message) {
	    // Write code here that turns the phrase above into concrete actions
		WebElement lnlErrorMessage = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div[1]/ol/li"));
		Assert.assertTrue(lnlErrorMessage.getText().equals(message));
		driver.quit();
	}
	
	@Then("User should see order confirmation")
	public void user_should_see_confirmation() {
		lg = new LogInPage(driver);
		Assert.assertTrue(lg.getTitle().equals("ORDER CONFIRMATION"));
	}
}

