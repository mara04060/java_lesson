package com.alphabank.work2;

public class Card {
    Suit suit;
    Rank rank;

    public Card(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }


        @Override
    public String toString() {
        return "Siut = " +suit+
                " Rank = "+rank;
    }


}
