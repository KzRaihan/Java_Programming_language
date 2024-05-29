/*
 * Write a program to reverse a given integer.
 */
import java.util.*;

public class reverse_number {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Any integer: ");
        int num = sc.nextInt();

        int temp;
        while(num !=0)
        {
            temp = num % 10;
            num = num / 10;

            System.out.print(temp);
        }
        System.out.println();
    }
    
}
