package scroll;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.vel.config.Configurations;

public class A {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", Configurations.driverpath);
		WebDriver driver = new ChromeDriver();
		driver.get(Configurations.appURL);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		
		((JavascriptExecutor)driver).executeScript("scroll(0,3000)");
		
		Thread.sleep(5000);
		
		((JavascriptExecutor)driver).executeScript("scroll(0,-1000)");

	}

}
