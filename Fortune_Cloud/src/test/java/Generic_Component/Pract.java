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
//		driver.findElement(By.linkText("Logout")).click();

		
	}

}
