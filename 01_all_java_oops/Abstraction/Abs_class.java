/*
 * Topic: Abstract class 
 
*>> By Access and assign the super class reference variable

 * when we use the super class reference variable to access and assign the data 
 * we only access and assign super class method and field (abstract and non-abstract)
 * Can't access the which method which is not present in super class
 */
abstract class MOB_USE {
    // field
    String name;

    // constructor
    MOB_USE(String name) {
        this.name = name;
    }

    // abstract method
    abstract void user();  // this is the syntax abstract method is no body in super class.

    // non-abstract method
    void display() {
        System.out.println("Name: " + name);
    }
}

class Kz extends MOB_USE {
    // already come-> name, user(), display()
    // must be user the user() method

    // constructor
    Kz(String name) {
        super(name);
    }

    // abstract method
    @Override
    void user() {
        System.out.println("HI, this is Kz");
    }

    // non-abstract method
    void kz_display() {
        System.out.println("This is non-abstract method form Kz class");
    }
}

class Rahim extends MOB_USE {
    // already come-> name, user(), display(),
    // must be use user() method

    // field
    int age;

    // constructor
    Rahim(String name, int age) {
        super(name);
        // this.name = name;
        this.age = age;
    }

    // abstract method
    @Override
    void user() {
        System.out.println("HI, this is Ra");
    }

    // non-abstract method
    void Ra_display() {
        System.out.println("This is non abstract method form Rahim class");
        // System.out.println("Name: "+);
        display();
        System.out.println("Age: " + age);
    }

}

// * when we use the super class reference variable to access and assign the data 
// * we only access and assign super class method and field (abstract and non-abstract)
// * Can't access the which method which is not present in super class

public class Abs_class {
    public static void main(String[] args) {
        MOB_USE var1; // var1 is the reference variable

        var1 = new Kz("Kz_Raihan"); // using super class reference variable to create an object Kz class which is Kz().
        var1.display(); // By using super class reference variable to access the super class non-abstract method
        
        var1.user(); // By using super class reference variable to access the Kz class abstract method
        
        // create an object for Kz class
        Kz var2 = new Kz("Raihan"); // pass the name but can't display
        //* kz_display() method is not present in super class that way we create an object for Kz class
        var2.kz_display(); // calling the non-abstract class form Kz class
       
        // by using super class reference variable to access the  Rahim class method
        // var1 = new Rahim("Sk_Rahim", 23);
        // var1.user();

        Rahim var3 = new Rahim("SK_Rahim", 20);
        var3.Ra_display();
        var3.user();


        
    }
    
}
