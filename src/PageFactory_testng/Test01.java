package PageFactory_testng;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test01 {
	Sheet sh;
	WebDriver driver;
	LoginPage l;
	HomePage h;
	
	@BeforeClass 
	public void openBrowser() throws Throwable {
		FileInputStream fis=new FileInputStream("C:\\Users\\Lenovo\\OneDrive\\Documents\\Book1.xlsx");
		 sh = WorkbookFactory.create(fis).getSheet("Sheet1");
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.get("https://demo.actitime.com/login.do");
		 
		 // all objects we need to create
		  l=new LoginPage(driver);
		  h=new HomePage(driver);
		  
	}
	@BeforeMethod
	public void openApp() {
		 String username = sh.getRow(0).getCell(0).getStringCellValue();
		 l.enterUN(username);
		 String password = sh.getRow(0).getCell(1).getStringCellValue();
		 l.enterPWD(password);
		 l.clickLoginBtn();
	}
	@Test
	public void verifyText() {
		Reporter.log("running verifyText",true);
		String expText = sh.getRow(0).getCell(2).getStringCellValue();
		String actText=h.verifyText();
		Assert.assertEquals(expText, actText);
		
	}
	@AfterMethod
	public void logout() {
		Reporter.log("logout from app",true);
		l.logOut();
	}
	@AfterClass
	public void closeBrowser() {
		Reporter.log("close the browser",true);
		driver.close();
		
	}
	

}
