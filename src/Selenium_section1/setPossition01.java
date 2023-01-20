package Selenium_section1;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class setPossition01 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://youtube.com/");
		//create object of point
		Point p=new Point(300, 400);
		//use the setPossition method
		d.manage().window().setPosition(p);
		
		
		
	}

}
