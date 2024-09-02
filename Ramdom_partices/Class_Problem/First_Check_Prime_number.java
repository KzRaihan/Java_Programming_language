// * Write a program to find a  number is prime or not.
import java.util.*;
public class First_Check_Prime_number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("\nEnter any number: ");
        int num = input.nextInt();

        int count = 0;
        if(num <=1)
        {
            count++;
        }
        else {

            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    count++;
                    break;
                }
            }
        }
        if(count == 0)
        {
            System.out.println("Given Number is prime");
        }
        else {
            System.out.println("Given Number is not prime");
        }
        
    }
    
}
