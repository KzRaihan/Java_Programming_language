/*
  * Topic: constructor with this keyword
  

  * Use 'this' keyword to minimizes code
  features:
    -> 'this' keyword refers to the current class constructor 
  
 */

public class Person {
    // field or variable
    public String name;
    int age;
    double height;
    String deprt;

    // constructor_01: Parameterized constructor with two parameter
    Person(String name, int age) // set or assign the value  
    {
        this.name = name;
        this.age = age;
    }
    
    // constructor_02: Parameterized constructor with three parameter
    Person(String name, int age, double height) // assign the value
    {
        // this.name = name;
        // this.age = age;
        this(name,age); // this line means to call the previous constructor
        this.height = height;
    }
    // constructor_03: Parameterized constructor with three parameter 
    Person(int age, String name, double height) // set the values
    {
        // this.age = age;
        // this.name = name;
        this(name, age, height);
        // this.height = height;
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

public class this_keyword_05 {
    public static void main(String[] args) {

        System.out.println("Parameterized constructor_01: ");
        // Create an Second of Person class using parameterized constructor_01
        Person obj_02 = new Person("Kz", 22); // call the parameterized constructor_01
        obj_02.display();

        System.out.println("Parameterized constructor_02: ");

        // Create an Third object of Person class using Parameterized constructor_02
        Person obj_03 = new Person("Sk", 24, 6.2); // called constructor which contain three parameter in order(string, age, double) 
        obj_03.display();

        System.out.println("Parameterized constructor_03: ");

        // Create Four object of person class using parameterized constructor_03 
        Person obj_04 = new Person(26, "Az", 5.9); // called constructor_04 which contain three parameter in order of(int, string, double)
        obj_04.display();
    }
    
}
