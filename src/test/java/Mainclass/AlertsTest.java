package Mainclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertsTest {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		try {
		driver.get("https://www.cleartrip.com/");
	
		WebElement e=driver.findElement(By.xpath("(//*[name()='svg'])[32]"));
		e.click();
		}catch(Exception e){
			
		}
		driver.close();
		
		
	}
	
}
