import java.util.Scanner;

public class TicTacToe {
	
	private static Board board = new Board() ;
	private static Symbol symbol = new Symbol() ;
	
	//To check the winner in right diagonal (\)
	private static boolean isDiagonalRightWin() {
		int i = 0 , countRight = 0;
			while(i < 9) {
					if(board.getBoard()[i][i] == Symbol.getCurrentSymbol()) {
						countRight++;
						if(countRight == 5) { return true ;	}
					}else {
						countRight = 0 ;
					}
					i++;
				}
		return false ;
    }
	
	//To check the winner in left diagonal (/)
	private static boolean isDiagonalLeftWin() {
		int i = 8 , j = 0 , countLeft = 0;
		
		while(i >= 0) {
			if(board.getBoard()[i][j] == symbol.getCurrentSymbol()){ 
				countLeft++;
				if(countLeft == 5) { return true ; }
			}else {
				countLeft = 0 ;
			}	
			i--; j++;
		}
		return false ;
    }
	
	//To check the winner in column.
	private static boolean isColumnsWin() {
		int countColumn = 0 ;
		for(int i = 0 ; i < 9 ; i++) {
			for(int j = 0 ; j < 9 ; j++) {
				if(board.getBoard()[j][i] == symbol.getCurrentSymbol()) {
					countColumn++;
					if(countColumn == 5) {
						return true ;
					}
				}
			}
			countColumn = 0 ;
		}
		return false;
	}

	//To check the winner in row.
	private static boolean isRowsWin() {
		int countRow = 0 ;
		for(int i = 0 ; i < 9 ; i++) {
			for(int j = 0 ; j < 9 ; j++) {
				if(board.getBoard()[i][j] == symbol.getCurrentSymbol()) {
					countRow++;
					if(countRow == 5) {
						return true ;
					}
				}
			}
			countRow = 0 ;
		}
		return false;
	}

	//To check if any type of wining occur.
	public static boolean isWin() {
		return (isRowsWin() || isColumnsWin() || isDiagonalRightWin() || isDiagonalLeftWin());
	}
}
