package com.clinztech.test1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindElements {

	public static void main(String[] args)throws Exception {
		//define browser
				WebDriverManager.chromedriver().setup();
				WebDriver driver= new ChromeDriver();
				//launch site
				driver.get("https://gmail.com");
				Thread.sleep(4000);
				//find all elements
				int hec=0;
				int vec=0;
				int eec=0;
				List<WebElement> list=driver.findElements(By.xpath("//*"));
				//check elements
				for(int i=0;i<=list.size()-1;i++) {
					if(list.get(i).isDisplayed()) {
						vec++;
					if(list.get(i).isEnabled()) {
						eec++;				
					}
					else {
						hec++;
					}
				}		
	}
				System.out.println("visible element count is:"+vec);
				System.out.println("enabled element count is:"+eec);
				System.out.println("hidden element count is:"+hec);
				//close site
				driver.close();
	}
}
	
