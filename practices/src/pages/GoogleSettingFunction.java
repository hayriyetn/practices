package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleSettingFunction {

	public GoogleSettingFunction(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(css="a[href='https://www.google.com/preferences?hl=en']")
	public WebElement settingButton;
	
	//@FindBy(xpath="//a[@role='menuitem'][4]")
	@FindBy (css="span #fsett a:nth-child(4)")
	public WebElement history;
	
	
	
	
	
}
