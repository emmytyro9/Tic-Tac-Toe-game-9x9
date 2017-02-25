import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		Board board = new Board() ;
		TicTacToe game = new TicTacToe() ;
		Symbol symbol = new Symbol() ;
		board.initialBoard() ;
		System.out.print(board.toString());

		while (!board.isFull()) {

			if (symbol.getCurrentSymbol() == 'X') {
				System.out.println("Player 1's turn.");
			} else {
				System.out.println("Player 2's turn.");
			}
			System.out.print("Please select row: ");
			int row = scan.nextInt();
			System.out.print("Please select col: ");
			int col = scan.nextInt();

			while (Board.getBoard()[row-1][col-1] != '-') {
				System.out.println("\n\n\nYou can't place on that cell.");
				System.out.print("Please select row: ");
				row = scan.nextInt();
				System.out.print("Please select col: ");
				col = scan.nextInt();
			}

			symbol.currentMark(row - 1, col - 1);
			System.out.println();
			System.out.printf("You placed %s on (%d, %d)\n", symbol.getCurrentSymbol(), row, col);
			System.out.print(board.toString()) ;
			if (game.isWin()) {
				if (symbol.getCurrentSymbol() == 'X') {
					System.out.println("Player'1 win.");
				} else {
					System.out.println("Player'2 win.");
				}
				break;
			}
			symbol.changeSymbol();
		}
	}
}
