package internship;
import java.util.Scanner;
import java.util.Random;

public class Guessnumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		boolean playagain=true;
		while (playagain) {
			int randomnumber=random.nextInt(9)+1;
			int attempts = 0;
			boolean guessedCorrectly=false;
			System.out.println("Welcome to the guess the Number game!");
			System.out.println("I have selected a number between 1 and 9.can you guess it?");
			while (!guessedCorrectly) {
				System.out.print("Enter your guess:");
				int guess=scanner.nextInt();
				attempts++;
				if (guess ==randomnumber) {
					System.out.println("you guessed the number " +  randomnumber + " correctly");
					System.out.println("It took you " +attempts+ " attempts.");
					guessedCorrectly=true;
				}else if (guess < randomnumber) {
					System.out.println("Too low! Try again.");
				} else {
					System.out.println("Too high! Try again.");					
				}
			}
			System.out.print("Do you want to play again? (yes/no):");
			String playagaininput=scanner.next().toLowerCase();
			playagain=playagaininput.equals("yes");
			
		}
		System.out.println("Thank for playing guess the Number game!");
		scanner.close();
	}

}
