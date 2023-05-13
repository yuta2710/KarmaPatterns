package org.example.Entity;

public interface PaymentGateway {
    public boolean processPayment(double amount, String cardNumber, String cvv);
}
