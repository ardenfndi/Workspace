package Exercise1;

import java.util.UUID;

public class CreditCardPayment implements Payment {
    private String cardNumber;
    private String cardHolderName;
    private String expiryDate;
    private String transactionId;

    public CreditCardPayment(String cardNumber, String cardHolderName, String expiryDate){
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
        this.expiryDate = expiryDate;
        this.transactionId = null;
    }

    public String getCardNumber(){
        return cardNumber;
    }

    public void setCardNumber(String cardNumber){
        this.cardNumber = cardNumber;
    }
    
    public String getCardHolderName(){
        return cardHolderName;
    }
    
    public void setCardHolderName(String cardHolderName){
        this.cardHolderName = cardHolderName;
    }
    
    public String getExpiryDate(){
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate){
        this.expiryDate = expiryDate;
    }
    
    public String getTransactionId(){
        return transactionId;
    }
    
    public void setTransactionId(String transactionId){
        this.transactionId = transactionId;
    }

    @Override
    public void processPayment(double amount) {
        this.transactionId = "CC-" + UUID.randomUUID().toString().substring(0, 8);
        System.out.println("Processing credit card payment of $" + amount + " with transaction ID: " + this.transactionId);
    }
    
    @Override
    public String getPaymentDetails() {
        // Payment Type: Credit Card, Transaction ID: CC-<UUID>
        return "Payment Type: Credit Card, Transaction ID: " + this.transactionId;
        
    }
}
