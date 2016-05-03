package ac.za.cput.polymorphism;

/**

 */
public abstract class Student implements LoanInterest{
    private String name;
    private String studNum;
    private double loanAmount;

    public Student(String name, String studNum, double loanAmount) {
        this.name = name;
        this.studNum = studNum;
        this.loanAmount = loanAmount;
    }

    public double getLoanAmount()
    {
        return loanAmount;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", studNum='" + studNum + '\'' +
                ", loanAmount=" + loanAmount +
                '}';
    }
}


