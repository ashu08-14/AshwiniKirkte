package Selenium_section1;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class setPossition03 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.msn.com/en-in/sports/football/fifa-world-cup?ocid=msedgdhphdr&cvid=c448e1ad1574412bc27273213e502b24");
		//create object for point class
		Point t=new Point(300, 400);
		// use setPossition method
		driver.manage().window().setPosition(t);
	}

}
