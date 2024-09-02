// * Write a program to find a  number is prime or not.
import java.util.*;
import java.lang.Math;


public class Thridc_Check_Prime_num {
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

            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    count++;
                    break;
                }
            }
        }
        if(count == 0)
        {
            System.out.println(+num+ " Number is prime");
        }
        else {
            System.out.println(+num+ " Number is not prime");
        }
        
    }
    
}
