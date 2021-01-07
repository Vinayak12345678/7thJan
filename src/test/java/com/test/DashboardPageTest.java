package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.pages.DashboardPage;

public class DashboardPageTest  {

WebDriver driver;
	DashboardPage page;
	
	@BeforeMethod
	public void openBrowser(){
		 System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
		    driver=new ChromeDriver();
		    driver.manage().window().maximize();
		    driver.get("file:///D:/Offline%20website/index.html");
		   page =new DashboardPage(driver);
		   
	}
	@AfterMethod
	public void closeBrowser(){
		driver.close();
}
	@Test(priority=1)
	public void verifyAllCourses(){
		Assert.assertTrue(page.verifyAllCourses());
	}
	@Test(priority=2)
	public void moreInfo(){
		Assert.assertTrue(page.moreInfo());
	}
	@Test(priority=3)
	public void mainNavigation(){
		Assert.assertTrue(page.mainNavigation());
	}
	@Test(priority=4)
	public void verifyHeading(){
		Assert.assertTrue(page.verifyHeading());
	}
	@Test(priority=5)
	public void logOut(){
		Assert.assertTrue(page.logOut());
	}
	@Test(priority=6)
	public void logOutMsg(){
		Assert.assertTrue(page.logOutMsg());
	}
	@Test(priority=7)
	public void verifySubHeading(){
		Assert.assertTrue(page.verifySubHeading());
	}
	@Test(priority=8)
	public void footer(){
		Assert.assertTrue(page.footer());
	}
	@Test(priority=9)
	public void copyRightMsg(){
		Assert.assertTrue(page.copyRightMsg());
	}
	@Test(priority=10)
	public void heading1(){
		Assert.assertTrue(page.heading1());
	}
	@Test(priority=11)
	public void message(){
		Assert.assertTrue(page.message());
	}
	@Test(priority=12)
	public void verifySubHeading2(){
		Assert.assertTrue(page.verifySubHeading2());
	}
	@Test(priority=13)
	public void verifySubHeading3(){
		Assert.assertTrue(page.verifySubHeading3());
	}
}
