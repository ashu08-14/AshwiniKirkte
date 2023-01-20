package Selenium_section1;


import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class setPossition02 {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://www.actitime.com/");
		//create object of point class
		Point p=new Point(200, 300);
		//use setPossition method
		d.manage().window().setPosition(p);
		
	}

}
