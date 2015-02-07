package test;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

import PageFactory.AutoQAHomePage;
import PageFactory.AutoQALogin;


public class TestAutoQALoginWithPageFactory {

	WebDriver driver;
	AutoQALogin objLogin;
	AutoQAHomePage objHomePage;
	
	@BeforeTest
	public void setup(){
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://autoqa.pp.ua/wp-login.php");
	}

	/**
	 * This test go to http://autoqa.pp.ua/wp-login.php
	 * Login to application
	 * Verify the home page using Dashboard message
	 */
	@Test(priority=0)
	public void test_Home_Page_Appear_Correct(){
		//Create Login Page object
	objLogin = new AutoQALogin(driver);
	//login to application
	objLogin.loginToAutoQA("subscriber", "subscriberpass");
	// go the next page
	objHomePage = new AutoQAHomePage(driver);
	//Verify home page
	AssertJUnit.assertTrue(objHomePage.getHomePageDashboardName().toLowerCase().contains("profile"));
	}
	
}
