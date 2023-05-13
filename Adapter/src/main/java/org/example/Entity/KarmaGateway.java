package org.example.Entity;

public class KarmaGateway {
    public KarmaGateway() {}

    public boolean pay(double price){
        System.out.println("Paid the price = " + price + " by Karma Gateway");
        return true;
    }
}
