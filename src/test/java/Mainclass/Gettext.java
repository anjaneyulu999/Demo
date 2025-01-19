package Mainclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Gettext {

	public static void main(String[] args) throws Exception{ 
		//launch browser
		 WebDriverManager.chromedriver().setup();
			WebDriver driver= new ChromeDriver();
			//launch site operation
			driver.get("https://www.worldometers.info/world-population/");
			Thread.sleep(4000);
			//locate element 
			WebElement e=driver.findElement(By.xpath("//span[@rel=\"current_population\"]"));
			//using get text method for child elements is dynamic
			String x=e.getText();
			System.out.println(x);
			//parent child combination use java script for get text 
			String y= (String) ((RemoteWebDriver) driver).executeScript("return(arguments[0].childNodes[7].textContent);",e);
			System.out.println(y);
			//close site
			driver.close();



	}

}
