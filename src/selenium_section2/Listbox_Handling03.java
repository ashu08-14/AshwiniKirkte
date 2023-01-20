package selenium_section2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Listbox_Handling03 {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver dr=new ChromeDriver();
		dr.get("https://www.facebook.com/");
		Thread.sleep(4000);
		dr.findElement(By.xpath("//a[text()='Create New Account']")).click();
		
		//select day listbox
		Thread.sleep(4000);
		 WebElement day = dr.findElement(By.xpath("//select[@id='day']"));
		//create object for select class
		 Select s=new Select(day);
		 Thread.sleep(4000);
		 //select by value method
		 //s.selectByValue("10");
		 //select by visible text
		 s.selectByVisibleText("17");
		 
		 //select month listbox
		 Thread.sleep(4000);
		 WebElement month = dr.findElement(By.xpath("//select[@id='month']"));
		 //create object for select class
		  Select t=new Select(month);
		 Thread.sleep(4000);
		 //select by  value method
		 //t.selectByValue("4");
		 //select by visible text
		 t.selectByVisibleText("May");
		 
		 //select year listbox
		 Thread.sleep(4000);
		WebElement year = dr.findElement(By.xpath("//select[@id='year']"));
		//create object for select class
		Select n=new Select(year);
		 Thread.sleep(4000);
		//select by  value method
		 //n.selectByValue("2017");
		//select by visible text
		 n.selectByVisibleText("2009");
		 
		 
		 
		 
		 
	}

}
