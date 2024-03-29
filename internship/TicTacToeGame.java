package internship;
	import java.util.Scanner;

	public class TicTacToeGame {
	    private static char[][] board = {
	            {' ', ' ', ' '},
	            {' ', ' ', ' '},
	            {' ', ' ', ' '}
	    };

	    private static char currentPlayer = 'X';

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        while (true) {
	            drawBoard();
	            System.out.println("Player " + currentPlayer + ", enter your move (row[1-3] column[1-3]):");
	            int row = scanner.nextInt() - 1;
	            int col = scanner.nextInt() - 1;
	            if (isValidMove(row, col)) {
	                board[row][col] = currentPlayer;
	                if (isGameWon()) {
	                    drawBoard();
	                    System.out.println("Player " + currentPlayer + " wins!");
	                    break;
	                }
	                if (isGameDraw()) {
	                    drawBoard();
	                    System.out.println("It's a draw!");
	                    break;
	                }

	                // Switch players
	                currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
	            } else {
	                System.out.println("Invalid move. Try again.");
	            }
	        }

	        scanner.close();
	    }

	    private static void drawBoard() {
	        System.out.println("-------------");
	        for (int i = 0; i < 3; i++) {
	            System.out.print("| ");
	            for (int j = 0; j < 3; j++) {
	                System.out.print(board[i][j] + " | ");
	            }
	            System.out.println("\n-------------");
	        }
	    }

	    private static boolean isValidMove(int row, int col) {
	        return row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == ' ';
	    }

	    private static boolean isGameWon() {
	        for (int i = 0; i < 3; i++) {
	            if (board[i][0] == currentPlayer && board[i][1] == currentPlayer && board[i][2] == currentPlayer) {
	                return true; 
	            }
	            if (board[0][i] == currentPlayer && board[1][i] == currentPlayer && board[2][i] == currentPlayer) {
	                return true; 
	            }
	        }
	        if (board[0][0] == currentPlayer && board[1][1] == currentPlayer && board[2][2] == currentPlayer) {
	            return true; 
	        }
	        if (board[0][2] == currentPlayer && board[1][1] == currentPlayer && board[2][0] == currentPlayer) {
	            return true; 
	        }
	        return false;
	    }

	    private static boolean isGameDraw() {
	        for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < 3; j++) {
	                if (board[i][j] == ' ') {
	                    return false;
	                }
	            }
	        }
	        return true;
	    }
	}


