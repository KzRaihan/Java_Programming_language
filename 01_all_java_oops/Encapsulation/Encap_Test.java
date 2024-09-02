/*
 * Topic: Encapsulation in java
 * 
 *  > Encapsulation is a process of 
 *                -> packaging variable and method into a single unit.
 *                -> Protecting data by declaring them as private(Hide data).  
 * 
 * key Benefit:
     -> Data Hiding
            --> By Making field private

     -> Controlled access:
            --> when access private members, we can must using public method or constructor.

     -> Flexibility and Maintainability:
            --> internal implementation is hidden, we can change the internal implementation without
                affecting other part of the code.
                
     -> Improve Security:
 *                
 */
// * Encapsulation is the protecting data by declaring them as private 
class Student {
    // public field member(variable)
    public String name;

    // Private field member(variable)
    private int age;
    private double salary;


    // create an constructor to initialize public field
    Student(String name)
    {
        this.name = name;
    }
    
    // create a public method to set private field(age)
    public void set_value(int age, double salary)
    {
        this.age = age;
        this.salary = salary;

    }
    // create an public method to get private and public fields
    public void get_value()
    {
        System.out.println("Name  : " + this.name);
        System.out.println("Age   : " + this.age);
        System.out.println("Salary: " + this.salary);
    }



}

public class Encap_Test {
    public static void main(String[] args) {
        System.out.println("\nFirst object(student_01) Properties");
        // Create an object to initialize of instant of class(variable)
        Student student_01 = new Student("Kz_Raihan");
        
        // set_value method to set private field(age and salary)
        student_01.set_value(25, 50000.0);
        
        // get_value method to get private and public fields
        student_01.get_value();

        // create another object to access and initialize class variable
        System.out.println("\nSecond object(student_02) Properties");

        Student student_02 = new Student("Raihan");
        
        // set_value method to set private field(age and salary)
        student_02.set_value(30, 80000.0);
        
        // get_value method to get private and public fields
        student_02.get_value();
        


        System.out.println("\n\n");
    }
    
}
