package com.test.sign.up;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.vel.config.Configurations;

public class Utility {
	
	public String readExcelSheet(int row, int col) throws EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream(Configurations.excelsheetPath);

		Sheet sh = WorkbookFactory.create(file).getSheet("sheet1");

		String data= sh.getRow(row).getCell(col).getStringCellValue();
		System.out.println(data);
		return data;
	}
	
	public WebDriver initDriver() {

		System.setProperty("webdriver.chrome.driver", Configurations.driverpath);
		WebDriver driver = new ChromeDriver();
		driver.get(Configurations.appURL);
		driver.manage().window().maximize();
		return driver;

}
}