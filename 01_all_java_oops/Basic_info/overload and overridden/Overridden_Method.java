/*
 * Topic: Overridden Method
 * obj  : super class same method use in subclass 
 * 
 * * super keyword used to refer the overridden method
 */
class Person_class {
    // field
    public String name;
    public int age;

    // Constructor : to initialize the object value
    Person_class(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method: to display the values
    public void display_info() {
        System.out.println("Name      : " + name);
        System.out.println("Age       : " + age);
        System.out.println("----------------------------------------\n\n");

    }
}

class Student_class extends Person_class {
    //already come: -> name, age, display_info()
    // additional field
    public int id;
    public int mobile;
    public String address;

    // Constructor
    Student_class(String name, int age,int id, int mobile, String address)
    {
        super(name, age);
        this.id = id;
        this.mobile = mobile;
        this.address = address;
    }
    // Overridden method:
    public void display_info() {
        super.display_info();
        System.out.println("ID        : " + id);
        System.out.println("Mobile    : " + mobile);
        System.out.println("Address   : " + address);
        System.out.println("----------------------------------------\n\n");
    }

}


public class Overridden_Method {
    public static void main(String[] args) {
        // Creating object of Student_class
        Student_class student = new Student_class("Raihan",22, 4039, 770, "Dhaka");
        // Calling overridden method
        student.display_info();
        

    }
    
}
