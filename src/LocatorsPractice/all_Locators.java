package LocatorsPractice;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class all_Locators {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.opencart.com/index.php?route=account/register");
		Thread.sleep(4000);
		//window maximize
		driver.manage().window().maximize();
		Thread.sleep(4000);
		// use setSize
		Dimension d=new Dimension(500, 500);
		driver.manage().window().setSize(d);
		Thread.sleep(4000);
		// use setPossition
		Point p=new Point(400, 400);
		driver.manage().window().setPosition(p);
		Thread.sleep(4000); 
		//set dropDown
		WebElement we = driver.findElement(By.xpath("//select[@id='input-country']"));
		Select s=new Select(we);
		//select by text
		s.selectByVisibleText("Austria");
		Thread.sleep(4000); 
		//window maximize
		driver.manage().window().maximize();
		Thread.sleep(4000); 
		//inter un,pwd,email usind keys class
		driver.findElement(By.xpath("//input[@id='input-username']")).sendKeys("ashu123",Keys.TAB,"Ashwini",Keys.TAB,"Kale",Keys.TAB,"ashwinikale049@gmail.com",Keys.TAB,Keys.TAB,"ashu@1234",Keys.ENTER);
		Thread.sleep(4000);
		//scroll using Robot class
		//create object of Robot class
		Robot b=new Robot();
		//KeyPress
		b.keyPress(KeyEvent.VK_PAGE_DOWN);
		//keyRelease
		b.keyRelease(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(4000);
		
		//KeyPress
		b.keyPress(KeyEvent.VK_PAGE_DOWN);
		//keyRelease
		b.keyRelease(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(4000);
		
		//for pageUp
		//KeyPress
		b.keyPress(KeyEvent.VK_PAGE_UP);
		//keyRelease
		b.keyRelease(KeyEvent.VK_PAGE_UP);
		Thread.sleep(4000);
		
		//KeyPress
		b.keyPress(KeyEvent.VK_PAGE_UP);
		//keyRelease
		b.keyRelease(KeyEvent.VK_PAGE_UP);
		Thread.sleep(4000);
		//scroll down by using scroll handling
		JavascriptExecutor ref=(JavascriptExecutor)driver;
		ref.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(4000);
		ref.executeScript("window.scrollBy(0,-1000)");
		//refresh page
		Thread.sleep(4000);
		driver.navigate().refresh();
		//close the page
		Thread.sleep(6000);
		driver.close(); 
		
		
		
		
		
		
		
		
	}

}
