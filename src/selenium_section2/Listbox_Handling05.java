package selenium_section2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Listbox_Handling05 {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/account");
	/*	Thread.sleep(4000);
		WebElement account = d.findElement(By.xpath("//select[@id='accountSelect']"));
		
		Select s=new Select(account);
		Thread.sleep(4000);
		s.selectByValue("ng-binding"); */
	}

}
