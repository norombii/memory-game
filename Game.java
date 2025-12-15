import java.util.Scanner;

public class Game {
    
    Scanner scanner = new Scanner(System.in);
    Layout board = new Layout();
    Card[][] layout = board.getLayout();
    private int matchFound = 0;

    public void printIntro() {
        System.out.println("");
        System.out.println("Welcome to the Memory Game!");
        System.out.println("Find all the matching pairs to win.");
        System.out.println("Select cards by entering their x and y coordinates.");
        System.out.println("Good luck!\n");
    }

    public Game() {
        play();
    }

    // moves to top of console for better playing experience
    // code is written by my teacher
    public static void clearScreen() {
        // Hacky gross unicode hack to clear console - Teacher
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public void runLayout() {

        while (matchFound <= 12) {

            board.printLayout();
                
            // asks user for first set of coordinates (similar to quadrant IV on xy plane)
            System.out.println("Choose the first card:");
            System.out.print("x1-coord: "); // x is column
            int x1 = Integer.parseInt(scanner.nextLine());
            System.out.print("y1-coord: "); // y is row
            int y1 = Integer.parseInt(scanner.nextLine());

            // checks if coordinates are within the board size
            if ((y1 > layout.length-1) || (x1 > layout[0].length-1) || y1 < 0 || x1 < 0) {
                clearScreen();
                System.out.println("Please enter coordinates within the board size.");
            }

            else {
                layout[y1][x1].setIsFlipped("true");
                System.out.println("---");

                // asks user for second set of coordinates
                System.out.println("Choose the second card:");
                System.out.print("x2-coord: "); // x is each column
                int x2 = Integer.parseInt(scanner.nextLine());
                System.out.print("y2-coord: "); // y is each row
                int y2 = Integer.parseInt(scanner.nextLine());

                if ((y2 > layout.length-1) || (x2 > layout[0].length-1) || y2 < 0 || x2 < 0) {
                    clearScreen();
                    System.out.println("Please enter coordinates within the board size.");
                }

                else {
                    clearScreen();
                    System.out.println("---");
                    layout[y1][x1].setIsFlipped("true");
                    layout[y2][x2].setIsFlipped("true");
                    board.printLayout();

                    if (layout[y1][x1].getSymbol().equals(layout[y2][x2].getSymbol())) {
                        System.out.println("Match!");
                        matchFound++;
                       System.out.println("Matches found: " + (matchFound));
                    }

                    else {
                        System.out.println("~~");
                        System.out.println("You chosen cards: " + layout[y1][x1].getSymbol() + " and " + layout[y2][x2].getSymbol());
                        System.out.println("Not a match :(");
                        System.out.println("~~");

                        layout[y1][x1].setIsFlipped("false");
                        layout[y2][x2].setIsFlipped("false");
                        }

                    if (matchFound == 12) {
                    System.out.println("You found all matches! You win!");
                    System.out.println("Thanks for playing!");
                    break;
                    }
                }
            }
        }
    }

    public void play() {
        printIntro();
        runLayout();    
    } 
}
