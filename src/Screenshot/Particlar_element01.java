package Screenshot;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Particlar_element01 {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://www.actitime.com/");
		Thread.sleep(4000);
	 WebElement ref = d.findElement(By.xpath("//div[@class='home-page__headline']"));
	 File src = ref.getScreenshotAs(OutputType.FILE);
	 File dest=new File("C:\\Users\\Lenovo\\OneDrive\\Desktop\\Screenshot 17sep22\\acttime.png");
	 Files.copy(src, dest);
	}

}
