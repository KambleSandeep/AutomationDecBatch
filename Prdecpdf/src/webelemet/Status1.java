package webelemet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.vel.config.Configurations;

public class Status1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", Configurations.driverpath);
		WebDriver driver = new ChromeDriver();
		driver.get(Configurations.appURL);

		WebElement radiobutton = driver.findElement(By.xpath("(//input[@type='radio'])[1]"));

		boolean dis = radiobutton.isDisplayed();
		boolean sel = radiobutton.isSelected();
		boolean enb = radiobutton.isEnabled();
		
		
		System.out.println(dis);
		System.out.println(sel);
		System.out.println(enb);


	}

}