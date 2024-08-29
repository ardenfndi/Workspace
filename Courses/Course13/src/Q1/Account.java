package Q1;

public class Account{

    private String accountNumber;
    private String accountHolderName;
    private double balance;

    public Account(String accountNumber, String accountHolderName, double balance){
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount){
        balance += amount;
    }

    public void withdraw(double amount) throws InsufficentBalanceException{
        if(balance < amount){
            throw new InsufficentBalanceException("Insufficent balance.");
        }
        balance -= amount;
    }

    public String toString(){
        return "Account Number: " + accountNumber + " Account Holder Name: " + accountHolderName + " Balance:" + balance;
    }
}