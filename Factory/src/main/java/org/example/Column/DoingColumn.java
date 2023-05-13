package org.example.Column;

import org.example.Card.Card;
import org.example.Card.ToDoCard;

public class DoingColumn extends Column implements ColumnFactory{
    public DoingColumn(String status) {
        super(status);
    }

    @Override
    public Card createCard() {
        return new ToDoCard();
    }
}
