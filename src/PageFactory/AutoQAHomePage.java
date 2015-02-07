package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AutoQAHomePage {

	WebDriver driver;
	@FindBy(xpath="//div[@id='profile-page']/h2")
	WebElement homePageName;
	
	public AutoQAHomePage(WebDriver driver){
		this.driver = driver;
		//This initElements method will create  all WebElements
		PageFactory.initElements(driver, this);
	}
	
	//Get the User name from Home Page
		public String getHomePageDashboardName(){
		 return	homePageName.getText();
		}
}
