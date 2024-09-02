/*
 * Topic: Inheritance in java
 * obj: It is a fundamental concept in oops that allow a new class to inherit(acquire) properties and behaviors(fields and methods) from an existing(another) class.
 * 
   here, 
            new class = child, subclass, drived class
            existing class = parent, superclass, base class
    
    * syntax:
       public class Parent_class{
         -------
         -------
       }
      public class Child_class extends Parent_class{
         * here, already come the public properties(fields and methods) from  Parent_class class.
   
      } 
 */
// * Here Basic inheritance operation with only public members
class Person {
  // field
  public String name;
  public int age;

  // Method
  void display_info() {
    System.out.println("Name: " + name);
    System.out.println("Age: " + age);
  }
}

class Teacher extends Person {
  // already here-> name,age, display_info()
  
  // Additional fields
  public String Quali;

  void display_teacher_info()
  {
    display_info();
    System.out.println("Qualification: " + Quali);
    System.out.println("\n\n");
  }
}

public class Basic_inheritance {
  public static void main(String[] args) {
    // create an object for Teacher to initialize instant of class(variable).
    Teacher obj_1 = new Teacher();
    
    // Direct initialize the class variable 
    obj_1.name = "Kz_Raihan";
    obj_1.age = 23;
    obj_1.Quali = "Bsc in CSE";

    // Call the method
    obj_1.display_teacher_info(); // it will call display_info() and display_teacher_info() separately. 

    // create an object two initialize class variable
    Teacher obj_2 = new Teacher();
    
    // Direct initialize the class variable
    obj_2.name = "Rani_Khan";
    obj_2.age = 25;
    obj_2.Quali = "Msc in CSE";

    // call the teacher class method
    obj_2.display_teacher_info();
    

    }
}
