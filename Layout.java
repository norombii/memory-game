public class Layout {
    private Card[][] layout = new Card[6][4];

    public Layout() {
        fillLayout();
    }

    public Card[][] fillLayout() {
        for (Card[] card : layout) {
            for (int j = 0; j < layout[0].length; j++) {
                card[j] = new Card("x", false);
            }
        }
        return layout;
    }
}
