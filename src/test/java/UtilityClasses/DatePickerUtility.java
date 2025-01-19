package UtilityClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class DatePickerUtility {
	public void selectYear(WebElement calender, int year) throws Exception {
		while(true) {
			String temp=calender.findElement(By.className("ui-datepicker-year")).getText();
			int cy=Integer.parseInt(temp);
			if(year<cy) {
				calender.findElement(By.xpath("//a[@title='Prev']")).click();
				Thread.sleep(5000);
			}
			else if(year>cy) {
				calender.findElement(By.xpath("descendant::a[@title='Next']")).click();
				Thread.sleep(3000);
			}
			else {
				break;
			}
		}
	}
	public void selectMonth(WebElement calender, String month) throws Exception {
		//step-1 come to january
		while(true) {
			String cm=calender.findElement(By.className("ui-datepicker-month")).getText();
			if(!cm.equalsIgnoreCase("January")) {
				calender.findElement(By.xpath("//a[@title='Prev']")).click();
				Thread.sleep(3000);
			}
			else {
				break;
			}
		}
		//step-2 come to target month from January
		while(true) {
			String cm=calender.findElement(By.className("ui-datepicker-month")).getText();
			if(!cm.equalsIgnoreCase(month)) {
				calender.findElement(By.xpath("descendant::a[@title='Next']")).click();
				Thread.sleep(2000);
			}
			else {
				break;
			}
					
		}
	}
	public void selectDay(WebElement calender, int day) {
		try {
			calender.findElement(By.xpath("//table[@class='ui-datepicker-calendar']/tbody//a[text()='"+day+"']")).click();
		}
		catch(Exception ex) {
			System.out.println("no given day in that month");
		}
	}
	public void selectSpecialDay(WebElement calender, String WeekDay, int index) {
		int col;
		if(WeekDay.equalsIgnoreCase("Sunday")) {
			col=1;
		}
		else if(WeekDay.equalsIgnoreCase("Monday")) {
			col=2;
		}
		else if(WeekDay.equalsIgnoreCase("Tuesday")) {
			col=3;
	}
		else if(WeekDay.equalsIgnoreCase("Wednesday")) {
			col=4;
		}
		else if(WeekDay.equalsIgnoreCase("Thursday")) {
			col=5;
		}
		else if(WeekDay.equalsIgnoreCase("Friday")) {
			col=6;
		}
		else {
			col=7;
		}
		try {
			calender.findElement(By.xpath("(//table[@class='ui-datepicker-calendar']/tbody/tr/td[\"+col+\"]/a)[\"+index+\"]")).click();
		}
		catch(Exception ex) {
			System.out.println("No"+index+"that"+WeekDay+"in that month");
		}
	}
}

