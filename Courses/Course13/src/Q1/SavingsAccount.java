package Q1;

public class SavingsAccount extends Account {
    private static final double MINIMUN_BALANCE = 100.0;
    private double interestRate;

    public SavingsAccount(String accountNumber, String accountHolderName, double balance, double interestRate){
        super(accountNumber, accountHolderName, balance);
        this.interestRate = interestRate;
    }
    public double getInterestRate(){
        return interestRate;
    }

    public void setInterestRate(double interestRate){
        this.interestRate = interestRate;
    }

    @Override
    public void withdraw(double amount) throws InsufficentBalanceException{
        if(getBalance() - amount < MINIMUN_BALANCE){
            throw new InsufficentBalanceException("Insufficent Balance");
        }
        super.withdraw(amount);
    }
    public String toString(){
        return super.toString() + "Interest Rate: " + interestRate;
    }
}
