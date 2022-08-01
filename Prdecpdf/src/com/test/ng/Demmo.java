package com.test.ng;


import static org.testng.Assert.fail;

import org.testng.Reporter;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class Demmo {
	
	
	
	@Test
	public void login () {
		Reporter.log("Login is succesfull",true);
		Assert.fail();
		}
	
	@Test(dependsOnMethods="login")
	public void logout() {
		Reporter.log("Log out is succesfull",true);
	}
	
}
