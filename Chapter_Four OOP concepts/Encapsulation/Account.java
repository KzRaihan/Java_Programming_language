/*
 * Create an Account class with 2 attributes balance and account_no 
 * Create method for debit, credit and printing the balance.
 */
class Account_class {
    // fields
    private String account_no;
    private double balance;

    // constructor : initial the instance of class(object).
    Account_class(String account_no, double initial_balance) {
        this.account_no = account_no;
        this.balance = initial_balance;
    }

    // Debit method: to debit some taka
    public void debit(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Amount Debited: " + amount);
            displayBalance();

        } else {
            System.out.println("Insufficient balance. Cannot debit.\n\n");
        }
    }
    // Credit 
    public void credit(double amount) {
        balance += amount;
        System.out.println("Amount Credited: " + amount);
        displayBalance();
    }

    // display balance
    public void displayBalance() {
        System.out.println("Account No: " + account_no + "\t Total Balance: " + balance);
        System.out.println("\n\n");
    }
    

}


public class Account {
    public static void main(String[] args)
    {
        Account_class obj1 = new Account_class("AC_NO_12345", 1000);
        obj1.displayBalance();

        // credit some balace
        obj1.credit(5000);

        // Debit some balance
        obj1.debit(2000);

    }
    
}
