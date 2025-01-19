package Mainclass;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class practise1 {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
	 	RemoteWebDriver driver=new ChromeDriver();
	 	Thread.sleep(4000);
	 	driver.get("http://www.google.co.in");
	 	Thread.sleep(4000);
	 	//click on gmail link
	 	driver.findElement(By.linkText("Gmail")).click();
	 	Thread.sleep(4000);
	 	//click on for work link
	 	driver.findElement(By.linkText("For Work")).click();
	 	Thread.sleep(4000);
	 	//click on admin console link 
	 	driver.findElement(By.linkText("Admin console")).click();
	 	Thread.sleep(4000);
	 	Set<String> set=driver.getWindowHandles();
	 	List<String> list=new ArrayList<String>(set);
	 	driver.switchTo().window(list.get(1));
	 	//close All tabs
	 		driver.close();
	 	}
}
