package org.example.Card;

public class ToDoCard extends Card implements CardServices{
    public ToDoCard() {}

    public ToDoCard(String name, String description) {
        super(name, description);
    }

    @Override
    public void displayCard() {
        System.out.println("ToDo card");
    }
}
