package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.pages.DashboardPage;
import com.pages.UserPage;

public class UserPageTest {


WebDriver driver;
	UserPage page;
	
	@BeforeMethod
	public void openBrowser(){
		 System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
		    driver=new ChromeDriver();
		    driver.manage().window().maximize();
		    driver.get("file:///D:/Offline%20website/index.html");
		   page =new UserPage(driver);
		   
	}
	@AfterMethod
	public void closeBrowser(){
		driver.close();
}
	@Test(priority=1)
	public void verifymainHeading(){
		Assert.assertTrue(page.mainHeading());
	}
	@Test(priority=2)
	public void addUserButton(){
		Assert.assertTrue(page.addUserButton());
	}
	@Test(priority=3)
	public void verifytable1(){
		Assert.assertTrue(page.table1());
	}
	@Test(priority=4)
	public void verifytable2(){
		Assert.assertTrue(page.table2());
	}
	@Test(priority=5)
	public void verifytable3(){
		Assert.assertTrue(page.table3());
	}
	@Test(priority=6)
	public void verifytable4(){
		Assert.assertTrue(page.table4());
	}
	@Test(priority=7)
	public void verifytable5(){
		Assert.assertTrue(page.table5());
	}
	@Test(priority=8)
	public void verifytable6(){
		Assert.assertTrue(page.table6());
	}
	@Test(priority=9)
	public void verifytable7(){
		Assert.assertTrue(page.table7());
	}
	@Test(priority=10)
	public void verifyheader(){
		Assert.assertTrue(page.verifyHeader());
	}
	@Test(priority=11)
	public void verifyFirstRow(){
		Assert.assertTrue(page.verifyFirstRow());
	}
	@Test(priority=12)
	public void verifySecondRow(){
		Assert.assertTrue(page.verifySecondRow());
	}
	@Test(priority=13)
	public void verifyThirdRow(){
		Assert.assertTrue(page.verifyThirdRow());
	}
	@Test(priority=14)
	public void verifyFourthRow(){
		Assert.assertTrue(page.verifyFourthRow1());
	}
	@Test(priority=15)
	public void verifyLogout(){
		Assert.assertTrue(page.logOut());
	}
	@Test(priority=16)
	public void verifylogOutMsg(){
		Assert.assertTrue(page.logOutMsg());
	}
	@Test(priority=17)
	public void verifyaddUserHeaders(){
		Assert.assertTrue(page.addUserHeaders());
	}
	@Test(priority=18)
	public void verifyFirstDeleteButton(){
		Assert.assertTrue(page.verifyFirstDeleteButton());
	}
	
	
	
}
