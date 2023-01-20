package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Multibrowser {
	@Parameters("browsername")  //annotation
	@Test
	public void TC(String browsername) { //parameterized method
		//declared global variable
		WebDriver driver=null;  //runtime polymorphism
		//apply condition
		if(browsername.equals("Chrome")) {
			//for chrome browser
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
			
		}
		else if(browsername.equals("Firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Lenovo\\Downloads\\geckodriver-v0.32.0-win32\\geckodriver.exe");
			driver=new FirefoxDriver();
			
		}
		driver.get("https://www.amazon.in/");
		
		
	}

}
