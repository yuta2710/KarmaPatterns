package org.example.Entity;

public class StripeGatewayAdapter implements PaymentGateway{
    private StripeGateway stripeGateway;

    public StripeGatewayAdapter(StripeGateway stripeGateway) {
        this.stripeGateway = stripeGateway;
    }

    @Override
    public boolean processPayment(double amount, String cardNumber, String cvv) {
        String token = convertToToken(cardNumber, cvv);

        return stripeGateway.charge(amount, token);
    }

    private String convertToToken(String cardNumber, String cvv) {
        // implementation details for converting to a Stripe token
        return "stripe_token";
    }
}
