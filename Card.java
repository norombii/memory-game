public class Card {
    private boolean isFlipped = false;
    //private boolean DEBUG = true;

    public static String CARD_DISPLAY = "*";
    private String symbolDisplay;

    public Card(String symbDis) {
        symbolDisplay = symbDis;
    }

    public String getSymbol() {
        return symbolDisplay;
    }

    public boolean getIsFlipped() {
        return isFlipped;
    }

    public void setIsFlipped(String s) {
        if (s.equals("false")) {
            isFlipped = false;
        } 
        else {
            isFlipped = true;
        }
    }
}
