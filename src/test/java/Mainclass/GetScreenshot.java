package Mainclass;



import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetScreenshot {

	public static void main(String[] args) throws Exception{
		//launch browser
		 WebDriverManager.chromedriver().setup();
			WebDriver driver= new ChromeDriver();
			//open Uri
			driver.get("https://www.google.co.in");
			Thread.sleep(4000);
			WebElement e=driver.findElement(By.xpath("//div[@aria-label='Search by voice']"));
			//as a file 
			File dest1=new File("elementpic.png");//save in local
			File src1=e.getScreenshotAs(OutputType.FILE);
			FileHandler.copy(src1, dest1);
			Thread.sleep(3000);
			//way2 
			String src2=e.getScreenshotAs(OutputType.BASE64);
			System.out.println(src2);
			driver.close();
			
	}

}
