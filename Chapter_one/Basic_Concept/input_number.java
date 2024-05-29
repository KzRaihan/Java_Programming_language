/**
 * input_number a number form user
 */
import java.util.*;

public class input_number {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // integer input
        System.out.print("\nEnter any integer: ");
        int num = sc.nextInt();
        System.out.println("Number is: " + num);

        // floating number input
        System.out.print("\nEnter floating : ");
        float num1 = sc.nextFloat();
        System.out.println("Number is: " + num1);

        // Double number input
        System.out.print("Enter any double number: ");
        double num2 = sc.nextDouble();
        System.out.println("Double is: " + num2);
        
        // string input
        // System.out.print("Enter Your name: ");
        // string str = sc.nextLine();
        // System.out.println("Name: " + str);
        

    }

    
}