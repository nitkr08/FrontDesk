package Scenario_component;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import Generic_Component.base_Class;
import PageObject_Component.pageObject_AccountType;
import PageObject_Component.pageObject_login;

public class TC_003AccountType extends base_Class{
	
	public pageObject_AccountType  AccountType;
	@BeforeClass
	public void start_Accounttype() throws IOException, InterruptedException{
	System.out.println("Testing of Account Type Started");	
	TC_001Login.test_case1();
	AccountType=new pageObject_AccountType(driver);
	}
	@Test(priority=1)
	public void open_AccountType(){
		System.out.println("Enter Account Type in search field");
		AccountType.enter_AccountTypePOM();
		WebElement btn_Group=driver.findElement(By.xpath(".//*[@for='radio-1']"));
		Boolean Btn_selected_Group=btn_Group.isDisplayed();
		WebElement btn_Property=driver.findElement(By.xpath(".//*[@for='radio-2']"));
		Boolean Btn_Displayed_property=btn_Property.isDisplayed();
		use_assert();
		assertion.assertTrue(Btn_selected_Group, "Button is selected");
		assertion.assertTrue(Btn_Displayed_property, "Property radio is displayed");
		assertion.assertAll();
		
	}	
	@Test(priority=2)
	public void clickOnCreatebutton() throws Exception{
		System.out.println("Click on create button");
		
		AccountType.click_createButtonPOM();
	}
	@Test(priority=3)
	public void code_AccountType() throws Exception{
		base_Class.readExcel();
		AccountType.enterCodePOM();
	}
	@Test(priority=4)
	public void Name_AccountType() throws Exception{
		AccountType.enterNamePOM();
	}
	@Test(priority=5)
	public void ClickSave() throws Exception{
		AccountType.clickOnSavePOM();
		//base_Class.takeSnapShot();
		//base_Class.writeExcel();//Writing in excel after saving record.	
	}
	
	@Test(priority=6)
	public void Edit_Group() throws InterruptedException{
		String Before_xapth=".//*[@id='side-menu']/div[2]/main/section/app-account-type/div/div[4]/div/div[1]/div/div/div[1]/div/table/tbody/tr[";
		String After_xpath="]/td[2]";
		//for(int i=1;i<=10;i++){
		String abc=driver.findElement(By.xpath(Before_xapth+1+After_xpath)).getText();
		driver.findElement(By.xpath(Before_xapth+1+After_xpath)).click();
		driver.findElement(By.xpath(".//*[@class='icon-edit card-edit']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(".//*[@id='mdname']")).clear();
		driver.findElement(By.xpath(".//*[@id='mdname']")).sendKeys("Code25");
		driver.findElement(By.xpath(".//*[@class='icon-tick-inside-circle card-save']")).click();
		driver.findElement(By.xpath(".//*[text()='Back']")).click();
	
		System.out.println(abc);
		//}	
	}
	
//	@Test(priority=7)
//	public void Delete_Group(){
//		AccountType.clickOnDeletePOM();	
//	}
//	
//	@AfterClass
//	public void logout_from_application() throws InterruptedException{
//		pageObject_login log=new pageObject_login(driver);
//		Thread.sleep(5000);
//		log.loggedout();
//		driver.quit();
//	}
}
