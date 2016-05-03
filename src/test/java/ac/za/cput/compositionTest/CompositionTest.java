package ac.za.cput.compositionTest;

import ac.za.cput.composition.Employee;
import ac.za.cput.composition.PersonalDetails;
import ac.za.cput.composition.PhysicalDetails;
import junit.framework.Assert;
import junit.framework.TestCase;

/**
 *
 */
public class CompositionTest extends TestCase{

    private Employee employee;
    private PersonalDetails personalDetails;
    private PhysicalDetails physicalDetails;

    public void setUp() throws Exception
    {
        personalDetails = new PersonalDetails(555345333, "35 Money Lane", "Single");
        physicalDetails = new PhysicalDetails("male", 37, 80, 1.82);
        employee = new Employee("Tony Stark", 123456789, "General Manager", 1000000.00, personalDetails, physicalDetails);
    }

    public void testToString()
    {
        Assert.assertEquals("Employee{employeeName=Tony Stark, employeeNumber=123456789, employeePosition='General Manager', employeeSalary=1000000.0, personalDetails=PersonalDetails{employeeContactNumber=555345333, employeeAddress='35 Money Lane', employeeMaritalStatus='Single'}, physicalDetails=PhysicalDetails{employeeGender='male', employeeAge=37, employeeWeightInKg=80, employeeHeightInMeters=1.82}}",employee.toString());

    }





}
