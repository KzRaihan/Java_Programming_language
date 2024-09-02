// Write a program to reverse a given integer.

import java.util.*;
public class Reverse_Number {
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("\nEnter any integer: ");
        int num = input.nextInt();
        
        int reverse = 0;
        while(num != 0)
        {
            int mod = num %10;
            reverse = reverse * 10 + mod;
            num = num / 10;
        }
        System.out.println("Reverse of number: "+reverse);
        
    
        
    }
}
