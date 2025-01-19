package UtilityClasses;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

public class DivTableUtility {
	public int getChildDivCount(WebElement wt) {
		int value=wt.findElements(By.xpath("child::div")).size();
		return value;
	}
	public List<WebElement> getChildDivs(WebElement wt){
		List<WebElement> rows=wt.findElements(By.xpath("child::div"));
		return rows;
	} 
	public String getDivValue(WebDriver driver, WebElement area, By elerloc) {
		WebElement e=area.findElement(elerloc);
		String value=(String) ((RemoteWebDriver) driver).executeScript("return(arguments[0].textContent);",e);
		return(value);
	}
	

}
