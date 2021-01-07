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

import com.objectRepository.DashboardPageRepository;
import com.objectRepository.DownloadPageRepository;

public class DownloadPage extends DownloadPageRepository{

WebDriver driver=null;
public DownloadPage(WebDriver driver){
	 PageFactory.initElements(driver ,this);
	 this.driver=driver;
}
	
	
	
	public boolean mainHeading(){
		driver.get("file:///D:/Offline%20website/pages/examples/downloads.html");
		WebElement Heading= driver.findElement(By.xpath("//h1"));
		Heading.isDisplayed();
		String actualdata=Heading.getText();
		String expdata="Downloads";
		if(actualdata.equals(expdata)){
			System.out.println("Heading is matched");
			return true;
		}else{
			System.out.println("Heading is not matched");
			return false;
		}
			//Assert.assertEquals(actualdata, expdata);
	}
	
	public boolean subHeading(){
		driver.get("file:///D:/Offline%20website/pages/examples/downloads.html");
		WebElement subHeading =driver.findElement(By.xpath("//h3[@class='box-title']"));
		subHeading.isDisplayed();
		String actualdata=subHeading.getText();
		String expdata="Downloads List";
		if(actualdata.equals(expdata)){
			System.out.println("Heading is matched");
			return true;
		}else{
			System.out.println("Heading is not matched");
			return false;
		}
		//Assert.assertEquals(actualdata, expdata);
	}
	
	public boolean Headers(){
		driver.get("file:///D:/Offline%20website/pages/examples/downloads.html");
		List<WebElement>list=driver.findElements(By.xpath("//th"));
		ArrayList<String>expdata =new ArrayList<String>();
		expdata.add("Sr");
		expdata.add("Name");
		expdata.add("vendor");
		expdata.add("Version");
		expdata.add("32bit");
		expdata.add("64bit");
		expdata.add("Common");
		expdata.add("Official Source"+"\n"+"*For prevoius and latest releases");
		ArrayList<String>actualdata=new ArrayList<String>();
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
		}
		//Assert.assertEquals(actualdata, expdata);
		
		}
	
	public boolean memorybit32(){
		driver.get("file:///D:/Offline%20website/pages/examples/downloads.html");
		List<WebElement> memory =driver.findElements(By.xpath("//tr/td[5]"));
		for(int i=2;i<=8;i++){
			String str1=driver.findElement(By.xpath("//tr["+i+"]/td[5]")).getText();
			if(str1.contains("32bit")){
				String str2=driver.findElement(By.xpath("//tr["+i+"]/td[3]")).getText();
				System.out.println(str1+" ");
				System.out.println(str1+" ");
			}
			System.out.println();
		}
		return true;
	}
	
	public boolean memorybit64(){
		driver.get("file:///D:/Offline%20website/pages/examples/downloads.html");
		List<WebElement> memory =driver.findElements(By.xpath("//tr/td[5]"));
		for(int i=2;i<=8;i++){
			String str1=driver.findElement(By.xpath("//tr["+i+"]/td[5]")).getText();
			if(str1.contains("64bit")){
				String str2=driver.findElement(By.xpath("//tr["+i+"]/td[3]")).getText();
				System.out.println(str1+" ");
				System.out.println(str1+" ");
			}
			System.out.println();
		}
		return true;
	}
	
	
	
	public boolean seleniumurl(){ //printing url of selenium
		driver.get("file:///D:/Offline%20website/pages/examples/downloads.html");
		String mainWindow =driver.getWindowHandle();
		for(int i=2;i<=8;i++){
			WebElement vendor =driver.findElement(By.xpath("//tr["+i+"]/td[3]"));
			String text =vendor.getText();
			if(text.contains("Seleneium")){
				WebElement link =driver.findElement(By.xpath("//tr["+i+"]/td[8]/a"));
				link.click();
			}	
		}
		Set<String>allWindows =driver.getWindowHandles();
		for(String window :allWindows){
			if(window.equals(mainWindow)){
				driver.switchTo().window(window);
				System.out.println("new window url is:"+driver.getCurrentUrl());
				System.out.println("new window title is:"+driver.getTitle());
			}	
		}
		return true;
	}
	
	public boolean chromeurl(){ 
	 driver.get("file:///D:/Offline%20website/pages/examples/downloads.html");	
	 String mainWindow =driver.getWindowHandle();
		for(int i=2;i<=8;i++){
		WebElement vendor=driver.findElement(By.xpath("//tr["+i+"]/td[3]"));	
		String text =vendor.getText();
		if(text.contains("Chrome")){
			WebElement link =driver.findElement(By.xpath("//tr["+i+"]/td[8]/a"));
			link.click();
		}
		}
	Set<String>allwindows =driver.getWindowHandles();
	for(String window1 :allwindows){
		if(window1.equals(mainWindow)){
			driver.switchTo().window(window1);
			System.out.println("new window url is:"+driver.getCurrentUrl());
			System.out.println("new window url is :"+driver.getTitle());
		}
	}
	return true;
}}


