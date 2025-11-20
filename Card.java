public class Card {
    private boolean isFlipped = false;
    private boolean DEBUG_MODE = true;
    private boolean hasSymbol = false;

    public static String CARD_DISPLAY = "*";
    public static String SYMBOL_DISPLAY;

    public Card(String symbol, boolean hasSymbol) {
        symbol = SYMBOL_DISPLAY;
        this.hasSymbol = hasSymbol;
    }

    public String getSymbol() {
        return SYMBOL_DISPLAY;
    }

    public boolean getIsFlipped() {
        return isUncovered;
    }

    public void setIsFlipped() {
        isUncovered = true;
    }
}
