package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class First {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		//test data
		String expT="Google";
		String actT=driver.getTitle();
		System.out.println(actT);
		if(expT.equals(actT)) {
			System.out.println("TC is pass");
		}
		else {
			System.out.println("TC is fail");
		}
		
		
	}
}