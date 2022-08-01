package com.testng.testsuit;

import org.testng.Reporter;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class A {
	
	@Test(groups="intraday")
	public void Tc01() {
		Assert.fail();
		Reporter.log("Test case -01 passed");
	
	}
		@Test(groups="Buy")
		public void Tc02() {
			
			Reporter.log("Test case -02 passed");
	}
		@Test(groups="sell")
		public void Tc03() {
			Assert.fail();
			Reporter.log("Test case -02 Passed");
	
		}
}
