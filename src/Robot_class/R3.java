package Robot_class;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class R3 {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver ref=new ChromeDriver();
		ref.get("https://www.firstcry.com/");
		ref.manage().window().maximize();
		//create object of robot class
		Robot b=new Robot();
		b.keyPress(KeyEvent.VK_PAGE_DOWN);
		b.keyRelease(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(4000);
		
		b.keyPress(KeyEvent.VK_PAGE_DOWN);
		b.keyRelease(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(4000);
		
		b.keyPress(KeyEvent.VK_PAGE_DOWN);
		b.keyRelease(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(4000);
		
		//pageup
		b.keyPress(KeyEvent.VK_PAGE_UP);
		b.keyRelease(KeyEvent.VK_PAGE_UP);
		Thread.sleep(4000);
		
		b.keyPress(KeyEvent.VK_PAGE_UP);
		b.keyRelease(KeyEvent.VK_PAGE_UP);
		Thread.sleep(4000);
		
		b.keyPress(KeyEvent.VK_PAGE_UP);
		b.keyRelease(KeyEvent.VK_PAGE_UP);
		Thread.sleep(4000);
		
		ref.close();
	}

}
