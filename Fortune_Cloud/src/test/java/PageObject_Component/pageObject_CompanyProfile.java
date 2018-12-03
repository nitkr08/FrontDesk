package PageObject_Component;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
public class pageObject_CompanyProfile  {
	
	//2. All page webElements
	@FindBy(xpath=".//*[@id='menusearch']/div/input")
	public WebElement search_fieldCompanyProfile;
	
	@FindBy(xpath=".//*[@id='floating-button']/p")
	public WebElement createButton;
	
	@FindBy(xpath=".//span[@class='md2-select-placeholder']")
	public WebElement classification_dropDown;

	
	//1. Initialize page factory
	
		public pageObject_CompanyProfile(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
			
		}
			
	//3.Actions
		public void enter_CompanyProfile(){
				
			search_fieldCompanyProfile.sendKeys("Company Profile" + Keys.ENTER);
				
			}
		
		public void click_createButton(){
		
			createButton.click();
			
		}
		
		public void select_classification(){
		
			classification_dropDown.click();
		}	

}
