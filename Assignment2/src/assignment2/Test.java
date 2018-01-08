package assignment2;// Driver for Employee hierarchy
//DIARMUID BEIRNE 15331436
// Java core packages
import java.text.DecimalFormat;
import java.time.LocalDateTime;

// Java extension packages
import javax.swing.JOptionPane;

public class Test {

    // test Employee hierarchy
    public static void main(String args[]) {
        Employee employee; // superclass reference
        String output = "";

        Boss boss = new Boss("John", "Smith", 800.0, 1985, 6,30,13,12);

        CommissionWorker commissionWorker =
                new CommissionWorker(
                "Sue", "Jones", 400.0, 3.0, 150, 2020, 8,4,10,23);

        PieceWorker pieceWorker =
                new PieceWorker("Bob", "Lewis", 2.5, 200, 1996, 2,29,9,35);

        HourlyWorker hourlyWorker =
               new HourlyWorker("Karen", "Price", 13.75, 40, 2010, 13,9,14,45);

        Boss boss1 = new Boss("Michael", "Seal", 800.0, 2008, 10,27,8,33);

        CommissionWorker commissionWorker1 =
                new CommissionWorker(
                        "John", "Dunne", 400.0, 3.0, 150, 2003, 1,18,11,14);

        PieceWorker pieceWorker1 =
                new PieceWorker("Mark", "Vedder", 2.5, 200, 1999, 2,30,16,11);

        HourlyWorker hourlyWorker1 =
                new HourlyWorker("Dermott", "Kennedy", 13.75, 40, 2015, 7,8,12,37);

        DecimalFormat precision2 = new DecimalFormat("0.00");

// Employee reference to a Boss
      /*  employee = boss;

        output += employee.toString() + " earned $"
                + precision2.format(employee.earnings()) + "\n"
                + boss.toString() + " earned $"
                + precision2.format(boss.earnings()) + "\n";

        // Employee reference to a CommissionWorker
        employee = commissionWorker;

        output += employee.toString() + " earned $"
                + precision2.format(employee.earnings()) + "\n"
                + commissionWorker.toString() + " earned $"
                + precision2.format(
                commissionWorker.earnings()) + "\n";

        // Employee reference to a PieceWorker
        employee = pieceWorker;

        output += employee.toString() + " earned $"
                + precision2.format(employee.earnings()) + "\n"
                + pieceWorker.toString() + " earned $"
                + precision2.format(pieceWorker.earnings()) + "\n";

// Employee reference to an HourlyWorker
        employee = hourlyWorker;

        output += employee.toString() + " earned $"
                + precision2.format(employee.earnings()) + "\n"
                + hourlyWorker.toString() + " earned $"
                + precision2.format(hourlyWorker.earnings()) + "\n";

        JOptionPane.showMessageDialog(null, output,
                "Demonstrating Polymorphism",
                JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);*/
    }
} // end class Test
