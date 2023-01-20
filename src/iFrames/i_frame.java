package iFrames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class i_frame {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?org/openqa/selenium/package-summary.html");
		//implicit wait(global wait)
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	    //maximize the browser
		driver.manage().window().maximize();
		//by default selenium focus is on main webpage so we need to switch it
		// switch to 1st iframe
	    driver.switchTo().frame("packageListFrame");
	  //for our confirmation take any element on 1st frame and print it
	   String t1 = driver.findElement(By.xpath("//h2[text()='Packages']")).getText();
	    System.out.println(t1);
	   
	    //switch to web browser
	    driver.switchTo().defaultContent();
	    // switch to 2nd iframe
	    driver.switchTo().frame("packageFrame");
	  String t2 = driver.findElement(By.xpath("//a[text()='ChromeOptions']")).getText();
	  System.out.println(t2);
	  
	  //switch to web browser
	  driver.switchTo().defaultContent();
	  //switch to 3rd iframe
	  driver.switchTo().frame("classFrame");
	   String t3 = driver.findElement(By.xpath("//span[text()='Exception Summary']")).getText();
	   System.out.println(t3);
	}
}
