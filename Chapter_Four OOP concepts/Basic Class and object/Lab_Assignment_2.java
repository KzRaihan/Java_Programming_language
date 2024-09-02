/*
 * 1. Create a class in java name Persons with three fields name, age and height. Use a parameterized constructor. Define 2 user-defined methods 
  >> i. to print all the properties 
  >> ii. check whether the person's height is greater than 5 feet or not. 
  >> Create 3 objects and use the methods.
 */
class Person
{
    String name;
    int age;
    double height;
    
    // parameterized constructor method
    Person(String name, int age, double height)
    {
        this.name = name;
        this.age = age;
        this.height = height;
        
    }
    
    // method one to display all Properties
    public void Display()
    {
        System.out.println("Name     : "+name);
        System.out.println("Age       : "+age);
        System.out.println("Height   : "+height);
       
    }
    // Method two to check height is greater than 5 or not
    public void Check_height()
    {
        if(height > 5)
        {
            System.out.println("Yes! Height is Greater than 5 ");
            System.out.println("Height : " + height);

        }
        else
        {
            System.out.println("No! Height is no Greater then 5");
            System.out.println("Height : " + height);
        }
    }
    
}
public class Lab_Assignment_2{
    
    public static void main(String[]args)
    {
        // create  first object(Kz)
        Person Kz = new Person("Kz", 23, 5.6);
        Kz.Display();
        Kz.Check_height();
        
        // Create second object(Ra)
        System.out.println("\n");
        Person Ra = new Person("Raihan", 20,4.6);
        Ra.Display();
        Ra.Check_height();
        
        System.out.println("\n");
        
        // create Third object (Sk)
        Person Sk = new Person("SK",  30, 5.0);
        Sk.Display();
        Sk.Check_height();
        
        System.out.println("\n");
        
        
    }
    
}