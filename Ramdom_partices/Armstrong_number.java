/*
 * Write a program to check whether a number is Armstrong or not. 
 
 * hint: A number is Armstrong if the sum of cubes of individual digit of number is equal to the number itself.
 */
import java.util.*;
import java.lang.Math;
public class Armstrong_number {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter a number: ");
        int num = sc.nextInt();

        int sum = 0;
        int real_num = num;
       
        while(num>0)
        {
           
            int rem = num % 10;
            // sum = sum + (rem * rem * rem);
            sum += Math.pow(rem,3);
            num = num / 10;
        }
        if(real_num == sum)
        {
            System.out.println(real_num + " is a Armstrong Number\n");
        }
        else {
            System.out.println(real_num + " is not a Armstrong Number\n");
        }
        
    }
    
}
