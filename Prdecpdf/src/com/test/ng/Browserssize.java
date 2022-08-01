package com.test.ng;



import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.vel.config.Configurations;

public class Browserssize {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", Configurations.driverpath);
							WebDriver driver = new ChromeDriver();
					 
							driver.get(Configurations.appURL);
						
						driver.manage().window().maximize();
						
						
						Dimension Dim = new Dimension(400,400);
						
						driver.manage().window().setSize(Dim);
						
						Thread.sleep(3000);
						
						driver.close();
	}

}
