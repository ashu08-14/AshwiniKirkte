package TestNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test5 {
	@Test
	public void TC1() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.selenium.dev/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Reporter.log("hello TestNG this is final program",true);
	}
	@Test
	public void TC2() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		Reporter.log("Hello Google How are you",true);
		Assert.fail();
		
	}
	@Test
	public void TC3() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Reporter.log("Amazon sale is going on",true);
		
	}
	@Test
	public void TC4() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.com/");
		Reporter.log("hello youtube play newly launch songs",true);
		Assert.fail();
	}
	@Test
	public void TC5() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/maps/@18.8154265,76.7747674,7z");
		Reporter.log("Hello siri...Search for NASHIK on the map",true);
		
	}

}
