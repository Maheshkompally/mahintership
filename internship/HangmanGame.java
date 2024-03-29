package internship;
	import java.util.Scanner;
	public class HangmanGame {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        String secretWord = "hangman";
	        int attempts = 6;
	        StringBuilder guessedWord = new StringBuilder(secretWord.replaceAll(".", "_"));
	        boolean gameWon = false;
	        while (attempts > 0 && !gameWon) {
	            System.out.println("Word: " + guessedWord);
	            System.out.println("Attempts left: " + attempts);
	            System.out.print("Enter a letter: ");
	            char guess = scanner.next().charAt(0);
	            boolean letterFound = false;
	            for (int i = 0; i < secretWord.length(); i++) {
	                if (secretWord.charAt(i) == guess) {
	                    guessedWord.setCharAt(i, guess);
	                    letterFound = true;
	                }
	            }
	            if (!letterFound) {
	                attempts--;
	                System.out.println("Incorrect guess!");
	            } else {
	                System.out.println("Correct guess!");
	            }
	            if (guessedWord.toString().equals(secretWord)) {
	                gameWon = true;
	            }
	        }
	        if (gameWon) {
	            System.out.println("Congratulations! You won! The word was: " + secretWord);
	        } else {
	            System.out.println("You lost! The word was: " + secretWord);
	        }
	        
	        scanner.close();
	    }
	}


