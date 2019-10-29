package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
 
import utilities.BaseTests;

public class GooglePage {
	
	//if I create in here,I can define WebElement as a class
	//variable,so I don't need define it for every function
	
//	private WebDriver driver;
//	private By searchInput=By.xpath("//input[@name='q']");
 // private WebElement searchInput;
	
	
	
	public GooglePage (WebDriver driver) {
		//using the driver initialize or locate all elements in this class
		PageFactory.initElements(driver, this);
	}
	
	//Using @FindBy specify a way to locate the WebElement
	@FindBy(xpath="//input[@name='q']")
	public WebElement searchInput;
	
	@FindBy(xpath="//*[@id=\"tsf\"]/div[2]/div[1]/div[3]/center/input[1]")
	public WebElement searchButton;
	
	@FindBy(id="gbqfbb")
	public WebElement feelingButton;
	
	
	
}