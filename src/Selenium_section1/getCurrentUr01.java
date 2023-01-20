package Selenium_section1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getCurrentUr01 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		//maximize
		driver.manage().window().maximize();
		//get current url
		String ref = driver.getCurrentUrl();
		System.out.println(ref);
	}

}
