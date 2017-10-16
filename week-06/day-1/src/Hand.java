import java.util.ArrayList;
import java.util.Arrays;

public class Hand {
    protected ArrayList<Card> hand;

    public Hand (String[] cards) {
        this.hand = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Card card = new Card(cards[i]);
            hand.add(card);
        }
    }

    public String handOut () {
        String out = "";
        for (int i = 0; i < 5; i++) {
            if (i < 4) {
                out += (hand.get(i).getCard() + " ");
            } else if (i == 4) {
                out += (hand.get(i).getCard());
            }
        }
        return out;
    }

}
