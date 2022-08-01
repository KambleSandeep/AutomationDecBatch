package Intrpckge;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.vel.config.Configurations;

public class Witsenkey {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", Configurations.driverpath);
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		WebElement srch = driver.findElement(By.xpath("//input[@class='_3704LK']"));
		
		
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		
		Thread.sleep(1000);  
		jse.executeScript("arguments[0].value='imac'", srch);
		
	}

}
