/*
 * Product:
        This is the base class, which includes common properties like name, price,
        and methods like getDetails() to print the product details.

        -> Field:
             name, price
        -> method
             getDetails() 

* Electronics:
        This class extends Product and adds properties specific to electronic
        products like warrantyPeriod.

        -> Additional Field:
             warrantyPeriod
        -> method
           * override getDetails() and also include warranty

* Laptop:
        This class extends Electronics and adds properties like brand, processorType,
        and methods to display laptop-specific information.
        
        -> Additional Field:
           brand, processorType
        -> method
          * override getDetails() and include brand,processorType

 */
// * Supper class
class Product {
     String name;
     double price;

     // constructor (initialize the values)
     Product(String name, double price) {
          this.name = name;
          this.price = price;
     }

     // method to display product details
     void getDetails() {
          System.out.println("Product Name: " + name);
          System.out.println("Price       : $" + price);
     }

}

class Electronics extends Product {
     int warrantyPeriod;

     // constructor
     Electronics(String name, double price, int warrantyPeriod) {
          super(name, price);
          this.warrantyPeriod = warrantyPeriod;
     }

     // overriding getDetails() method
     @Override
     void getDetails() {
          super.getDetails();
          System.out.println("Warranty Period: " + warrantyPeriod + " years");
     }
}

class Laptop extends Electronics {
     String brand;
     String processorType;

     // constructor
     Laptop(String name, double price, int warrantyPeriod, String brand, String processorType) {
          super(name, price, warrantyPeriod);
          this.brand = brand;
          this.processorType = processorType;
     }

     // overriding getDetails() method and include brand, processorType
      @Override
      void getDetails() {
           super.getDetails();
           System.out.println("Brand         : " + brand);
           System.out.println("Processor Type: " + processorType);
           System.out.println("\n\n");
      }


}


public class Main {
     public static void main(String[] args) {
           Laptop lp = new Laptop("HP", 45000.66, 5, "Intel", "Core i7");
           lp.getDetails();

           // Create Electronics object
           Electronics el = new Electronics("Sony", 25000.99, 3);
           el.getDetails();

           // Create Product object
           Product p = new Product("Apple", 30000.55);
           p.getDetails();
          
     }
    
    
}
