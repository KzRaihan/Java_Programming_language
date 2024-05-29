
/* 
 * Write a program to find the number of integer divisible by 5 between the given range
 * num1 and num2, where num1 < num 2 .
 * Also find the sum of all these integer numbers which are divisible by 5 and display the total.
*/
import java.util.*;

public class Divisible_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter First integer: ");
        int num1 = sc.nextInt();
        System.out.print("\nEnter Second integer: ");
        int num2 = sc.nextInt();  
        int sum = 0;
        for(int i=num1;i<=num2;i++)
        {
            if (i % 5 == 0) {
                sum += i;
            }    
        }
        System.out.println("\nsum of All integer numbers which are division by 5 ("+ num1 +"-"+ num2 +"): " + sum + "\n");
    }  
}
