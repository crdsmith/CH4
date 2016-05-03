package ac.za.cput.dip.violate;

import junit.framework.Assert;
import junit.framework.TestCase;

/**
 *
 */
public class AgeCalculatorViolateViolateTest extends TestCase {
    AgeCalculatorViolate ageCalculatorViolate;

    public void setUp() throws Exception {
        ageCalculatorViolate = new AgeCalculatorViolate(1990, 2016);
    }
    public void testEmployee(){


        Assert.assertEquals(26, ageCalculatorViolate.calculateAge());

    }

}