package Mainclass;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CookieTest {

	public static void main(String[] args) throws Exception{
		//open browser
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//launch site
		driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
		 // Add two cookies in key-value pairs
	      driver.manage().addCookie(new Cookie("C1", "VAL1"));
	      driver.manage().addCookie(new Cookie("C2", "VAL2"));

	      // get every cookie details
	      Set<Cookie> c = driver.manage().getCookies();
	      System.out.println("Cookie details are: " + c);
	      driver.manage().deleteAllCookies();
	      System.out.println("Cookie details are: " + c);

	      // Closing browser
	      driver.quit();
	}

}
