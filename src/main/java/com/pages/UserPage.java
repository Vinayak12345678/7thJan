package com.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.objectRepository.UserPageRepository;

public class UserPage extends UserPageRepository {

	WebDriver driver;
	public UserPage(WebDriver driver){
		 PageFactory.initElements(driver ,this);
		 this.driver=driver;
	}
	
	

	
	public boolean mainHeading() {
		driver.get("file:///D:/Offline%20website/pages/examples/users.html");
		WebElement actualdata = mainHeading;
		System.out.println(actualdata);
		String actualHeading = actualdata.getText();
		String expdata = "Users";
		if(actualHeading.equals(expdata)){
			System.out.println("Heading is matched");
			return true;
		}else{
			System.out.println("Heading is not matched");
			return false;
		}
		//Assert.assertEquals(actualHeading, expdata);
	}

	
	public boolean addUserButton() {
		driver.get("file:///D:/Offline%20website/pages/examples/users.html");
		WebElement actualdata = addUserButton;
		System.out.println(actualdata);
		String actualHeading = actualdata.getText();
		String expdata = "Add User";
		if(actualHeading.equals(expdata)){
			System.out.println("Heading is matched");
			return true;
		}else{
			System.out.println("Heading is not matched");
			return false;
		}
		//Assert.assertEquals(actualHeading, expdata);
	}
	
	
	public boolean table1(){
		driver.get("file:///D:/Offline%20website/pages/examples/users.html");
		List<WebElement>list =table1;
		ArrayList<String>expdata =new ArrayList<String>();
		expdata.add("1");
		expdata.add("2");
		expdata.add("3");
		expdata.add("4");
		System.out.println(expdata);
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
	
	public boolean table2(){
		driver.get("file:///D:/Offline%20website/pages/examples/users.html");
		List<WebElement>list =table2;
		ArrayList<String>expdata =new ArrayList<String>();
		expdata.add("Kiran");
		expdata.add("Sagar");
		expdata.add("Monica");
		expdata.add("Kimaya");
		System.out.println(expdata);
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
	
	public boolean table3(){
		driver.get("file:///D:/Offline%20website/pages/examples/users.html");
		List<WebElement>list =table3;
		ArrayList<String>expdata =new ArrayList<String>();
		expdata.add("kiran@gmail.com");
		expdata.add("sagar@gmail.com");
		expdata.add("monica@gmail.com");
		expdata.add("kimaya@gmail.com");
		System.out.println(expdata);
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
	
	public boolean table4(){
		driver.get("file:///D:/Offline%20website/pages/examples/users.html");
		List<WebElement>list =table4;
		ArrayList<String>expdata= new ArrayList<String>();
		expdata.add("9898989898");
		expdata.add("999999999");
		expdata.add("1111111111");
		expdata.add("999999999");
		System.out.println(expdata);
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
	
	public boolean table5(){
	    driver.get("file:///D:/Offline%20website/pages/examples/users.html");
	    List<WebElement>list =table5;
	    ArrayList<String>expdata=new ArrayList<String>();
	    expdata.add("Java/J2EE");
	    expdata.add("Selenium");
	    expdata.add("Python");
	    expdata.add("PHP");
	    System.out.println(expdata);
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
	   // Assert.assertEquals(actualdata, expdata);
	}
	
	public boolean table6(){
	   driver.get("file:///D:/Offline%20website/pages/examples/users.html");
	   List<WebElement>list =table6;
	   ArrayList<String>expdata=new ArrayList<String>();
	   expdata.add("Male");
	   expdata.add("Male");
	   expdata.add("Female");
	   expdata.add("Female");
	   System.out.println(expdata);
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
	public boolean table7(){
		   driver.get("file:///D:/Offline%20website/pages/examples/users.html");
		   List<WebElement>list =table7;
		   ArrayList<String>expdata=new ArrayList<String>();
		   expdata.add("Maharashtra");
		   expdata.add("Punjab");
		   expdata.add("Maharashtra");
		   expdata.add("Punjab");
		   System.out.println(expdata);
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
		   // Assert.assertEquals(actualdata, expdata);
		
	}
	public boolean verifyHeader(){
		   driver.get("file:///D:/Offline%20website/pages/examples/users.html");
		   List<WebElement>list =verifyHeader;
		   ArrayList<String>expdata=new ArrayList<String>();
		   expdata.add("#");
		   expdata.add("Username");
		   expdata.add("Email");
		   expdata.add("Mobile");
		   expdata.add("Course");
		   expdata.add("Gender");
		   expdata.add("State");
		   expdata.add("Action");
		   System.out.println(expdata);
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
		   // Assert.assertEquals(actualdata, expdata);
	}
	
	public boolean  verifyFirstRow(){
		   driver.get("file:///D:/Offline%20website/pages/examples/users.html");
		   List<WebElement>list =verifyFirstRow;
		   ArrayList<String>expdata=new ArrayList<String>();
		   expdata.add("1");
		   expdata.add("Kiran");
		   expdata.add("kiran@gmail.com");
		   expdata.add("9898989898");
		   expdata.add("Java/J2EE");
		   expdata.add("Male");
		   expdata.add("Maharashtra");
		   expdata.add("Delete");
		   System.out.println(expdata);
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
	
	public boolean verifySecondRow(){
		   driver.get("file:///D:/Offline%20website/pages/examples/users.html");
		   List<WebElement>list =verifySecondRow;
		   ArrayList<String>expdata=new ArrayList<String>();
		   expdata.add("2");
		   expdata.add("Sagar");
		   expdata.add("sagar@gmail.com");
		   expdata.add("999999999");
		   expdata.add("Selenium");
		   expdata.add("Male");
		   expdata.add("Punjab");
		   expdata.add("Delete");
		   System.out.println(expdata);
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
	
	public boolean verifyThirdRow(){
		   driver.get("file:///D:/Offline%20website/pages/examples/users.html");
		   List<WebElement>list =verifyThirdRow;
		   ArrayList<String>expdata=new ArrayList<String>();
		   expdata.add("3");
		   expdata.add("Monica");
		   expdata.add("monica@gmail.com");
		   expdata.add("1111111111");
		   expdata.add("Python");
		   expdata.add("Female");
		   expdata.add("Maharashtra");
		   expdata.add("Delete");
		   System.out.println(expdata);
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
		   // Assert.assertEquals(actualdata, expdata);
	}
	
  
	public boolean verifyFourthRow1(){
    	   driver.get("file:///D:/Offline%20website/pages/examples/users.html");
		   List<WebElement>list =verifyFourthRow;
		   ArrayList<String>expdata=new ArrayList<String>();
		   expdata.add("4");
		   expdata.add("Kimaya");
		   expdata.add("kimaya@gmail.com");
		   expdata.add("999999999");
		   expdata.add("PHP");
		   expdata.add("Female");
		   expdata.add("Punjab");
		   expdata.add("Delete");
		   System.out.println(expdata);
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
 
	public boolean logOut(){
    	driver.get("file:///D:/Offline%20website/pages/examples/users.html");
    	WebElement actualdata =logOut;
    	System.out.println(actualdata);
    	String actualHeading =actualdata.getText();
    	String expdata="LOGOUT";
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
		String actualHeading=actualdata.getText();
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
    
    public boolean addUserHeaders(){
    	driver.get("file:///D:/Offline%20website/pages/examples/add_user.html");
    	List<WebElement>list =addUserHeaders;
    	ArrayList<String>expdata =new ArrayList<String>();
    	expdata.add("Username");
    	expdata.add("Mobile");
    	expdata.add("Email");
    	expdata.add("Courses");
    	expdata.add("Gender");
    	expdata.add("State");
    	expdata.add("Password");
    	System.out.println(expdata);
    	ArrayList<String>actualdata=new ArrayList<String>();
    	for(WebElement element: list){
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
   
    public boolean verifyFirstDeleteButton(){
    	driver.get("file:///D:/Offline%20website/pages/examples/users.html#");
    	verifyFirstDeleteButton.click();
        Alert al= driver.switchTo().alert();
    	String actualdata =al.getText();
    	System.out.println(actualdata);
    	String expdata="You can not delete Default User";
    	al.accept();
    	if(actualdata.equals(expdata)){
			System.out.println("Heading is matched");
			return true;
		}else{
			System.out.println("Heading is not matched");
			return false;
		}
    	//Assert.assertEquals(actualdata, expdata);
    }
   
    @Test(priority=22)
    public boolean verifyFourthDelete(){
    	driver.get("file:///D:/Offline%20website/pages/examples/users.html#");
    	verifyFourthDeleteButton.click();
    	Alert al= driver.switchTo().alert();
    	String actualdata =al.getText();
    	System.out.println(actualdata);
    	String expdata="You can not delete Default User";
    	al.accept();
    	if(actualdata.equals(expdata)){
			System.out.println("Heading is matched");
			return true;
		}else{
			System.out.println("Heading is not matched");
			return false;
		}
    	//Assert.assertEquals(actualdata, expdata);
 
    }

}
