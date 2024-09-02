/*
 * Scenario2 : You are building a payroll system that handles different types of employees.
 * Each type of employee has a specific way of calculating their salary, but all employees share some common properties like name and employeeId.


* Employee: This abstract class represents any employee in the company. 
  -> It includes an abstract method calculateSalary() that each type of employee must implement,
     as well as a method displayDetails() to show basic information about the employee.

    -> abstract class name  : Employee
    -> Field                : name, employeeId
    -> abstract method      : calculateSalary()
    -> method               : displayDetails() // name , employeeId


* FullTimeEmployee: This class extends Employee and implements the calculateSalary() method based on a fixed monthly salary.

   -> class name  : FullTimeEmployee
   -> Field          : monthlySalary
   -> Overriding method: calculateSalary()  -> to calculate the monthly salary. (fixed_salary)

* PartTimeEmployee: This class extends Employee and implements the calculateSalary() method based on an hourly rate and the number of hours worked
  
  -> class name  : PartTimeEmployee
  -> Field            : hourlyRate, hoursWorked
  -> Overriding method: calculateSalary()  -> to calculate the monthly salary. (hourlyRate * hoursWorked )


 */
abstract class Employee {
    int emp_id;
    String name;

    // abstract method
    abstract double cal_salary();

    // constructor : to initialize the values
    Employee(int emp_id, String name) {
        this.emp_id = emp_id;
        this.name = name;
    }

    // method to display employee details
    void display_info() {
        System.out.println("Name  : " + name);
        System.out.println("Emp_ID: " + emp_id);
        System.out.println("Salary: " + cal_salary());
    }

}

class Full_T_Emp extends Employee {
    double mon_salary;

    // constructor : to initialize the values
    Full_T_Emp(int emp_id, String name, double mon_salary) {
        super(emp_id, name);
        this.mon_salary = mon_salary;
    }

    // overriding method
    @Override
    double cal_salary() {
        return mon_salary;

    }

}

class Part_T_Emp extends Employee {
    double hourly_rate;
    int hours_worked;
    
    // constructor : to initialize the values
    Part_T_Emp(int emp_id, String name, double hourly_rate, int hours_worked) {
        super(emp_id, name);
        this.hourly_rate = hourly_rate;
        this.hours_worked = hours_worked;
    }
    
    // overriding method
    @Override
    double cal_salary() {
        return hourly_rate * hours_worked;
    }
}

public class Lab_5 {
    public static void main(String[] args) {
        // Create an object for class Full_T_Emp
        System.out.println("Full Time Employee Details");
        Full_T_Emp full_time = new Full_T_Emp(4039, "Kz_Raihan", 505050);
        full_time.display_info();
        
        // Create an object for class Part_T_Emp
        System.out.println("\nPart Time Employee Details");
        Part_T_Emp part_time = new Part_T_Emp(2000, "Rahim", 200, 80);
        part_time.display_info();
        
    }
    
}
