package test;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.GoogleImagesPage;
import pages.GooglePage;
import utilities.BaseTests;

public class GoogleImagesPageTests extends BaseTests {

	//private WebDriver driver;

	@Test
	public void mapCheck() {
		
     driver.get("https://google.com/");
    //goHome();
     
     GooglePage googlePage=new GooglePage(driver);
  	 googlePage.searchInput.sendKeys("bags");
     googlePage.searchButton.click();
  	
     GoogleImagesPage googleImagesPage=new GoogleImagesPage(driver);
   
      Assert.assertTrue( googleImagesPage.images.isDisplayed());
     
    
   
 
}
}