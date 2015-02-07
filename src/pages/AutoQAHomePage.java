package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AutoQAHomePage {

	WebDriver driver;
	By homePageName = By.xpath("//div[@id='profile-page']/h2");
	
	public AutoQAHomePage(WebDriver driver){
		this.driver = driver;
	}
	
	//Get the Page name from Home Page
		public String getHomePageDashboardName(){
		 return	driver.findElement(homePageName).getText();
		}
}
