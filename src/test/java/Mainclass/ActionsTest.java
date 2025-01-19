package Mainclass;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsTest {

	public static void main(String[] args)  {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		driver.executeScript("document.body.style.zoom='200%';");

		//move to element
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.demo-frame")));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement frome=driver.findElement(By.id("//img[@alt='The peaks of High Tatras']"));
		WebElement toe=driver.findElement(By.id("trash"));
		Actions act=new Actions(driver);
		act.clickAndHold(frome).dragAndDrop(frome,toe).perform();
		

       
	}

	}


