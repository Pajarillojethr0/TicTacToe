public class TicTacToe {

	public TicTacToe() {
		super();
		
		char[][] board = { { ' ', ' ', ' ' },
				   { ' ', ' ', ' ' },
				   { ' ', ' ', ' ' } };
		
		displayBoard(board);
	}


	private void displayBoard(char[][] board) {
		int rowSize = board.length;
		int colSize = board[0].length;
		
		for(int i = 0; i < rowSize; i++) {
			for(int j = 0; j < colSize; j++) {
				System.out.print(board[i][j]);
				if(j != colSize-1) {
					System.out.print("|");
				}
			}
			System.out.println();
			if(i != rowSize-1) {
				System.out.println("-+-+-");
			}
		}
		
		System.out.print(" X turn");
	}

}
