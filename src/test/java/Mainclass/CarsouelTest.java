package Mainclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.Carsouelslider;

public class CarsouelTest {

	public static void main(String[] args) {
		//open browser
		WebDriver driver=new ChromeDriver();
		try {
			driver.get("https://www.flipkart.com/");
			  driver.manage().window().maximize();
			  //create object
			  Carsouelslider cs=new Carsouelslider();
			  int count=cs.getNumberOfSlides();
			  System.out.println("slides is"+count);
			  
			  //iterate
			  for(int i=0;i<count;i++) {
				  System.out.println("navigating to slide"+(i+1));
				  cs.clickNext();
			  }
		}
		catch (Exception e){
			
		}
		finally {
            // Close the browser
            driver.quit();

}
}
}
