package assignment2;// Abstract base class Employee.

//Diarmuid Beirne 15331436
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Calendar;


public abstract class Employee {

    private String firstName;
    private String lastName;
    private LocalDateTime joinDate;

    // constructor
    public Employee(String first, String last, int year, int month, int day, int hour, int minute){
        firstName = first;
        lastName = last;
        try {
            this.setJoinDate(year, month, day, hour, minute);
        }
        catch (InvalidDateException e){
            System.out.println(e.getMessage());
        };
    }

    // get first name
    public String getFirstName() {
        return firstName;
    }

    // get last name
    public String getLastName() {
        return lastName;
    }

    public String toString() {
        return firstName + ' ' + lastName;
    }

    public abstract double earnings();

    public LocalDateTime getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(int year, int month, int day, int hour, int minute) throws InvalidDateException{
        String dateTimeString = String.valueOf(day) + "/" + String.valueOf(month) + "/" + String.valueOf(year) + "  " + String.valueOf(hour) + ":" + String.valueOf(minute);
        String fullName = this.firstName + " " + this.lastName;
        LocalDateTime now = LocalDateTime.now();
        int[] daysInMonth =  {31,28,31,30,31,30,31,31,30,31,30,31};
        int[] daysInMonthLeap =  {31,29,31,30,31,30,31,31,30,31,30,31};






        //Exceptions
        //Month out of Range
        if(month > 12) throw new InvalidDateException(fullName, "Month is Out of Range", dateTimeString);
        //Date earlier than 1990
        if(year < 1990) throw new InvalidDateException(fullName, "Date entered is pre 1990. Please Enter a Date after 1990", dateTimeString);
        // Check day is out of range according to the month

        if(year % 4 == 0) {
            if (day > daysInMonthLeap[month - 1])
                throw new InvalidDateException(fullName, "Date entered falls out of range for month entered", dateTimeString);
        }
        else {
            if (day > daysInMonth[month - 1])
                throw new InvalidDateException(fullName, "Date entered falls out of range for month entered", dateTimeString);
        }
        //Date in the Future
        if((LocalDateTime.of(year, month, day, hour, minute).isAfter(now))) throw new InvalidDateException(fullName, "Date Entered is the future", dateTimeString);
        //Time Between 09:00 and 18:00
        if(LocalTime.of(hour, minute).isBefore(LocalTime.of(9,00)) || LocalTime.of(hour, minute).isAfter(LocalTime.of(18,00))) {
            throw new InvalidDateException(fullName, "Time must be between 09:00 and 18:00", dateTimeString);
        }

        //Check if weekend
        if(LocalDateTime.of(year, month, day, hour, minute).getDayOfWeek() == DayOfWeek.SATURDAY || LocalDateTime.of(year, month, day, hour, day).getDayOfWeek() == DayOfWeek.SUNDAY )
        {
            throw new InvalidDateException(fullName, "Date Entered is during a weekend", dateTimeString);
        }



        this.joinDate = (LocalDateTime.of(year, month, day, hour, minute));
    }
}
