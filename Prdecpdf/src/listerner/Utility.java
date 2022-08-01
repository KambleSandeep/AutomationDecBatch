package listerner;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import com.vel.config.Configurations;

public class Utility {
	public void takeScreenshot(String tcID) throws IOException {
		WebDriver driver;
		
		BaseClass dri = new BaseClass();
		driver = dri.driverInit();
			
		
		
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		Date date = new Date();
		
		String FileName = date.toString().replace(":", "_");
		
		File f = new File(Configurations.screenshotPath+FileName+tcID+".jpg");
		 
		FileHandler.copy(source, f);

	}

}
