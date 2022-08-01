package a;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.vel.config.Configurations;

public class erreormsg {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", Configurations.driverpath);
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.Facebook.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("6554");
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("sccc");
		
		driver.findElement(By.xpath("//button[@name='login']")).click();
		
		String store = driver.findElement(By.xpath("//div[@class='_9ay7']")).getText();
		
		System.out.println(store);

}
}