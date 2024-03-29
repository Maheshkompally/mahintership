package internship;
	public class TicTacToeChecker {
	    public static void main(String[] args) {
        char[][] board = {
	            {'X', 'O', 'X'},
	            {'O', 'X', 'O'},
	            {'X', 'O', 'X'}
	        };
	        String status = checkTicTacToe(board);
	        System.out.println("Tic-Tac-Toe Status: " + status);
	    }
	    public static String checkTicTacToe(char[][] board) {
	        for (int i = 0; i < 3; i++) {
	            if (board[i][0] == board[i][1] && board[i][1] == board[i][2]) {
	                if (board[i][0] != ' ') {
	                    return "Winner: " + board[i][0];
	                }
	            }
	            if (board[0][i] == board[1][i] && board[1][i] == board[2][i]) {
	                if (board[0][i] != ' ') {
	                    return "Winner: " + board[0][i];
	                }
	            }
	        }
	        if (board[0][0] == board[1][1] && board[1][1] == board[2][2]) {
	            if (board[0][0] != ' ') {
	                return "Winner: " + board[0][0];
	            }
	        }
	        if (board[0][2] == board[1][1] && board[1][1] == board[2][0]) {
	            if (board[0][2] != ' ') {
	                return "Winner: " + board[0][2];
	            }
	        }
	        boolean draw = true;
	        for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < 3; j++) {
	                if (board[i][j] == ' ') {
	                    draw = false;
	                    break;
	                }
	            }
	        }
	        if (draw) {
	            return "Draw";
	        }
	        return "In Progress";
	    }
	}

