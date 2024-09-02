/*
 * Topic: Assignment Four
   Obj: 1. Imagine you are tasked with creating a Student class for a university's student management system. 
           Each student should have a unique ID, a name, and an age. 
           The  age should be accessible but validated upon setting to ensure they meet certain criteria.Task:
  
  * Your task is to implement the Student class with the following requirements:
  *   Private variables: id , name, and age.Constructor to initialize name and age.Getter methods for id, name, and age.
  *   Setter methods for name and age with appropriate validation:
  
  *   >> age should be between 18 and 100 years inclusive.
 */
public class Student_class {
    // Fields
    private String id;
    private String name;
    private int age;

    // Constructor
    Student_class(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Get name
    public String Get_name() {
        return name;
    }

    // Get age
    public int Get_age() {
        if (age >= 18 && age <= 100) {
            return age;

        } else {
            System.out.println("Invalid age");
            return age;
        }

    }

    // Set id 
    public void Set_id(String id) {
        this.id = id;
    }

    // Get id
    public String Get_id() {
        return id;
    }

}
    
// NNB: when we using set value function than function type void (return type)
//    >> when use get value function than function name depends on what type of data get (Depends on : return type value)

