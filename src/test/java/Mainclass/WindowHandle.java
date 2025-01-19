package Mainclass;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandle {

	public static void main(String[] args)throws Exception{ 
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		//launch
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().window().maximize();
		//parent window
		String parentWindow=driver.getWindowHandle();
		System.out.println(parentWindow);
		//child windows
		driver.findElement(By.xpath("(//*[text()='PNR STATUS'])[1]")).click();
		Thread.sleep(5000);
		System.out.println(driver.getTitle());
		Thread.sleep(4000);
		Set<String> allWindows=driver.getWindowHandles();
		//loop
		for(String window:allWindows) {
			System.out.println(window);
			if(window.equals(parentWindow)) {
				String title=driver.getTitle();
				
			}
		}
		
		driver.quit();        

	}

}
