
public class Board {
	
	private static char[][] board = new char[9][9];
	
	public static char[][] getBoard() {
		return board;
	}

	public static void setBoard(char[][] board) {
		Board.board = board;
	}

	//To Generate new board for players.
	public static void initialBoard() {
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				board[i][j] = '-';
			}
		}
	}
	
	//To check if the board is full or not.
	public boolean isFull() {
		boolean full = true;
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				if (board[i][j] == '-') {
					full = false;
				}
			}
		}
		return full;
	}

	//To print the game board.
	public String toString() {
		String temp = "" ;
		for (int i = 0; i < 10; i++) {
			temp += String.format("%d   ", i) ;
		}
		temp += "\n" ;
		for (int i = 0; i < 9; i++) {
			temp += String.format("%d | ", i+1);
			for (int j = 0; j < 9; j++) {
				temp += String.format("%c | ", board[i][j]);
			}
			temp += "\n" ;
		}
		return temp ;
	}
}
