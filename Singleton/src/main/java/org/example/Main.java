package org.example;

import java.util.ArrayList;
import java.util.List;

class ShoppingCart {
    private static ShoppingCart instance;
    private List<Item> items;

    private ShoppingCart() {
        items = new ArrayList<>();
    }

    public static ShoppingCart getInstance(){
        if(instance == null){
            instance = new ShoppingCart();
        }

        return instance;
    }

    public void addItem(Item item){
        items.add(item);
    }

    public List<Item> getItems() {
        return items;
    }
}

class Item {
    private String name;
    private double price;

    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // getters and setters
}

public class Main {
    public static void main(String[] args) {
        ShoppingCart cart1 = ShoppingCart.getInstance();
        ShoppingCart cart2 = ShoppingCart.getInstance();

        cart1.addItem(new Item("Shirt", 25.0));
        cart2.addItem(new Item("Pants", 35.0));

        System.out.println("Cart 1 items: " + cart1.getItems());
        System.out.println("Cart 2 items: " + cart2.getItems());

        ShoppingCart cart3 = ShoppingCart.getInstance();
        ShoppingCart anotherCart = ShoppingCart.getInstance();

        System.out.println("Are the two shopping carts the same? " + (cart3 == anotherCart));

    }
}