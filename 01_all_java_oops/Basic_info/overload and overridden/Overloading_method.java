class Super_class{
    // fields
    public int num1;
    public int num2, num3;
    public int sum = 0, sub=0;
    public double num4;
    
    // method (two parameter: int, int) || count the overlodding numbers of parameter
    void method(int num1, int num2)
    {
        sum = num1 + num2;
        System.out.println("sum: "+sum);
    }
    
        // overloading method_1(Tree parameters: int, int, int)|| count the overloading numbers of parameter
    void method(int num1, int num2, int num3)
    {
        sum = num1 + num2 + num3;
        System.out.println("sum: "+sum);
    }
        // overloading method_2(two parameter: int, double)|| count the overloading order  of parameter
    int method(int num1, double num4)
    {
        sub = (int)(num1 - num4);
        System.out.println("sub: "+sub);
        return sub;
    }
}
public class Overloading_method{
    public static void main(String[] args)
    {
        Super_class obj1 = new Super_class();
        obj1.method(10,20);
        obj1.method(10,20,30);
        obj1.method(90, 10.11);
        
    }
}