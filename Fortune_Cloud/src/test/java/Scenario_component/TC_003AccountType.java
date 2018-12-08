package Scenario_component;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import Generic_Component.base_Class;
import PageObject_Component.pageObject_AccountType;
import PageObject_Component.pageObject_login;

public class TC_003AccountType extends base_Class{
	
	public pageObject_AccountType  AccountType;
	
	@BeforeClass(description="Testing of Account Type Started")
	public void start_Accounttype() throws IOException, InterruptedException{
			
		TC_001Login.test_case1();
		AccountType=new pageObject_AccountType(driver);
	}
	
	@Test(priority=1,description="Open Acccount type by entering Account type in search field")
	public void open_AccountType(){
		
		AccountType.enter_AccountTypePOM();
	}
	
	@Test(priority=2,description="Create Record at Group level")
	public void CreateGroupRecord() throws Exception{
		//driver.findElement(By.xpath(".//*[@for='radio-2']")).click();
		AccountType.click_createButtonPOM();
		base_Class.readExcel();
		AccountType.enterCodePOM();
		AccountType.enterNamePOM();
		AccountType.clickOnSavePOM();
	}
	
	@Test(priority=3,description="Edit Record at Group level")
	public void EditGroupRecord() throws InterruptedException{
		AccountType.Edit_Operation();
	}
	
	@Test(priority=5,description="Copy Record from Group to property")
	public void CopyFromMaster() throws Exception{
		CreateGroupRecord();
		AccountType.CopyFromMaster();
	}
	
	@Test(priority=4,description="Delete first record from Group")
	public void DeleteGroupRecord() throws Exception{
		AccountType.clickOnDeletePOM();	
	}
	
	@AfterClass(description="logout from application")
	public void logout_from_application() throws InterruptedException{
		pageObject_login log=new pageObject_login(driver);
		Thread.sleep(3000);
		log.loggedout();
		driver.quit();
	}
}
