package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath_By_Atrribute02 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.applitools.com/");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("ashwini08");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("ashu1234");
		driver.findElement(By.xpath("//a[@id='log-in']")).click();
		String expT="ACME demo app";
		String actT = driver.getTitle();
		System.out.println(actT);
		if (expT.equals(actT)) {
			System.out.println("TC is pass");
		}
		else
			System.out.println("TC is fail");
		

	}

}
