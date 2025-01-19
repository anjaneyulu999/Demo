package Mainclass;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ShadowRoot {

	public static void main(String[] args)throws Exception {
		//define browser
				WebDriverManager.chromedriver().setup();
				WebDriver driver= new ChromeDriver();
				//launch site
				driver.get("https://books-pwakit.appspot.com");
				Thread.sleep(4000);
				//shadow element
			WebElement shome=driver.findElement(By.cssSelector("book-app[apptitle='BOOKS']"));
			SearchContext sroot=shome.getShadowRoot();
			sroot.findElement(By.cssSelector("input[id='input']")).sendKeys("abdulkalam");
			driver.close();
			

	}

}
