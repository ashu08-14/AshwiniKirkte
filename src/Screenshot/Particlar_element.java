package Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Particlar_element {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.selenium.dev/");
		driver.manage().window().maximize();
		//takes the xPath of an element
		WebElement abc = driver.findElement(By.xpath("//h1[@class='display-1 mt-0 mt-md-5 pb-1']"));
		//use getScreenshot method
		File src = abc.getScreenshotAs(OutputType.FILE);
		//create object of file class
		File dest=new File("C:\\Users\\Lenovo\\OneDrive\\Desktop\\Screenshot 17sep22\\particular.png");
		//use copy method
		Files.copy(src, dest);
		
		
		
	}

}
