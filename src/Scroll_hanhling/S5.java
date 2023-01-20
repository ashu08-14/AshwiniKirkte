package Scroll_hanhling;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class S5 {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver wd= new ChromeDriver();
		wd.get("https://www.youtube.com/");
		wd.manage().window().maximize();
		Thread.sleep(4000);
		JavascriptExecutor je=(JavascriptExecutor)wd;
		je.executeScript("window.scrollBy(0,3000)");
		Thread.sleep(4000);
		je.executeScript("window.scrollBy(0,-3000)");
	}

}
