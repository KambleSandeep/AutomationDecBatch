package listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.vel.config.Configurations;

public class Listbox1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", Configurations.driverpath);
		WebDriver driver = new ChromeDriver();
		driver.get(Configurations.appURL);
		driver.manage().window().maximize();

		WebElement month = driver.findElement(By.xpath("//select[@name=\"birthday_month\"]"));

		Select s1 = new Select(month);

		Thread.sleep(2000);
		// s1.selectByIndex(10);
		// s1.selectByValue("12");

		s1.selectByVisibleText("Nov");
		
	
	}
}