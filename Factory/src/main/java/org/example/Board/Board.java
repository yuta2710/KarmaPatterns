package org.example.Board;

import org.example.Card.Card;

import java.util.ArrayList;
import java.util.List;

public class Board {
    private String name;
    private List<Card> todoCards;
    private List<Card> doingCards;
    private List<Card> doneCards;


    public Board(String name) {
        this.name = name;
        this.todoCards = new ArrayList<>();
        this.doingCards = new ArrayList<>();
        this.doneCards = new ArrayList<>();
    }


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public Board createBoard(String name){
        return new Board(name);
    }

    public boolean addToDoCard(Card newTodoCard){
        todoCards.add(newTodoCard);
        return true;
    }

    public boolean removeToDoCard(Card card){
        todoCards.remove(card);
        return true;
    }

    public boolean addDoingCard(Card newDoingCard){
        doingCards.add(newDoingCard);
        return true;
    }

    public boolean removeDoingCard(Card card){
        doingCards.remove(card);
        return true;
    }

    public boolean addDoneCard(Card newDoneCard){
        doneCards.add(newDoneCard);
        return true;
    }

    public boolean removeDoneCard(Card card){
        doneCards.remove(card);
        return true;
    }

    @Override
    public String toString() {
        return "Board{" +
                "name='" + name + '\'' +
                ", todoCards=" + todoCards +
                ", doingCards=" + doingCards +
                ", doneCards=" + doneCards +
                '}';
    }
}
