package UtilityClasses;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

public class WebTableUtility {
	public int getRowsCount(WebElement wt){
		int value=wt.findElements(By.xpath("//child::tbody/tr")).size();
		return value;	
	}
	public int getColumnCountInrow(WebElement wt, int rownum) {
		int value=wt.findElements(By.xpath("//child::tbody/tr["+rownum+"]/td")).size();
		return value;
	}
	public String getCellValue(WebDriver driver, WebElement wt, int rownum, int columnnum) {
		WebElement e=wt.findElement(By.xpath("//child::tbody/tr["+rownum+"]/td["+columnnum+"]"));
		String value=(String) ((RemoteWebDriver) driver).executeScript("return(arguments[0].textContent);", e);
		return value;
	}
	public List<WebElement> getCellChilds(WebElement wt, int rownum, int columnnum, String tagname){
		List<WebElement> elements=wt.findElements(By.xpath("//child::tbody/tr["+rownum+"]/td["+columnnum+"]/"+tagname+""));
		return(elements);
	}
	

}
