package Mainclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitTest {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//launch site
		driver.get("https://web.whatsapp.com/");
		//define wait object 
		FluentWait<ChromeDriver> wait=new FluentWait<ChromeDriver>(driver);
		wait.withTimeout(Duration.ofSeconds(20));
		wait.pollingEvery(Duration.ofMillis(1000));
		//do login 
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[@role='button'])[2]"))).click();
		//click on dropdown
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[contains(@class, 'x1c4vz4f xs83m0k')])[18]"))).click();
		//search india
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@data-icon='search']"))).sendKeys("India");
	}	

}
