package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Carsouelslider {
	private WebDriver driver;
	//locators
	private By slides=By.xpath("//div[contains(@class, '_3bzdSa')]");
	private By nextButton=By.xpath("//button[@aria-label='Next Slide']");
	
	//flipkart site
	public void FlipkartPage(WebDriver driver) {
        this.driver = driver;
	}
	public int getNumberOfSlides() {
		List<WebElement> num=driver.findElements(slides);
		return num.size();
	}
	public void clickNext() {
        driver.findElement(nextButton).click();
    }

}
