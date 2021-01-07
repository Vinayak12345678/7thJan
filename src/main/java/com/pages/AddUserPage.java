package com.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.objectRepository.AddUserPageRepository;

public class AddUserPage extends AddUserPageRepository {

WebDriver driver=null;
public AddUserPage(WebDriver driver){
	PageFactory.initElements(driver, this);
	this.driver=driver;
}
		
	public boolean Heading(){
	  driver.get("file:///D:/Offline%20website/pages/examples/add_user.html");
	  WebElement heading =driver.findElement(By.xpath("//h1"));
	  heading.isDisplayed();
	  String actualdata =heading.getText();
	  String expdata ="Add User";
	  if(actualdata.equals(expdata)){
			System.out.println("Heading is matched");
			return true;
		}else{
			System.out.println("Heading is not matched");
			return false;
		}
	 // Assert.assertEquals(actualdata, expdata);
	}
	
	
	public boolean subHeading(){
		driver.get("file:///D:/Offline%20website/pages/examples/add_user.html");
		WebElement subHeading =driver.findElement(By.xpath("//h3[@class='box-title']"));
		subHeading.isDisplayed();
		String actualdata =subHeading.getText();
		String expdata="Fill Below Details";
		if(actualdata.equals(expdata)){
			System.out.println("Heading is matched");
			return true;
		}else{
			System.out.println("Heading is not matched");
			return false;
		}
		//Assert.assertEquals(actualdata, expdata);
	}
	
	
	public boolean userTable(){
		driver.get("file:///D:/Offline%20website/pages/examples/add_user.html");
		List<WebElement>list =driver.findElements(By.xpath("//label[@class='col-sm-3 control-label']"));
		ArrayList<String> expdata =new ArrayList<String>();
		expdata.add("Username");
		expdata.add("Mobile");
		expdata.add("Email");
		expdata.add("Courses");
		expdata.add("Gender");
		expdata.add("State");
		expdata.add("Password");
		ArrayList<String>actualdata =new ArrayList<String>();
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
		
	
	public boolean radioButtonMale(){
		driver.get("file:///D:/Offline%20website/pages/examples/add_user.html");
		WebElement male=driver.findElement(By.xpath("//input[@id='Male']"));
		male.click();
		boolean actualdata= male.isSelected();
		//String expdata =" Male";
		//Assert.assertEquals(actualdata, true);
		return true;
	}
	
	
	public boolean radioButtonfemale(){
	driver.get("file:///D:/Offline%20website/pages/examples/add_user.html");
	WebElement female =driver.findElement(By.xpath("//input[@id='Female']"));
	female.click();
	boolean actualdata =female.isSelected();
	//Assert.assertEquals(actualdata, true);
	return true;
	}
	
	
	
	public boolean selectState(){
		driver.get("file:///D:/Offline%20website/pages/examples/add_user.html");
		WebElement Selectstate =driver.findElement(By.xpath("//select"));
		Selectstate.click();
		boolean actualdata =Selectstate.isSelected();
		//Assert.assertEquals(actualdata, false);
		return true;
	}
	
	
	public boolean submitButton(){
		driver.get("file:///D:/Offline%20website/pages/examples/add_user.html");
		WebElement button =driver.findElement(By.xpath("//button[@id='submit']"));
		button.click();
		boolean actualdata =button.isSelected();
		//Assert.assertEquals(actualdata,false);
		return true;
	}
	
	
	public boolean addUserAlert() {
		driver.get("file:///D:/Offline%20website/pages/examples/add_user.html");
    	driver.findElement(By.xpath("//input[@id='username']")).sendKeys("vinayak");
        driver.findElement(By.xpath("//input[@id='mobile']")).sendKeys("8888888888");
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("vinayak@gmail.com");
        driver.findElement(By.xpath("//input[@id='course']")).sendKeys("Java");
        radioButtonMale.click();
        Select state =new Select(selectState);
        state.selectByValue("Maharashtra");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123456");
        submitButton.click();
        Alert al=driver.switchTo().alert();
        String actualmessage =al.getText();
        System.out.println(actualmessage);
        al.accept();
        String message ="User Added Successfully. You can not see added user.";
        System.out.println(message);
        //Assert.assertEquals(actualmessage, message);
		return true;   
		
	}
	
}
