package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleResultPage {
	
	
	public GoogleResultPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}


	
	
	
	@FindBy(xpath="//*[@id=\"rso\"]/div[2]/div/div[1]/div/div/div[1]/a/h3")
	public WebElement wikipedia;
	
	@FindBy(css="h1#firstHeading.firstHeading")
	public WebElement headOne;
	
	
	
	
	
}
