/*
 * Employee: 
        This abstract class represents any employee in the company. It includes an abstract method calculateSalary()
        that each type of employee must implement, as well as a method displayDetails() to show basic information about the employee.

        -> Fields
              id      : unique identifier for each employee
             name     : name of the employee
            department: department where the employee works
        
        -> Method
           calculateSalary() : returns the salary of the employee
           displayDetails()  : 

* FullTimeEmployee: 
        This class extends Employee and implements the calculateSalary() method based on a fixed monthly salary.
        
        -> Fields
        monthlySalary : monthly salary of the full-time employee
        
        -> Method
        calculateSalary() : returns the monthly salary multiplied by 12 (to get the annual salary)

* PartTimeEmployee: 
        This class extends Employee and implements the calculateSalary() method based on an hourly rate and the number of hours worked.
        
        -> Fields
        hourlyRate    : hourly rate of the part-time employee
        hoursWorked  : number of hours worked by the part-time employee
        
        -> Method
        calculateSalary() : returns the hourly rate multiplied by the number of hours worked


 */

// Abstract class: Employee
abstract class Employee {
    String name;
    int employeeId;

    // Constructor to initialize employee details
    Employee(String name, int employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }

    // Abstract method to calculate salary
    abstract double calculateSalary();

    // Method to display basic employee details
    void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID  : " + employeeId);
    }
}

// FullTimeEmployee class extends Employee
class FullTimeEmployee extends Employee {
    double monthlySalary;

    // Constructor to initialize full-time employee details
    FullTimeEmployee(String name, int employeeId, double monthlySalary) {
        super(name, employeeId);
        this.monthlySalary = monthlySalary;
    }

    // Implementing the abstract method to calculate salary
    @Override
    double calculateSalary() {
        return monthlySalary;
    }
}

// PartTimeEmployee class extends Employee
class PartTimeEmployee extends Employee {
    double hourlyRate;
    int hoursWorked;

    // Constructor to initialize part-time employee details
    PartTimeEmployee(String name, int employeeId, double hourlyRate, int hoursWorked) {
        super(name, employeeId);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    // Implementing the abstract method to calculate salary
    @Override
    double calculateSalary() {
        return hourlyRate * hoursWorked;
    }
}

public class PayrollSystemDemo {
    public static void main(String[] args) {
        // Creating a full-time employee object
        FullTimeEmployee ftEmployee = new FullTimeEmployee("Kz", 100, 50000.00);
        // Creating a part-time employee object
        PartTimeEmployee ptEmployee = new PartTimeEmployee("Ra", 101, 30.00, 120);

        // Displaying details and calculating salary for full-time employee
        ftEmployee.displayDetails();
        System.out.println("Salary       : $" + ftEmployee.calculateSalary());
        System.out.println();

        // Displaying details and calculating salary for part-time employee
        ptEmployee.displayDetails();
        System.out.println("Salary       : $" + ptEmployee.calculateSalary());
    }
}
