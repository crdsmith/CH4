package ac.za.cput.dip.violate;

import ac.za.cput.dip.obey.*;
import ac.za.cput.dip.obey.Calculator;

/**
 *
 */
public class AgeCalculatorViolate {

    private int yearOfBirth;
    private int currentYear;
    CalculatorViolate calculatorViolate = new CalculatorViolate();


    public AgeCalculatorViolate(int yearOfBirth, int currentYear) {
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
       return calculatorViolate.calculateAge(yearOfBirth, currentYear);
    }

}
