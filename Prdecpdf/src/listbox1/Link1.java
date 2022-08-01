package listbox1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.vel.config.Configurations;

public class Link1 {

public static void main(String[] args) {

	System.setProperty("webdriver.chrome.driver", Configurations.driverpath);
	WebDriver driver = new ChromeDriver();
	driver.get(Configurations.appURL);
	driver.manage().window().maximize();
	
	
		List<WebElement> links = driver.findElements(By.xpath("//button"));

		int count = links.size();
		System.out.println(count);
		
		for (int i=0; i<=count-1; i++) {

			System.out.println(links.get(i).getText());	


		//for (i=0; i<=)	
	}
}
}