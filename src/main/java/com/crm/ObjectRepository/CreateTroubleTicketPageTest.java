package com.crm.ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateTroubleTicketPageTest {


	//store all the webElement using @findby

	@FindBy(name="ticket_title")
	private WebElement subjectname;
	
	@FindBy(xpath="//input[@title='Save [Alt+S]']")
	private WebElement save;
	
	
	//uthilisation through business libraries/methods

	public void Navigatetocreate(String subjectName) { 
		subjectname.sendKeys(subjectName);
	}
	public void savetroubleticket(){
		save.click();
	
	}
	
	
	
}
