package org.example.Card;

public class DoneCard extends Card implements CardServices{
    public DoneCard() {}

    public DoneCard(String name, String description) {
        super(name, description);
    }

    @Override
    public void displayCard() {
        System.out.println("Done card");
    }
}
