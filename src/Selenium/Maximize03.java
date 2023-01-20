package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Maximize03 {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver ref=new ChromeDriver();
		ref.get("https://mail.google.com/");
		Thread.sleep(4000);
		ref.manage().window().maximize();
	}

}
