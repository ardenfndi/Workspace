package Q1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.annotation.processing.FilerException;

public class BankingApplication {

    private List<Account> accounts;
    private final String filename = "accounts.txt";

    public BankingApplication() {
        accounts = new ArrayList<>();
    }

    public Account findAccountByNumber(String accountNumber){
        for(Account account: accounts){
        
        if(account.getAccountNumber().equals(accountNumber)){
            return account;
            }
        }
        return null;
    }
    
    public void createAccount() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Account Number: ");
        String accountNumber = scanner.nextLine();

        System.out.println("Enter Account Holder Name: ");
        String accountHolderName = scanner.nextLine();

        System.out.println("Enter Initial Balance: ");
        double balance = scanner.nextDouble();

        while(true){
            System.out.println("Is this a saving account? (yes/no): ");
            String answer = scanner.nextLine().toLowerCase();

            if (answer.equals("yes")) {
                System.out.println("Enter interest rate.");
                double interestRate = scanner.nextDouble();
                accounts.add(new SavingsAccount(accountNumber, accountHolderName, balance, interestRate));
                break;
            }
            else if (answer.equals("no")) {
                accounts.add(new Account(accountNumber, accountHolderName, balance));
                break;
            } 
            else {
                System.out.println("Please only enter 'yes' or 'no'");
            }
        }

        System.out.println("Account created successfully!");
    }

    public void depositMoney(String accountNumber, double amount){
        for(Account account : accounts){
            if(accountNumber.equals(account.getAccountNumber())){
                account.deposit(amount);
                System.out.println("Deposit Succesfull!");
            }  else {
                System.out.println("Account not found!");
            }
        } 
    }

    public void withdrawMoney(String accountNumber, double amount){
        Account account = findAccountByNumber(accountNumber);
        if(account != null){
            try {
                account.withdraw(amount);
                System.out.println("Withdrawal successfull!");
            } catch (InsufficentBalanceException e) {
                System.out.println(e.getMessage());
            }
        } else {
            System.out.println("Account not found!");
        }
        
    }

    public void viewAccountDetails(String accountNumber){
        Account account = findAccountByNumber(accountNumber);
        if(account != null){
            System.out.println(account);
        } else {
            System.out.println("Account not found!");
        }
    }

    public void deleteAccount(String accountNumber){
        Account account = findAccountByNumber(accountNumber);
        if(account != null){
            accounts.remove(account);
            System.out.println("Account deleted!");
        } else {
            System.out.println("Account not found!");
        }
    }
    
    public void saveAccountsToFile(){
        try {
            FileWriter writer = new FileWriter(filename);
            for(Account account : accounts){
                if (account instanceof SavingsAccount) {
                    SavingsAccount savingsAccount = (SavingsAccount) account;
                    writer.write(
                        "SavingsAccount," +
                        account.getAccountNumber() 
                        + "," + account.getAccountHolderName() 
                        + "," + account.getBalance() 
                        + "," + savingsAccount.getInterestRate() + "\n"
                    );
                } else {
                    writer.write(
                        "Account," +
                        account.getAccountNumber() 
                        + "," + account.getAccountHolderName() 
                        + "," + account.getBalance() + "\n"
                    );
                }
            }
            writer.close();
        } catch (IOException e) {
            
            e.printStackTrace();
        }
        
    }


    public void loadAccountsFromFile(){
        try {
            Scanner scanner = new Scanner(new File(filename));
            while(scanner.hasNextLine()){
                String line = scanner.nextLine(); // 
                String[] parts = line.split(",");
                String accountType = parts[0];
                if (accountType.equals("SavingsAccount")) {
                    String accountNumber = parts[1];
                    String accountHolderName = parts[2];
                    double balance = Double.parseDouble(parts[3]);
                    double interestRate = Double.parseDouble(parts[4]);
                    accounts.add(new SavingsAccount(accountNumber, accountHolderName, balance, interestRate));
                }
                else {
                    String accountNumber = parts[1];
                    String accountHolderName = parts[2];
                    double balance = Double.parseDouble(parts[3]);
                    accounts.add(new Account(accountNumber, accountHolderName, balance));
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void displayMenu(){
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nWelcome to the Banking Application");
            System.out.println("1. Create a new account");
            System.out.println("2. Deposit money");
            System.out.println("3. Withdraw money");
            System.out.println("4. View account details");
            System.out.println("5. Delete an account");
            System.out.println("6. Save account to file");
            System.out.println("7. Load accounts from file");
            System.out.println("8. Exit");
            System.out.println("Enter your choice: ");
            int choice = scanner.nextInt();

            switch(choice){
                case 1:
                    createAccount();
                    break;
                case 2:
                    System.out.println("Enter Account Number: ");
                    String accountNumber = scanner.next();

                    System.out.println("Enter Deposit Amount: ");
                    double amount = scanner.nextDouble();

                    depositMoney(accountNumber, amount);
                    break;
                case 3:
                    System.out.println("Enter Account Number: ");
                    String accountNumber2 = scanner.next();

                    System.out.println("Enter Withdraw Amount: ");
                    double withdrawAmount = scanner.nextDouble();

                    withdrawMoney(accountNumber2, withdrawAmount);
                    break;
                case 4:
                    System.out.println("Enter Account Number: ");
                    String accountNumber3 = scanner.next();

                    viewAccountDetails(accountNumber3);
                    break;
                case 5:
                    System.out.println("Enter Account Number: ");
                    String accountNumber4 = scanner.next();
                    
                    deleteAccount(accountNumber4);
                    break;
                case 6:
                    saveAccountsToFile();
                    break;
                case 7:
                    loadAccountsFromFile();
                    break;
                case 8:
                    System.out.println("Thank you for using the Banking Application!");
                    return;
            }
        }
    }
}