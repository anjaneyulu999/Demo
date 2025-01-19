package Mainclass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.github.dockerjava.api.model.Driver;

import UtilityClasses.LinksUtility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LinksTest {

	public static void main(String[] args) throws Exception{
		//open browser
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		//launch site
		driver.get("https://www.gmail.com");
		Thread.sleep(5000);
		//find the broken links in homepage
		callmethods(driver);
		Thread.sleep(5000);
		//do login
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("anjaneyulu9c9");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		driver.findElement(By.name("password")).sendKeys("Anji@gmail999");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(5000);
		//find broken links in compose page
		callmethods(driver);
		//close browser
		driver.close();
	}
	
        public static void callmethods(WebDriver driver) {
        	LinksUtility object=new LinksUtility(driver);
		System.out.println("count of links is"+object.getLinkCount());
		//find brokenlinks
		List<String> res=object.getBrokenLinks();
		System.out.println(res); 
		for(String r:res) {
			System.out.println(r);
		}
	}

}
