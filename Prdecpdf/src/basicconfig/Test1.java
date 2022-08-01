package basicconfig;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Apps\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("http://www.facebook.com/");
			driver.manage().window().maximize();
			
			driver.findElement(By.xpath("(//input[@type='_6lux'])[1]")).sendKeys("djgduygbsuycguy");
			
			driver.findElement(By.xpath("(//input[@type='_6lux'])[2]")).sendKeys("123456987458");
			
			driver.findElement(By.xpath("//button[@name='login']")).click();

}
}