package Selenium_section1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Minimize {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		//open the browser
		d.get("https://mail.google.com/");
		//maximize
		d.manage().window().maximize();
		//java wait
		Thread.sleep(15000);
		//minimize the method
		d.manage().window().minimize();
		
		
	}


}
