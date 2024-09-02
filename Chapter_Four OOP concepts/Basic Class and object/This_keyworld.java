import java.util.*;
class Person{
    String name;
    int age;
    public void Set_info(String name,int age)
    {
        this.name = name;
        this.age = age;
    }
    public void Get_info()
    {
         System.out.println("Name: " + name);
         System.out.println("Age : " + age);
    }
}
public class This_keyworld
{
    public static void main(String[]args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("\nEnter Your Name: ");
        String name = input.nextLine();
        
        System.out.print("\nEnter Your age: ");
        int age = input.nextInt();
        
     
        // First object
        Person Student1 = new Person();
        Student1.Set_info(name,age);
        Student1.Get_info();
        
        // Second object
      
        
        // System.out.print("\nEnter Name: ");
        // String nam = input.nextLine();
        
        // System.out.print("\nEnter age: ");
        // int ag = input.nextInt();
        
         Person Student2 = new Person();
         System.out.println("\n");
        Student2.Set_info("Kz", 90);
        Student2.Get_info();
        
        
    }
}