package Mainclass;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActiveElement {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//launch site
		driver.get("https://www.facebook.com");
		driver.switchTo().activeElement().sendKeys("Anjaneyulu",Keys.TAB);
		driver.switchTo().activeElement().sendKeys("Anji",Keys.TAB,Keys.TAB);
		driver.switchTo().activeElement().click();

	}

}
