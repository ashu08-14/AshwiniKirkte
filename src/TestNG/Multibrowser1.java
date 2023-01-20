package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Multibrowser1 {
	@Parameters("selenium")
	@Test
	public void TC(String selenium) {
		WebDriver driver=null;
		if(selenium.equals("Chrome")){
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
			
		}
		else if(selenium.equals("Firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Lenovo\\Downloads\\geckodriver-v0.32.0-win32\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		driver.get("https://www.selenium.dev/");
	}

}
