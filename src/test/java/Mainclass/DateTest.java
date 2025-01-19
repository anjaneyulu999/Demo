package Mainclass;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import UtilityClasses.DatePickerUtility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DateTest {

	public static void main(String[] args)throws Exception{
		//open browser
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a day");
		int ed=Integer.parseInt(sc.nextLine());
		System.out.println("Enter the month");
		String em=sc.nextLine();
		System.out.println("Enter the year");
		int ey=sc.nextInt();
		sc.close();
		//launch site
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.globalsqa.com/demo-site/datepicker/");
		Thread.sleep(5000);
		//operate date picker
		driver.switchTo().frame(0);
		WebElement tb=driver.findElement(By.xpath("//*[@id='datepicker']"));
		 ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();",tb);
		tb.click();
		Thread.sleep(5000);
		WebElement calender=driver.findElement(By.id("ui-datepicker-div"));
		Thread.sleep(5000);
		//select date
		DatePickerUtility obj=new DatePickerUtility();
		obj.selectYear(calender, ey);
		obj.selectMonth(calender, em);
		obj.selectDay(calender, ed);
		}

}
