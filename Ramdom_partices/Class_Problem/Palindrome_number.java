// Write a program to check whether a number is Palindrome or not. 
// A palindrome number is a number such that if we reverse it, it will not change

import java.util.*;
public class Palindrome_number {
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("\nEnter any integer: ");
        int num = input.nextInt();
        
        int temp = num;
        int reverse = 0;
        while(num != 0)
        {
            int mod = num %10;
            reverse = reverse * 10 + mod;
            num = num / 10;
        }
        if(temp == reverse)
        {
         System.out.println("Palindrome number: "+reverse);
        }
        else
        {
            System.out.println("Not Palindrome number");
        }
     
        
    }
}
