package Selenium_section1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate_02 {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver wd=new ChromeDriver();
		wd.navigate().to("https://www.natgeotv.com/");
		Thread.sleep(4000);
		wd.navigate().to("https://www.imdb.com/title/tt0795176/");
		//backward
		wd.navigate().back();
		//forward
		wd.navigate().forward();
		//refresh
		wd.navigate().refresh();
	}

}
