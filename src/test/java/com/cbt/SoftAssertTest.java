package com.cbt;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

	public class SoftAssertTest {
		SoftAssert softAssert = new SoftAssert();
			@Test
	public void test1() {
		int j = 100;
		int k = 200;
		
		System.out.println("First assertion ");
		softAssert.assertEquals(j, k);
		
		System.out.println("Second assertion ");
		softAssert.assertNotEquals(j, k);
		
		System.out.println("Third assertion ");
		softAssert.assertTrue(j>k);
		
		softAssert.assertAll();
		
				
			}
	
	

}
