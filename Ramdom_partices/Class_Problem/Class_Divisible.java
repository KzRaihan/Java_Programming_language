/*
 * . Write a program to find the number of integers divisible by 5 between the given
     range num1 and num2, where num1 < num2. Also find the sum of all these integer
     numbers which are divisible by 5 and display the total.
 */
import java.util.*;
class Divisible_Number
{
    int num1, num2;
    
    public void Set_value(int num1, int num2)
    {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int Get_value()
    {
        int sum = 0;
        if (num1 > num2)
        {
            System.out.println("num1 should be less than num2");
            return 0;
        }
        else {
            for(int i = num1;i<=num2;i++)
            {

                if (i % 5 == 0) {
                    sum = sum + i;
                }
            }
            // System.out.println("Sum of total number which are divisible by 5: " + sum);
            return sum;
        }

      
    }
}
public class Class_Divisible {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("\nEnter First Number: ");
        int num1 = input.nextInt();
        
        System.out.print("\nEnter Second Number: ");
        int num2 = input.nextInt();
        
        Divisible_Number object = new Divisible_Number();
        object.Set_value(num1, num2);
        int result = object.Get_value();
       
        System.out.println("Sum of total number which are divisible by 5: " + result);
    }
}
