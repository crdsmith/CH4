package ac.za.cput.encapsulationTest;

import ac.za.cput.encapsulation.Employee;
import junit.framework.Assert;
import junit.framework.TestCase;

/**

 */
public class EmployeeTest extends TestCase
{
    private Employee emp = new Employee("Bruce Wayne", 888888, "Manager", 1000000.00);

    public void testEmployee() throws Exception {
        //Employee emp = new Employee("Bruce Wayne", 888888, "Manager", 1000000);

        Assert.assertEquals("Bruce Wayne", emp.getEmployeeName());
        Assert.assertEquals(888888, emp.getEmployeeNumber());
        Assert.assertEquals("Manager", emp.getEmployeePosition());
        Assert.assertEquals(1000000.00, emp.getEmployeeSalary());
    }
}
