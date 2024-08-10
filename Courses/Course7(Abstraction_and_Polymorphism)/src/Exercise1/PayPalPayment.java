package Exercise1;

import java.util.UUID;

public class PayPalPayment implements Payment {
    private String email;
    private String transactionId;

    public PayPalPayment(String email){
        this.email = email;
    }
    
    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    @Override
    public void processPayment(double amount){
        this.transactionId = "CC-" + UUID.randomUUID().toString().substring(0, 8);
        System.out.println("Processing credit card payment of $" + amount + " with transaction ID: " + this.transactionId);
    }

    @Override
    public String getPaymentDetails(){
        return "Payment Type: Paypal, Transaction ID: " + this.transactionId;
    }
    
}
