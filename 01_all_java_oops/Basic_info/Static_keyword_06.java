/*
 * Topic: Static keyword 
 *       
 *  obj: Static keyword is used for memory management.
     
    -> It makes the program more efficiencies by saving memory.
 
 * The static can be (Static members):
      -> Variable
      -> Method
      -> Block 
      -> nested class   

 
 */

class Student {
    // fields
    //  this are instant of class
    public String name;
    int id;                    

    static String un_name = "SU"; // <- this are class variable
    static String dept = "CSE";
    

    // constructor
    Student(String name, int id) {
        this.name = name;
        this.id = id;
    }
    
    // method_01: to display
    void display()
    {
        System.out.println("Name: " +this.name);
        System.out.println("ID  : " + this.id);
        System.out.println("University name  : " +un_name);
    }

 }


 public class Static_keyword_06 {
     public static void main(String[] args) {
         //Create an object to access the instant of class
         Student obj_01 = new Student("Kz", 4093);
         obj_01.display();

         // * Without Create an object access the class variable
         // System.out.println("University name  : " + Student.un_name);
         System.out.println("Department name  : " + Student.dept);

        
         System.out.println("\nVariable_diff class properties: \n");
         // * Variable_diff class create an object
         
         // * without create an object access class variable using static keyword
         System.out.println("\nWithout Crate object access the class variable: ");
         System.out.println("Dress Color: " + Variable_diff.dress_color);

         // Creating an object to access object properties or behavior
         Variable_diff obj_1 = new Variable_diff();
         obj_1.Variable(22, 5.6);
         obj_1.display_pro();

         // total count for create an object one: obj_1 
         System.out.println("\nTotal count for calling obj_1 : ");
         obj_1.total_count();
         
         // total count for obj_2
         System.out.println("\nTotal count for calling obj_2: ");
         Variable_diff obj_2 = new Variable_diff();
         obj_2.total_count();

        
         
         System.out.println("\n\n");
     }

 }

 /*
   * Topic: difference between class instant and class variable(members)
    
  */
 class Variable_diff {
     // fields of instant variable
     public int age;
     double height;
     int count = 0;

     // fields of class variable
     static String dress_color = "White";
     static int num = 0;

     // method_01: assign the value of instant variable
     public void Variable(int age, double height) {
         this.age = age;
         this.height = height;
     }

     void display_pro()
     {
         System.out.println("Age: " + this.age);
         System.out.println("Height: " + this.height);
     }

     // method_02: to count total and print
     void total_count() {
         count++;
         num++;
         System.out.println("Total instant count: " + count);
         System.out.println("Class variable count: " + num);
     }

 }

