package listbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.vel.config.Configurations;

public class Listbox2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", Configurations.driverpath);
		WebDriver driver = new ChromeDriver();
		driver.get(Configurations.appURL);
		driver.manage().window().maximize();

		WebElement year = driver.findElement(By.xpath("//select[@name='birthday_year']"));

		Select s1 = new Select(year);
		// single or mulit selectable
		System.out.println(s1.isMultiple());

		// get selected option

		String FirstValue = s1.getFirstSelectedOption().getText();
		System.out.println(FirstValue);
	}

}
