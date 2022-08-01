package listbox1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.vel.config.Configurations;

public class Custom {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", Configurations.driverpath);
		WebDriver driver = new ChromeDriver();
		driver.get(Configurations.appURL);
		driver.manage().window().maximize();
		Thread.sleep(2000);

		WebElement day = driver.findElement(By.xpath("//select[@name='birthday_day']"));

		Actions acts = new Actions(driver);

		acts.moveToElement(day).click().build().perform();

		Thread.sleep(2000);
		
		
		Thread.sleep(2000);

		
		for (int i=0; i<=13; i++) {
			
		acts.sendKeys(Keys.ARROW_UP).perform();
		Thread.sleep(500);
		}
		
			Thread.sleep(500);

		
		
		
		acts.sendKeys(Keys.ENTER).perform();



	}

}