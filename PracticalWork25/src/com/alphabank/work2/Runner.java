package com.alphabank.work2;


public class Runner {

    public void run() {
        Card[] cards = allCards();
        printCard(cards);
    }

        public Card[] allCards() {
            int i = 0;
            Card[] cards = new Card[52];
            for (Suit suit : Suit.values()) {
                for (Rank rank : Rank.values()) {
                    cards[i] = new Card(suit, rank);
                  i++;
                }
            }
            return cards;
        }

        public void printCard(Card[] cards){
        int i=0;
            for (Card card: cards) {
                System.out.println(++i + ") "+card);
            }
        }



}
