package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath_By_Atrribute04 {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(4000);
		d.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		d.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		d.findElement(By.xpath("//button[@type='submit']")).click();
		String Expt="OrangeHRM";
		String actT = d.getTitle();
		System.out.println(actT);
		if(Expt.equals(actT)) {
			System.out.println("TC is pass");
			
		}
		else {
			System.out.println("TC is fail");
		}
	}

}
