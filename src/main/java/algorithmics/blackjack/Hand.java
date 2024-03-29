package algorithmics.blackjack;

import java.util.ArrayList;
import java.util.List;

public class Hand implements IHand{

    private final List<ICard> cards;

    public Hand(ICard firstCard, ICard secondCard) {
        cards = new ArrayList<>();
        cards.add(firstCard);
        cards.add(secondCard);
    }

    @Override
    public void addCard(ICard card) {
        cards.add(card);
    }

    @Override
    public boolean isBusted() {
        return getPoints() > 21;
    }

    @Override
    public boolean isBlackJack() {
        return cards.size() == 2 && getPoints() == 21;
    }

    @Override
    public int getPoints() {
        int points = 0;
        int aceCount = 0;
        for (ICard card : cards) {
            points = points + card.getPoints();
            if (card.getPoints() == 11) {
                aceCount++;
            }
        }
        while (points > 21 && aceCount > 0) {
            points -= 10; // Convertir un As de 11 points en 1 point
            aceCount--;
        }
        return points;
    }
}
