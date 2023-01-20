package selenium_section2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Listbox_Handling {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver wd=new ChromeDriver();
		//open the application
		wd.get("https://www.facebook.com/");
		Thread.sleep(4000);
		//click on the create new a/c btn
		wd.findElement(By.xpath("//a[text()='Create New Account']")).click();
		//select day listbox
		Thread.sleep(4000);
		WebElement day = wd.findElement(By.xpath("//select[@id='day']"));
		//create object of select class
		Select s=new Select(day);
		Thread.sleep(4000);
		//use select class method
		s.selectByValue("6");
		//select by visible text
		//s.selectByVisibleText("15");
		Thread.sleep(4000);
		WebElement month = wd.findElement(By.xpath("//select[@id='month']"));
		//Create object of select class
		Select a=new Select(month);
		Thread.sleep(4000);
		//use select class method
		//a.selectByValue("6");
		//select by visible text
		a.selectByVisibleText("Aug");
		Thread.sleep(4000);
		WebElement year = wd.findElement(By.xpath("//select[@id='year']"));
		//create object of select class
		Select b=new Select(year);
		Thread.sleep(4000);
		//use select class method
		//b.selectByValue("2017");
		//select by visible text
		b.selectByVisibleText("2018");
		Thread.sleep(4000);
		//select gender
	    wd.findElement(By.xpath("//label[text()='Female']")).click();
		
		
	}

}
