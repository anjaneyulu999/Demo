package Mainclass;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class practise3 {

	public static void main(String[] args) throws Exception {
		
		
       WebDriverManager.chromedriver().setup();
       WebDriver driver=new ChromeDriver();
       driver.get("https://www.gmail.com");
       Thread.sleep(5000);
       driver.findElement(By.name("identifier")).sendKeys("anjaneyulu9c9@gmail.com");
       driver.findElement(By.xpath("//span[text()='Next']/parent::button")).click();
       Thread.sleep(5000);
      
      // driver.close();
       
	
	}

}
