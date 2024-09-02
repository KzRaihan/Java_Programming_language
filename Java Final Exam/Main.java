/*
 * Create a Java program that demonstrates single inheritance and method overriding. Define
    a base class Vehicle with a method startEngine() that prints "Vehicle engine started".
    Create a derived class Car that overrides the startEngine() method to print "Car engine
    started". In the main method, create an object of Car and call the startEngine() method. 

 */

// Base class: Vehicle
class Vehicle {
    // Method to start the engine
    void startEngine() {
        System.out.println("Vehicle engine started");
    }
}

// Derived class: Car
class Car extends Vehicle {
    // Overriding the startEngine() method
    @Override
    void startEngine() {
        System.out.println("Car engine started");
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating an object of the Car class
        Car myCar = new Car();

        // Calling the startEngine() method
        myCar.startEngine();

        System.out.println("\n");


    }
}
