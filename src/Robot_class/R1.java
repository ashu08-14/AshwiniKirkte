package Robot_class;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class R1 {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver wd=new ChromeDriver();
		wd.get("https://www.youtube.com/");
		wd.manage().window().maximize();
		//create object for robot class
		Robot r=new Robot();
		//keypress
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		//keyrelease
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
		
		wd.close();
		
	}

}
