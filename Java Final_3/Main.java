/*
    * Create an interface Payable with a method calculatePayment(). Implement this interface in
    two classes, HourlyEmployee and SalariedEmployee. The HourlyEmployee class should
    have fields for hours worked and hourly rate, while the SalariedEmployee class should
    have a fixed salary field. In the main method, create objects of both employee types and
    calculate their payments using the calculatePayment() method.
  
 */

// Define the Payable interface
interface Payable {
    // Method to calculate payment
    double calculatePayment();
}

// Class: HourlyEmployee implements Payable
class HourlyEmployee implements Payable {
    // Fields: hours worked and hourly rate
    private int hoursWorked;
    private double hourlyRate;

    // Constructor
    HourlyEmployee(int hoursWorked, double hourlyRate) {
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    // Implementing the calculatePayment() method
    @Override
    public double calculatePayment() {
        return hoursWorked * hourlyRate;
    }
}

// Class: SalariedEmployee implements Payable
class SalariedEmployee implements Payable {
    // Field: fixed salary
    private double salary;

    // Constructor
    SalariedEmployee(double salary) {
        this.salary = salary;
    }

    // Implementing the calculatePayment() method
    @Override
    public double calculatePayment() {
        return salary;
    }
}

public class Main {
    public static void main(String[] args) {
        // Create an HourlyEmployee object with 4 hours worked and an hourly rate of 3060
        HourlyEmployee hourlyEmployee = new HourlyEmployee(4, 25.50);
        // Calculate and print the payment for the hourly employee
        System.out.println("Hourly Employee Payment: " + hourlyEmployee.calculatePayment() + "Taka");

        // Create a SalariedEmployee object with a fixed salary of 3060
        SalariedEmployee salariedEmployee = new SalariedEmployee(3060.00);
        // Calculate and print the payment for the salaried employee
        System.out.println("Salaried Employee Payment: " + salariedEmployee.calculatePayment() + "Taka");
        System.out.println("\n");

    }
}
