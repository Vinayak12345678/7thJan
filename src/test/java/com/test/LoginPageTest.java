package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.pages.LoginPage;

public class LoginPageTest {

	WebDriver driver;
	LoginPage lp;
	@BeforeMethod
	public void openBrowser(){
	    System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("file:///D:/Offline%20website/index.html");
	    lp=new LoginPage(driver);
}

	@AfterMethod
	public void closeBrowser() {
	    driver.close();
	}
	@Test(priority=1)
	public void verifyCorrectData(){
		Assert.assertTrue(lp.login());
		
	}
	@Test(priority=2)
	public void verifyTitle(){
		Assert.assertTrue(lp.verifyTitle());
	}
	
	@Test(priority=3)
	public void verifyLogo(){
		Assert.assertTrue(lp.verifyLogo());
	}
	@Test(priority=4)
	public void signMessage(){
		Assert.assertTrue(lp.signMessage());
	}
	@Test(priority=5)
	public void blankEmail(){
		Assert.assertTrue(lp.blankEmail());
	}
	@Test(priority=6)
	public void blankPassword(){
		Assert.assertTrue(lp.blankPassword());
	}
	@Test(priority=7)
	public void newRegistration(){
		Assert.assertTrue(lp.newRegistration());
	}
	@Test(priority=8)
	public void registrationPage(){
		Assert.assertTrue(lp.registrationPage());
	}
	@Test(priority=9)
	public void wrongEmail(){
		Assert.assertTrue(lp.wrongEmail());
	}
	@Test(priority=10)
	public void wrongPassword(){
		Assert.assertTrue(lp.wrongPassword());
	}
	
}
