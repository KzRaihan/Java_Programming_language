//  Write a program to count number of digits in a given integer. and 
// find the sum of total number.
import java.util.*;
public class Digit_Count_sum {
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("\nEnter any integer: ");
        int num = input.nextInt();
        
        int sum = 0, count = 0;
      while(num != 0)
       {
            int mod = num % 10;
            sum = sum + mod;
            num = num /10;
            count++;
            
        }
        System.out.println("Total digit: "+count);
        System.out.println("sum of digits: "+sum);
        
    }
}
