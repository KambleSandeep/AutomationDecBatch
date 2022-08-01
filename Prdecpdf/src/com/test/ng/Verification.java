package com.test.ng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Verification {
	@Test
	public void test() {
		String str1="HI";
		String str2="HI";
		
		Assert.assertNotEquals(str1, str2);
	}
}
