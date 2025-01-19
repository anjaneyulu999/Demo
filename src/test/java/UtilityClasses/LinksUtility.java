package UtilityClasses;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class LinksUtility {
	
	private WebDriver driver;
	@FindBys({@FindBy(xpath="//*")})
	private List<WebElement> allelements;
	private List<WebElement>links;
	//methods
	public LinksUtility(WebDriver driver) {
		//if developers used Ajax in pages source
		AjaxElementLocatorFactory adriver=new AjaxElementLocatorFactory(driver, 5);
		PageFactory.initElements(adriver, this);
		this.driver=driver;
	}
	public List<WebElement> getAllHyperLinks() {
		links=new ArrayList<WebElement>();
	try {
		for(WebElement e:allelements) {
			if(e.getAttribute("href")!=null) {
				String x=e.getAttribute("href");
				if(x.startsWith("https")||x.startsWith("http")) {
					links.add(e);
				}
			}
		}
	}
	catch (Exception ex) {
		
	}
	return (links);
}
	public int getLinkCount() {
		if(links==null) {
			getAllHyperLinks();
		}
		return(links.size());
	}
	/*public List<String> getBrokenLinks1() {
		if(links==null) {
			getAllHyperLinks();
		}
		return(links.size());
	}*/
	public List<String> getBrokenLinks() {
		if(links==null) {
			getAllHyperLinks();
		}
		List<String> result=new ArrayList<String>();
		for(WebElement link:links) {
			String address=link.getAttribute("href");
			try {
				URL url=new URL(address);
       HttpURLConnection httpConn = (HttpURLConnection) url.openConnection();
				httpConn.connect();
				int sc=httpConn.getResponseCode();
				String msg=httpConn.getResponseMessage();
				if(sc!=200) {
					result.add(address+"is broken due to"+sc+"and"+msg);
				}			
			}
			catch(Exception ex) {
				result.add(address+"is not working due to"+ex.getMessage());
			}
		}
		return result;
		
	}
}
