package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class GoogleImagesPage {

	public GoogleImagesPage (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	

	
	@FindBy(id="platop1")
	public WebElement images;
		
}



