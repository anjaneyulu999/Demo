package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ComposePage {
	//define locators
	@FindBy(xpath="//div[text()='Compose']") public WebElement compose;
	@FindBy(name="to") public WebElement to;
	@FindBy(name="subjectbox") public WebElement subject;
	@FindBy(xpath="//div[@aria-label='Message Body']") public WebElement body;
	@FindBy(xpath="//div[text()='send']") public WebElement send;
	//constructor method
	public ComposePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public boolean iscomposeDisplayed() {
		if(compose.isDisplayed()){
		return true;
		}
		else {
			return false;
		}		
	}
	public void compose() throws Exception{
		compose.click();
		Thread.sleep(4000);
	}
	public void sendTo(String str) {
		to.sendKeys(str);
	}
	public void fillSubject(String str) {
		subject.sendKeys(str);
	}
	public void fillBody(String str) {
		body.sendKeys(str);
	}
	public void sendmethod() throws Exception {
		send.click();
		Thread.sleep(3000);
	}
}
