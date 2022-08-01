	package popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.vel.config.Configurations;

public class Demo {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", Configurations.driverpath);
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		  WebElement btn = driver.findElement(By.xpath("//button[@id='promtButton']"));
		  btn.click();
		
		
		Alert alertpopup = driver.switchTo().alert();
		alertpopup.sendKeys("@@@@@ on java@@@@");
		
		
		Thread.sleep(2000);
		
		 alertpopup.accept();                  //click on ok 
		// alertpopup.dismiss();                   //click on cancel
	}

}
