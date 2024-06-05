import java.util.*;

public class Input_From_User {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        // Scanner sc = new Scanner(System.in);
        
        int num1;
        System.out.print("\nEnter any integer: ");
        num1 = input.nextInt();
        System.out.println("num1: " + num1);

        float num2;
        System.out.print("\nEnter floating Value: ");
        num2 = input.nextFloat();
        System.out.println("num2: " + num2);


        char ch;
        System.out.print("\nEnter any letter: ");
        ch = input.next().charAt(0);
        System.out.println("Ch: " + ch);
    }
    
}
