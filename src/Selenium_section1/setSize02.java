package Selenium_section1;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class setSize02 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://www.msn.com/en-in/health/fitness?ocid=msedgdhphdr");
		// create object of Dimension class
		Dimension dn=new Dimension(200, 300);
		
		//use setSize methos
		d.manage().window().setSize(dn);
		
		
	}

}
