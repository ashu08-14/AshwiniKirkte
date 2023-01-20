package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath_By_Atrribute03 {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("student");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Password123");
		driver.findElement(By.xpath("//button[@id='submit']")).click();
		//verify user should navigate to homepage
		String ExpT="Logged In Successfully | Practice Test Automation";
		String actT = driver.getTitle();
		System.out.println(actT );
		if(ExpT.equals(actT)) {
			System.out.println("TC is pass");
			
		}
		else {
			System.out.println("TC is fali");
		}
	}

}
