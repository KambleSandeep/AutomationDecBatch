package basicconfig;


import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Jk {
	
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","C:\\Apps\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.facebook.com/");
			
			
		Dimension dim = new Dimension(200,200);
			
			
			driver.manage().window().setSize(dim);
			
			Point P= new Point(-200,200);
			
			driver.manage().window().setPosition(P);
			
			Thread.sleep(3000);
			
			driver.close();
			
			


}
}