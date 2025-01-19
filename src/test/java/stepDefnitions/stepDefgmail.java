package stepDefnitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.ComposePage;
import pages.Homepage;
import pages.LoginPage;
import pages.Logoutpage;

public class stepDefgmail {
	//declare objects
	public WebDriver driver;
	public Homepage obj1;
	public LoginPage obj2;
	public ComposePage obj3;
	public Logoutpage obj4;

	//open browser 
	@Given("open {string} browser")
	public void openBrowserchrome(String x) {
		if(x.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			obj1=new Homepage(driver);
			obj2=new LoginPage(driver);
			obj3=new ComposePage(driver);
			obj4=new Logoutpage(driver);
		}
	}
	@Given("launch {string} site")
		public void launchSite(String url) throws Exception {
			driver.get(url);
			Thread.sleep(5000);
		}
	@When("do login using {string} and {string} credentials") 
	public void login(String uid, String pwd) throws Exception{
		obj1.fillUsename(uid);
		obj1.clickNext();
		obj2.fillPassword(pwd);
		obj2.clickNext();		
	}
	@Then("compose is displayed")
	public void compose() {
		if(obj3.iscomposeDisplayed()) {
			System.out.println("compose is displayed");
		}
		else {
			System.out.println("compose is not displayed");
		}
	}
	@When("click on compose")
	public void clickCompose() throws Exception {
		obj3.compose();
	}
	@When("fill fields with{string}, {string}, {string}")
	public void fillfields(String to, String subject, String body) {
		obj3.sendTo(to);
		obj3.fillSubject(subject);
		obj3.fillBody(body);
	}
	@When("do logout")
	public void logout() throws Exception {
		obj4.clickProfilepic();
		obj4.clickSignout();
	}
	@Then("close site")
	public void close() {
		driver.close();
	}
}
