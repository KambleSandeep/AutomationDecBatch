package listbox1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.vel.config.Configurations;

public class Setup {
	
public  WebDriver initDriver() {System.setProperty("webdriver.chrome.driver", Configurations.driverpath);
WebDriver driver = new ChromeDriver();
return driver;
}
	
}
