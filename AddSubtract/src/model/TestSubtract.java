package model;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestSubtract {

	@Before
	public void setUp() throws Exception {
	}
	
	
	//assertFalse() test case for subtract
	@Test
	public void testSubtract_assertFalse() {
	    Calculator calculator = new Calculator();
	    int result = calculator.subtract(1, 1);
	    assertFalse(result == 2);
	}
	
	//test subtract method
    @Test
    public void testSubtract() {
        Calculator calculator = new Calculator();
        int result = calculator.subtract(3, 1);
        assertEquals(2, result);
    }
}
