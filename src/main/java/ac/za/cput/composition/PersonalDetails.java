package ac.za.cput.composition;

/**

 */
public class PersonalDetails {
    private long employeeContactNumber;
    private String employeeAddress;
    private String employeeMaritalStatus;


    public PersonalDetails(long employeeContactNumber, String employeeAddress, String employeeMaritalStatus) {
        this.employeeContactNumber = employeeContactNumber;
        this.employeeAddress = employeeAddress;
        this.employeeMaritalStatus = employeeMaritalStatus;
    }

    public long getEmployeeContactNumber() {
        return employeeContactNumber;
    }

    public void setEmployeeContactNumber(long employeeContactNumber) {
        this.employeeContactNumber = employeeContactNumber;
    }

    public String getEmployeeAddress() {
        return employeeAddress;
    }

    public void setEmployeeAddress(String employeeAddress) {
        this.employeeAddress = employeeAddress;
    }

    public String getEmployeeMaritalStatus() {
        return employeeMaritalStatus;
    }

    public void setEmployeeMaritalStatus(String employeeMaritalStatus) {
        this.employeeMaritalStatus = employeeMaritalStatus;
    }

    @Override
    public String toString() {
        return "PersonalDetails{" +
                "employeeContactNumber=" + employeeContactNumber +
                ", employeeAddress='" + employeeAddress + '\'' +
                ", employeeMaritalStatus='" + employeeMaritalStatus + '\'' +
                '}';
    }
}
