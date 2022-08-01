package basicconfig;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Apps\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	
	
		driver.get("https;//wwww.facebook.com/");

		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.navigate().back();
		Thread.sleep(2000); 
		
		driver.navigate().forward();
		Thread.sleep(2000);
		
		driver.quit();
}	
}
		
