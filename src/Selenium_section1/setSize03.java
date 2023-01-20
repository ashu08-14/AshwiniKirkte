package Selenium_section1;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class setSize03 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://www.irctc.co.in/nget/train-search");
		//create object of Dimension class
		Dimension s=new Dimension(300, 400);
		
		// use setSize method
		d.manage().window().setSize(s);
		
	}

}
