package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleDropDown {
	
	public GoogleDropDown (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(css="a[href='https://www.windsorstore.com/'] h3")
	public WebElement linkDropDown;
	
	@FindBy(css="div.MobileLogo a img")
	public WebElement logo; 
	
	//css="div.PreHeader__btn-acount"
	@FindBy(xpath="//*[@id=\"shopify-section-INF-Header\"]/div[1]/div[3]/div/div[3]/div[1]")
	public WebElement accountDD;
	
	//css="div.PreHeader__dropdown-account.reveal :nth-child(2)"
	/*
	 * @FindBy(xpath=
	 * "//*[@id=\"shopify-section-INF-Header\"]/div[1]/div[3]/div/div[3]/div[2]/a[2]")
	 * public WebElement wishList;
	 */
	
	@FindBy(css= "div.PreHeader__dropdown-account.reveal :nth-child(2)")
    public WebElement wishList;
	



}