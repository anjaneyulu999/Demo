package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logoutpage {
	//define locators
	@FindBy(xpath="//a[starts-with(@aria-label,'Google Account')]") public WebElement profilepic;
	@FindBy(linkText="Signout") public WebElement signOut;
	//constructor
	public Logoutpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void clickProfilepic() throws Exception {
		profilepic.click();
		Thread.sleep(4000);
	}
	public void clickSignout() {
		signOut.click();
	}

}
