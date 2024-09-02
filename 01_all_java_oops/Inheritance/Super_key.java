/*
* Topic: Super keyword
* obj  : Super keyword is used to refer immediate super class object.

usage:
  -> It is used to subclass call super class instance variable.
  -> It is used to subclass call super class method(overridden method).
  -> It is used to subclass call super class constructor.

*  Syntax:
*  super_keyword.variable_name/constructor_name/method_name

 -> this is the first statement of subclass constructor or method.(overridden method)


*/
// * used to subclass call super class variable and constructor
class Super_class{
    // fields
    public int age = 20;

    // Default constructor
    Super_class(){
        System.out.println("Super_class constructor");
    }
    // General method
    public void display(){
        System.out.println("Super_class Method");
    }

}

class Sub_class extends Super_class{
    // already come super_class public members (age, display() )

    // Additional fields
    
    // Subclass field with the same name as in superclass (This variable hides the superclass variable)
    public int age = 22;  //  this variable is more priority rather than super class variable

    // Default constructor
    Sub_class()
    {
        super();  // calling super class constructor
        System.out.println("Sub_class constructor");
    }

    // General method
    public void display_info()
    {
        System.out.println("Sub_class Method"); 
        System.out.println("Sub_class Age: " + age); // access sub class variable
        
        super.display();  // calling super class method
        System.out.println("Super_class Age: " +super.age); // access sub class variable
    }
}

public class Super_key {
    public static void main(String[] args) {
        // Creating an instance of Sub_class, which also calls the Super_class constructor

        Sub_class obj_1 = new Sub_class(); // calling and initialize by null value in default constructor form  Sub_class.
        obj_1.display_info(); // calling method with access to super class variable and method.

    }
    
}
