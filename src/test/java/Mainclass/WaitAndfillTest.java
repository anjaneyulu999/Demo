package Mainclass;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.bidi.log.LogEntry;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.FluentWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitAndfillTest {
	

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		 //wait condition
		 FluentWait<ChromeDriver> wait=new FluentWait<ChromeDriver>((ChromeDriver) driver);
		 wait.withTimeout(Duration.ofSeconds(20));
		 wait.pollingEvery(Duration.ofMillis(1000));
		 //locate element
	    driver.get("https://www.browserstack.com");
	     List<org.openqa.selenium.logging.LogEntry> list=driver.manage().logs().get(LogType.BROWSER).getAll();
	     for(org.openqa.selenium.logging.LogEntry log:list) {
	    	 System.out.println(log.getMessage()+""+log.getTimestamp());
	    	 driver.close();
	    	 
	     }
	}

}