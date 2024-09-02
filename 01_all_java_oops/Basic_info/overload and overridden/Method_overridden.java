/*
 * Topic: Method Overridden
 * obj  : Declaring a method in subclass which is already existing Super class
 * 
 * Rule and Restriction:
    -> Class must be inheritance
    -> Subclass must have same
                     --> name
                     --> return type
                     --> parameter number
    -> Constructor can't be overridden
    -> Static method,Final method, Private method can't be overridden

    * super keyword used to refer overridden method.
 */
class Super_class {
   // Fields
   String name;
   int age;

   // Display information
   void display_info() {
      System.out.println("Name: " + name);
      System.out.println("Age: " + age);
      System.out.println("\n\n");
   }
}

class Sub_class extends Super_class {
   // Fields
   String address;

   // overridden method
   void display_info()
   {
      // super.display_info();
      System.out.println("Name    : " + name);
      System.out.println("Age     : " + age);
      System.out.println("Address : " + address);
      System.out.println("\n\n");
   }
}


public class Method_overridden {
  // Create an object to initialize the instance of class(object)
   public static void main(String[] args) {
      Sub_class obj1 = new Sub_class();

      // By using object direct initialize the class variable
      obj1.name = "KzRaihan";
      obj1.age = 25;
      obj1.address = "Dhaka";

      // display the details
      obj1.display_info();

      // Create Super class object to initialize the object properties
      Super_class obj2 = new Super_class();
      // direct initialize the class variable
      obj2.name = "Raihan";
      obj2.age = 22;
      // display the object properties
      obj2.display_info();
      
   }
    
}
