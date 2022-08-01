package crossBrowserPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.vel.config.Configurations;

public class A {

	@Test
	@Parameters("browserName") // key+December
	public void browser(String txt) { // txt=firefox

		if (txt.equalsIgnoreCase("firefox")) {

			System.out.println("Firefox is launched");

			System.setProperty("webdriver.gecko.driver", Configurations.Firfoxpath);
			WebDriver driver = new FirefoxDriver();
			driver.get("https://www.facebook.com/");

		} else

		{
			System.out.println("Chromedriver is launched ");
			System.setProperty("webdriver.chrome.driver", Configurations.driverpath);
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.Flipkart.com/");
			driver.manage().window().maximize();
		}

	}

}
