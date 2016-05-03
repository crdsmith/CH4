package ac.za.cput.polymorphismTest;

import ac.za.cput.polymorphism.PostGrad;
import ac.za.cput.polymorphism.SmallBusiness;
import ac.za.cput.polymorphism.UnderGrad;
import junit.framework.Assert;
import junit.framework.TestCase;

/**
 *
 */
public class PolymorphismTest extends TestCase{
    private PostGrad postGrad;
    private UnderGrad underGrad;
    private SmallBusiness smallBusiness;

    public void setUp() throws Exception
    {
        postGrad = new PostGrad("John Doe", "123456", 15000.00);
        underGrad = new UnderGrad("Jane Doe", "678910", 10000.00);
        smallBusiness = new SmallBusiness("Dead Bodies Inc", "677889", 20000.00);
    }

    public void testPostGradInterest() throws  Exception
    {
        Assert.assertEquals(1500.00, postGrad.interest());
    }

    public void testUnderGradInterest() throws  Exception
    {
        Assert.assertEquals(1200.00, underGrad.interest());
    }

    public void testSmallBusinessInterest() throws  Exception
    {
        Assert.assertEquals(3000.00, smallBusiness.interest());
    }

}
