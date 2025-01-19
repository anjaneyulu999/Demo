package Mainclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frames {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//launch site
		try {
		driver.get("https://demo.automationtesting.in/Frames.html");
		Thread.sleep(5000);
		driver.switchTo().frame(driver.findElement(By.id("singleframe")));
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("testing");
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		}
		catch(Exception e) {
			
		}
		
		//close site
		driver.close();
		
	}

}
