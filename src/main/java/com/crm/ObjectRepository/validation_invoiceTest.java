package com.crm.ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class validation_invoiceTest {
	
	@FindBy(xpath="//span[contains(text(),'Invoice Information')]")
			private WebElement validation;

	public WebElement getValidation() {
		return validation;
	}
	
	
	

}
