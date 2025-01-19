package Mainclass;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Links {

	public static void main(String[] args)throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		//launch site 
		driver.get("https://www.gmail.com");
		Thread.sleep(10000);
		List<WebElement> list=driver.findElements(By.xpath("(//a)|(//href)|(//link)|(//base)|(img)"));
		
		List<WebElement> alist=new ArrayList<WebElement>();
		for(WebElement e:list) {
			//Thread.sleep(4000);
			if(e.getAttribute("href") != null) {
				alist.add(e);
				//Thread.sleep(4000);
				System.out.println(alist);
			}
		}
		      //close site
		       driver.close();
	}

}
