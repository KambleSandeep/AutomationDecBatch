package com.test.ng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.vel.config.Configurations;

public class Sample {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", Configurations.driverpath);
		WebDriver driver = new ChromeDriver();
		driver.get(Configurations.appURL);
		driver.manage().window().maximize();
		
		
		driver.findElement(By.xpath("//button[@name='login']")).click();
		Thread.sleep(2000);
		
		String actualtxt = driver.findElement(By.xpath("//div[@id='email_container']")).getText();
		//verification
		String expectedTxt="The email address or mobile number you entered isn't connected to an account. Find your account and log in.";
			if (actualtxt.equalsIgnoreCase(expectedTxt)){
			System.out.println("Pass the  test cases");
			
		}else {System.out.println("Fail the test cases");
			
		}
		}
	}

