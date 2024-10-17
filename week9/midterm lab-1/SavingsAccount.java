
public class SavingsAccount {
     double balance;

    public SavingsAccount(double balance) {
        this.balance = balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public double getBalance() {
        return balance;
    }
    /*
     * subtract amount from balance for withdrawl
     */
    public void withdraw(double amount){
        balance -= amount;
    }
     /*
      * add amount to balance for deposit
      */
      public void deposit(double amount){
        balance += amount;
    }
      /*
       * add amount of monthly interest earned to balance
       */
      public double monthlyInterest(double rate){
        return (balance * (rate / 12.0));
    }
}
