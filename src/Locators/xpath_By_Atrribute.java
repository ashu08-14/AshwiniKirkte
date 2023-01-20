package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath_By_Atrribute {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		//enter username
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
		//enter password
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		//click on login
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		//verify use should navigate to homepage
		String expT="actiTIME - Login";
		String actT = driver.getTitle();
		System.out.println(actT);
		if(expT.equals(actT)) {
			System.out.println("TC is pass");
		}
		else {
			System.out.println("TC is fail");
		}
	}

}
