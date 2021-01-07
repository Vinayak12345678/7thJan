package com.objectRepository;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddUserPageRepository {

	@FindBy(xpath="//h1")
	public WebElement Heading;
	
	@FindBy(xpath="//h3[@class='box-title']")
	public WebElement subHeading;
	
	@FindBy(xpath="//label[@class='col-sm-3 control-label']")
	public List<WebElement>userTable;
	
	@FindBy(xpath="//input[@id='Male']")
	public WebElement radioButtonMale;
	
	@FindBy(xpath="//input[@id='Female']")
	public WebElement radioButtonfemale;
	
	@FindBy(xpath="//select")
	public WebElement selectState;
	
	@FindBy(xpath="//button[@id='submit']")
	public WebElement submitButton;
	
	
	
	
	
}
