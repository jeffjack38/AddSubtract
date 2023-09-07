package model;

/**
 * @author jeade - jeaden
 * CIS175 - Fall 2023
 *Sep 7, 2023
 */
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ TestAdd.class, TestSubtract.class })
public class AllTests {
	public AllTests() {
		
	}

    @Test
    public void testAllTests() {
        // This method would run all of the tests in the project
    }

}
