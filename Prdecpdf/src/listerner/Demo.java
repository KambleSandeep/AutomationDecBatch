package listerner;

import static org.testng.Assert.fail;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Demo {
	
	String tcID;
	
	BaseClass base = new BaseClass();
	WebDriver driver;
	
	@BeforeMethod()
	public void login() {
		driver=base.driverInit();
						
	}
	
	@Test
	public void TC01(){
		tcID="TC_201";
		Reporter.log("TC01 is executed",true);
		Assert.fail();
	}
	@Test
	public void TC02() {
		tcID="TC_201";
		Reporter.log("TC02 is executed",true);
		Assert.fail();
	}

	
	@AfterMethod
	public void logout (ITestResult	result) throws IOException {
		System.out.println(result.getStatus());
		if(ITestResult.FAILURE==result.getStatus()) {
			
			Utility util = new Utility();
			util.takeScreenshot(tcID);
			Reporter.log("Screeshot captured",true);
			
		Reporter.log("Application Logout",true);

		}
	
	}
}
