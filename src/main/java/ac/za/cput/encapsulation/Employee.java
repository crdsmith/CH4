package ac.za.cput.encapsulation;

/**

 */
public class Employee {

    private String employeeName;
    private int employeeNumber;
    private String employeePosition;
    private double employeeSalary;


    public Employee(String employeeName, int employeeNumber, String employeePosition, double employeeSalary) {
        this.employeeName = employeeName;
        this.employeeNumber = employeeNumber;
        this.employeePosition = employeePosition;
        this.employeeSalary = employeeSalary;
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

    @Override
    public String toString() {
        return "Employee{" +
                "employeeName='" + employeeName + '\'' +
                ", employeeNumber=" + employeeNumber +
                ", employeePosition='" + employeePosition + '\'' +
                ", employeeSalary=" + employeeSalary +
                '}';
    }
}
