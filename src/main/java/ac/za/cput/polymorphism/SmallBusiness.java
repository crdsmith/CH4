package ac.za.cput.polymorphism;

/**

 */
public class SmallBusiness implements LoanInterest{
    private String name;
    private String registerNum;
    private double loanAmount;

    public SmallBusiness(String name, String registerNum, double loanAmount) {
        this.name = name;
        this.registerNum = registerNum;
        this.loanAmount = loanAmount;
    }


    public double interest()
    {
        return loanAmount * 0.15;
    }

    @Override
    public String toString() {
        return "SmallBusiness{" +
                "name='" + name + '\'' +
                ", registerNum='" + registerNum + '\'' +
                ", loanAmount='" + loanAmount + '\'' +
                ", interest=" + interest() +
                '}';
    }
}
