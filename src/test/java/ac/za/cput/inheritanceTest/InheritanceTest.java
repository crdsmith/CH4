package ac.za.cput.inheritanceTest;

import ac.za.cput.inheritance.Cylinder;
import junit.framework.Assert;
import junit.framework.TestCase;

/**

 */
public class InheritanceTest extends TestCase
{
    private Cylinder cylinder;

    public void setUp() throws  Exception{
        cylinder = new Cylinder(20.00, 50.00);
    }

    public void testGetCylinderArea() throws Exception
    {
        Assert.assertEquals(8796.46,cylinder.getCylinderArea());
    }
    public void testGetCylinderVolume() throws Exception
    {
        Assert.assertEquals(62831.85,cylinder.getCylinderVolume());
    }
}
