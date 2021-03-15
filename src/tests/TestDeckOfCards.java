import cardDeck.CardDeck;
import cardDeck.card.Card;
import org.junit.Assert;
import org.junit.Test;

public class TestDeckOfCards {

    private static final int CARD_COUNT = 52;
    private CardDeck deck;

    public TestDeckOfCards() {
        deck = new CardDeck();
        deck.setDeck();
    }

    @Test
    public void test_initialize_card_deck() {
        Assert.assertEquals(deck.getDeck().size(), CARD_COUNT);
        Assert.assertNotNull(deck.getDeck().get(0));
    }

    @Test
    public void test_shuffle() {
        Card before_shuffle = deck.getDeck().get(0);
        deck.shuffle();
        Card after_shuffle = deck.getDeck().get(0);
        Assert.assertNotEquals(before_shuffle, after_shuffle);
    }

    @Test
    public void test_deal_one_card() {
        Card dealt = deck.dealOneCard();
        Assert.assertNotNull(dealt);
    }

    @Test
    public void test_no_card_dealt() {
        for (int deal = 0; deal < CARD_COUNT; deal++) {
            Card dealt = deck.dealOneCard();
            Assert.assertNotNull(dealt);
        }
        Assert.assertNull(deck.dealOneCard());
    }
}
