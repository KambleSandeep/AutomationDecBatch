package scroll;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.vel.config.Configurations;

public class B {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", Configurations.driverpath);
		WebDriver driver = new ChromeDriver();
		driver.get(Configurations.appURL);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		WebElement us = driver.findElement(By.xpath("//a[text()='United States']"));
		
		
		
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",us);

		
	}

}
