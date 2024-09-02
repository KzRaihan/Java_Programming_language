/*
Topic: Assignment_03
   Create a class in java name Persons with three fields name, age and height.
 *  Use a parameterized constructor. Define 2 user-defined methods 
 *  i. to print all the properties 
 *  ii. check whether the person's height is greater than 5 feet or not. Create 3 objects and use the methods.
 */
import java.util.*;

public class Persons {
  // Fields or variable
  public String name; // for public: in not mandatory to assign before String
  int age;
  double height;

  // Constructor
  Persons(String name, int age, double height)
  {
    // setting the value
    this.name = name;
    this.age = age;
    this.height = height;   
  }
  // Method_01 to print all properties
  public void display_properties()
  {
    System.out.println("Name   : " + name);
    System.out.println("Age    : " + age);
    System.out.println("Height : " + height);
  }

  // Method_02 to Check height greater or not
  public void Check_height()
  {
    if(height > 5)
    {
      System.out.println("\t\tTrue");
      System.out.println("Height is Greater than 5");
    }
    else {
      System.out.println("\t\tFalse");
      System.out.println("Height is Less than or equal to 5");
    }
  }

  public static void main(String args[]) {
    // object one
    Persons obj1 = new Persons("Kz", 23, 5.6);
    obj1.display_properties();
    obj1.Check_height();
    System.out.println("----------------------------------------------------\n");

    // object two
    Persons obj2 = new Persons("Raihan", 90, 5.8);
    obj2.display_properties();
    obj2.Check_height();
    System.out.println("----------------------------------------------------\n");
    
    // object three
    Persons obj3 = new Persons("Rahim", 16, 4.5);
    obj3.display_properties();
    obj3.Check_height();
  }

}
/*
  public void input_user()
  {
    Scanner sc = new Scanner(System.in);

    System.out.print("\nEnter any integer: ");
    obj.name = sc.nextInt();

  }
 */
