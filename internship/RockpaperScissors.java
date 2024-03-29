package internship;
import java.util.Scanner;

public class RockpaperScissors {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean playagain = true;
		while(playagain) {
			System.out.println("lets play Rock-paper-scissor game!");
			System.out.println("player 1,enter your choice rock,paper or scissor:");
			String player1choice = scanner.next().toLowerCase();
			System.out.println("player2, enter your choice(rock,paper or scissor):");
			String player2choice = scanner.next().toLowerCase();
			String result=determineWinner(player1choice,player2choice);
			System.out.println(result);
			System.out.print("Do you want play again? (yes/no):");
			String playagaininput = scanner.next().toLowerCase();
			playagain = playagaininput.equals("yes");
		}
		System.out.println("Thanks for playing!");
		scanner.close();
	}
	public static String determineWinner(String choice1, String choice2) {
		if (choice1.equals(choice2)) {
			return "It's a tie!";
		} else if (choice1.equals("rock")) {
				 return choice2.equals("scissors") ? "player1 wins!" : "player2 wins!";
	}else if(choice1.equals("paper")) {
		return choice2.equals("rock")? "player 1 wins" : "player 2 wins!";
	} else if (choice1.equals("scissors")) {
		return choice2.equals("paper") ? "player 1 wins!" : "player 2 wins!";
	} else {
		return "invalid choice. please enter 'rock',''paper','scissor'.";
		
		}
	}

}
