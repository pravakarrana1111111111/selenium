package com.crm.inoviceTest;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.crm.ObjectRepository.HomepageTest;
import com.crm.ObjectRepository.TroubleTicketpageTest;
import com.crm.ObjectRepository.invoicepageTest;
import com.crm.generic_lib.Baseclass;

public class createinvoice_withoutmandatoryfieldTest extends Baseclass {
	
	@Test
	public void createTroubletickettest() throws Throwable, IOException{
		
 		String exresult3   =flib.getexcelData("Sheet1", 16, 1);

		/*open invoice page*/
        
		HomepageTest home3=PageFactory.initElements(driver, HomepageTest.class);
        home3.navigatetoemorlink();
        
	    HomepageTest home4=PageFactory.initElements(driver, HomepageTest.class);
	    home4.navigatetoinvoicelink();
	
		/*open create invoice page*/
	     
	    invoicepageTest invoice=PageFactory.initElements(driver, invoicepageTest.class);
	    invoice.navigateToinvoice();
	    
		/*save invoice*/
	    
	    invoicepageTest save=PageFactory.initElements(driver, invoicepageTest.class);
	    save.navigateTosave();
	    
	     Alert alt=driver.switchTo().alert();
	     String actmsg= alt.getText();
		  
		 Thread.sleep(5000);
		 alt.accept();
 		 
		 boolean status=actmsg.contains(exresult3);
		 Assert.assertTrue(status);
		 
         Reporter.log("Subject cannot be empty",true);  

 	}
  
}
