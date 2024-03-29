package algorithmics.blackjack;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HandTest {

    @Test
    public void handValueWithMultipleCards() {
        Card two = new Card("2");
        Card three = new Card("3");
        Card ten = new Card("10");
        Hand hand = new Hand(two, three); // Main initiale avec 2 et 3
        hand.addCard(ten); // Ajout de 10
        assertEquals(15, hand.getPoints()); // La main doit valoir 15
    }

    @Test
    public void handWithAceNotBusted() {
        Card ten = new Card("10");
        Card four = new Card("4");
        Card ace = new Card("A");
        Hand hand = new Hand(ten, four); // Main initiale avec 10 et 4
        hand.addCard(ace); // Ajout de l'As
        assertEquals(15, hand.getPoints()); // La main doit valoir 15
        assertFalse(hand.isBusted()); // La main ne doit pas être busted
    }

    @Test
    public void handWithMultipleAcesValueAdjustment() {
        Card aceOne = new Card("A");
        Card six = new Card("6");
        Card aceTwo = new Card("A");
        Hand hand = new Hand(aceOne, six); // Main initiale avec un As et 6
        hand.addCard(aceTwo); // Ajout d'un second As
        assertEquals(18, hand.getPoints()); // La main doit s'ajuster à 18
    }

    @Test
    public void handIsBlackjack() {
        Card ten = new Card("10");
        Card ace = new Card("A");
        Hand hand = new Hand(ten, ace); // Blackjack avec 10 et un As
        assertTrue(hand.isBlackJack()); // La main doit être un Blackjack
    }

    @Test
    public void handIsBusted() {
        Card ten = new Card("10");
        Card eight = new Card("8");
        Card five = new Card("5");
        Hand hand = new Hand(ten, eight); // Main initiale avec 10 et 8
        hand.addCard(five); // Ajout de 5
        assertTrue(hand.isBusted()); // La main doit être busted
    }

    @Test
    public void shouldValueFourWhenCardsAreTwoAndTwo() {
        ICard firstCard = new Card("2");
        ICard secondCard = new Card("2");
        IHand hand = new Hand(firstCard, secondCard);
        assertEquals(4, hand.getPoints());
    }

    @Test
    public void shouldValueFourteenWhenCardsAreEightAndSix() {
        ICard firstCard = new Card("8");
        ICard secondCard = new Card("6");
        IHand hand = new Hand(firstCard, secondCard);
        assertEquals(14, hand.getPoints());
    }

    @Test
    public void shouldValueNineteenWhenCardsAreEightAndSixAndFive() {
        ICard firstCard = new Card("8");
        ICard secondCard = new Card("6");
        ICard thirdCard = new Card("5");
        IHand hand = new Hand(firstCard, secondCard);
        hand.addCard(thirdCard);
        assertEquals(19, hand.getPoints());
    }

    @Test
    public void shouldValueSeventeenWhenCardsAreFourAndFiveAndTwoAndSix() {
        ICard firstCard = new Card("4");
        ICard secondCard = new Card("5");
        ICard thirdCard = new Card("2");
        ICard fourthCard = new Card("6");
        IHand hand = new Hand(firstCard, secondCard);
        hand.addCard(thirdCard);
        hand.addCard(fourthCard);
        assertEquals(17, hand.getPoints());
    }

    @Test
    public void shouldHaveFifteenWhenCardsAreTenAndFourAndAce() {
        ICard firstCard = new Card("10");
        ICard secondCard = new Card("4");
        ICard thirdCard = new Card("A");
        IHand hand = new Hand(firstCard, secondCard);
        hand.addCard(thirdCard);
        assertEquals(15, hand.getPoints());
        assertFalse(hand.isBlackJack());
        assertFalse(hand.isBusted());
    }

    @Test
    public void shouldHaveTwentyTwoAndBustedWhenCardsAreTenAndFourAndSevenAndAce() {
        ICard firstCard = new Card("10");
        ICard secondCard = new Card("4");
        ICard thirdCard = new Card("7");
        ICard fourthCard = new Card("A");
        IHand hand = new Hand(firstCard, secondCard);
        hand.addCard(thirdCard);
        hand.addCard(fourthCard);
        assertEquals(22, hand.getPoints());
        assertTrue(hand.isBusted());
    }

    @Test
    public void shouldHaveTwelveWhenHandAlreadyContainsAce() {
        ICard firstCard = new Card("A");
        ICard secondCard = new Card("6");
        ICard thirdCard = new Card("4");
        ICard fourthCard = new Card("A");
        IHand hand = new Hand(firstCard, secondCard);
        hand.addCard(thirdCard);
        hand.addCard(fourthCard);
        assertEquals(12, hand.getPoints());
        assertFalse(hand.isBlackJack());
        assertFalse(hand.isBusted());
    }
}