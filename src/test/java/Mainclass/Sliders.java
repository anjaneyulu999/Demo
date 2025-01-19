package Mainclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sliders {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://jqueryui.com/slider");
		try {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		
		WebElement e=driver.findElement(By.cssSelector(".ui-slider-handle"));
		Actions act=new Actions(driver);
		act.moveToElement(e).clickAndHold(e).moveByOffset(50, 0).perform();
		}catch(Exception ex) {
		driver.close();
		}
		

	}

}
