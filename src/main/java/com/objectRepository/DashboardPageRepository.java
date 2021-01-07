package com.objectRepository;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPageRepository {

	@FindBy(xpath="//div[@class='inner']//following::p")
	public List<WebElement>verifyAllCourses;
	
	@FindBy(xpath="//a[@class='small-box-footer'")
	public List<WebElement> moreInfo;
	
	@FindBy(xpath="//i[@class='fa fa-dashboard']//following::span")
	public List<WebElement> mainNavigation;
	
	@FindBy(xpath="//span[@class='logo-lg']//child::b")
	public WebElement verifyHeading;
	
	@FindBy(xpath="//li[@class='dropdown user user-menu']//child::a")
	public WebElement logOut;
	
	@FindBy(xpath="//p[@class='login-box-msg']//following::p")
	public WebElement logOutMsg;
	
	@FindBy(xpath="//section[@class='content-header']//following::small")
	public WebElement verifySubHeading;
	
	@FindBy(xpath="//div[@class='pull-right hidden-xs']//following::b")
	public WebElement footer;
	
	@FindBy(xpath="//div[@class='pull-right hidden-xs']//following::strong")
	public WebElement copyRightMsg;
	
	@FindBy(xpath="//div[@class='pull-left info']//child::p")
	public WebElement heading1;
	
	@FindBy(xpath="//div[@class='pull-left info']//child::a")
	public WebElement message;
	
	@FindBy(xpath="//section[@class='content-header']//child::h1")
	public WebElement verifySubHeading2;
	
	@FindBy(xpath="//ol[@class='breadcrumb']//child::a")
	public WebElement verifySubHeading3;
	
}
