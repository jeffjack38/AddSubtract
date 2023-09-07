/**
 * @author jeade - jeaden
 * CIS175 - Fall 2023
 *Sep 7, 2023
 */
package model;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * 
 */
public class TestAdd {

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	//test add method
    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        int result = calculator.add(1, 2);
        assertEquals(3, result);
    }
    
    //assertTrue test case for add
    public void testAdd_assertTrue() {
        Calculator calculator = new Calculator();
        int result = calculator.add(1, 1);
        assertTrue(result == 2);
    }


}
