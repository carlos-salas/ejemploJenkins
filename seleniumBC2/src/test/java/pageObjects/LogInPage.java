package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPage {
	public LogInPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id = "email")
	WebElement emaillbl;
	
	@FindBy(id = "passwd")
	WebElement passwdlbl;
	
	@FindBy(id = "SubmitLogin")
	WebElement submitBtn;
	
	@FindBy(className = "icon-home")
	WebElement homeBtn;

	@FindBy(className = "product_img_link")
	WebElement productBtn;
	
	@FindBy(className = "quick-view")
	WebElement viewBtn;
	
	@FindBy(xpath = "//*[@id=\"homefeatured\"]/li[1]/div/div[2]/div[2]/a[1]/span")
	WebElement addBtn;
	
	@FindBy(linkText = "Proceed to checkout")
	WebElement proceedBtn;
	
	@FindBy(css = "button.button.btn.btn-default.button-medium")
	WebElement proceedBtn2;
	
	@FindBy(css = "button.button.btn.btn-default.standard-checkout.button-medium")
	WebElement proceedBtn3;
	
	@FindBy(id = "cgv")
	WebElement agreeCheckBox;
	
	@FindBy(className = "bankwire")
	WebElement bankWireBtn;
	
	@FindBy(className = "page-heading")
	WebElement headingTitle;
	
	public String getTitle() {
		System.out.println(headingTitle.getText());
		return headingTitle.getText();
	}
	public void clickConfirm() {
		proceedBtn2.click();	
	}
	public void clickProceed() {
		proceedBtn.click();
		proceedBtn.click();
		proceedBtn2.click();
		agreeCheckBox.click();
		proceedBtn3.click();
		bankWireBtn.click();
	}
	
	public void clickProduct(WebDriver driver) {
		Actions action = new Actions(driver);
		action.moveToElement(productBtn).perform();
	}
	public void clickAdd() {
		addBtn.click();
	}
	public void sendEmail(String email) {
		emaillbl.sendKeys(email);
	}
	
	public void sendPass(String pass) {
		passwdlbl.sendKeys(pass);
	}
	
	public void clickSubmit() {
		submitBtn.click();
	}
	
	public void clickHome() {
		homeBtn.click();
	}
}


