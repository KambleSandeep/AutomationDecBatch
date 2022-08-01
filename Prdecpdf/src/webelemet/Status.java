package webelemet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.vel.config.Configurations;

public class Status {
	
				public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",Configurations.driverpath);
			WebDriver driver = new ChromeDriver();
			driver.get(Configurations.appURL);
			boolean sts = driver.findElement(By.xpath("//button[@name='login']")).isEnabled();
			System.out.println(sts);
			
	

}
}