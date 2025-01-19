package Mainclass;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Slider1 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
        // Launch Website
        driver.navigate().to("https://monica-official.github.io/Pseudo-Elements/sample-pseudo-element.html");
 
        // Maximize the browser
        driver.manage().window().maximize();
 
        JavascriptExecutor js = (JavascriptExecutor) driver;
        String text = js.executeScript("return window.getComputedStyle(document.querySelector('.submitButton'),'::before').getPropertyValue('border-color')")
                .toString();
 
        System.out.print(text);
        
        driver.quit();
	}

}
