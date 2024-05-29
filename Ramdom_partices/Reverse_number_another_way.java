/*
 *  Write a program to reverse a given integer.
 */
import java.util.*;

public class Reverse_number_another_way {
    public static void main(String[] args)
    {
        // Scanner sc = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter any integer: ");
        int num = sc.nextInt();

        int Reverse = 0;
        while(num>0)
        {
            int last_number = num % 10;
            Reverse = Reverse * 10 + last_number;
            num /= 10;

        }

        System.out.println("\nReverse of the number is: " + Reverse);

        sc.close();

    }
    
}
