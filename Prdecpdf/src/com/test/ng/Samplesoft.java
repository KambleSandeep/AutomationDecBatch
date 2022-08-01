package com.test.ng;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Samplesoft {
	
	@Test
	public void m4() {
		String str1="xyz";
		String str2="abc";
		
		SoftAssert asrt= new SoftAssert();	
		asrt.assertEquals(str1, str2);
		System.out.println("...........After Assertation..........");
		
		asrt.assertNotEquals(str1, str2);
		
		asrt.assertEquals("djbbvbdh", "expescdhgyugtgected");
		System.out.println("End of assertation....");
		asrt.assertAll();
		
}	
}