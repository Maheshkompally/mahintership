package internship;
import java.util.Scanner;

public class GameBoard {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the size of board:");
		int size=scanner.nextInt();
		scanner.close();
		drawgameboard(size);
	}
	public static void drawgameboard(int size) {
		for (int i=0;i <size;i++) {
			for(int j=0;j<size;j++) {
			System.out.print("---");
		}
			System.out.println();
			for(int j=0;j<size+1;j++) {
				System.out.print("|  ");
			}
				System.out.println();
			}
			for (int j=0;j<size;j++) {
				System.out.print("---");
			}
	}

}
