package CSS_Selector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.findElement(By.cssSelector("input[id=\"username\"]")).sendKeys("student");
		driver.findElement(By.cssSelector("input[id=\"password\"]")).sendKeys("Password123");
		driver.findElement(By.cssSelector("button[id=\"submit\"]")).click();
	}

}
