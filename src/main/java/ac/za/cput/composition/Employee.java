package ac.za.cput.composition;

/**

 */
public class Employee {
    private String employeeName;
    private int employeeNumber;
    private String employeePosition;
    private double employeeSalary;
    private PersonalDetails personalDetails;
    private PhysicalDetails physicalDetails;


    public Employee(String employeeName, int employeeNumber, String employeePosition, double employeeSalary, PersonalDetails personalDetails, PhysicalDetails physicalDetails) {
        this.employeeName = employeeName;
        this.employeeNumber = employeeNumber;
        this.employeePosition = employeePosition;
        this.employeeSalary = employeeSalary;
        this.personalDetails = personalDetails;
        this.physicalDetails = physicalDetails;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(int employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public String getEmployeePosition() {
        return employeePosition;
    }

    public void setEmployeePosition(String employeePosition) {
        this.employeePosition = employeePosition;
    }

    public double getEmployeeSalary() {
        return employeeSalary;
    }

    public void setEmployeeSalary(double employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    public PersonalDetails getPersonalDetails() {
        return personalDetails;
    }

    public void setPersonalDetails(PersonalDetails personalDetails) {
        this.personalDetails = personalDetails;
    }

    public PhysicalDetails getPhysicalDetails() {
        return physicalDetails;
    }

    public void setPhysicalDetails(PhysicalDetails physicalDetails) {
        this.physicalDetails = physicalDetails;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeName=" + employeeName +
                ", employeeNumber=" + employeeNumber +
                ", employeePosition='" + employeePosition + '\'' +
                ", employeeSalary=" + employeeSalary +
                ", personalDetails=" + personalDetails.toString() +
                ", physicalDetails=" + physicalDetails.toString() +
                '}';
    }
}
