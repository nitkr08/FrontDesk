package Scenario_component;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.Test;
import Generic_Component.base_Class;
import PageObject_Component.pageObject_login;

public class TC_001Login extends base_Class {
		
	@Test
	public static void test_case1() throws IOException, InterruptedException
	{
		init_browser();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		pageObject_login obj = new pageObject_login(driver);
		obj.enter_username();
		obj.enter_password();
		obj.click_login_button();
	
		//use_assert();
		//assertion.assertEquals(driver.getTitle(), "Fo");
		obj.click_FortuneCloud();
		//obj.hamburger_mouseover();
		//assertion.assertAll();
	}
	
	
}
