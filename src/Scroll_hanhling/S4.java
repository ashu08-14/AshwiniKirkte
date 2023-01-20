package Scroll_hanhling;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class S4 {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver d= new ChromeDriver();
		d.get("https://www.tensportstv.com/");
		Thread.sleep(4000);
		JavascriptExecutor js=(JavascriptExecutor)d;
		
		js.executeScript("window.scrollBy(0,3000)");
		Thread.sleep(4000);
		js.executeScript("window.scrollBy(0,-3000)");
	}

}