package com.crm.ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class organisationpageTest {
	
	@FindBy(xpath="//img[@title='Create Organization...']")
	private WebElement organisationlink;
	
	
	public void navigateToorganisation(){
		organisationlink.click();
	}

}
