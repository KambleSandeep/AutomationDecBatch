package popup;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.vel.config.Configurations;

public class Test123 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", Configurations.driverpath);
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@id='windowButton']")).click();
		
		 Set<String> ids= driver.getWindowHandles();
		 
		 System.out.println(ids.size());
		 System.out.println(ids);
		 
		 
		 Iterator<String> window = ids.iterator();
		 while(window.hasNext()) {
		 String mainWin = window.next();
		 String childWin = window.next();
		 
		 driver.switchTo().window(childWin);
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		driver.close();
		
	}
	}
}