package Mainclass;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NestedShadowRoot {

	public static void main(String[] args) throws Exception{
		//define browser
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		//launch site
		driver.get("https://shop.polymer-project.org");
		Thread.sleep(4000);
		//shadow home element
		WebElement shome=driver.findElement(By.cssSelector("shop-app[page='home']"));
		SearchContext sroot=shome.getShadowRoot();
		//shadow root element
		WebElement shome2=sroot.findElement(By.cssSelector("shop-home[name='home']"));
		SearchContext sroot2=shome2.getShadowRoot();
		sroot2.findElement(By.cssSelector("a[aria-label*='Men']")).click();
		Thread.sleep(2000);
		//close browser
		driver.close();
	}

}
