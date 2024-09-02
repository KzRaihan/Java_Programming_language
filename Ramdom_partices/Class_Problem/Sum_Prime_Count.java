// * Write a program to find a  number is prime to 1 to 100.
// count total number 
//  total and sum of prime number
import java.util.*;
import java.lang.Math;


public class Sum_Prime_Count {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // System.out.print("\nEnter any number: ");
        // int num = input.nextInt();
        int num;

        int count = 0;
        int total_prime_num = 0;
        int sum_total = 0;
        
        for(num = 1;num<=100;num++)
        {
            count = 0;
   if(num <=1)
        {
            count++;
        }
        else {

            for (int i = 2; i <= Math.sqrt(num); i++)
            {
                if (num % i == 0) {
                    count++;
                    break;
                }
        
           
            }
        }
         if(count == 0)
           {
            System.out.print(num+ "\t") ;
            total_prime_num++;
            sum_total += num;
           }
        }
     
        System.out.println("\nTotal number within (1 to 100): "+total_prime_num);
        
        System.out.println("\nSum of total (1 to 100): "+sum_total);
    }
    
}
