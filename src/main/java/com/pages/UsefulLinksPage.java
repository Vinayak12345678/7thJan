package com.pages;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.objectRepository.UsefulLinksPageRepository;

public class UsefulLinksPage  extends UsefulLinksPageRepository{

WebDriver driver;
public UsefulLinksPage(WebDriver driver){
	 PageFactory.initElements(driver ,this);
	 this.driver=driver;
}	
	
	
	public boolean mainHeading(){
		driver.get("file:///D:/Offline%20website/pages/examples/links.html");
		WebElement Heading =mainHeading;
		Heading.isDisplayed();
		String actualTitle=Heading.getText();
		String expTitle="Useful Links";
		//Assert.assertEquals(actualTitle, expTitle);
		if(actualTitle.equals(expTitle)){
			System.out.println("Heading is matched");
			return true;
		}else{
			System.out.println("Heading is not matched");
			return false;
		}
	}
	
	public boolean subHeading(){
		driver.get("file:///D:/Offline%20website/pages/examples/links.html");
		WebElement subHeading =driver.findElement(By.xpath("//h3[@class='box-title']"));
		subHeading.isDisplayed();
		String actualTitle=subHeading.getText();
		String expTitle="* Internet Required";	
		
		if(actualTitle.equals(expTitle)){
			System.out.println("Heading is matched");
			return true;
		}else{
			System.out.println("Heading is not matched");
			return false;
		}
	//Assert.assertEquals(actualTitle, expTitle);
	}
	public boolean interviewQues(){
		driver.get("file:///D:/Offline%20website/pages/examples/links.html");
		String mainwindow =driver.getWindowHandle();
		for(int i=2;i<=7;i++){
			WebElement vendor=driver.findElement(By.xpath("//tr["+i+"]/td[2]"));
		    String text= vendor.getText();
		    if(text.contains("interview")){
		    	WebElement link =driver.findElement(By.xpath("//tr["+i+"]/td[3]/a"));
		    	link.click();
		    	Set<String>allwindows =driver.getWindowHandles();
		    	for(String window1 :allwindows){
		    		if(window1.equals(mainwindow)){
		    			driver.switchTo().window(window1);
		    			System.out.println("new window url is:"+driver.getCurrentUrl());
		    			System.out.println("new window url is :"+driver.getTitle());
		    		}
		    	
		    }
		}
	}
		return true;
	}	
	
	public boolean Headers(){
		driver.get("file:///D:/Offline%20website/pages/examples/links.html");
		List<WebElement>list =Headers;
		ArrayList<String>expdata =new ArrayList<String>();
		expdata.add("Sr");
		expdata.add("Content");
		expdata.add("Click");
		ArrayList<String> actualdata=new ArrayList<String>();
		for(WebElement element:list){
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
	
	
	public boolean table1(){
		driver.get("file:///D:/Offline%20website/pages/examples/links.html");
		List<WebElement>list =table1;
		ArrayList<String>expdata =new ArrayList<String>();
		expdata.add("01");
		expdata.add("02");
		expdata.add("03");
		expdata.add("04");
		expdata.add("05");
		expdata.add("06");
		ArrayList<String> actualdata=new ArrayList<String>();
		for(WebElement element:list){
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
	
	
		
		public boolean table2(){
			driver.get("file:///D:/Offline%20website/pages/examples/links.html");
			List<WebElement>list =table2;
			ArrayList<String>expdata =new ArrayList<String>();
			expdata.add("Schedule");
			expdata.add("Video Lactures All Topics");
			expdata.add("Selenium Interview Questions");
			expdata.add("Java Interview Questions");
			expdata.add("Courses");
			expdata.add("Placement");
			ArrayList<String> actualdata=new ArrayList<String>();
			for(WebElement element:list){
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
		
		
	public boolean table3(){
		driver.get("file:///D:/Offline%20website/pages/examples/links.html");
		WebElement link =driver.findElement(By.xpath("//td[3]"));
		link.click();
		boolean actualdata =link.isSelected();
		return true;
		//Assert.assertEquals(actualdata,false);
	}
	
}
