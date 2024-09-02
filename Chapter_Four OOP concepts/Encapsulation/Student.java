/* 
 * 1. Imagine you are tasked with creating a Student class for a university's student management system.
  Each student should have a unique ID, a name, and an age. The  age should be accessible but validated
  upon setting to ensure they meet certain criteria.Task:
  Your task is to implement the Student class with the following requirements:Private variables: id , name, and age.
  Constructor to initialize name and age.Getter methods for id, name, and age.Setter methods for name and age 
  with appropriate validation:
  age should be between 18 and 100 years inclusive.
 

 * Key point:
   class name = Student
   private fields = id, name and age.
   constructor = initialize name and age
   set method = set the value of id
   get method = to get or display id, name and age(where age should be between 18 and 100 years inclusive).


 */
// * by using only one class do this problem but we use two class.

// First class : management system contains all Properties and action
class Management_System {
    // Private field or members
    private int id;
    private String name;
    private int age;
    
    // Constructor to initialize name and age
    Management_System(String name, int age)
    {
        this.name = name;
        this.age = age;
    }
    // set method : to set or initialize the id
    void set_id(int id)
    {
        this.id = id;

    }

    // get_id method: to display the id
    public int get_id()
    {
        return id;
    }

    // get_name method: to display the name
    public String get_name()
    {
        return name;
    }

    // get_age method: to display the age
    public int get_age()
    {
        if (age >= 18 && age <= 100) // here both cds are true then run this body part
        {
            return age; // body
        } else {
            System.out.println("Invalid age");
            return age;
        }

    }
    
    // Display all 
    void display()
    {
        System.out.println("ID  : " + get_id());
        System.out.println("Name: "+ get_name());
        System.out.println("Age: " + get_age());

        System.out.println("\n\n");
    }
    
    
}


// Second class : By using this class we assign and access the First class properties
public class Student {
    public static void main(String[] args) {
        // Create an object to initialize the values (name, age)
        Management_System obj_1 = new Management_System("Kz", 23);
        // by using object to initialize id
        obj_1.set_id(4039);
        // to get or display all Properties
        obj_1.display();

        
    }

}

