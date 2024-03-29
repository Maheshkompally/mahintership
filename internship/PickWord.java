package internship;
import java.util.Random;
public class PickWord {
	public static void main(String[] args) {
		String[] words = {"canon","nikon","fujifilm","sony"};
		int randomIndex=pickRandomIndex(words.length);
		String randomword=words[randomIndex];
		System.out.println("Randomly picked word:" +randomword);
	}
		public static int pickRandomIndex(int length) {
			Random random =new Random();
			return random.nextInt(length);
		}
	}
