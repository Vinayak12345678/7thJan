package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.pages.DownloadPage;
import com.pages.OperatorsPage;

public class DownloadPageTest {
    WebDriver driver;  
	DownloadPage dp;

	@BeforeMethod
	public void openBrowser(){
		 System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
		    driver=new ChromeDriver();
		    driver.manage().window().maximize();
		    driver.get("file:///D:/Offline%20website/index.html");
		    dp =new DownloadPage(driver);
			   
		   
	}
	@AfterMethod
	public void closeBrowser(){
		driver.close();
}
	@Test(priority=1)
	public void verifymainHeading(){
		Assert.assertTrue(dp.mainHeading());
	}
	
	@Test(priority=2)
	public void verifysubHeading(){
		Assert.assertTrue(dp.subHeading());
	}
	
	@Test(priority=3)
	public void verifyHeaders(){
		Assert.assertTrue(dp.Headers());
	}
	
	@Test(priority=4)
	public void verifymemorybit32(){
		Assert.assertTrue(dp.memorybit32());
	}
	
	@Test(priority=5)
	public void verifymemorybit64(){
		Assert.assertTrue(dp.memorybit64());
	}
	
	@Test(priority=6)
	public void verifyseleniumurl(){
		Assert.assertTrue(dp.seleniumurl());
	}
	
	@Test(priority=7)
	public void verifychromeurl(){
		Assert.assertTrue(dp.chromeurl());
	}
	
	
}
