import java.util.*;

public class Main{
    public static void main(String[]args)
    {
        Scanner input = new Scanner(System.in);
        int num1, num2;
        int count = 1;
        
        do{
            try{
               System.out.print("Enter First integer: ");
               num1 = input.nextInt();
               
               System.out.print("Enter Second integer: ");
               num2 = input.nextInt();
               
               int result = num1/num2;
               System.out.println("Result: "+ result);
               count = 2;
               
            }catch(Exception ep){
                System.out.println("Exception: "+ep);
                System.out.println("Try again");
                
            }
            
        }while(count == 1);
        
    }
} 
    

