public class Within_class {
    public void division()
    {
        int num1 = 10;
        int num2 = 15;
        int sum = 0;

        for(int i=num1;i<=num2;i++)
        {
            if (i % 3 == 0) {
                sum += i;
            }
        }
        System.out.println("Sum: "+sum);
    }

    public static void main(String[] args) {
        Within_class Ta = new Within_class();
        
        Ta.division();
        
    }
}
