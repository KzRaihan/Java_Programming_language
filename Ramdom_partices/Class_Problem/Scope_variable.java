public class Scope_variable {
    public static void main(String args[])
    {
        int num1 = 10;
        
        if(num1 >= 10)
        {
            int num2 = 20;
            System.out.println("Num1: " + num1 + "\nNum2: " + num2);
            num1 = num2 * 2;
        }
        num2 = num1 * 3; // * Here, num2 is not use because the scope of variable 
                        // * (num2 is declare within the if block. so we can't use num2 without if block).
        System.out.println("Num1: " + num1 + "\nNum2: " + num2);
    }
    
}
