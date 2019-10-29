package test;

import org.testng.annotations.Test;

import pages.GoogleFeelingButton;
import utilities.BaseTests;

public class GoogleFeelingTests extends BaseTests{
	

@Test
public void testHoover() throws Exception {
	driver.get("https://google.com/");
	GoogleFeelingButton googleFeelingButton=new GoogleFeelingButton(driver);
	
	try {
		
		Thread.sleep(5000);
		
		googleFeelingButton.feelingButton.click();
		
	}catch(Exception e){
		
		System.out.print(e);
	}
}
}
