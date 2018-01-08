package assignment2;
//Diarmuid Beirne 15331436
public class InvalidDateException extends Exception {

    public InvalidDateException(String name, String errorMessage, String dateEntered){
        super("Error in Date/Time Format\nName of Employee: " + name + "\nError Message: " + errorMessage + "\nDate Entered: " + dateEntered + "\n \n");
    }
}
