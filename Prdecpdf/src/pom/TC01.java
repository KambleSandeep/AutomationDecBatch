package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.vel.config.Configurations;

public class TC01 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", Configurations.driverpath);
		WebDriver driver = new ChromeDriver();
		driver.get(Configurations.appURL);
		driver.manage().window().maximize();
		
		Loginpage Login = new Loginpage(driver);
		
		Login.SetUserid("Tester");
		Login.SetPassword("12345");
		Login.clickloginbtn();
	
	Thread.sleep(2000);
	driver.get(Configurations.appURL);

	Login.SetUserid("sanjahed@gamil.com");
	Login.SetPassword("sanhdhr");
	Login.clickloginbtn();
	
	Thread.sleep(2000);
	driver.get(Configurations.appURL);

	Login.SetUserid("9582484654");
	Login.SetPassword("sanhdhr1284843244");
	Login.clickloginbtn();
	
	
	

	}
	
}
