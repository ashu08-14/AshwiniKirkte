package Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Screenshot02 {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://www.youtube.com/");
		TakesScreenshot ts=(TakesScreenshot) d;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\Lenovo\\OneDrive\\Desktop\\Screenshot 17sep22\\youtube.jpg");
		Files.copy(src, dest);
	}

}
