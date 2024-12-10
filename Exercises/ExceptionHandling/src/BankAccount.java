public class BankAccount {
    private String accountNumber;
    private double balance;


    public BankAccount(String accountNumber, double balance) throws NegativeBalanceException{
        if(balance < 0){
            throw new NegativeBalanceException("Balance cannot be negative");
        }
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit (double amount) throws InvalidAmountException  {
        if(amount < 0){
            throw new InvalidAmountException("Amount cannot be negative");
        }
        balance += amount;
    }

    public void withdraw (double amount) throws InsufficientFundsException {
        if (amount < 0){
            throw new InsufficientFundsException("Withdrawal cannot be bigger than amount");
        }
        balance -= amount;
    }
    
    public String getAccountNumber(){
        return accountNumber;
    } 
    public double getBalance(){
        return balance;
    }

    
}
