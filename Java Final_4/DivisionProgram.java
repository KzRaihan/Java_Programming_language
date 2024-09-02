/*
 * Write a Java program that asks the user to enter two integers and then divides the first
    number by the second. If the user enters zero as the second number, catch the
    ArithmeticException and display an error message: &quot;Division by zero is not allowed.&quot; The
    program should then prompt the user to enter the numbers again until a valid division can
    be performed.
 */


import java.util.Scanner;

public class DivisionProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1, num2;
        boolean validDivision = false;

        while (!validDivision) {
            try {
                // Prompt the user to enter two integers
                System.out.print("Enter the first integer: ");
                num1 = scanner.nextInt();

                System.out.print("Enter the second integer: ");
                num2 = scanner.nextInt();

                // Perform the division
                int result = num1 / num2;

                // If no exception occurs, print the result and break the loop
                System.out.println("The result of the division is: " + result);
                validDivision = true;

            } catch (ArithmeticException e) {
                // Catch the ArithmeticException if division by zero occurs
                System.out.println("Error: Division by zero is not allowed. Please try again.");

            } catch (Exception e) {
                // Catch any other exceptions (like non-integer input)
                System.out.println("Invalid input. Please enter valid integers.");
                scanner.next(); // Clear the invalid input from the scanner buffer
            }
        }

        scanner.close();
    }
}
