package Scroll_hanhling;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class S2 {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver ref=new ChromeDriver();
		ref.get("https://www.amazon.in/");
		Thread.sleep(4000);
		JavascriptExecutor r=(JavascriptExecutor)ref;
		r.executeScript("window.scrollBy(0,2000)");
		Thread.sleep(4000);
		r.executeScript("window.scrollBy(0,-2000)");
		
	}

}
