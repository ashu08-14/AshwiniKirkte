package selenium_section2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Listbox_Handling02 {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://www.opencart.com/index.php?route=account/register");
		Thread.sleep(4000);
		d.findElement(By.xpath("//input[@id='input-username']")).sendKeys("ashu123");
		
		d.findElement(By.xpath("//input[@id='input-firstname']")).sendKeys("Ashwini");
		
		d.findElement(By.xpath("//input[@id='input-lastname']")).sendKeys("Kale");
		
		d.findElement(By.xpath("//input[@id='input-email']")).sendKeys("ashwinikale049@gmail.com");
		
		d.findElement(By.xpath("//input[@id='input-password']")).sendKeys("ashu@1234");
		
		
		WebElement country = d.findElement(By.xpath("//select[@id='input-country']"));
		//create object for select class
		Select s=new Select(country);
		Thread.sleep(4000);
		//use select method
		//s.selectByValue("11");
		//select by index
		//s.selectByIndex(13);
		//select by visible text
		s.selectByVisibleText("Canada");
		
	}

}
