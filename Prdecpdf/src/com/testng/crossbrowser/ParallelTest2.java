package com.testng.crossbrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.vel.config.Configurations;

public class ParallelTest2 {
	@Test
	public void tc05() {

		System.setProperty("webdriver.chrome.driver", Configurations.driverpath);
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.quit();

	}

	@Test
	public void tc06() {

		System.setProperty("webdriver.chrome.driver", Configurations.driverpath);
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.Google.com/");
		driver.manage().window().maximize();
		driver.quit();

	}

	@Test
	public void tc07() {

		System.setProperty("webdriver.chrome.driver", Configurations.driverpath);
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.Flipkart.com/");
		driver.manage().window().maximize();
		driver.quit();

	}
	@Test
	public void tc08() {

		System.setProperty("webdriver.chrome.driver", Configurations.driverpath);
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		driver.quit();

	}
}


