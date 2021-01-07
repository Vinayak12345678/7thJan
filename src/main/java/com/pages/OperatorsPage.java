package com.pages;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.objectRepository.OperatorsPageRepository;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;

public class OperatorsPage extends OperatorsPageRepository{

	WebDriver driver;
	public OperatorsPage(WebDriver driver){
		 PageFactory.initElements(driver ,this);
		 this.driver=driver;
	}

	
	public boolean mainHeading(){
		driver.get("file:///D:/Offline%20website/pages/examples/operators.html");
		WebElement actualdata= mainHeading;
		System.out.println(actualdata);
		String actualTitle=actualdata.getText();
		String expTitle="Operators";
		if(actualTitle.equals(expTitle)){
			System.out.println("Heading is matched");
			return true;
		}else{
			System.out.println("Heading is not matched");
			return false;
		}
		//Assert.assertEquals(actualTitle, expTitle);
	}
	
	
	public boolean Heading(){
		driver.get("file:///D:/Offline%20website/pages/examples/operators.html");
		List<WebElement> list=Heading;
		ArrayList<String>expdata =new ArrayList<String>();
		expdata.add("ID");
		expdata.add("Person");
		expdata.add("For");
		expdata.add("Prefered Way to Connect");
		expdata.add("Contact");
		expdata.add("Timings");
		ArrayList<String>actualdata = new ArrayList<String>();
		for(WebElement element: list){
			actualdata.add(element.getText());}
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

	
	public boolean subHeading(){
		driver.get("file:///D:/Offline%20website/pages/examples/operators.html");
	     WebElement actualdata =subHeading;
	     System.out.println(actualdata);
	     String actualTitle=actualdata.getText();
	     String expTitle="Operator List";
	     if(actualTitle.equals(expTitle)){
				System.out.println("Heading is matched");
				return true;
			}else{
				System.out.println("Heading is not matched");
				return false;
			}
	     //Assert.assertEquals(actualTitle, expTitle);
	}
	
	public boolean preferedContact1(){
		driver.get("file:///D:/Offline%20website/pages/examples/operators.html");
		for(int i=2;i<=6;i++){
			String str1=driver.findElement(By.xpath("//tr["+i+"]/td[4]")).getText();
			if(str1.contains("Whats App Only")){
				String str2 =driver.findElement(By.xpath("//tr["+i+"]/td[2]")).getText();
				System.out.println(str2+" ");
				System.out.println(str1+" ");
			}
			System.out.println();
			
		}
		return true;
	}
		
		public boolean preferedContact2(){
			driver.get("file:///D:/Offline%20website/pages/examples/operators.html");
			for(int i=3;i<=6;i++){
				String str1=driver.findElement(By.xpath("//tr["+i+"]/td[4]")).getText();
				if(str1.contains("Phone Call")){
					String str2 =driver.findElement(By.xpath("//tr["+i+"]/td[2]")).getText();
					System.out.println(str2+" ");
					System.out.println(str1+" ");
				}
			}System.out.println();
			return true;
		}
	
	     
	     public boolean Timings(){
	    	 driver.get("file:///D:/Offline%20website/pages/examples/operators.html");
	    	 for(int i=3;i<=6;i++){
	    		 String str1=driver.findElement(By.xpath("//tr["+i+"]/td[6]")).getText();
	    		 if(str1.contains("Monday-Saturday")){
	    			 String str2=driver.findElement(By.xpath("//tr["+i+"]/td[2]")).getText();
	    			 System.out.println(str2+" ");
	    			 System.out.println(str1+" ");
	    		 }
	    		 System.out.println();
	    	 }
			return true;
	     }
        	     
	     public boolean Timings2(){
        	driver.get("file:///D:/Offline%20website/pages/examples/operators.html");
        	for(int i=2;i<=2;i++){
        		String str1 =driver.findElement(By.xpath("//tr[2]/td[6]")).getText();
        		if(str1.contains("07:00 AM to 10:00 PM")){
        			String str2 =driver.findElement(By.xpath("//tr[2]/td[2]")).getText();
        			System.out.println(str2+" ");
        			System.out.println(str1+" ");
        		}
        		System.out.println();
        	}
			return true;
        }
        	
        	public boolean call(){
        		driver.get("file:///D:/Offline%20website/pages/examples/operators.html");
        		for(int i=3;i<=6;i++){
        			String str1 =driver.findElement(By.xpath("//tr["+i+"]/td[4]")).getText();
        			if(str1.contains("Whats App")){
        				String str2 =driver.findElement(By.xpath("//tr["+i+"]/td[2]")).getText();
        				System.out.println(str1+" ");
        				System.out.println(str2+" ");
        			}
        			System.out.println();
        		}
				return true;
        	}

		
		public boolean excelsheetData() throws Exception {
			FileInputStream fis=new FileInputStream("Operator.xls");
			Workbook wb= Workbook.getWorkbook(fis);
			Sheet sh =wb.getSheet(0);
			int rows= sh.getRows();
			int cols =sh.getColumns();
			List<String>expdata=new ArrayList<String>();
			for(int i=0;i<cols;i++){
				for(int j=1;j<rows;j++){
					Cell cell =sh.getCell(i, j);
					String data =cell.getContents();
					System.out.println("0"+data+"  ");
					expdata.add("0"+data);
				}
				
				System.out.println("---");
                List<WebElement>row =driver.findElements(By.xpath("//tr/td"));
                int rowcount =row.size();
                for(int k=0;k<rowcount;k++){
                	String rowtext =row.get(k).getText();
                	System.out.println(rowtext);
                }
			
			
			}
			return true;
		}
	
}
