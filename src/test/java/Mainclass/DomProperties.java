package Mainclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DomProperties {

	public static void main(String[] args) throws Exception {
		//define browser
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		//open Uri
		driver.get("https://www.gmail.com");
		Thread.sleep(4000);
		WebElement element=driver.findElement(By.name("identifier"));
		//get accessible name
		String x=element.getAccessibleName();
		Thread.sleep(3000);
		System.out.println(x);
		//get ariarole
		String y=element.getAriaRole();
		System.out.println(y);
		Thread.sleep(3000);
		//get dom attribute and dom property
		System.out.println(element.getDomAttribute("maxLength"));
		Thread.sleep(3000);
		System.out.println(element.getDomProperty("clientHeight"));
		//close browser
		driver.close();

		
	

		

	}

}
