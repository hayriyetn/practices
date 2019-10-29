package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class GoogleFeelingButton extends GooglePage{
	
	WebDriver driver = null;
	public WebElement feelingButton;
	
	public GoogleFeelingButton(WebDriver driver) {
		super(driver);
	
	}
	
	public void feelingHooverOver () {
		
		
		
		Actions actions=new Actions(driver);
		
		actions.moveToElement(feelingButton).build().perform();
		
		
	}
	

}
