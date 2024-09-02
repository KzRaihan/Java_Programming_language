import java.util.*;
class Factorial_number
{
    // attribute
    double num;

    // constructor method  
    Factorial_number(double num)
    {
        this.num = num;
    }

    public void display()
    {
        double fact = 1;
        for(int i=1;i<=num;i++)
        {
            fact = fact * i;
        }
        System.out.println("Factorial Number: " + fact);
    }

}

public class Class_factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("\nEnter a number: ");
        double num = input.nextDouble();


         
        Factorial_number object1 = new Factorial_number(num);
        object1.display();
        
    }
    
}
