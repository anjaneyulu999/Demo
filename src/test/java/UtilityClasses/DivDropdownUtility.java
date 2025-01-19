package UtilityClasses;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

public class DivDropdownUtility {
	public boolean isMultiSelect(WebElement dd){
		if(dd.getAttribute("class").contains("multiple")) {
		return (true);
		}else {
			return false;
		}
		
	}
	public  int getItemsCount(WebElement dd) {
		int value=dd.findElements(By.xpath("child::div[contains (@class,'menu')]/div")).size();
		return(value);
	}
	public List<String> getItemsNames(WebDriver driver, WebElement dd) {
		List<String> values=new ArrayList<String>();
		List<WebElement> items=dd.findElements(By.xpath("child::div[contains (@class,'menu')]/div"));
		for(WebElement item:items) {
			values.add((String)((RemoteWebDriver) driver).executeScript("return(arguments[0].textContent);",item));
		}
		return (values);	
	}
	public void selectItemByIndex(WebElement dd, int x) throws Exception {
		dd.click();
		Thread.sleep(5000);	
		List<WebElement> items=dd.findElements(By.xpath("child::div[contains (@class,'menu')]/div"));
		if(items.size()<x) {
			System.out.println("Wrong index");
			System.exit(0);
		}
		else {
			items.get(x-1).click();
		}
	}

}
