/*
 * Write a program to find the factorial of a number. 
 */
import java.util.*;
public class factorical {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter any integer: ");
        double num = sc.nextDouble();

        double fact = 1;
        for(int i=1;i<=num;i++)
        {
            fact = fact * i;
        }

        System.out.println("Factorial " + num + " is :  " + fact);
        
    }
}
