package junitTestPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddStrings {

	@Test
	public void test() {
		jUnitFunctions junitString = new jUnitFunctions();
		String result = junitString.addtwostring("SAMARTH ","BHATT"); 
		assertEquals("SAMARTH BHATT",result);
	}
}
