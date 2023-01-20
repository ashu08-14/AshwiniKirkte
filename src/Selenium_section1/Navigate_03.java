package Selenium_section1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate_03 {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver ref=new ChromeDriver();
		ref.navigate().to("https://www.ndtv.com/");
		Thread.sleep(10000);
		ref.navigate().to("https://www.cricbuzz.com/");
		//backward
		ref.navigate().back();
		//forward
		ref.navigate().forward();
		//refresh
		ref.navigate().refresh();
	}

}
