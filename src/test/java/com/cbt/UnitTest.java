package com.cbt;

import org.testng.Assert;
import org.testng.annotations.Test;

public class UnitTest {
	@Test
	public void add() {
		int expected = 2;
		Unit unit = new Unit();
		int actual = unit.add(1, 1);
		//int result = expected-actual;
		
		Assert.assertEquals(actual, expected);
		//System.out.println(result);
		
	}
	

}
