package ac.za.cput.dip.obey;

/**
 *
 */
public class AgeCalculator implements Calculator {
    private int yearOfBirth;
    private int currentYear;


    public AgeCalculator(int yearOfBirth, int currentYear) {
        this.yearOfBirth = yearOfBirth;
        this.currentYear = currentYear;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public int getCurrentYear() {
        return currentYear;
    }

    public void setCurrentYear(int currentYear) {
        this.currentYear = currentYear;
    }

    public int calculateAge()
    {
        return currentYear - yearOfBirth;
    }
}
