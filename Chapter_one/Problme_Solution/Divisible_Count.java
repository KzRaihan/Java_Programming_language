/*
 * 1.Using a User defined function. Write a program to find the number of integers divisible by 3 between the given range num1 and num2.
 *  where num1 < num2 .
 *  Also find the sum of all these integer numbers which are divisible by 3 and display the total .
 * Also count the numbers which are divisible by 3.
*/
import java.util.*;

public class Divisible_Count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First number: ");
        int num1 = sc.nextInt(); // first input form user which is store in num1 variable

        System.out.print("\nEnter Second number: ");
        int num2 = sc.nextInt(); // Second input from user which is store in num2 variable.

        //My_Function(num1, num2);
    }

    public class function {
        public static void My_Function(int num1, int num2) {
            {
                int sum = 0, count = 0;
                for (int i = num1; i <= num2; i++) {
                    if (i % 3 == 0) {
                        sum = sum + i;
                        count++;
                    }
                }
                System.out.println("the sum of all these integer numbers which are divisible by 3 in between " + num1 + "and" + num2+"is: "+sum);
                System.out.println("The numbers which are divisible by 3 in between " + num1 + "and" + num2+"is: "+count);

            }

        }
    }
}
