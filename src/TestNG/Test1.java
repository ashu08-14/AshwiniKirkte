package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test1 {
	@Test
	public void TC1() {
		Reporter.log("My First testNG program", true);
		
	}

}
