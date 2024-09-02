/*
  * Topic: constructor
  
* obj: Constructor is a special type of method that used to initialize object.

  -> constructor has the same of as the class in which is defined.
  -> It has no return type even void
  -> constructor call automatically when create a newly object.
  
 * constructor can be categorized into three main types: 
    -> i). Default constructor
    -> ii). Parameterized constructor
    -> iii). Copy constructor

  
 */

public class Person {
    // field or variable
    public String name;
    int age;
    double height;
    String deprt;

    // Default Constructor: A default constructor that takes no parameter
    Person()
    {
        name = "Kz";
        age = 25;
        height = 5.6;
        deprt = "Engineering";
    }

    // constructor_02: Parameterized constructor with two parameter
    Person(String name, int age) // set or assign the value  
    {
        this.name = name;
        this.age = age;
    }
    
    // constructor_03: Parameterized constructor with three parameter
    Person(String name, int age, double height) // assign the value
    {
        this.name = name;
        this.age = age;
        this.height = height;
    }
    // constructor_04: Parameterized constructor with three parameter 
    Person(int age, String name, double height) // set the values
    {
        this.age = age;
        this.name = name;
        this.height = height;
    }

    // General method
    public void display()
    {
        System.out.println("Name  : " + this.name);
        System.out.println("Age   : " +this.age);
        System.out.println("Height: " +this.height );
        System.out.println("Depart: " +this.deprt);
        
    }


}

public class All_type_constructor_05 {
    public static void main(String[] args) {
        System.out.println("Default Constructor");
        // Create an object of Person class using default constructor
        Person obj_01 = new Person(); // call the default constructor
        obj_01.display();

        System.out.println("Parameterized constructor_02: ");
        // Create an Second of Person class using parameterized constructor_02
        Person obj_02 = new Person("Ra", 30); // call the parameterized constructor_02
        obj_02.display();

        System.out.println("Parameterized constructor_03: ");

        // Create an Third object of Person class using Parameterized constructor_03
        Person obj_03 = new Person("Sk", 25, 6.0); // called constructor which contain three parameter in order(string, age, double) 
        obj_03.display();

        System.out.println("Parameterized constructor_04: ");

        // Create Four object of person class using parameterized constructor_04 
        Person obj_04 = new Person(26, "Az", 5.9); // called constructor_04 which contain three parameter in order of(int, string, double)
        obj_04.display();
    }
    
}
