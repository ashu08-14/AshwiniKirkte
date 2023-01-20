package selenium_section2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Listbox_Handling04 {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://www.facebook.com/");
		Thread.sleep(4000);
		 d.findElement(By.xpath("//a[text()='Create New Account']")).click();
		//select  day listbox method
		 Thread.sleep(4000);
		WebElement day = d.findElement(By.xpath("//select[@id='day']"));
		// create object for select class
		Select s=new Select(day);
		Thread.sleep(4000);
		//select by value method
		//s.selectByValue("8");
		//select by text
		s.selectByVisibleText("14");
		
		//select month listbox
		Thread.sleep(4000);
		WebElement month = d.findElement(By.xpath("//select[@id='month']"));
		// create object for select class
		Select t=new Select(month);
		Thread.sleep(4000);
		//t.selectByValue("11");
		//select by text
		t.selectByVisibleText("Apr");
		
		//select year listbox
		Thread.sleep(4000);
		WebElement year = d.findElement(By.xpath("//select[@id='year']"));
		// create object for select class
		Select b=new Select(year);
		Thread.sleep(4000);
		b.selectByValue("2018");
		//select by text
		//b.selectByVisibleText("2000");
		
		
		
	}
}
