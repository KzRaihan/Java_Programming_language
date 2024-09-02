
public class Answer_4_a
{
 public static void main(String args[])
{
    int number = 5;
    if(number > 0)
    {
        System.out.println("The number is positive.");
        if(number%2== 0)
        {
            System.out.println("The number is even");
        }
        else
        {
            System.out.println("The Number is odd");
        }
    }
    else
    {
        if(number<0)
        {
            System.out.println("The number is negative.");
            if(number % 2 == 0)
            {
                System.out.println("The number is even.");
            }
            else
            {
                System.out.println("The number is odd.");
            }
        }
        else
        {
            System.out.println("The number is zero.");
        }
        
    }
 
}
    
}

