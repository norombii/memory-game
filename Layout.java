import java.util.ArrayList;

public class Layout {
    private Card[][] layout = new Card[6][4];
    
    public ArrayList<String> symbolList = new ArrayList<String>("✦", "✧", "✰", "▣", "❤", "♡", "❄", "◯", "◎", "☢", "⇦", "⇨",
     "✦", "✧", "✰", "▣", "❤", "♡", "❄", "◯", "◎", "☢", "⇦", "⇨");

    public Layout() {
        fillLayout();
    }

    // fills each card with a symbol (each symbol is repeated once)
    // then removing the symbol from symbolList.
    // returns the filled layout with symbols added to each card.
    public Card[][] fillLayout() {
        for (Card[] card : layout) {
            for (int j = 0; j < layout[0].length; j++) {
                int randomIndex = (int) (Math.random() * (symbolList.size()-1));
                card[j] = new Card(symbolList[randomIndex], true);
                symbolList[randomIndex].remove(randomIndex);
            }
        }
        return layout;
    }

    // this method is copied from on of my previous works with printing 2D arrays
    public void printLayout() {
        for (int k = 0; k <= layout[0].length-1; k++) { 
            if (k == 0) {
                System.out.print("    ");
            }
            System.out.print(k + "   ");
        }
        System.out.println();
        for (int f = 0; f <= layout[0].length; f++) {
            System.out.print("----");
        }
        System.out.println();

        for (int i = 0; i < layout.length; i++) {
            System.out.print(i + " | ");
            for (int j = 0; j < layout[0].length; j++) {
                //System.out.print(j);
                System.out.print(layout[i][j] + "   ");
            }
            System.out.println();
            System.out.println();
        }

    }
}
