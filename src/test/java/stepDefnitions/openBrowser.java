package stepDefnitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class openBrowser {
	WebDriver driver;
	@Given("open {string} browser")
	public void openBrowserchrome(String x) {
		if(x.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver(); 
		}
		else if(x.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}	
	}
	@When("launch {string} site")
	public void launchSite(String x) {
		driver.get(x);
	}
	@Then ("the title should be {string}")
	public void title(String expected) {
		String actual=driver.getTitle();
		if(actual.contains(expected)) {
			System.out.println("title test is passed");
		}
		else {
			System.out.println("title test failed");
			
		}	
	}

}
