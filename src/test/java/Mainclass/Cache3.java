package Mainclass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Cache3 {

	public static void main(String[] args) throws Exception{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		//launch site
		/*try {
		driver.get("https://flipkart.com/");
		 driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@name='q']")).sendKeys("macbook");
		Thread.sleep(5000);
	   // WebElement e= driver.findElement(By.xpath("//*[@name='q']"));
	//creating list
	  
	List<WebElement> list=driver.findElements(By.xpath("//ul[@class='_1sFryS _2x2Mmc']//li"));
	 Thread.sleep(4000); 
	for(WebElement li:list) {
		System.out.println(li.getText());
	}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	
		driver.close();*/
		
		driver.get("https://flipkart.com/");
		 driver.manage().window().maximize();

        // Find the search bar and enter "MacBook"
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("MacBook");
        Thread.sleep(4000);

        // Get the list of suggestions
        List<WebElement> suggestions = driver.findElements(By.xpath("//ul[contains(@class, '_1sFryS _2x2Mmc')]/li"));
        Thread.sleep(4000);

        // Print each suggestion
        System.out.println("Search suggestions for 'MacBook':");
        for (WebElement suggestion : suggestions) {
            System.out.println(suggestion.getText());
        }
	
     
        driver.quit();

	
	}
	
	}


