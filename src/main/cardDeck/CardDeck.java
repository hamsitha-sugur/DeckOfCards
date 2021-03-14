package cardDeck;

import cardDeck.card.Card;
import cardDeck.card.Face;
import cardDeck.card.Suit;

import java.util.ArrayList;
import java.util.List;

/**
 * Card Deck class
 */
public class CardDeck {

    private List<Card> deck;
    private int dealNext = 0;
    private static final int CARD_COUNT = 52;


    /**
     * Initializes Card Deck
     */
    public void setDeck() {
        // initializes the deck
        this.deck = new ArrayList<>(CARD_COUNT);
        for (Face faceValue: Face.values()) {
            for (Suit suit : Suit.values()) {
                Card card = new Card(faceValue, suit);
                deck.add(card);
            }
        }
    }

    /**
     * Returns remaining deck
     * @return List<Card>
     */
    public List<Card> getDeck() {
        return deck.subList(dealNext, CARD_COUNT);
    }

    /**
     * Shuffles the deck
     */
    public void shuffle() {
        // shuffle the cards in deck from dealNext index to end
        for (int first = dealNext; first < CARD_COUNT; first++) {
            // get random card between dealtIndex and CARD_COUNT and swap with first
            int second = (int)(Math.random() * (CARD_COUNT - dealNext)) + dealNext;

            Card temp = deck.get(first);
            deck.set(first, deck.get(second));
            deck.set(second, temp);
        }
    }

    /**
     * Deals one card from Deck
     * @return Card
     */
    public Card dealOneCard() {
        // return null when all cards are dealt else return last undealt card from list
        if (dealNext == CARD_COUNT) return null;
        return deck.get(dealNext++);
    }
}
