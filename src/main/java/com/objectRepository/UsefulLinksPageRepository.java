package com.objectRepository;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UsefulLinksPageRepository {

	@FindBy(xpath="//h1")
	public WebElement mainHeading;
	
	@FindBy(xpath="//h3[@class='box-title']")
	public WebElement subHeading;
	
	@FindBy(xpath="//th")
	public List<WebElement> Headers;
	
	@FindBy(xpath="//td[1]")
	public List<WebElement> table1;
	
	@FindBy(xpath="//td[2]")
	public List<WebElement> table2;
	
	@FindBy(xpath="//td[3]")
	public List<WebElement> table3;
	
}
