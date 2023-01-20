package Selenium_section1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.naukri.com/");
		Thread.sleep(15000);
		driver.navigate().to("https://www.facebook.com/");
		//backward
		driver.navigate().back();
		//forward
		driver.navigate().forward();
		//refresh
		driver.navigate().refresh();
		
	}

}
