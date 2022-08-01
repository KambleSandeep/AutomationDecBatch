package com.test.sign.up;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.vel.config.Configurations;

public class Test2{
	
	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		
		Utility util = new Utility();
		WebDriver driver = util.initDriver();
		
		SignUpPOM signup = new SignUpPOM(driver);
		
		//TC01
		driver.get(Configurations.appURL);
		signup.enterFirstName(util.readExcelSheet(1, 1));
		signup.enterlastname(util.readExcelSheet(2, 1));
		signup.enterEmailId(util.readExcelSheet(3, 1));
		signup.selectGender();
		signup.selectmonth(util.readExcelSheet(4, 1));
		
		
		Thread.sleep(4000);

		
		//TC02
		driver.get(Configurations.appURL);
		signup.enterFirstName(util.readExcelSheet(1, 2));
		signup.enterlastname(util.readExcelSheet(2, 2));
		signup.enterEmailId(util.readExcelSheet(3, 2));
		signup.selectGender();
		signup.selectmonth(util.readExcelSheet(4, 2));
		
		Thread.sleep(4000);
		//TC03
		driver.get(Configurations.appURL);
		signup.enterFirstName(util.readExcelSheet(1, 3));
		signup.enterlastname(util.readExcelSheet(2, 3));
		signup.enterEmailId(util.readExcelSheet(3, 3));
		signup.selectGender();
		signup.selectmonth(util.readExcelSheet(4, 3));
		
	}	}