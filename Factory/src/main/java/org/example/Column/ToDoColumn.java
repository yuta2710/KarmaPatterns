package org.example.Column;

import org.example.Card.Card;
import org.example.Card.ToDoCard;

public class ToDoColumn extends Column implements ColumnFactory{
    public ToDoColumn(String status) {
        super(status);
    }

    @Override
    public Card createCard() {
        return new ToDoCard();
    }
}
