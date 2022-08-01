package com.testng.testsuit;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class C {
	@Test(groups="intraday")
	public void Tc08() {
		Reporter.log("Test case -08 passed");
	
	}
		@Test(groups="intraday")
		public void Tc09() {
			Reporter.log("Test case -09 passed");
	}
		@Test(groups="sell")
		public void Tc10() {
			Reporter.log("Test case -10 Passed");

}		@Test(groups="sell")
		public void Tc11() {
	Reporter.log("Test case -11 Passed");

}}