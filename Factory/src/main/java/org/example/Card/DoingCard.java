package org.example.Card;

public class DoingCard extends Card implements CardServices{
    public DoingCard() {}

    public DoingCard(String name, String description) {
        super(name, description);
    }

    @Override
    public void displayCard() {
        System.out.println("Doing card");
    }
}
