package Selenium_section1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Minimize01 {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver d=new ChromeDriver();
        d.get("https://www.google.com/maps/");
        Thread.sleep(4000);
        d.manage().window().maximize();
        Thread.sleep(4000);
        d.manage().window().minimize();
	}

}
