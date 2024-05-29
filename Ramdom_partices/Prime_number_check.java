/*
 * Write a program to find a number is prime or not
 */
import java.util.*;
public class Prime_number_check {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("\nEnter a number: ");
        int num = sc.nextInt();

        int flag = 0;
        for(int i=2;i<num;i++)
        {
            if (num % i == 0) {
                System.out.println("\t\t"+ num + " is not a prime number");
                flag = 1;
                break;
            }
        }
        if(flag == 0)
        {
            System.out.println("\t\t"+num + " is a prime number\n");
        }

    }

}

/*
 *  A number(7) is prime when the number are divisible by only 1 and that number(7).
 * 
 */
