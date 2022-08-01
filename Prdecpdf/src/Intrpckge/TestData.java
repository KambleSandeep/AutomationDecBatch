package Intrpckge;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.test.sign.up.Utility;
import com.vel.config.Configurations;

public class TestData {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", Configurations.driverpath);
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);

		WebElement src = driver.findElement(By.xpath("//a[contains(text(),'rch')]"));

		System.out.println(src.getText());

	}

}
