import java.util.Random;
import java.util.Scanner;

public class TicTacToe {

	public TicTacToe() {
		super();
		
		char[][] board = { { ' ', ' ', ' ' },
				   { ' ', ' ', ' ' },
				   { ' ', ' ', ' ' } };
		
		displayBoard(board);
	}

	public void getComputerMove(char[][]board) {
		Random random = new Random();
		int computerMove = random.nextInt(9) + 1;
		System.out.println( "Computer move: " + computerMove);
		
		switch(computerMove) {
	    case 1:
	        if (board[0][0] == ' ') {
	            board[0][0] = 'O';
	        }
	        break;
	    case 2:
	        if (board[0][1] == ' ') {
	            board[0][1] = 'O';
	        }
	        break;
	    case 3:
	        if (board[0][2] == ' ') {
	            board[0][2] = 'O';
	        }
	        break;
	    case 4:
	        if (board[1][0] == ' ') {
	            board[1][0] = 'O';
	        }
	        break;
	    case 5:
	        if (board[1][1] == ' ') {
	            board[1][1] = 'O';
	        }
	        break;
	    case 6:
	        if (board[1][2] == ' ') {
	            board[1][2] = 'O';
	        }
	        break;
	    case 7:
	        if (board[2][0] == ' ') {
	            board[2][0] = 'O';
	        }
	        break;
	    case 8:
	        if (board[2][1] == ' ') {
	            board[2][1] = 'O';
	        }
	        break;
	    case 9:
	        if (board[2][2] == ' ') {
	            board[2][2] = 'O';
	        }
	        break;
	    default:
	        System.out.println("Invalid Input");
	        break;
	    }
		displayBoard(board);
	}

	public void getUserMove(char[][] board) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter your move (1-9) : ");
		String userInput = scan.nextLine();
		
		switch(userInput) {
	    case "1":
	        board[0][0] = 'X';
	        break;
	    case "2":
	        board[0][1] = 'X';
	        break;
	    case "3":
	        board[0][2] = 'X';
	        break;
	    case "4":
	        board[1][0] = 'X';
	        break;
	    case "5":
	        board[1][1] = 'X';
	        break;
	    case "6":
	        board[1][2] = 'X';
	        break;
	    case "7":
	        board[2][0] = 'X';
	        break;
	    case "8":
	        board[2][1] = 'X';
	        break;
	    case "9":
	        board[2][2] = 'X';
	        break;
	    default:
	        System.out.println("Invalid Input");
	        break;
	}
		
		getComputerMove(board);
		displayBoard(board);
	}
	
	public void displayBoard(char[][] board) {
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
//		getComputerMove(board);
		getUserMove(board);
	}

}
