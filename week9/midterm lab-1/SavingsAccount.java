// Name: Lucy Finnerty
// Date: 10/17/24
// Purpose: This class allows for the creation of a saving account where a starting balance must be provided.
// It has an accessor and mutator method, as well as a withdraw, deposit, and monthly interest capability.
public class SavingsAccount {
     private double balance; // total amount of money in savings account
    /*
     * constructor with one parameter - starting balance
     */
    public SavingsAccount(double balance) {
        this.balance = balance;
    }
    /*
     * mutator method to change the total amount of money, balance, in the account
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }
    /*
     * accessor method to get the total amount of money, balance, in the account
     */
    public double getBalance() {
        return balance;
    }
    /*
     * subtracts amount from balance for a withdrawl
     */
    public void withdraw(double amount){
        balance -= amount;
    }
     /*
      * adds amount to balance for a deposit
      */
      public void deposit(double amount){
        balance += amount;
    }
      /*
       * adds amount of monthly interest earned to balance
       */
      public double monthlyInterest(double rate){
        return (balance * (rate / 12.0));
    }
}