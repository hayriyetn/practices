package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.GoogleImagesPage;
import pages.GooglePage;
import utilities.BaseTests;

public class GooglePageTests extends BaseTests{
    
	//private WebDriver driver;
	
	@Test
	public void firstTest() {
				
	driver.get("https://google.com/");
	
	//Create object from GooglePage class
	
	GooglePage googlePage=new GooglePage(driver);
	
	
	googlePage.searchInput.sendKeys("testing");
    googlePage.searchButton.click();
	

//   Assert.assertTrue(googlePage.settingButton.isDisplayed());	
   Assert.assertTrue(driver.getTitle().contains("Search"));
	}
	
   }