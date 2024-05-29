/*
 * Write a program to check whether a number is palindrome or not
 * hint: A palindrome number is a number such that if we reverse it, it will not change.
 */
import java.util.*;
public class Palindrome_Number {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter a number: ");
        int num = sc.nextInt();
        
        int temp = num;
        int rev = 0;
        while(num !=0)
        {
            int rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10;
        }
        if(temp == rev)
        {
            System.out.println(temp + " is a Palindrome Number\n");
        }
        else {
            System.out.println(temp + " is not a Palindrome Number\n");
        }
    }
}
