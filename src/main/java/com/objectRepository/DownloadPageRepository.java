package com.objectRepository;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DownloadPageRepository {

	@FindBy(xpath="//h1")
	public WebElement verifymainHeading;
	
	@FindBy(xpath="/h3[@class='box-title']")
	public WebElement verifysubHeading;
	
	@FindBy(xpath="//th")
	public List<WebElement> verifyHeaders;
	
}
