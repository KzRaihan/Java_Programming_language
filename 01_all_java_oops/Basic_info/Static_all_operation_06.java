/*
 * Topic: Static block and static members
 
 * Static method:
 *        is associate with (belong to) the class itself, rather than an instance of class(object)
  
    -> call static method without creating an instant of class(object).
    -> Access Static member direct and can change the value

 * Static method Restriction:
    -> Static method can't use non static member.
    -> this and super keyword can't be used within static method or block.\

 * Static block :
   -> It is used to initialize static members of a class.
   -> It is executed before the main method.
   * when execute at the same class static block is execute first then main method

 */
// create an class which contain all operation of static method
class Static_method {
    // non-static member
      String name;
      int id;

          // static member
      static String un_name = "SU";
      static int un_id = 101;

        // constructor
      Static_method(String name, int id) {
          this.name = name;
          this.id = id;
      }
    

      // static block 
      static {
          System.out.println("Static block executed");
          un_name = "BUET";
          un_id = 50;
          
      }
      // static method
      public static void display_static() {
          System.out.println("\nThis is static method");
          System.out.println("Name: " + un_name);
          System.out.println("ID: " + un_id);

          // this method can't access non-static method members
        //   set_value(); (x) <- here, set_value() is non-static method
      }
      // General method
      public void set_value() {
          System.out.println("\nThis is non static method");
          System.out.println("Name: " + name);
          System.out.println("ID: " + id);

          // non-static method can access static method
          // here, we call: display_static() is will execute
          
      }
      
   

}

public class Static_all_operation_06 {
    public static void main(String[] args) {
        System.out.println("\nThis is Main method: ");
        
        // creating an object to access non Static members
        Static_method obj = new Static_method("Kz_Raihan", 4039);
        obj.set_value();

        // without crating any object to access static members

        Static_method.display_static();



        System.out.println("\n\n\n");
    }


    
    
}
