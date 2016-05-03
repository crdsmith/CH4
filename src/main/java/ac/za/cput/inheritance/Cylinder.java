package ac.za.cput.inheritance;

/**

 */
public class Cylinder extends Circle
{
    private double cylHeight;

    public Cylinder()
    {
    }

    public Cylinder(double rad, double height)
    {
        super(rad);
        cylHeight = height;
    }

    public void setHeight(double height)
    {
        cylHeight = height;
    }

    public void setRadius(double rad)
    {
        super.setRadius(rad);
    }

    public double getCylinderArea()
    {
        double cArea = (super.area()*2) + (cylHeight*super.circumference());
        cArea = Math.round(cArea * 100.0) / 100.0;
        return cArea;
    }

    public double getCylinderVolume()
    {
        double cVolume = Math.PI * Math.pow(super.getRadius(),2) * cylHeight;
        cVolume = Math.round(cVolume * 100.0) / 100.0;
        return cVolume;
    }

    public String toString()
    {
        return String.format(super.toString() + "\nCylinder Area: " + getCylinderArea() + "\nCylinder Volume: " + getCylinderVolume());
    }
}
