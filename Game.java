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
            
        // asks user for coordinates (similar to quadrant IV on xy plane)
        System.out.print("x-coord: "); // x is column
        int x = Integer.parseInt(scanner.nextLine());
        System.out.print("y-coord: "); // y is row
        int y = Integer.parseInt(scanner.nextLine());

        if ((y > layout.length-1) || (x > layout[0].length-1) || y < 0 || x < 0) {
            System.out.println("Please enter coordinates within the board size.");
        }
        else {
            layout[y][x].setIsFlipped("true");
        }
    }


    public void play() {
        //printIntro();
        runLayout();    
    } 
}
