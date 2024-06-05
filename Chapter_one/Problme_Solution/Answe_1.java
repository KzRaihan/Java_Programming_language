public class Answe_1 {
    public static void main(String[] args) {
        My_function();
    }

    void My_function() {
        int num1 = 50, num2 = 100;
        int sum = 0, count = 0;

        if (num1 < num2) {

            for (int i = num1; i <= num2; i++) {
                if (i % 3 == 0) {
                    sum = sum + i;
                    count++;
                }
            }
            System.out.println("The sum of all integers divisible by 3 between " + num1 + " and " + num2 + " is " + sum);
            System.out.println("There numbers are present within " + num1 + "and " + num2 + "is: " + count);

        } else {
            System.out.println("Invalid Input");
        }
    }
}