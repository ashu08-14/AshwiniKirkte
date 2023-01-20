package Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Screenshot01 {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.selenium.dev/");
		driver.manage().window().maximize();
		TakesScreenshot ts=(TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\Lenovo\\OneDrive\\Desktop\\Screenshot 17sep22\\selenium.png");
		Files.copy(src, dest);
	}

}
