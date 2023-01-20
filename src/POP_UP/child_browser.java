package POP_UP;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class child_browser {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		//click on cancel button
		driver.findElement(By.xpath("//button[text()=\"✕\"]")).click();
		//search any mobile
		driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("mobile under 20000",Keys.ENTER);
		Thread.sleep(4000);
		//click on 1st phone
		driver.findElement(By.xpath("//div[@class='_4rR01T']")).click();
		//switch the control
		Thread.sleep(4000);
		Set<String> allwindows = driver.getWindowHandles();
		//create object of Arraylist
		ArrayList<String>al=new ArrayList<String>(allwindows);
		//print the main window id
		String mainid=al.get(0);
		System.out.println(mainid);
		//switch to the child window
		driver.switchTo().window(al.get(1));
		//print session id
		String cwind=al.get(1);
		System.out.println(cwind);
		Thread.sleep(4000);
		String title = driver.getTitle();
		System.out.println(title);
		
	}

}
