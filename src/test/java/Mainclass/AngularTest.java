package Mainclass;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AngularTest {

	public static void main(String[] args) {
			WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			//launch site
			driver.get("https://www.google.com");
			driver.switchTo().newWindow(WindowType.TAB);
			//collect window handle values
			Set<String> s=driver.getWindowHandles();
			List<String> a=new ArrayList<String>(s);
			
			driver.switchTo().window(a.get(1));
			//launch gmail
			driver.get("https://www.gmail.com");
			driver.quit();
			
			
		

	}

}
