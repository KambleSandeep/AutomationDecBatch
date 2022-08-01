package com.test.ng;

import static org.testng.Assert.assertNull;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class Verification1 {
	@Test
	public void m1() {
		
		
		//boolean actualStatus=true;
		
		//Assert.assertTrue(actualStatus);
		 
			String str = "HI";
			
		Assert.assertNull(str);
		//Assert.assertNotNull(str);
	}
}
