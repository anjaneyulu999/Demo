package Mainclass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CarsouelSliderAutomation {

	public static void main(String[] args) {
		//open browser
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		//launch site
		try {
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		WebElement e=driver.findElement(By.xpath("//div[@class='_3bzdSa']"));
		//find next and previous buttons
		//WebElement previousButton=e.findElement(By.xpath("//button[@title='Previous Slide']"));
		//WebElement nxtButton=e.findElement(By.xpath("//button[@aria-label='Next Slide']"));
		Thread.sleep(3000);
		//count slides
		List<WebElement> slides = e.findElements(By.cssSelector("//div[@class=\"zlQd20 \"]/img"));
		int count=slides.size();
		System.out.println(count);
		//iteration 
		//for(int i=0;i<count;i++) {
			
		}
		catch (Exception e){
			
		}
	}

}
