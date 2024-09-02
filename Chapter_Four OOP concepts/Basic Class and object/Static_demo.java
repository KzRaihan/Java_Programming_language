public class Static_demo{
    static int id;
    static String name;
    
    static{
        System.out.println("Static block is execute");
        id = 4039;
        name = "Kz";
    }
    static void display()
    {
        System.out.println("ID: "+id);
        System.out.println("Name: "+name);
    }
 public static void main(String[] args)
    {
        System.out.println("This is the main method\n");
        Static_demo.display();
        
    
        
    }
    
    
    
}

// public class Main{
    
//     public static void main(String[] args)
//     {
//         System.out.println("This is the main method\n");
//         // Static_demo.display();
        
        
        
        
//     }
    
// }  {
    
//}
