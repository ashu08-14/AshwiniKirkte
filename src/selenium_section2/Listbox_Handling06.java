package selenium_section2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Listbox_Handling06 {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://tutorialsninja.com/demo/index.php?route=product/search");
		Thread.sleep(4000);
		WebElement categories = driver.findElement(By.xpath("//select[@name='category_id']"));
		Select s=new Select(categories);
		//select by value
		//s.selectByValue("18");
		
		// select by visibleText
		s.selectByVisibleText("Desktops");
		
	}

}
