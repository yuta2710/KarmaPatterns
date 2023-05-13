package org.example.Entity;

public class KarmaGatewayAdapter implements PaymentGateway{
    private KarmaGateway karmaGateway;

    public KarmaGatewayAdapter(KarmaGateway karmaGateway) {
        this.karmaGateway = karmaGateway;
    }

    @Override
    public boolean processPayment(double amount, String cardNumber, String cvv) {
        boolean isPaid = karmaGateway.pay(amount);

        if(isPaid){
            System.out.println("Successfully bro Karma :>>");
        }else{
            System.err.println("Failed bro :<<");
            return false;
        }

        return true;
    }
}
