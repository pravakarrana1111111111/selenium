package com.crm.ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class contactpageTest {
	
	@FindBy(xpath="//a[@href=\"index.php?module=Products&action=index\"]")
	private WebElement contactlink;
	
	
	public void navigatetocontact(){
		contactlink.click();
	}

}
