package ac.za.cput.inheritance;

/**

 */
public class Circle
{
    private double radius;

    public Circle()
    {
    }

    public Circle(double rad)
    {
        radius = rad;
    }

    public void setRadius(double rad)
    {
        radius = rad;
    }

    public double getRadius()
    {
        return radius;
    }

    public double diameter()
    {
        return radius * 2;
    }

    public double circumference()
    {
        return Math.PI * diameter();
    }

    public double area()
    {
        return Math.PI * Math.pow(radius,2);
    }

    public String toString()
    {
        return String.format("\n\nThe radius of the circle is: %.2f \nThe diameter of the circle is: %.2f \nThe circumference of the circle is: %.2f \nThe area of the circle is: %.2f", radius, diameter(), circumference(), area());
    }

}


