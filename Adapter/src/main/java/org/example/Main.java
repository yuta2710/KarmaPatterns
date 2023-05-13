package org.example;

import org.example.Entity.*;

public class Main {
    public static void main(String[] args) {
        PaymentGateway paymentGateway = new StripeGatewayAdapter(new StripeGateway());

        boolean paymentProcessed = paymentGateway.processPayment(100.00, "1234567890123456", "123");

        if(paymentProcessed){
            System.out.println("Payment processing successfully");
        }else{
            System.err.println("Payment processing failed");
        }

        PaymentGateway karmaGateway = new KarmaGatewayAdapter(new KarmaGateway());

        karmaGateway.processPayment(50.55, "452034402450", "452");
    }
}