package POP_UP;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_popup {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("ashu_08");
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		
		 //first of all we need to switch the control of selenium from webpage to popup
		Alert alt = driver.switchTo().alert();
		
		//alt.accept();
		//alt.dismiss();
		String ref = alt.getText();
		System.out.println(ref);
	}

}
