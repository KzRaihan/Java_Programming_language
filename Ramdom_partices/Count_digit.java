/*
 * Write a program to count number of digits in a given integer.
 */
import java.util.*;
public class Count_digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter any integer: ");
        int num = sc.nextInt();
       
        int count = 0;
        while(num !=0)
        {
            num = num / 10;
            count++;
        }
        System.out.println("\nNumber of Digit are: " + count +"\n");
    }   
}
