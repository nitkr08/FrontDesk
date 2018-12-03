package Generic_Component;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

public class base_Class {
	public static String Code_data0;
	public static String Name_data0;
	public static WebDriver driver;
	public static Properties prop;
	public static Actions Act;
	public static SoftAssert assertion;
	public static WebDriverWait exp_wait;
	
	public static void property_call() throws IOException
	{
		FileInputStream prop_file = new FileInputStream("D:\\Fortune_Cloud\\src\\test\\java\\dataprovider.properties");
		prop = new Properties();
		prop.load(prop_file);
	}
	
	
	public static void init_browser() throws IOException, InterruptedException
	{
		property_call();
		
		if(prop.getProperty("browser").contains("firefox"))
		{
			driver = new FirefoxDriver();
		}
		else if (prop.getProperty("browser").contains("chrome"))
		{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sanu\\Downloads\\JAR files\\chromedriver_win32\\chromedriver.exe");
	    driver = new ChromeDriver();
		}
		else
		{
			driver = new InternetExplorerDriver();
		}
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		}
		public static void use_mouse(){
			Act= new Actions(driver);
		}
		public static void use_assert(){
			assertion=new SoftAssert();
		}
		public static void explicit_wait(){
			WebDriverWait exp_wait=new WebDriverWait(driver,50);
		}
		public static void readExcel() throws Exception{
			File src=new File("D:\\Fortune_Cloud\\TestData.xlsx");
			FileInputStream fis=new FileInputStream(src);
			XSSFWorkbook wb=new XSSFWorkbook(fis);//for xls file HSSFWorkbook wb=new HSSFWorkbook(fis); 
			XSSFSheet sh1=wb.getSheetAt(0);
			int rowCount=sh1.getLastRowNum();
			System.out.println(rowCount);
			for(int i=0;i<1;i++){
			Code_data0=sh1.getRow(i).getCell(0).getStringCellValue();
			Name_data0=sh1.getRow(i).getCell(1).getStringCellValue();
			}
		}
		
		public static void writeExcel() throws Exception{
			File src=new File("D:\\Fortune_Cloud\\TestData.xlsx");
			FileInputStream fis=new FileInputStream(src);
			XSSFWorkbook wb=new XSSFWorkbook(fis);//for xls file HSSFWorkbook wb=new HSSFWorkbook(fis); 
			XSSFSheet sh1=wb.getSheetAt(0);
			int rowCount=sh1.getLastRowNum();
			System.out.println(rowCount);
			for(int i=0;i<1;i++){
			sh1.getRow(i).createCell(2).setCellValue("Pass");
			FileOutputStream Fout=new FileOutputStream(src);
			wb.write(Fout);
			}
		}
		public static void takeSnapShot() throws IOException{
			Date date= new Date();
			SimpleDateFormat df= new SimpleDateFormat("yyyy-MM-dd hh-mm-ss");
			File file= new File(df.format(date)+".jpg");
			TakesScreenshot screenshot=(TakesScreenshot)driver;
			File screenshotAs = screenshot.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(screenshotAs, new File("D:\\Fortune_Cloud\\ScreenShots" +"-"+"-"+file));
		}
}
