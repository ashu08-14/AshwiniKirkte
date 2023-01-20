package TestNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test3 {
@Test
public void TC1() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.actitime.com/login.do");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	Reporter.log("Hello ActiTime",true);
}
@Test
public void TC2() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.selenium.dev/");
	Reporter.log("Selenium opens",true);
	
}
@Test
public void TC3() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.youtube.com/");
	Reporter.log("How are you...",true);
	Assert.fail();
	
}
}
