package ac.za.cput.polymorphism;

/**

 */
public class UnderGrad extends Student{
    public UnderGrad(String nm, String num, double loanAmount)
    {
        super(nm, num, loanAmount);
    }

    public double interest()
    {
        return getLoanAmount() * 0.12;
    }
}
