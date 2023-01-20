package Selenium_section1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getCurrentUr03 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver ref=new ChromeDriver();
		ref.get("https://www.firstcry.com/");
		ref.manage().window().maximize();
		String gc = ref.getCurrentUrl();
		System.out.println(gc);
	}

}
