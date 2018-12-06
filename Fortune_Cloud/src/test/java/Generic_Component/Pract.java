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
	public void Prcdemo(){
		My name is Nitish kumar
		My name is Surbhi
		WebDriver driver=new FirefoxDriver();
		driver.get("https://productsqa.idsnext.com");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.id("md-input-0-input")).sendKeys("********");
		driver.findElement(By.id("md-input-1-input")).sendKeys("********");
		driver.findElement(By.className("login-button")).click();
		driver.findElement(By.xpath(".//*[@id='Front Desk']")).click();
		driver.findElement(By.xpath(".//*[@id='menusearch']/div/input")).sendKeys("Account type");
		driver.findElement(By.xpath(".//*[@id='menusearch']/div/input")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath(".//*[@id='menusearch']/div/input")).sendKeys(Keys.ENTER);
		
		driver.findElement(By.xpath(".//*[@class='custom-tbody']/tr[1]/td[1]")).click();
		
//		driver.findElement(By.xpath(".//*[@class='fa fa-chevron-down']")).click();
//		System.out.println("arrow mark");
		driver.findElement(By.linkText("Logout")).click();
		
		
		
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

		
	}

}
