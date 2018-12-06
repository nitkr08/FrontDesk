package PageObject_Component;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Generic_Component.base_Class;

public class pageObject_AccountType {
	
	//1. Initialize page factory
			public pageObject_AccountType(WebDriver driver)
			{
				PageFactory.initElements(driver, this);
			}
	//2. All page webElements
	@FindBy(xpath=".//*[@id='menusearch']/div/input")
	public WebElement search_fieldAccountTypeX;//Search field to enter account type
	
	@FindBy(xpath=".//*[@id='floating-button']/p")
	public WebElement createButtonX;//Click on create button
	
	@FindBy(xpath=".//input[@id='mdcode-input']")
	public WebElement enter_CodeTextX;//Enter code
	
	@FindBy(xpath=".//input[@id='mdname-input']")
	public WebElement enter_NameTextX;//Enter name
	
	@FindBy(xpath=".//button[text()='Save']")
	public WebElement save_buttonX;//click on save button
	
	@FindBy(xpath=".//*[@class='custom-tbody']/tr[1]/td[1]")
	public WebElement Select_checkbox;//select first check box at Group level
	
	@FindBy(xpath=".//*[@title='Delete']")
	public WebElement Delete_button;//click on delete button
	
	@FindBy(xpath=".//*[text()='Yes']")
	public WebElement Yes_button;//click on Yes button
	
	@FindBy(xpath=".//*[text()='OK']")
	public WebElement OK_button;//click on Ok button
	
	@FindBy(xpath=".//*[@id='side-menu']/div[2]/main/section/app-account-type/div/div[4]/div/div[1]/div/div/div[1]/div/table/tbody/tr[1]/td[2]")
	public WebElement First_value;
	
	@FindBy(xpath=".//*[@class='icon-edit card-edit']")
	public WebElement Edit_icon;
	
	@FindBy(xpath=".//*[@id='mdname-input']")
	public WebElement Name_field;
	
	@FindBy(xpath=".//*[@class='icon-tick-inside-circle card-save']")
	public WebElement Save_icon;
	
	@FindBy(xpath=".//*[text()='Back']")
	public WebElement Back_button;
	
	@FindBy(xpath=".//*[text()='Yes']")
	public WebElement Button_Yes;
	
	//2. Actions
	public void enter_AccountTypePOM(){
		search_fieldAccountTypeX.click();
		search_fieldAccountTypeX.sendKeys("Account Type");
		search_fieldAccountTypeX.click();
		//search_fieldAccountTypeX.sendKeys(Keys.ARROW_DOWN);
		search_fieldAccountTypeX.sendKeys(Keys.ENTER);
		
		}
	public void click_createButtonPOM() throws Exception{
		createButtonX.click();
	}
	public void enterCodePOM(){
		enter_CodeTextX.sendKeys(base_Class.Code_data0);
	}
	public void enterNamePOM(){
		enter_NameTextX.sendKeys(base_Class.Name_data0);
	}
	public void clickOnSavePOM(){
		save_buttonX.click();
	}
	public void clickOnDeletePOM(){
		Select_checkbox.click();
		Delete_button.click();
		Yes_button.click();
		OK_button.click();
	}
	
	public void Edit_Operation(){
		First_value.click();
		Edit_icon.click();
		Name_field.clear();
		Name_field.sendKeys("wwww");
		Save_icon.click();
		Back_button.click();
		Button_Yes.click();
		
		
	}
}
