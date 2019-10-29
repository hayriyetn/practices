package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.GooglePage;
import pages.GoogleResultPage;
import utilities.BaseTests;

public class GoogleResultPageTests extends BaseTests{
	
//	private WebDriver driver;
	
	@Test
	public void resultTest() {
		
	driver.get("https://google.com/");
		
	GooglePage googlePage=new GooglePage(driver);
    googlePage.searchInput.sendKeys("testing");	
    googlePage.searchButton.click();
    
	

	 
 
   GoogleResultPage googleResultPage=new GoogleResultPage(driver);
   googleResultPage.wikipedia.click();
  System.out.println( googleResultPage.headOne.getText());
   
  Assert.assertEquals(googleResultPage.headOne.getText(), "Software testing");
    
    
    
 
	}
	}


