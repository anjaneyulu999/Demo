package Mainclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MailreadOrunread {

	public static void main(String[] args) {
		//open browser
				WebDriverManager.chromedriver().setup();
				WebDriver driver=new ChromeDriver();
				//launch site
				driver.get(null);

	}

}
