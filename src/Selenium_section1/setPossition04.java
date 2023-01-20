package Selenium_section1;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class setPossition04 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.msn.com/en-in/weather?ocid=msedgdhphdr");
		//create object of point class
		Point r=new Point(200, 300);
		//use setPossition method
		driver.manage().window().setPosition(r);
	}

}
