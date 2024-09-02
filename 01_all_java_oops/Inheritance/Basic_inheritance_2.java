/*
 * Topic: Inheritance in java
 * obj: It is a fundamental concept in oops that allow a new class to inherit(acquire) properties and behaviors(fields and methods) from an existing(another) class.

 * Never inheritance the private members but access private members by using set_method and get_method
 */

// * Here Basic inheritance operation with  public and private members By using set_method(initialize the value) and get_method(get the value)
class Person {
  // public field
  public String name;

  // private fields
  private int age;
  private String address;

  // set_method :to set or initialize the value
  public void set_age(int age) {
      this.age = age;
  }
  // get_method : to get the value
  public int get_age()
  {
      //   System.out.println("Age: " + age);
      return age;
  }
    
  // set_address : initialize the address
public void set_address(String address)
{
    this.address = address;

}

// get_address : to get the address
  public String get_address()
  {
      //   System.out.println("Address: " + address);
      return address;
  }
  // Method : to display the values
  void display_info() {
    System.out.println("Name: " + get_age()); // calling the get_age()
    System.out.println("Age: " + get_address()); // calling the get_address()
  }
    

  
}

class Teacher extends Person {
  // already here->(public members) name,age, display_info()  but don't came the public members
  
  // Additional fields
  private String Quali;

  // set_method: to set the Quali class variable
public void set_Quali(String Quali)
{
    this.Quali = Quali; 
}
  // get_method: to get the Quali class variable
public String get_Quali()
{
    return Quali;
}


  void display_teacher_info()
  {
    display_info(); // calling the Super class method
    System.out.println("Qualification: " +get_Quali()); // Calling the subclass method
    System.out.println("\n\n");
  }
}

public class Basic_inheritance_2 {
  public static void main(String[] args) {
    // create an object for Teacher to initialize instant of class(variable).
    Teacher obj_1 = new Teacher();
    
    // set or initialize the private member form super class variable by using sub class object
    obj_1.set_age(23);
    obj_1.set_address("Bangladesh");
    obj_1.set_Quali("CSE Engineer"); // this the subclass member

    // Access or display the class variable
    obj_1.display_teacher_info();


    // create another object for Teacher to initialize the class variable(super and sub classes)

    Teacher obj_2 = new Teacher();
    
    // super class variable initialize
    obj_2.set_age(25);
    obj_2.set_address("Finland");

    // initialize or set the subclass variable
    obj_2.set_Quali("Msc in CSE"); // this the subclass member

      // Access or display the class variable
    obj_2.display_teacher_info();
    

    

    }
}
