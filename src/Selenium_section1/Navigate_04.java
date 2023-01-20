package Selenium_section1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate_04 {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver wd=new ChromeDriver();
		wd.navigate().to("https://www.apple.com/in/watch/");
		Thread.sleep(15000);
		wd.navigate().to("https://www.myntra.com/");
		//backward
		wd.navigate().back();
		//forward
		wd.navigate().forward();
		//refresh
		wd.navigate().refresh();
		
	}

}
