package Mainclass;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CacheTest {
   
   
	public static void main(String[] args) throws Exception{
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		//launch site
		try {
		driver.get("https://www.google.com/");
		
		driver.findElement(By.xpath("//*[@name='q']")).sendKeys("macbook");
		Thread.sleep(5000);
	   // WebElement e= driver.findElement(By.xpath("//*[@name='q']"));
	//creating list
	  
	List<WebElement> list=driver.findElements(By.xpath("//ul[@role='listbox']//li"));
	 Thread.sleep(2000); 
	for(WebElement li:list) {
		System.out.println(li.getText());
	}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	
		driver.close();
	}
		 

}
