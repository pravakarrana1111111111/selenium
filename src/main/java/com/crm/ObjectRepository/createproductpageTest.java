package com.crm.ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class createproductpageTest {
	
	@FindBy(xpath="//img[@title='Create Contact...']")
	private WebElement products;
	

	@FindBy(name="lastname")
	private WebElement name;
	
	@FindBy(xpath="//tbody/tr[5]/td[2]/img")
	private WebElement organisationadd;
	
	
	 public void navigatetoorganisationadd()
	    {
		 organisationadd.click();
	    }
	 
	 public void navigatetoproductname(String Name)
	    {
		 name.sendKeys(Name);
	    }
	
    public void navigatetoproductlink()
    {
    	products.click();
    }

}
