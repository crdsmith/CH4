package ac.za.cput.polymorphism;

/**

 */
public class PostGrad extends Student{
    public PostGrad(String name, String studNum, double amt)
    {
        super(name, studNum, amt);
    }

    public double interest()
    {
        return getLoanAmount() * 0.10;
    }


}
