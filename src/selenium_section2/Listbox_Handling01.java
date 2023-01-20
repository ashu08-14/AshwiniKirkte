package selenium_section2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Listbox_Handling01 {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.sugarcrm.com/au/request-demo/");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[@id='CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("ashwinikale049@gmail.com");
		Thread.sleep(4000);
		WebElement employeename = driver.findElement(By.xpath("//select[@name='employees_c']"));
		//create object of select class
		Select s=new Select(employeename);
		Thread.sleep(4000);
		//use select class method
		//s.selectByValue("level2");
		//use select by visible text
		s.selectByVisibleText("1,001 - 2,500 employees");
	    WebElement hear = driver.findElement(By.xpath("//select[@id='how-select']"));
		Thread.sleep(4000);
		//create object of select class
		Select t=new Select(hear);
		Thread.sleep(4000);
		//use select class method
		//t.selectByValue("YouTube"); 
		//use select by visible text
		t.selectByVisibleText("Other");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id='doi0']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@class='element-container my-2 btn btn-primary']")).click();
		
		
	}

}

