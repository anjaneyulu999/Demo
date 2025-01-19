package Mainclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

public class practise2 {

	public static void main(String[] args) throws Exception {
		//ChromeOptions opt=new ChromeOptions();
		//opt.addArguments("--remote-allow-origins=*");
		// System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Google\\Chrome\\Application");
		//WebDriver driver=new ChromeDriver(opt);
		//driver.get("https://www.google.com");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Google\\Chrome\\Application\\131.0.6778.140.exe");
		   WebDriver driver = new ChromeDriver();
		  driver.get("http://www.google.com/"); 
		  Thread.sleep(5000);  // Let the user actually see something!
		  WebElement searchBox = driver.findElement(By.name("q"));
		  searchBox.sendKeys("ChromeDriver");
		  searchBox.submit(); 
		  Thread.sleep(5000);  // Let the user actually see something!
		  driver.quit();  
		 }	
	}




