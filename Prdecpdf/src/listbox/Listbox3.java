package listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.vel.config.Configurations;

public class Listbox3 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", Configurations.driverpath);
		WebDriver driver = new ChromeDriver();
		driver.get(Configurations.appURL);
		driver.manage().window().maximize();
		
		WebElement year = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		
		Select sel = new Select(year);
		int size = sel.getOptions().size();
		
		System.out.println(size);
		for (int i=0; i<=size-1; i++) {
		String ele = sel.getOptions().get(i).getText();
		System.out.println(ele);

 

}
}}