package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.pages.DashboardPage;
import com.pages.OperatorsPage;

public class OperatorsPageTest {

	WebDriver driver;
	OperatorsPage op;
	
	@BeforeMethod
	public void openBrowser(){
		 System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
		    driver=new ChromeDriver();
		    driver.manage().window().maximize();
		    driver.get("file:///D:/Offline%20website/index.html");
		   op =new OperatorsPage(driver);
		   
	}
	@AfterMethod
	public void closeBrowser(){
		driver.close();
}
	@Test(priority=1)
	public void verifymainHeading(){
		Assert.assertTrue(op.mainHeading());
	}
	@Test(priority=2)
	public void verifyHeading(){
		Assert.assertTrue(op.Heading());
	}
	@Test(priority=3)
	public void verifysubHeading(){
		Assert.assertTrue(op.subHeading());
	}
	@Test(priority=4)
	public void verifypreferedContact1(){
		Assert.assertTrue(op.preferedContact1());
	}
	@Test(priority=5)
	public void verifypreferedContact2(){
		Assert.assertTrue(op.preferedContact2());
	}
	@Test(priority=6)
	public void verifyTimings(){
		Assert.assertTrue(op.Timings());
	}
	@Test(priority=7)
	public void verifyTimings2(){
		Assert.assertTrue(op.Timings2());
	}
	@Test(priority=8)
	public void verifycall(){
		Assert.assertTrue(op.call());
	}
	@Test(priority=9)
	public void verifyexcelsheetData() throws Exception{
		Assert.assertTrue(op.excelsheetData());
	}
}
