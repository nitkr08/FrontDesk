package PageObject_Component;

import java.util.List;
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
	
	@FindBy(xpath=".//*[@class='custom-tbody']/tr[1]/td[2]")
	public WebElement First_value;//first value of the list data table
	
	@FindBy(xpath=".//*[@class='icon-edit card-edit']")
	public WebElement Edit_icon;// Edit icon during edit operation
	
	@FindBy(xpath=".//*[@id='mdname-input']")
	public WebElement Name_field;//Name field during edit operation
	
	@FindBy(xpath=".//*[@class='icon-tick-inside-circle card-save']")
	public WebElement Save_icon;//save button during edit operation
	
	@FindBy(xpath=".//*[text()='Back']")
	public WebElement Back_button;//Back button during edit
	
	@FindBy(xpath=".//*[text()='Yes']")
	public WebElement Button_Yes;//Yes button of back pop-up
	
	@FindBy(xpath=".//*[@title='Copy From Master']")
	public WebElement Copy_from_master;//Copy From master
	
	@FindBy(xpath=".//*[@class='cp-check-width']")
	public List<WebElement> First_Check_box;//First check box selection

	@FindBy(xpath=".//*[@class='cp-p animated fadeInUp']")
	public List<WebElement> Move_to_Property;//Move to property
	
	//2. Actions
	//This method will land to Account type
	public void enter_AccountTypePOM(){
		search_fieldAccountTypeX.click();
		search_fieldAccountTypeX.sendKeys("Account Type");
		search_fieldAccountTypeX.click();
		//search_fieldAccountTypeX.sendKeys(Keys.ARROW_DOWN);
		search_fieldAccountTypeX.sendKeys(Keys.ENTER);
		
		}
	
	//This method will click on Create button
	public void click_createButtonPOM() throws Exception{
		createButtonX.click();
	}
	
	//This method will enter code
	public void enterCodePOM(){
		enter_CodeTextX.sendKeys(base_Class.Code_data0);
	}
	
	//This method will enter Name
	public void enterNamePOM(){
		enter_NameTextX.sendKeys(base_Class.Name_data0);
	}
	
	//This method will click on save button
	public void clickOnSavePOM(){
		save_buttonX.click();
	}
	
	//This method will delete record
	public void clickOnDeletePOM(){
		Select_checkbox.click();
		Delete_button.click();
		Yes_button.click();
		OK_button.click();
	}
	
	//This method will edit record
	public void Edit_Operation(){
		First_value.click();
		Edit_icon.click();
		Name_field.clear();
		Name_field.sendKeys("wwww");
		Save_icon.click();
		Back_button.click();
		Button_Yes.click();
			
	}
	
	//This method will take to copy from master
	public void CopyFromMaster(){
		Copy_from_master.click();
		First_Check_box.get(1).click();
		Move_to_Property.get(0).click();
		
	}
}
