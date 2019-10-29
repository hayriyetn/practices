package test;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.GooglePage;
import pages.GoogleSettingFunction;
import utilities.BaseTests;

public class GoogleSettingFunctionsTests extends BaseTests{

	@Test
	public void settingTest() {
	
	
	
	driver.get("https://google.com/");
	
	
	GoogleSettingFunction googleSettingFunction=new GoogleSettingFunction(driver);
	googleSettingFunction.settingButton.click();
	
	}
	
	@Test
	public void settingHistory() {
		
		GoogleSettingFunction googleSettingFunction= new GoogleSettingFunction(driver);
		
		String historyText="History";
		String actual=googleSettingFunction.history.getText();
	
		Assert.assertTrue(actual.contains(historyText));
	}
}