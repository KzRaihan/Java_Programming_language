// /*
//  * Write a program to find a number is prime or not within a given range 
//  * where num1 < num2 and also find the summation of the numbers.
//  */
// import java.util.*;

// public class Prime_number_check_within_range {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter first number: ");
//         int num1 = sc.nextInt();
        
//         System.out.print("Enter Second number: ");
//         int num2 = sc.nextInt();

//         System.out.println("Prime Number are: \n");
//         int sum = 0, flag = 0;
//         int i, j;
//         int arr[];
//         int b = 0;
//         for(i=num1;i<=num2;i++)
//         {
            
//             for (j = 2; j < num2; j++) {
//                 if (i % j == 1) {
//                     flag = 1;
//                     arr[b] = i;
//                     b++;
//                     break;
//                 }

//             }
//         }
//         if(flag == 1)
//         {
//             System.out.println(i + "\t");
//         }

        
//     }
    
// }
