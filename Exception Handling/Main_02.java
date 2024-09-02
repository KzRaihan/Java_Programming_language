/*
 * Write a Java program that asks the user to enter two integers and then divides the first
    number by the second. If the user enters zero as the second number, catch the
    ArithmeticException and display an error message: &quot;Division by zero is not allowed.&quot; The
    program should then prompt the user to enter the numbers again until a valid division can
    be performed.
    
 */
import java.util.*;

public class Main_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2;

        int count = 1, result;

        do {
            try {
                System.out.print("Enter the first number: ");
                num1 = input.nextInt();

                System.out.print("Enter the second number: ");
                num2 = input.nextInt();

                result = num1 / num2;
                System.out.println(num1 + "/" + num2 + " = " + result);
                count = 0;


            } catch (ArithmeticException ep) {
                System.out.println("Exception: " + ep);
                System.out.println("Division by zero is not allowed");               
            }catch(Exception ep1)
            {
                System.out.println("Exception: " + ep1);
                System.out.println("Division by zero is not allowed");                       
            }

        } while (count == 1);
        
    }
    
}
