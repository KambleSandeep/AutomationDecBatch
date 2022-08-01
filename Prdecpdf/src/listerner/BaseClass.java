package listerner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.vel.config.Configurations;

public class BaseClass {
	
	public WebDriver driverInit() {
		System.setProperty("webdriver.chrome.driver", Configurations.driverpath);
		WebDriver driver = new ChromeDriver();
		driver.get(Configurations.appURL);
		driver.manage().window().maximize();
		
		return driver;
		
	}

}
