package stringpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.vel.config.Configurations;

public class Demo123 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",Configurations.driverpath);
			WebDriver driver = new ChromeDriver();
			driver.get(Configurations.appURL);
			driver.manage().window().maximize();
	}
}
