package assignment2;// Definition of class HourlyWorker

import java.time.LocalDateTime;

public final class HourlyWorker extends Employee {

    private double wage; // wage per hour
    private double hours; // hours worked for week

    // constructor for class HourlyWorker
    public HourlyWorker(String first, String last,
                        double wagePerHour, double hoursWorked, int year, int month, int day, int hour, int minute) {
        super(first, last, year, month, day, hour, minute); // call superclass constructor
        setWage(wagePerHour);
        setHours(hoursWorked);
    }

    // Set the wage
    public void setWage(double wagePerHour) {
        wage = (wagePerHour > 0 ? wagePerHour : 0);
    }

    // Set the hours worked
    public void setHours(double hoursWorked) {
        hours = (hoursWorked >= 0 && hoursWorked < 168
                ? hoursWorked : 0);
    }

    // Get the HourlyWorker's pay
    public double earnings() {
        return wage * hours;
    }

    public String toString() {
        return "Hourly worker: " + super.toString();
    }
}
