package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath_By_Atrribute01 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		// enter username
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("problem_user");
		//enter password
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
		//click on login
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		//verify the use should navigate to homepage
		String expT="Swag Labs";
		String actT = driver.getTitle();
		System.out.println(actT);
		if (expT.equals(actT)) {
			System.out.println("TC is pass");
		}
		else
			System.out.println("TC is fail");
	}

}
