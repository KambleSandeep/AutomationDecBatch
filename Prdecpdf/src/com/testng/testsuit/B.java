package com.testng.testsuit;

import org.testng.Reporter;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class B {
	@Test(groups="Buy")
	public void Tc04() {
		Reporter.log("Test case -04 passed");
	
	}
		@Test(groups="Buy")
		public void Tc05() {
			Assert.fail();
			Reporter.log("Test case -05 passed");
	}
		@Test(groups="intraday")
		public void Tc06() {
			Reporter.log("Test case -06 Passed");
	
}
		@Test(groups="sell")
		public void Tc07() {
			Reporter.log("Test case -07 Passed");
}}