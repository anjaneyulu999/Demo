package Mainclass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class cacheTest2 {

	public static void main(String[] args) throws Exception{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		//launch site
		driver.get("https://www.flipkart.com/");
		//take suggestions
		driver.findElement(By.name("q")).sendKeys("macbook");
		 for (int i = 1; i < 3; i++) {
	           driver.findElement(By.name("q")).sendKeys(Keys.ARROW_DOWN);
	           Thread.sleep(5000);
			}

		 driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		 Thread.sleep(5000);
	}

}
