package Key_class;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://practicetestautomation.com/practice-test-login/");
		d.findElement(By.xpath("//input[@id='username']")).sendKeys("student",Keys.TAB,"Password123",Keys.TAB, Keys.ENTER);
	}

}
