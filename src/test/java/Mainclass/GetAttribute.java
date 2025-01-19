package Mainclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetAttribute {

	public static void main(String[] args) throws Exception {
		
  //System.setProperty("webdriver.chrome.driver","C://Program Files (x86)//Google//Chrome//Application//chrome.exe");
        WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver(); 
		driver.get("https://www.gmail.com");
		Thread.sleep(4000);
		//driver.findElement(By.linkText("Gmail")).click();
		//Thread.sleep(4000);
		WebElement e=driver.findElement(By.xpath("//*[text()='Forgot email?']"));
		Thread.sleep(4000);
		String x=e.getAttribute("type");
		System.out.println(x);
		Thread.sleep(4000);
		String y=e.getCssValue("colour");
		System.out.println(y);
		//close site

		driver.close();
		        
		        
		
	}

}
