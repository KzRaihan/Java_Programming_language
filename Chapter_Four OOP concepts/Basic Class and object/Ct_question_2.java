import java.util.*;

class Armstrong {
    int num;

    public int check_arms(int n)
    {
        int num = n;
        int reverse = 0;
        while (num != 0)
        {
            int rem = num % 10;
            reverse +=  rem * rem * rem;
            num = num / 10;
        }

        return reverse;
    
    }
}
public class Ct_question_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("\nEnter any integer: ");
        int num1 = input.nextInt();
        
        // create object
        Armstrong object = new Armstrong();
        int resutl = object.check_arms(num1);

        if(num1 == resutl)
        {
            System.out.println(+num1 + " is a Armstrong number");
        }
        else {
            System.out.println(+num1 + " is not a Armstrong number");
        }


        
    }
}
