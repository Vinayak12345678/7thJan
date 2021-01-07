package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.pages.DashboardPage;
import com.pages.UsefulLinksPage;

public class UsefulLinksPageTest {

	WebDriver driver;
	UsefulLinksPage Up;
	
	@BeforeMethod
	public void openBrowser(){
		 System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
		    driver=new ChromeDriver();
		    driver.manage().window().maximize();
		    driver.get("file:///D:/Offline%20website/index.html");
		    Up =new UsefulLinksPage(driver);
		   
	}
	@AfterMethod
	public void closeBrowser(){
		driver.close();
}
	@Test(priority=1)
	public void verifymainHeading(){
		Assert.assertTrue(Up.mainHeading());
	}
	
	@Test(priority=2)
	public void verifysubHeading(){
		Assert.assertTrue(Up.subHeading());
	}
	
	@Test(priority=3)
	public void verifyinterviewQues(){
		Assert.assertTrue(Up.interviewQues());
	}
	
	@Test(priority=4)
	public void verifyHeaders(){
		Assert.assertTrue(Up.Headers());
	}
	
	@Test(priority=5)
	public void verifytable1(){
		Assert.assertTrue(Up.table1());
	}
	
	@Test(priority=6)
	public void verifytable2(){
		Assert.assertTrue(Up.table2());
	}
	
	@Test(priority=7)
	public void verifytable3(){
		Assert.assertTrue(Up.table3());
	}
	
	
}
