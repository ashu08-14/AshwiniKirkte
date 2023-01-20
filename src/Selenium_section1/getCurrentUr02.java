package Selenium_section1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getCurrentUr02 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//enter url
		driver.get("https://www.amazon.in/");
		//maximize
		driver.manage().window().maximize();
		//get current url
		String d = driver.getCurrentUrl();
		System.out.println(d);
	}

}
