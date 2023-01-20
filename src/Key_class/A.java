package Key_class;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//open the url
		driver.get("https://demo.actitime.com/login.do");
		//open the application using key class
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin",Keys.TAB,"manager",Keys.ENTER);
	}

}
