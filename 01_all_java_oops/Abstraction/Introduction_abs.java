/*
 * Topic: Abstraction 
 * obj  : Hiding the implementation details and showing only essential functionality to the user.
 
 * Two way to achieve abstraction
 
     -> 1. Abstract class (0 to 100%)
     -> 2. Interface (100%).

* 1. Abstract class:
     -> class must be declare with an abstract keyword
     -> It can have abstract and non-abstract methods.
     -> It can have constructor, variable members.
     -> Can not create an abject of an abstract class.

     * if we extends an abstract class we have to use all it's abstract method or we have to declare
     *  the class as abstract itself.

 */
abstract class Mobile_user {
    // abstract method
    abstract void send_message();

}

class Kz extends Mobile_user {
    // overriding the abstract method
    void send_message() {
        System.out.println("Sending message from Kz_Raihan");
        System.out.println("\n");

    }
}

class Raihan extends Mobile_user {
    void send_message()
    {
        System.out.println("Sending message from Raihan");
        System.out.println("\n");
    }
}


public class Introduction_abs {
    public static void main(String[] args) {
        // By using Super class reference variable access all sub class's methods.
        Mobile_user ms; // ms is reference variable
        ms = new Kz();  // create an Kz class object by using reference variable.
        ms.send_message();

        ms = new Raihan();
        ms.send_message();

        // Abstract class can't be created object
        // Mobile_user mu = new Mobile_user(); // Error: Cannot instantiate the abstract class Mobile_user
    }
}