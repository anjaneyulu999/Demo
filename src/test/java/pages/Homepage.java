package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Homepage  {
	//define locators
	@FindBy(how=How.NAME, using="identifier") public WebElement userName;
	@FindBy(xpath="//span[text()='Next']/..") public WebElement homeNext;
	//constructor method
	public  Homepage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	//operational and observation methods
	public void fillUsename(String str) {
		userName.sendKeys(str);
	}
	public void clickNext() throws Exception {
		homeNext.click();
		Thread.sleep(5000);
	}
	

}
