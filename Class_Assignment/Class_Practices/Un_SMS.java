/*
 * 1. Imagine you are tasked with creating a Student class for a university's student management system.
 *   Each student should have a unique ID, a name, and an age. 
 *   The  age should be accessible but validated upon setting to ensure they meet certain criteria.Task:
    Your task is to implement the Student class with the following requirements:
    Private variables: id , name, and age.Constructor to initialize name and age.Getter methods for id, name, and age.
    Setter methods for name and age with appropriate validation:
          * age should be between 18 and 100 years inclusive.

    Class: Student
     *  Field:
           private id, name, age
     *  Constructor:
           name, age (initialize two values)
     *   Setter method:
           id
     *   getter_name:
          return the name

     *   getter_id:
          return id

     *   getter_age:
        Validation
            return the age
       
           
 */
class Student {
    // field
    private String name;
    private int id, age;

    // Constructor
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // setter_id
    void setter_id(int id)
    {
        this.id = id;
    }

    // getter_name
    String getter_name() {
        return name;
    }
    // getter_id
    int getter_id() {
        return id;
    }

    // getter_age with check validation
    int getter_age() {
        if (age >= 18 && age <= 100) {
            return age;
        } else if (age < 18 || age > 100) {
            System.out.println("Age is not valid");
            return age;
        }
        else {
            return 0;
        }
    }
    // display all information
    void display_info()
    {
        System.out.println("Name  : " + getter_name());
        System.out.println("ID    : " + getter_id());
        System.out.println("Age   : " + getter_age());
    }

}


public class Un_SMS {
    public static void main(String[] args) {
        Student student1 = new Student("Kz_Raihan", 2);
        student1.setter_id(4039);
        student1.display_info();
    }
    
}
