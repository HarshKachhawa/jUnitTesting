package jUnitTestingPackage;
//HarshKachhawa
//E20CSE428
import static org.junit.Assert.*;

import org.junit.Test;

public class testAddStrings {

	@Test
	public void test() {
		jUnitFunction jUnit = new jUnitFunction();
		String result = jUnit.AddStrings("Harsh", "Kachhawa");
		assertEquals("HarshKachhawa", result);
	}

}
