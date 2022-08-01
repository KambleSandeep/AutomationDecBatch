package com.test.ng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo {
	
	
	@Test(priority=1)
	public void TC01() {
		System.out.println("TC01 is excuted");
	}
	
	@Test
	public void TC02() {
		System.out.println("TC02 is excuted");
	}
		@Test(priority=-1)
		public void TC03() {
			System.out.println("TC03 is excuted");
		
		}
		
		@BeforeMethod
		public void login() {
			System.out.println("Application Login");
		}
		@AfterMethod
		public void logout() {
			System.out.println("Application logout");
		}
		
		@BeforeClass 
		public void launchbrwoser() {
			System.out.println("Browser is openen");
		}
		
		@AfterClass
		public void closeBrowser() {
			System.out.println("browser is closed ");
			
		}
}
