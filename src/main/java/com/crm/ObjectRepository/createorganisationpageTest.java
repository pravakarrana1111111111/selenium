package com.crm.ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class createorganisationpageTest {
	
	@FindBy(name="accountname")
	private WebElement organisationname;
	
	 

	
	public void navigateNewOrganisation(String organisation){
		organisationname.sendKeys(organisation);
	}

}
