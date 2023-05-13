package org.example.Entity;

public class PayPalGateway implements PaymentGateway{
    @Override
    public boolean processPayment(double amount, String cardNumber, String cvv) {
        System.out.println("Used PayPal API to process the payment");
        return true;
    }
}
