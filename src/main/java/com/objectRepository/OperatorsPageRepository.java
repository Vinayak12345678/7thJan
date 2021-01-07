package com.objectRepository;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OperatorsPageRepository {

	@FindBy(xpath="//h1")
	public WebElement mainHeading;
	
	@FindBy(xpath="//th")
	public List<WebElement> Heading;
	
	@FindBy(xpath="//h3[@class='box-title']")
	public WebElement subHeading;
	
	@FindBy(xpath="//tr/td")
	public WebElement excelsheetData;
	
	
	
}
