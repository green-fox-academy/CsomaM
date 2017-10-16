import java.util.ArrayList;

public class GameMechanics {

    protected char[] cardValues;

    public GameMechanics () {
        cardValues = new char[]{ '2', '3', '4', '5', '6', '7', '8', '9', 'T', 'J', 'Q', 'K', 'A'};
    }

    public String highestCard (Hand test) {

        String highCard = "";
        int i = cardValues.length - 1;
        boolean found = false;
        while (!found && i > 0) {
            for (int j = 0; j < test.hand.size(); j++) {
                if (test.hand.get(j).getValue() == cardValues[i]) {
                    found = true;
                    highCard = test.hand.get(j).getCard();
                }
            }
            i--;
        }
        return highCard;
    }

    public ArrayList<String> checkMultiple (Hand test) {
        ArrayList<String> multiples = new ArrayList<>();
        for (int i = 0; i < test.hand.size() - 1; i++) {
            for (int j = i + 1; j < test.hand.size(); j++) {
                if (test.hand.get(i).getValue() == test.hand.get(j).getValue() && !multiples.contains(test.hand.get(i)) && !multiples.contains(test.hand.get(j))) {
                    multiples.add(test.hand.get(i).getCard());
                    multiples.add(test.hand.get(j).getCard());
                }
            }
        }
        return multiples;
    }

    public boolean checkTriple (Hand test) {
        boolean tripleExists = false;
        int size = checkMultiple(test).size();
        if (size == 8) {
            tripleExists = true;
        } else if (size == 6) {
            tripleExists = true;
        }
        return tripleExists;
    }

    public boolean checkPairs (Hand test) {
        boolean doubleExists = false;
        int size = checkMultiple(test).size();
        if (size == 8 || size == 4 || size == 2) {
            doubleExists = true;
        }
        return doubleExists;
    }

    public boolean checkStraight (Hand test) {
        boolean straight = false;
        ArrayList<Card> temp = new ArrayList<>();
        int i = 0;
        while (i < cardValues.length) {
            for (int j = 0; j < test.hand.size(); j++) {
                if (test.hand.get(j).getValue() == cardValues[i]) {
                    temp.add(test.hand.get(j));
                }
            }
            i++;
        }
        if (temp.size() > 2) {
            straight = true;
        }
        return straight;
    }
}