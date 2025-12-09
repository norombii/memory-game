import java.util.ArrayList;
import java.util.Arrays;

public class Layout {
    private Card[][] layout = new Card[4][6];
    
    public static ArrayList<String> symbolList = new ArrayList<String>(Arrays.asList("✦", "✧", "✰", "▣", "❤", "♡", "❄", 
    "◯", "◎", "☢", "⇦", "⇨", "✦", "✧", "✰", "▣", "❤", "♡", "❄", "◯", "◎", "☢", "⇦", "⇨"));

    public Layout() {
        fillLayout();
    }

    // fills each card with a symbol, (each symbol is repeated once)
    // then removes the symbol from symbolList.
    // returns the filled layout with symbols added to each card.
    public Card[][] fillLayout() {
        for (int i = 0; i < layout.length; i++) {
            for (int j = 0; j < layout[0].length; j++) {
                int randomIndex = (int) (Math.random() * (symbolList.size()-1));
                String currSym = symbolList.remove(randomIndex);
                layout[i][j] = new Card((currSym));
            }
        }
        return layout;
    }

    // this method is copied and revised from on of my previous works with printing 2D arrays
    public void printLayout() {

        //print the column numbers
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

        // print each row of the 2D array
        for (int i = 0; i < layout.length; i++) {
            System.out.print(i + " | ");
            for (int j = 0; j < layout[0].length; j++) {
                System.out.print(layout[i][j].getSymbol() + "   ");
            }
            System.out.println();
            System.out.println();
        }
    }

    public Card[][] getLayout() {
        return layout;
    }
}
