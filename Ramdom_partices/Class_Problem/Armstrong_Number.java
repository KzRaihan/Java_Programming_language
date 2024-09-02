/*   Write a program to check number is Armstrong or not.
   (Hint: A number is Armstrong if the sum of cubes of individual digits of a number is equal to the number itself).
*/
import java.util.*;
public class Armstrong_Number
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("\nEnter any integer: ");
        int num = input.nextInt();
        
        int temp = num;
        
        int sum = 0;
        
        while(num != 0)
        {
            int mod = num % 10;
            sum = sum + mod * mod* mod;
            num = num / 10;
        }
        if(sum == temp)
        {
            System.out.println("Given Number is Armstrong");
            System.out.println("Number is: "+sum);
        }
        else
        {
             System.out.println("Given Number is not Armstrong");
        }
        
    }
}