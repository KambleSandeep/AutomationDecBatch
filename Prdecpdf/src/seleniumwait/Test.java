package seleniumwait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.vel.config.Configurations;

public class Test {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", Configurations.driverpath);
		WebDriver driver = new ChromeDriver();
		driver.get(Configurations.appURL);
		driver.manage().window().maximize();
		// Thread.sleep(10000);

		WebElement uName = driver.findElement(By.xpath("//input[@id='email']"));
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		

		WebDriverWait wait = new WebDriverWait(driver, 10); // explicit wait
		wait.until(ExpectedConditions.visibilityOf(uName));
		wait.until(ExpectedConditions.elementToBeClickable(uName));

		uName.sendKeys("Tester");

	}
}