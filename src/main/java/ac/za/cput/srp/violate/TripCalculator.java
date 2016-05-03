package ac.za.cput.srp.violate;

/**
 *
 */
public class TripCalculator {
    private double distance;
    private double speed;

    public TripCalculator(double distance, double speed) {
        this.distance = distance;
        this.speed = speed;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double timeTaken() {
        double distanceInKm = distance*1.62;

        double timeInHours = distanceInKm/speed;
        return timeInHours;
    }
}
