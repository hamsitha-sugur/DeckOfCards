package cardDeck.card;

/**
 * Card class
 */
public class Card {

    private Face faceValue;
    private Suit suit;

    public Card(Face faceValue, Suit suit) {
        this.faceValue = faceValue;
        this.suit = suit;
    }

    @Override
    public String toString() {
        return "Card{" +
                "FaceValue=" + faceValue +
                ", Suite=" + suit +
                '}';
    }
}
