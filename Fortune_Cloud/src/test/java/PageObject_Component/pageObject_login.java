package PageObject_Component;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Generic_Component.base_Class;

public class pageObject_login extends base_Class {
	
	//2. All page webElements
	
	@FindBy(xpath=".//*[@id='md-input-0-input']")
	public WebElement user_name;
	
	@FindBy(xpath=".//*[@id='md-input-1-input']") 
	public WebElement password;
	
	@FindBy(className="login-button")
	public WebElement login_button;
	
	@FindBy(xpath=".//*[@id='Front Desk']/div[1]/img")
	public WebElement click_FortuneCloud;
	
	@FindBy(xpath=".//button[@class='toggle-button-first']")
	public WebElement hamburger_mouseover;
	
	@FindBy(xpath=".//*[@class='fa fa-chevron-down']")
	public WebElement Down_arrow;
	
	@FindBy(linkText="Logout")
	public WebElement logout_click;
	
	
	
//	@FindBy(linkText="Front Office")
//	public WebElement click_Frontoffice;
	
	@FindBy(xpath="//label[@_ngcontent-c0=''][text()='Configuration']")
	public WebElement configuration;


	//1. Initialize page factory
	
	public pageObject_login(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//3. Actions
	
	public void enter_username() throws IOException
	{
		property_call();
		user_name.sendKeys(prop.getProperty("user_name"));
	}
	public void enter_password() throws IOException
	{
		property_call();
		password.sendKeys(prop.getProperty("password"));
	}
	
	public void click_login_button() 
	{
		login_button.click();
		
	}
	public void click_FortuneCloud(){
		
		click_FortuneCloud.click();
	}
	
	public void hamburger_mouseover()  {
		
		use_mouse();
		Act.moveToElement(hamburger_mouseover).build().perform();
		//click_Frontoffice.click();
		configuration.click();	
	}
	
	public void loggedout(){
		
		Down_arrow.click();
		logout_click.click();
		
	}
	
}
