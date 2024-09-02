/*
 * Interface is the collection of Abstract class
 *   -> For fully abstraction
 *   -> It supports multiple inheritance
 */
interface Animal{
    void eat(); // public abstract eat();
}
class Dog implements Animal{
    public void eat()
    {
        System.out.println("Dog can eat");
    }
}
class Cat implements Animal{
    public void eat()
    {
        System.out.println("Cat can eat meal");
    }
}

public class Main{
    public static void main(String []args){
        Dog dg = new Dog(); // Create an object for Dog class
        Animal ag;     // Crate an reference variable for Super class
        ag = new Dog(); // reference variable refers the Dog class object
        ag.eat();
        dg.eat();
        
        // Cat ct = new Cat();
        ag = new Cat();  // super class reference variable to refer the Cat class object.
        ag.eat();
        // ct.eat();

        System.out.println("\n\n");
    }
}