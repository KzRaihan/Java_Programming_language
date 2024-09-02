/*
 * 3.Imagine you are developing a simple BankAccount class for a basic banking application. 
  You need to implement deposit and withdrawal operations while ensuring encapsulation and 
  proper validation of input.Task:

  Your task is to implement the BankAccount class with the following requirements:
  Private variables: accountNumber and balance.Constructor to initialize accountNumber and 
  balance.Getter methods for accountNumber and balance.Method to deposit money into the account.
  Method to withdraw money from the account, ensuring sufficient balance.
 
 * Key points:
    Class name = Bank_Account
    private members -> (account_number and balance)
    constructor = to initialize private members
    getter methods -> to access private members
    
    Credit_method -> deposit money into the account
    Debit_method -> withdraw money from the account, ensuring sufficient balance

 */

class Account {
    // private fields
    private String account_number;
    private double balance;

    // constructor : to initialize the private numbers
    Account(String account_number, double initial_balance) {
        this.account_number = account_number;
        this.balance = initial_balance;
    }

    // get_account_num : to get the account number(access private member by using public method)
    public String get_account_num()
    {
        return account_number;
    }
    // get_balance : to get the balance
    public double get_balance()
    {
        return balance;
    }
    // Account number and balance
    public void Account_details()
    {
        System.out.println("Account Number : " + get_account_num());
        System.out.println("Account Balance : " + get_balance() + " Tk");
    }

    // Credit method : deposit money amount into the account
    public void credit(double amount)
    {
        balance += amount;
        System.out.println("Credit Account: " + amount +" Tk");
        displayBalance();

    }

    // Debit method: debit the some amount from the account
    public void debit(double amount)
    {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Amount Credited: " + amount +" Tk");
            displayBalance();

        } else {
            System.out.println("Insufficient balance. Cannot debit.\n\n");
        }

    }
    
    // display total balance
    public void displayBalance() {
        System.out.println("Account No: " + account_number + "\t Total Balance: " + balance +" Tk");
        System.out.println("\n\n");
    }
 

    
 }

public class Bank_Account{
    public static void main(String[]args)
    {
        Account obj_1 = new Account("AN_428609", 1000);
        obj_1.Account_details();
        // deposit money 1000 into the account
        obj_1.credit(1000);
        
        // Debit method: debit 500 from the account
        obj_1.debit(500);
        
    }
}
