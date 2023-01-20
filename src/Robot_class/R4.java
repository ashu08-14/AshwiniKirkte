package Robot_class;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class R4 {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver a=new ChromeDriver();
		a.get("https://www.imdb.com/title/tt0795176/");
		a.manage().window().maximize();
		Robot t=new Robot();
		t.keyPress(KeyEvent.VK_PAGE_DOWN);
		t.keyRelease(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(4000);
		
		t.keyPress(KeyEvent.VK_PAGE_DOWN);
		t.keyRelease(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(4000);
		
		t.keyPress(KeyEvent.VK_PAGE_DOWN);
		t.keyRelease(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(4000);
		
		t.keyPress(KeyEvent.VK_PAGE_DOWN);
		t.keyRelease(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(4000);
		
		//pageup
		t.keyPress(KeyEvent.VK_PAGE_UP);
		t.keyRelease(KeyEvent.VK_PAGE_UP);
		Thread.sleep(4000);
		
		t.keyPress(KeyEvent.VK_PAGE_UP);
		t.keyRelease(KeyEvent.VK_PAGE_UP);
		Thread.sleep(4000);
		
		t.keyPress(KeyEvent.VK_PAGE_UP);
		t.keyRelease(KeyEvent.VK_PAGE_UP);
		Thread.sleep(4000);
		
		t.keyPress(KeyEvent.VK_PAGE_UP);
		t.keyRelease(KeyEvent.VK_PAGE_UP);
		Thread.sleep(4000);
		
		a.close();
		
	}

}
