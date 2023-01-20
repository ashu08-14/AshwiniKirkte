package Selenium_section1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate_01 {public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver d=new ChromeDriver();
	d.navigate().to("https://www.espncricinfo.com/");
	Thread.sleep(10000);
	d.navigate().to("https://www.aajtak.in/");
	//backward
	d.navigate().back();
	//forward
	d.navigate().forward();
	//refresh
	d.navigate().refresh();
	
}

}
