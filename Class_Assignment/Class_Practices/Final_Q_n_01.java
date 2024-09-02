/*
 * 
 * Create a Java program that demonstrates single inheritance and method overriding. Define
    a base class Vehicle with a method startEngine() that prints " Vehicle engine started".
    Create a derived class Car that overrides the startEngine() method to print " Car engine
    started". In the main method, create an object of Car and call the startEngine() method.

    -> Super class : Vehicle
       Method : startEngine()
    
       -> Sub class : Car
        override method: startEngine()
 * 
 */
class Vehicle {
    // * overridden method
    public void startEngine() {
        System.out.println("Vehicle engine started");
    }
}

class Car extends Vehicle {
    // * overriding method
    @Override
    public void startEngine() {
        System.out.println("Car engine started");
    }
}

public class Final_Q_n_01 {
    public static void main(String[] args) {
     // Create an object of Vehicle
    Vehicle objV = new Vehicle();
    objV.startEngine(); // Calls the overridden method in Vehicle class

    // Create an object or Car class
    Car objC = new Car();
    objC.startEngine();

   
   }
    
}
