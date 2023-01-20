package Key_class;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A3 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver ref=new ChromeDriver();
		ref.get("https://www.saucedemo.com/");
		ref.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user",Keys.TAB,"secret_sauce",Keys.ENTER);
	}

}
