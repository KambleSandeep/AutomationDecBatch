package autosuggestion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.vel.config.Configurations;

public class B {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", Configurations.driverpath);
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("Apple 13");
		Thread.sleep(5000);

		List<WebElement> lst = driver.findElements(By.xpath("//ul[@class=\"G43f7e\"]//li"));

		System.out.println(lst.size());
		String src = "apple 13 pro max";

		for (int i = 0; i <= lst.size() - 1; i++) {
			System.out.println(lst.get(i).getText());

			String lstemn = lst.get(i).getText();

			if (lstemn.equals(src)) {

				lst.get(i).click();
				break;

			}

		}

	}
}