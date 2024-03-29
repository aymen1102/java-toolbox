package algorithmics.blackjack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CardTest {
    @Test
    void cardValueShouldBeTwoForCardTwo() {
        ICard card = new Card("2");
        assertEquals(2, card.getPoints());
    }

    @Test
    void cardValueShouldBeThreeForCardThree() {
        ICard card = new Card("3");
        assertEquals(3, card.getPoints());
    }

    @Test
    void cardValueShouldBeTenForCardTen() {
        ICard card = new Card("10");
        assertEquals(10, card.getPoints());
    }

    @Test
    void cardValueShouldBeTenForJack() {
        ICard card = new Card("J");
        assertEquals(10, card.getPoints());
    }

    @Test
    void cardValueShouldBeTenForQueen() {
        ICard card = new Card("Q");
        assertEquals(10, card.getPoints());
    }

    @Test
    void cardValueShouldBeTenForKing() {
        ICard card = new Card("K");
        assertEquals(10, card.getPoints());
    }

    @Test
    void cardValueShouldBeElevenForAce() {
        ICard card = new Card("A");
        assertEquals(11, card.getPoints());
    }

    @Test
    void shouldThrowIllegalArgumentExceptionForInvalidCard() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Card("Invalid");
        });
    }
}