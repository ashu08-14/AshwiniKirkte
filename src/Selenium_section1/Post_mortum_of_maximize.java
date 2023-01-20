package Selenium_section1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class Post_mortum_of_maximize {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		//use option interface
	/*	Options opt = driver.manage();
		//use window interface
		Window win = opt.window();
		//maximize
		win.maximize(); */
		//method chaining
		driver.manage().window().maximize();
		
		
	}

}
