package ac.za.cput.ocp.obey;

import junit.framework.Assert;
import junit.framework.TestCase;

/**
 *
 */
public class StudentMarksImplementationTest extends TestCase {
    private StudentMarksImplementation studentMarksImplementation;

    public void setUp() throws Exception{
        studentMarksImplementation = new StudentMarksImplementation();
    }

    public void testStudent()
    {
        Assert.assertEquals("B", studentMarksImplementation.getScore(75));
    }
}