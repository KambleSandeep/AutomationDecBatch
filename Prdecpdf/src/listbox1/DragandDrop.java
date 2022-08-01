package listbox1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.vel.config.Configurations;

public class DragandDrop {
	public static void main(String[] args) {
		
		Setup set = new Setup();
		WebDriver driver = set.initDriver();
		
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		driver.manage().window().maximize();

		//h5[contains(text(),'High Tatras 3')]
		
		driver.switchTo().frame(3);
		
		WebElement sourceimage = driver.findElement(By.xpath("//img[@src='images/high_tatras_min.jpg']"));	
		WebElement Destination = driver.findElement(By.xpath("//div[@id='trash']"));
		
		Actions act = new Actions(driver);
		//act.dragAndDrop(sourceimage, Destination).perform();
		
		act.moveToElement(sourceimage).clickAndHold().moveToElement(Destination).release().build().perform();
	
	}
}
