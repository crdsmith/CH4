package ac.za.cput.composition;

/**

 */
public class PhysicalDetails {
    private String employeeGender;
    private int employeeAge;
    private int employeeWeightInKg;
    private double employeeHeightInMeters;


    public PhysicalDetails(String employeeGender, int employeeAge, int employeeWeightInKg, double employeeHeightInMeters) {
        this.employeeGender = employeeGender;
        this.employeeAge = employeeAge;
        this.employeeWeightInKg = employeeWeightInKg;
        this.employeeHeightInMeters = employeeHeightInMeters;
    }

    public String getEmployeeGender() {
        return employeeGender;
    }

    public void setEmployeeGender(String employeeGender) {
        this.employeeGender = employeeGender;
    }

    public int getEmployeeAge() {
        return employeeAge;
    }

    public void setEmployeeAge(int employeeAge) {
        this.employeeAge = employeeAge;
    }

    public int getEmployeeWeightInKg() {
        return employeeWeightInKg;
    }

    public void setEmployeeWeightInKg(int employeeWeightInKg) {
        this.employeeWeightInKg = employeeWeightInKg;
    }

    public double getEmployeeHeightInMeters() {
        return employeeHeightInMeters;
    }

    public void setEmployeeHeightInMeters(double employeeHeightInMeters) {
        this.employeeHeightInMeters = employeeHeightInMeters;
    }

    @Override
    public String toString() {
        return "PhysicalDetails{" +
                "employeeGender='" + employeeGender + '\'' +
                ", employeeAge=" + employeeAge +
                ", employeeWeightInKg=" + employeeWeightInKg +
                ", employeeHeightInMeters=" + employeeHeightInMeters +
                '}';
    }
}
