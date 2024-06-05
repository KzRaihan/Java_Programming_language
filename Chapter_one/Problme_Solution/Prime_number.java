import java.util.*;

public class Prime_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number: ");
        int num = sc.nextInt();

        int isPrime = 1;
        if(num < 2)
        {
            isPrime = 0;
        }
        else {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    isPrime = 0;
                    break;
                }
            }
        }
        if(isPrime == 1)
        {
            System.out.println("Prime number");
        }
        else {
            System.out.println("Not Prime number");
        }


    }
    
}
