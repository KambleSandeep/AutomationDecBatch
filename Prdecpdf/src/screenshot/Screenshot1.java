package screenshot;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import com.vel.config.Configurations;

public class Screenshot1 {
		public static void main(String[] args) throws IOException{
			System.setProperty("webdriver.chrome.driver", Configurations.driverpath);
			WebDriver driver = new ChromeDriver();
			driver.get(Configurations.appURL);
			driver.manage().window().maximize();
			
			File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			
			Date date = new Date();
			
			
			
			String FileName = date.toString().replace(":", "_");
			
			File f = new File(Configurations.screenshotPath+FileName+".jpg");
			 
			FileHandler.copy(source, f);
}
}	
	



