import java.util.Scanner;

public class Game {
    
    Scanner scanner = new Scanner(System.in);
    Layout layout = new Layout();
    Layout[][] Layout = layout.getLayout();


    public Game() {
        play();
    }

    public void runBoard() {
        board.printLayout();
            
            System.out.print("x-coord: "); // like on a graph; x is col
            int x = Integer.parseInt(scanner.nextLine());
            System.out.print("y-coord: "); // y is row
            int y = Integer.parseInt(scanner.nextLine());

            if ((y > sqrBoard.length-1) || (x > sqrBoard[0].length-1) || y < 0 || x < 0) {
                System.out.println("Please enter coordinates within the board size.");
            }


    public void play() {
        //printIntro();
        runBoard();    
    } 
}
