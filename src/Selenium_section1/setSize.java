package Selenium_section1;



import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class setSize {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.myntra.com/login");
		//create object of Dimension class
		Dimension d=new Dimension(200, 100);

		//use the setSize method
		driver.manage().window().setSize(d);
	
		
		
	}

}
