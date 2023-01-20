package Robot_class;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class R2 {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.selenium.dev/");
		driver.manage().window().maximize();
		//create object of robot class
		Robot r=new Robot();
		//keypress
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		r.keyRelease(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(4000);
		
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		r.keyRelease(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(4000);
		
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		r.keyRelease(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(4000);
		
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		r.keyRelease(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(4000);
		
		//pageup
		r.keyPress(KeyEvent.VK_PAGE_UP);
		r.keyRelease(KeyEvent.VK_PAGE_UP);
		Thread.sleep(4000);
		
		r.keyPress(KeyEvent.VK_PAGE_UP);
		r.keyRelease(KeyEvent.VK_PAGE_UP);
		Thread.sleep(4000);
		
		r.keyPress(KeyEvent.VK_PAGE_UP);
		r.keyRelease(KeyEvent.VK_PAGE_UP);
		Thread.sleep(4000);
		
		r.keyPress(KeyEvent.VK_PAGE_UP);
		r.keyRelease(KeyEvent.VK_PAGE_UP);
		Thread.sleep(4000);
		
		driver.close();
		
		
		
		
	}

}
