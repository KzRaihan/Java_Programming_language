import java.util.*;
class Method_1{
    int num1,num2;
     public void function(int n, int m)
     {
         int num1 = n;
         int num2 = m;
         int sum = 0, count = 0;
         int i;
         if(num1 < num2)
         {
             for(i=num1;i<=num2;i++)
             {
                 if(i%3==0)
                 {
                     sum += i;
                     count++;
                     
                 }
             }
             System.out.println("The sum of Total number which are divisible by 3 : " + sum);
             System.out.println("The Total numbers of are "+count);
         }
         else
         {
             System.out.println("Invalid input try again...");
         }
         
     }
}

public class Main{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("\nEnter First number: ");
        int num1 = input.nextInt();
        
        System.out.print("\nEnter Second number: ");
        int num2 = input.nextInt();
        
        Method_1 object1 = new Method_1();
        object1.function(num1,num2);
        
        
        
    }
}