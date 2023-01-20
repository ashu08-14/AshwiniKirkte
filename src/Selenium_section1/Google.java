package Selenium_section1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		//enter username 
		driver.findElement(By.id("username")).sendKeys("admin");
		//enter password
		driver.findElement(By.name("pwd")).sendKeys("manager");
		//click on login button
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		driver.get("https://demo.actitime.com/user/submit_tt.do");
		//expected title
		String expT="actiTIME - Enter Time-Track";
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
