package algorithmics.blackjack;

public class Card implements ICard {

    private String value;

    public Card(String value) {
        if (!isValidCard(value)) {
            throw new IllegalArgumentException("Invalid");
        }
        this.value = value;
    }

    private boolean isValidCard(String value) {
        return value.matches("[2-9]|[AJQK]|1|10");
    }

    @Override
    public int getPoints() {
        if(value.equals("J") || value.equals("Q")  ||  value.equals("K") ) {
            return 10;
        } else if(value.equals("A") || Integer.parseInt(value) == 1) {
            return 11;
        } else {
            return Integer.parseInt(value);
        }
    }
}
