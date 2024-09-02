// topic : How to create multiple class
// what is meaning of access specifier
public class Person_01 {
    public String name;  // name field is public 
    public int id;     // id field is public
     int mobile;      // mobile field is default

    public void set_value(String na, int i, int mob) {
        name = na;
        id = i;
        mobile = mob;
    }
    public void get_value(){
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Mobile: " + mobile);
    }
}

public class Person_03 {
    // set the fields value directly
    public String name = "Raihan";  // name field is public and assign the direct value
    public int id = 2;
    int mobile = 2345;

    public void get_value()
    {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Mobile: " + mobile);
    }
   
    public static void main(String [] args) {
        
        System.out.println("\nFirst object of Person_01 class\n");
        // create object for Person_01 class
       Person_01 obj_01 = new Person_01();
       
       // Set the value of  Person_01 class using object
       obj_01.set_value("Kz", 4039, 1234);

       // access and display of Person_01 class method
       obj_01.get_value();
        
       System.out.println("\nSecond object of Person_01 class\n");

       // create second object for Person_02 class
       Person_01 obj_02 = new Person_01();

       // set value of obj_02
       obj_02.set_value("Ra", 20, 12356);

       // get value 
       obj_02.get_value();

       System.out.println("\nNow Creating and access Person_03 class fields and method\n");
        System.out.println("\nFirst object of Person_03 class\n");
       // create object for Person_03 class
       Person_03 obj_03 = new Person_03();

       // access and display the Person_03 fields value
       obj_03.get_value();


    }
       
     

}
