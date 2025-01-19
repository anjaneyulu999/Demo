package Mainclass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import UtilityClasses.DivTableUtility;
import UtilityClasses.WebTableUtility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DivTableTest {

	public static void main(String[] args) throws Exception {
		//open browser
				WebDriverManager.chromedriver().setup();
				WebDriver driver=new ChromeDriver();
				//launch site
				driver.get("https://www.spicejet.com");
				Thread.sleep(5000);
				//search Flights
				driver.findElement(By.xpath("//div[text()='From']/following::input[1]")).clear();
				driver.findElement(By.xpath("//div[text()='From']/following::input[1]")).sendKeys("Bengaluru(BLR)");
				Thread.sleep(6000);
				driver.findElement(By.xpath("//div[text()='To']/following::input[1]")).clear();
				driver.findElement(By.xpath("//div[text()='From']/following::input[1]")).sendKeys("Delhi");
				Thread.sleep(5000);
				driver.findElement(By.xpath("//div[text()='29']")).click();
				Thread.sleep(5000);
				driver.findElement(By.xpath("//div[@data-testid='search-submit-btn']")).click();
				Thread.sleep(5000);
				//flights table
				WebElement wt=driver.findElement(By.xpath("//div[text()='SpiceMax']/following::div[2]"));
				DivTableUtility obj=new DivTableUtility();
				int nof=obj.getChildDivCount(wt);
				System.out.println("count no of flights"+nof);
				List<WebElement> flights=obj.getChildDivs(wt);
				for(WebElement flight:flights) {
					By b=By.xpath("child::div/div[2]/div[1]//span/parent::div");
					String value=obj.getDivValue(driver, flight, b);
					String num=value.replaceAll("[^0-9]", "");
					System.out.println(num);
				}
				//close site
				//driver.close();
				
				
	}

}
