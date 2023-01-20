package TestNG;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test2 {
	@Test
	public void TC1() {
		Reporter.log("TC is pass", true);
	}
	@Test
	public void TC2() {
		Reporter.log("TC is fail",true);
		Assert.fail();
		
	}

}
