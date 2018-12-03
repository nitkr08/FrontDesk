package Scenario_component;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import Generic_Component.base_Class;
import PageObject_Component.pageObject_CompanyProfile;


public class TC_002CompanyProfile extends base_Class{
	
	public pageObject_CompanyProfile  CompanyProfile;
	
	//Logger log=Logger.getLogger(TC_002CompanyProfile.class);
	
	@BeforeClass
	public void start_CompanyProfile() throws IOException, InterruptedException{

	//log.info("Company profile started");	
	System.out.println("Testing of Company Profile Started");	
	TC_001Login.test_case1();
	CompanyProfile=new pageObject_CompanyProfile(driver);
	

	}
	
	@Test(priority=1)
	public void open_CompanyProfile(){
		
		System.out.println("Enter Company Profile in search field");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		CompanyProfile.enter_CompanyProfile();
		
	}	
	
	@Test(priority=2)
	public void clickOnCreatebutton() throws InterruptedException{
		
		System.out.println("Click on create button");
		Thread.sleep(5000);
		CompanyProfile.click_createButton();
	}
	
	@Test(priority=3)
	public void selectClassification() throws InterruptedException{
		//Thread.sleep(5000);
		CompanyProfile.select_classification();
		System.out.println("success ");
	}

}
