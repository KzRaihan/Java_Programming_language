import java.util.*;
    class Person
    {
        // state or attributes
       // int num;
        public void Fact(int n)
        {
           // int num = n;
            int fact =1;
            for(int i = 1;i<=n;i++)
            {
                fact *= i;
            }
            System.out.println("Factorial of : "+ fact);
        }
    }
public class Factorial_with_class{

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any integer: ");
        int num = input.nextInt();
         
        Person object = new Person();
        
        
       object.Fact(num);
        
    }
}
