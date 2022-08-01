package parametrization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.vel.config.Configurations;

public class TC01 {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// Reading data

		FileInputStream file = new FileInputStream(Configurations.excelsheetPath);

		Sheet sh = WorkbookFactory.create(file).getSheet("sheet1");

		String username = sh.getRow(0).getCell(0).getStringCellValue();
		System.out.println(username);

		String username1 = sh.getRow(1).getCell(0).getStringCellValue();
		System.out.println(username1);

		// browser setup
		System.setProperty("webdriver.chrome.driver", Configurations.driverpath);
		WebDriver driver = new ChromeDriver();
		driver.get(Configurations.appURL);
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(username1);

	}
}