package com.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageRepository {

	@FindBy(xpath="//input[@id='email']")
	public WebElement uname;
	
	@FindBy(xpath="//input[@id='password']")
	public WebElement password;
	
	@FindBy(xpath="//button[@type='submit']")
	public WebElement loginButton;
	
	@FindBy(xpath="//img")
	public WebElement logo;
	
	@FindBy(xpath="//b")
	public WebElement actualTitle;
	
	@FindBy(xpath="//h4")
	public WebElement actSubHead;
	
	@FindBy(id="email_error")
	public WebElement email;
	
	@FindBy(id="password_error")
	public WebElement  actpassword;
	
	@FindBy(id="email_error")
	public WebElement blankEmail;
	
	@FindBy(id="password_error")
	public WebElement blankpassword;
	
	@FindBy(xpath="//a[@class='text-center']")
	public WebElement RegLink;
	
	@FindBy(name="name")
	public WebElement Name;
	
	@FindBy(name="mobile")
	public WebElement Mobile;
	
	@FindBy(name="email")
	public WebElement newemail;
	
	@FindBy(name="password")
	public WebElement newpassword;
	
	@FindBy(name="//button")
	public WebElement regButton;
	
}
