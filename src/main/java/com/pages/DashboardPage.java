package com.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.objectRepository.DashboardPageRepository;



public class DashboardPage extends DashboardPageRepository{

WebDriver driver;
public DashboardPage(WebDriver driver){
	 PageFactory.initElements(driver ,this);
	 this.driver=driver;
}
	
	

	
	public boolean verifyAllCourses(){
		driver.get("file:///D:/Offline%20website/pages/examples/dashboard.html");
		List<WebElement> list=verifyAllCourses;
		ArrayList<String>expdata=new ArrayList<String>();
		expdata.add("Automation Testing");
		expdata.add("Software Development");
		expdata.add("Data Science");
		expdata.add("Web Development");
		ArrayList<String>actualdata=new ArrayList<String>();
		for(WebElement element : list){
			actualdata.add(element.getText());
		}
		System.out.println(actualdata);
		if(actualdata.equals(expdata)){
			System.out.println("Heading is matched");
			return true;
		}else{
			System.out.println("Heading is not matched");
			return false;
		}
		//Assert.assertEquals(actualdata, expdata);
		
	}
	
	public boolean moreInfo(){
		driver.get("file:///D:/Offline%20website/pages/examples/dashboard.html");
		List<WebElement>list =moreInfo;
		ArrayList<String>expdata=new ArrayList<String>();
		expdata.add("More info");
		expdata.add("More info");
		expdata.add("More info");
		expdata.add("More info");
		ArrayList<String>actualdata = new ArrayList<String>();
		for(WebElement element : list){
			actualdata.add(element.getText());
		}
		System.out.println(actualdata);
		if(actualdata.equals(expdata)){
			System.out.println("Heading is matched");
			return true;
		}else{
			System.out.println("Heading is not matched");
			return false;
		}
		//Assert.assertEquals(actualdata, expdata);
	}
		
	
	public boolean mainNavigation(){
		driver.get("file:///D:/Offline%20website/pages/examples/dashboard.html");
		List<WebElement>list = mainNavigation;
		ArrayList<String>expdata =new ArrayList<String>();
		expdata.add("Dashboard");
		expdata.add("Users");
		expdata.add("Operators");
		expdata.add("Useful Links");
		expdata.add("Downloads");
		expdata.add("Logout");
		ArrayList<String>actualdata= new ArrayList<String>();
		for(WebElement element :list){
			actualdata.add(element.getText());
		}
		System.out.println(actualdata);
		if(actualdata.equals(expdata)){
			System.out.println("Heading is matched");
			return true;
		}else{
			System.out.println("Heading is not matched");
			return false;
		//Assert.assertEquals(actualdata, expdata);
		}
	}
		
		
	public boolean verifyHeading(){
		driver.get("file:///D:/Offline%20website/pages/examples/dashboard.html");
		WebElement actualdata =verifyHeading;
		String actualHeading=actualdata.getText();
		actualdata.isDisplayed();
		String expdata="Java By Kiran";
		if(actualHeading.equals(expdata)){
			System.out.println("Heading is matched");
			return true;
		}else{
			System.out.println("Heading is not matched");
			return false;
		//Assert.assertEquals(actualHeading, expdata);
		}
	}
	
	public boolean logOut(){
		    driver.get("file:///D:/Offline%20website/pages/examples/dashboard.html");
			WebElement actualdata =logOut;
		    String actualHeading=actualdata.getText();
			System.out.println(actualHeading);
			String expdata="LOGOUT";
			System.out.println(expdata);
			if(actualHeading.equals(expdata)){
				System.out.println("Heading is matched");
				return true;
			}else{
				System.out.println("Heading is not matched");
				return false;
			}
			//Assert.assertEquals(actualHeading, expdata);
			
	    }
		
	public boolean logOutMsg(){
        driver.get("file:///D:/Offline%20website/pages/examples/logout.html");
		WebElement actualdata =logOutMsg;
        System.out.println(actualdata);
		String actualHeading=driver.findElement(By.xpath("//p[@class='login-box-msg']//following::p")).getText();
		String expdata ="Logout successfully";
		if(actualHeading.equals(expdata)){
			System.out.println("Heading is matched");
			return true;
		}else{
			System.out.println("Heading is not matched");
			return false;
		}
		//Assert.assertEquals(actualHeading, expdata);
	}
	
	public boolean verifySubHeading(){
		driver.get("file:///D:/Offline%20website/pages/examples/dashboard.html");
		WebElement actualdata =verifySubHeading;
		System.out.println(actualdata);
		String actualHeading =actualdata.getText();
		String expdata ="Courses Offered";
		if(actualHeading.equals(expdata)){
			System.out.println("Heading is matched");
			return true;
		}else{
			System.out.println("Heading is not matched");
			return false;
		}
		//Assert.assertEquals(actualHeading, expdata);
	}
	
	public boolean footer(){
		driver.get("file:///D:/Offline%20website/pages/examples/dashboard.html");
		WebElement actualdata =footer;
		System.out.println(actualdata);
		String actualHeading =actualdata.getText();
		String expdata="Design for Selenium Automation Test";
		if(actualHeading.equals(expdata)){
			System.out.println("Heading is matched");
			return true;
		}else{
			System.out.println("Heading is not matched");
			return false;
		}
		//Assert.assertEquals(actualHeading, expdata);
	}
	
	public boolean copyRightMsg(){
		driver.get("file:///D:/Offline%20website/pages/examples/dashboard.html");
		WebElement actualdata =copyRightMsg;
		System.out.println(actualdata);
		String actualHeading =actualdata.getText();
		String expdata ="Copyright © 2005-2019 JavaByKiran.";
		if(actualHeading.equals(expdata)){
			System.out.println("Heading is matched");
			return true;
		}else{
			System.out.println("Heading is not matched");
			return false;
		}
		//Assert.assertEquals(actualHeading, expdata);
	}	
	
	public boolean heading1(){
	  driver.get("file:///D:/Offline%20website/pages/examples/dashboard.html");
	  WebElement actualdata =heading1;
	  System.out.println(actualdata);
	  String actualHeading =actualdata.getText();
	  String expdata ="Kiran";
	  if(actualHeading.equals(expdata)){
			System.out.println("Heading is matched");
			return true;
		}else{
			System.out.println("Heading is not matched");
			return false;
		}
	  //Assert.assertEquals(actualHeading,expdata);
	  }
	 
	public boolean message(){
	  driver.get("file:///D:/Offline%20website/pages/examples/dashboard.html");
	 WebElement actualdata =message;
	  System.out.println(actualdata);
	  String actualHeading =actualdata.getText();
	  String expdata ="Online";
	  if(actualHeading.equals(expdata)){
			System.out.println("Heading is matched");
			return true;
		}else{
			System.out.println("Heading is not matched");
			return false;
		}
	 // Assert.assertEquals(actualHeading, expdata);
	}
	
	public boolean verifySubHeading2(){
	  driver.get("file:///D:/Offline%20website/pages/examples/dashboard.html");	
	  WebElement actualdata =verifySubHeading2;
	  System.out.println(actualdata);
	  String actualHeading= actualdata.getText();
	  String expdata ="Dashboard Courses Offered";
	  if(actualHeading.equals(expdata)){
			System.out.println("Heading is matched");
			return true;
		}else{
			System.out.println("Heading is not matched");
			return false;
		}
	 // Assert.assertEquals(actualHeading, expdata);
	}
	
	public boolean verifySubHeading3(){
		driver.get("file:///D:/Offline%20website/pages/examples/dashboard.html");
		WebElement actualdata =verifySubHeading3;
		System.out.println(actualdata);
		String actualHeading= actualdata.getText();
		String expdata="Home";
		if(actualHeading.equals(expdata)){
			System.out.println("Heading is matched");
			return true;
		}else{
			System.out.println("Heading is not matched");
			return false;
		}
		//Assert.assertEquals(actualHeading, expdata);
	}
}
