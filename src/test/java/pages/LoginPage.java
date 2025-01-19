package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy(name="password") public WebElement password;
	@FindBy(xpath="//span[text()='Next']/..") public WebElement loginNext;
	public  LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void fillPassword(String str) {
		password.sendKeys(str);
	}
	public void clickNext() throws Exception{
		loginNext.click();
		Thread.sleep(4000);
	}
}
