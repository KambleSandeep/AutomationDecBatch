package com.testng.crossbrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.vel.config.Configurations;

public class ParallelTest {
	@Test
	public void tc01() {

		System.setProperty("webdriver.chrome.driver", Configurations.driverpath);
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.quit();

	}

	@Test
	public void tc02() {

		System.setProperty("webdriver.chrome.driver", Configurations.driverpath);
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.Google.com/");
		driver.manage().window().maximize();
		driver.quit();

	}

	@Test
	public void tc03() {

		System.setProperty("webdriver.chrome.driver", Configurations.driverpath);
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.Flipkart.com/");
		driver.manage().window().maximize();
		driver.quit();

	}
	@Test
	public void tc04() {

		System.setProperty("webdriver.chrome.driver", Configurations.driverpath);
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		driver.quit();

	}
}