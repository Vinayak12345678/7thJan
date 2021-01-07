package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.pages.AddUserPage;
import com.pages.DashboardPage;

public class AddUserPageTest {

	WebDriver driver;
	AddUserPage Ap;
	
	@BeforeMethod
	public void openBrowser(){
		 System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
		    driver=new ChromeDriver();
		    driver.manage().window().maximize();
		    driver.get("file:///D:/Offline%20website/index.html");
		   Ap =new AddUserPage(driver);
		   
	}
	@AfterMethod
	public void closeBrowser(){
		driver.close();
}
	@Test(priority=1)
	public void verifyHeading(){
		Assert.assertTrue(Ap.Heading());
	}
	
	@Test(priority=2)
	public void verifySubHeading(){
		Assert.assertTrue(Ap.subHeading());
	}
	
	@Test(priority=3)
	public void verifyUserTable(){
		Assert.assertTrue(Ap.userTable());
	}
	
	@Test(priority=4)
	public void verifyRadioButtonMale(){
		Assert.assertTrue(Ap.radioButtonMale());
	}
	
	@Test(priority=5)
	public void verifyRadioButtonfemale(){
		Assert.assertTrue(Ap.radioButtonfemale());
	}
	
	@Test(priority=6)
	public void verifySelectState(){
		Assert.assertTrue(Ap.selectState());
	}
	
	@Test(priority=7)
	public void verifySubmitButton(){
		Assert.assertTrue(Ap.submitButton());
	}
	
	@Test(priority=8)
	public void verifyAddUserAlert(){
		Assert.assertTrue(Ap.addUserAlert());
	}
	
	
	
}