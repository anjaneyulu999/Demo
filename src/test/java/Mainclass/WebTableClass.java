package Mainclass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import UtilityClasses.WebTableUtility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTableClass {

	public static void main(String[] args) throws Exception {
		//open browser
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		//launch site
		driver.get("https://www.espncricinfo.com/series/south-africa-vs-pakistan-2024-25-1432205/south-africa-vs-pakistan-3rd-odi-1432216/full-scorecard");
		Thread.sleep(5000);
		//work with a table
		WebElement wt=driver.findElement(By.xpath("//span[text()='Pakistan']/following::table[1]"));
		//create an object
		WebTableUtility obj=new WebTableUtility();
		System.out.println(obj.getRowsCount(wt));
		System.out.println(obj.getColumnCountInrow(wt, 6));
		//skip rows, which are borders
		for(int i=1;i<11;i=i+2) {
			List<WebElement> batter=obj.getCellChilds(wt, i, 1, "a");
			String value=(String) ((RemoteWebDriver) driver).executeScript("return(arguments[0].textContent);", batter.get(0));
			String desc;
		try {
			List<WebElement> out=obj.getCellChilds(wt, i, 2, "span");
			desc=(String) ((RemoteWebDriver) driver).executeScript("return(arguments[0].textContent);", out.get(0));
		}
		catch(Exception ex) {
			desc=obj.getCellValue(driver, wt, i, 2);
		}
		String x=obj.getCellValue(driver, wt, i, 3);
		String y=obj.getCellValue(driver, wt, i, 4);
		String z=obj.getCellValue(driver, wt, i, 5);
		String u=obj.getCellValue(driver, wt, i, 6);
		String v=obj.getCellValue(driver, wt, i, 7);
		System.out.println("name" +"--"+desc+"---"+x+"--"+y+"--"+z+"--"+u+"--"+v);
		}
		//close site
		driver.close();
	}
}
