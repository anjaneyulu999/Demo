package UtilityClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class ActionsUtility {
	public Actions act;
	public FluentWait<WebDriver> wait;
	//constructor
	public ActionsUtility(WebDriver driver, FluentWait<WebDriver> wait) {
		this.wait=wait;
		act=new Actions(driver);
	}
	//methods
	public void clickOnElement(WebElement e) {
		wait.until(ExpectedConditions.elementToBeClickable(e));
		act.click(e).perform();
	}
	public void fillElement(WebElement e, String data) {
		wait.until(ExpectedConditions.elementToBeClickable(e));
		act.sendKeys(e, data).perform();
	}
	public void doubleClickOnElement(WebElement e) {
		wait.until(ExpectedConditions.elementToBeClickable(e));
		act.doubleClick(e).perform();
	}
	

}
