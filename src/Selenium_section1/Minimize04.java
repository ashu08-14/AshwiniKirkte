package Selenium_section1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Minimize04 {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver ref=new ChromeDriver();
        ref.get("https://web.whatsapp.com/");
        Thread.sleep(4000);
        ref.manage().window().maximize();
        Thread.sleep(4000);
        ref.manage().window().minimize();
	}

}
