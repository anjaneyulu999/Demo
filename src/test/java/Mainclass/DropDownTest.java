package Mainclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownTest {
	      
	static WebDriver driver;

	public static void main(String[] args) throws Exception{
		//open browser
				WebDriverManager.chromedriver().setup();
				WebDriver driver=new ChromeDriver();
				//launch site
				driver.get("https://www.orangehrm.com/en/30-day-free-trial");
				//select dropdown
				By locator=By.id("Form_getForm_Country");
				//Select select=new Select(driver.findElement(item));
			//	select.selectByVisibleText("India");
				//getByValue(item, "Albania");
				//Thread.sleep(5000);
				//getByIndex(locator, 4);
				selectdropDown(locator, "index", "5");
        } 
	      
		public static void selectdropDown(By locator, String value, String text ) {
	    	  Select select=new Select(getElement(locator));
	    	  switch(text) {
	    	  case "index":
	    		  select.selectByIndex(Integer.parseInt(value));
	    		  break;
	    	  case "visibleText":
	    		  select.selectByValue(value);
	    		  break;
	    	  case "value":
	    		  select.selectByValue(value);
	    		  break;
	    		default:
	    			System.out.println("choose correct selector");
	    		  break;
	    	  }
	      }
	     public static WebElement getElement(By locator) {
	    	 return driver.findElement(locator);
	     }
	     public static void getByVisisbletext(By locator, String text) {
	    	 Select select=new Select(getElement(locator));
	    	 select.selectByVisibleText(text);	 
	     }
	     public static void getByValue(By locator, String value) {
	    	 Select select=new Select(getElement(locator));
	    	 select.selectByValue(value);
	     }
	     public static void getByIndex(By locator, int index) {
	    	 Select select=new Select(getElement(locator));
	    	 select.selectByIndex(index);
	     }
        }


