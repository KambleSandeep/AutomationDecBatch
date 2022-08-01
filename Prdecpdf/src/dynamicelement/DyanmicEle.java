package dynamicelement;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.vel.config.Configurations;

public class DyanmicEle {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", Configurations.driverpath);
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/TILE-RE-19001-Tile-Mate-Pack/dp/B07W9BBCTB/ref=sr_1_1?crid=QWV8ACP0DS7K&keywords=tile+mate&qid=1647929982&sprefix=tile+mate%2Caps%2C417&sr=8-1");
		driver.manage().window().maximize();
		
		//driver.findElement(By.xpath("//input[@name='pass']//parent::div//parent::div//preceding-sibling::div//input")).sendKeys("Dyanmicx path");
       
		WebElement gift = driver.findElement(By.xpath("//div[@id='title_feature_div']//following-sibling::div[@id='averageCustomerReviews_feature_div']//I[1]"));
		
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",gift);
		
		Thread.sleep(2000);
		
		gift.click();
	}
}
