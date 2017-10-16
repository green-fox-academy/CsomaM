public class Card {
    protected char value;
    protected char type;
    protected String wholeCard;

    public Card (String input) {
        this.value = input.charAt(0);
        this.type = input.charAt(1);
        this.wholeCard = input;
    }

    public String getCard () {
        return wholeCard;
    }

    public char getValue ( ) {
        return value;
    }

    public char getType ( ) {
        return type;
    }
}
