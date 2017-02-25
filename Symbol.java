
public class Symbol {
	
	private static char currentSymbol = 'X';
	private static Board board = new Board() ;
	private static Symbol symbol = new Symbol() ;
	

	public static char getCurrentSymbol() {
		return currentSymbol;
	}
	
	public static void setCurrentSymbol(char currentSymbol) {
		Symbol.currentSymbol = currentSymbol;
	}
	
	//To change symbol when the player is changed.
	public static void changeSymbol() {
		if (currentSymbol == 'X') {
			currentSymbol = 'O';
		} else {
			currentSymbol = 'X';
		}
	}
	
	//To mark the current position with symbol.
	public static boolean currentMark(int row, int col) {
		if ((row >= 0) && (row < 9)) {
			if ((col >= 0) && (col < 9)) {
				if (board.getBoard()[row][col] == '-') {
					board.getBoard()[row][col] = symbol.getCurrentSymbol();
					return true;
				}
			}
		}
		return false;
	}
	
}