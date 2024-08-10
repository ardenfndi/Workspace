package Exercise1;

public class Main {
    public static void main(String[] args){
        Payment creditCardPayment = new CreditCardPayment("ONE", "TWO", "THREE");
        Payment payPalPayment = new PayPalPayment("emre.cubukm@hotmail.com");

        creditCardPayment.processPayment(10);
        payPalPayment.processPayment(15);
        
        System.out.println(creditCardPayment.getPaymentDetails());
        System.out.println(payPalPayment.getPaymentDetails());
    }
    
}
