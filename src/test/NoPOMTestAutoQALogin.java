package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class NoPOMTestAutoQALogin {

	/**
	 * This test case will login in http://autoqa.pp.ua/wp-login.php
	 * Login to application
	 * Verify the home page using Dashboard message
	 */
	@Test(priority=0)
	public void test_Home_Page_Appear_Correct(){
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://autoqa.pp.ua/wp-login.php");
		//Find user name and fill user name
	    driver.findElement(By.id("user_login")).sendKeys("subscriber");
	    //find password and fill it
	    driver.findElement(By.id("user_pass")).sendKeys("subscriberpass");
	    //click login button
	    driver.findElement(By.id("wp-submit")).click(); 
	    String homeText = driver.findElement(By.xpath("//div[@id='profile-page']/h2")).getText();
	    //verify login success
		Assert.assertTrue(homeText.toLowerCase().contains("profile"));
	}
}
