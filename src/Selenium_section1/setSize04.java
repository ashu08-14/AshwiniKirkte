package Selenium_section1;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class setSize04 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.msn.com/en-in/recipes?ocid=msedgdhphdr");
		//create object of Dimension class
		Dimension s=new Dimension(300, 400);
		
		//use setSize method
		driver.manage().window().setSize(s);
		
	}

}
