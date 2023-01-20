package TestNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test4 {
	@Test
	public void TC1() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Reporter.log("Hello TestNG this is my fourth program", true);
		
	}
	@Test
	public void TC2() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.myntra.com/");
		Reporter.log("Hello Myntra.. Is there any sale for today",true);
		Assert.fail();
		
	}
	@Test
	public void TC3() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Reporter.log("Flipkart open...",true);
		
	}
	@Test
	public void TC4() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.firstcry.com/");
		Reporter.log("Kids love Firstcry and Mommy too",true);
		Assert.fail();
	}
	

}
