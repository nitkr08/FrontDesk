package Generic_Component;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Pract {
	
	@Test
	public void Prcdemo() throws InterruptedException{
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://productsqa.idsnext.com");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.id("md-input-0-input")).sendKeys("nitish.kumar@idsnext.com");
		driver.findElement(By.id("md-input-1-input")).sendKeys("1234@quality");
		driver.findElement(By.className("login-button")).click();
		driver.findElement(By.xpath(".//*[@id='Front Desk']")).click();
		driver.findElement(By.xpath(".//*[@id='menusearch']/div/input")).sendKeys("Account");
		driver.findElement(By.xpath(".//*[@id='menusearch']/div/input")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath(".//*[@id='menusearch']/div/input")).sendKeys(Keys.ENTER);
		
		
		driver.findElement(By.xpath(".//*[@title='Copy From Master']")).click();
		driver.findElement(By.xpath(".//*[@class='col s12 col m12 col l12']/div[1]/md-card/div/div/table/tbody/tr[1]/td[1]")).click();
//		List<WebElement> check_box=driver.findElements(By.xpath(".//*[@class='cp-check-width']"));
//		check_box.get(1).click();
		
		driver.findElement(By.xpath("//*[@class='icon-Move-to-Property cp-right']")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@class='col s12 col m12 col l12']/div[2]/md-card/div/div/table/tbody/tr[1]/td[1]")).click();
		driver.findElement(By.xpath("//*[@class='icon-Move-to-Group cp-left']")).click();
		
		
		
//		driver.findElement(By.xpath(".//*[@class='custom-tbody']/tr[1]/td[1]")).click();
//		driver.findElement(By.xpath(".//*[@class='fa fa-chevron-down']")).click();		
//		driver.findElement(By.linkText("Logout")).click();
		
		
		
//		String Before_xapth=".//*[@id='side-menu']/div[2]/main/section/app-account-type/div/div[4]/div/div[1]/div/div/div[1]/div/table/tbody/tr[";
//		String After_xpath="]/td[2]";
//		//for(int i=1;i<=10;i++){
//		String abc=driver.findElement(By.xpath(Before_xapth+1+After_xpath)).getText();
//		driver.findElement(By.xpath(Before_xapth+1+After_xpath)).click();
//		driver.findElement(By.xpath(".//*[@class='icon-edit card-edit']")).click();
//		Thread.sleep(5000);
//		driver.findElement(By.xpath(".//*[@id='mdname-input']")).clear();
//		driver.findElement(By.xpath(".//*[@id='mdname-input']")).sendKeys("Code25");
//		driver.findElement(By.xpath(".//*[@class='icon-tick-inside-circle card-save']")).click();
//		explicit_wait();
//		driver.findElement(By.xpath(".//*[text()='Back']")).click();
//		driver.findElement(By.xpath(".//*[text()='Yes']")).click();
//	
//		System.out.println(abc);
//		//}	
		
		
		
		
//		WebElement btn_Group=driver.findElement(By.xpath(".//*[@for='radio-1']"));
//		Boolean Btn_selected_Group=btn_Group.isDisplayed();
//		WebElement btn_Property=driver.findElement(By.xpath(".//*[@for='radio-2']"));
//		Boolean Btn_Displayed_property=btn_Property.isDisplayed();
//		use_assert();
//		assertion.assertTrue(Btn_selected_Group, "Button is selected");
//		assertion.assertTrue(Btn_Displayed_property, "Property radio is displayed");
//		assertion.assertAll();

		
	}

}
