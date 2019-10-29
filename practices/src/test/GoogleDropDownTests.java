package test;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import pages.GoogleDropDown;
import pages.GooglePage;
import utilities.BaseTests;

public class GoogleDropDownTests extends BaseTests{
	
	

	@Test
	public void goInside() {
		
    driver.get("https://google.com/");
    
    GooglePage googlePage=new GooglePage(driver);
    googlePage.searchInput.sendKeys("windsor fashions");
    googlePage.searchButton.click();  
    		  
    
    GoogleDropDown googleDropDown=new GoogleDropDown(driver);
    googleDropDown.linkDropDown.click();
	
	Assert.assertTrue(googleDropDown.logo.getAttribute("alt").contains("Windsor"));
	}
	
	@Test 
	public void selectValue() throws Exception {
		
	    GoogleDropDown googleDropDown=new GoogleDropDown(driver);

        googleDropDown.accountDD.click();
        Thread.sleep(1000);
	    googleDropDown.wishList.click();
      
        
	}
	
	
	
	
		
		
		
	
}
