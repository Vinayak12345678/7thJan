package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.pages.DashboardPage;
import com.pages.LoginPage;
import com.pages.OperatorsPage;
import com.pages.UserPage;

public class TestBase {

	public static WebDriver driver;
	public static LoginPage lp=null;
	public static DashboardPage dp=null;
	public static UserPage page=null;
	public static OperatorsPage op=null;
	
	public static void initialisation () {
		
		System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("file:///D:/Offline%20website/index.html");
	   driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
	   driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
	}
}
