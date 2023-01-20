package Scroll_hanhling;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class S1 {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.selenium.dev/");
		Thread.sleep(4000);
		JavascriptExecutor ref=(JavascriptExecutor)driver;
		ref.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(4000);
		ref.executeScript("window.scrollBy(0,-1000)");
	}

}
