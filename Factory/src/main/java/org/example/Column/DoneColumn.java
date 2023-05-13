package org.example.Column;

import org.example.Card.Card;
import org.example.Card.DoneCard;

public class DoneColumn extends Column implements ColumnFactory{

    public DoneColumn(String status) {
        super(status);
    }

    @Override
    public Card createCard() {
        return new DoneCard();
    }
}
