package ac.za.cput.srp.obey;

/**

 */
public class TripCalculator implements Trip{
    private double distanceInKM;
    private double speedInKMPerHour;

    public TripCalculator(double distanceInKM, double speedInKMPerHour) {
        this.distanceInKM = distanceInKM;
        this.speedInKMPerHour = speedInKMPerHour;
    }

    public double getDistanceInKM() {
        return distanceInKM;
    }

    public void setDistanceInKM(double distanceInKM) {
        this.distanceInKM = distanceInKM;
    }

    public double getSpeedInKMPerHour() {
        return speedInKMPerHour;
    }

    public void setSpeedInKMPerHour(double speedInKMPerHour) {
        this.speedInKMPerHour = speedInKMPerHour;
    }

    public double timeTaken() {

        double timeInHours = distanceInKM / speedInKMPerHour;
        return timeInHours;
    }
}
