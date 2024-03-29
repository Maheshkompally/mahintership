package internship;

public class TicTacToeDraw {
	    public static void main(String[] args) {
	        char[][] board = {
	            {'X', 'O', 'X'},
	            {'O', 'X', 'O'},
	            {'X', 'O', 'X'}
	        };
	        drawTicTacToeBoard(board);
	    }

	    public static void drawTicTacToeBoard(char[][] board) {
	        for (int i = 0; i < board.length; i++) {
	            for (int j = 0; j < board[0].length; j++) {
	                System.out.print(" " + board[i][j] + " ");
	                if (j < board[0].length - 1) {
	                    System.out.print("|");
	                }
	            }
	            System.out.println();
	            if (i < board.length - 1) {
	                for (int j = 0; j < board[0].length; j++) {
	                    System.out.print("---");
	                    if (j < board[0].length - 1) {
	                        System.out.print("|");
	                    }
	                }
	                System.out.println();
	            }
	        }
	    }
	}
