package hand;

import cardDeck.card.Card;

import java.util.ArrayList;
import java.util.List;

public class Hand {

    private List<Card> cards;

    public Hand() {
        cards = new ArrayList<>();
    }

    /**
     * adds card to hand
     * @param card: Card
     */
    public void addCard(Card card) {
        cards.add(card);
    }

}
