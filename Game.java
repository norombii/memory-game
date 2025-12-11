import java.util.Scanner;

public class Game {
    
    Scanner scanner = new Scanner(System.in);
    Layout board = new Layout();
    Card[][] layout = board.getLayout();


    public void printIntro() {
        System.out.println("Welcome to the Memory Game!");
        System.out.println("Find all the matching pairs to win.");
        System.out.println("Select cards by entering their x and y coordinates.");
        System.out.println("Good luck!\n");
    }

    public Game() {
        play();
    }

    public void runLayout() {

        board.printLayout();
            
        // asks user for first set of coordinates (similar to quadrant IV on xy plane)
        System.out.print("x1-coord: "); // x is column
        int x1 = Integer.parseInt(scanner.nextLine());
        System.out.print("y1-coord: "); // y is row
        int y1 = Integer.parseInt(scanner.nextLine());

        if ((y1 > layout.length-1) || (x1 > layout[0].length-1) || y1 < 0 || x1 < 0) {
            System.out.println("Please enter coordinates within the board size.");
        }
        else {
            layout[y1][x1].setIsFlipped("true");

            // asks user for second set of coordinates (similar to quadrant IV on xy plane)
            System.out.print("x2-coord: "); // x is column
            int x2 = Integer.parseInt(scanner.nextLine());
            System.out.print("y2-coord: "); // y is row
            int y2 = Integer.parseInt(scanner.nextLine());

            if ((y1 > layout.length-1) || (x1 > layout[0].length-1) || y1 < 0 || x1 < 0) {
                System.out.println("Please enter coordinates within the board size.");
            }

            else {
                layout[y1][x1].setIsFlipped("true");
                layout[y2][x2].setIsFlipped("true");
                board.printLayout();

                if (layout[y1][x1].getSymbol().equals(layout[y2][x2].getSymbol())) {
                    System.out.println("Match!");
                }
                else {
                    System.out.println();
                    System.out.println("Not a match.");
                    layout[y1][x1].setIsFlipped("false");
                    layout[y2][x2].setIsFlipped("false");
                    // clears console for better playing experience
                    System.out.print("\033[H\033[2J");
                }
            }
        }
    }


    public void play() {
        //printIntro();
        runLayout();    
    } 
}
