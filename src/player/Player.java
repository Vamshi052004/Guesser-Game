package player;

import java.util.Scanner;

public class Player {
	int playerNumber;
	public int guessNumber() {
		System.out.println("Player kindly guess a number from 1 to 10");
		Scanner sc = new Scanner(System.in);
		playerNumber = sc.nextInt();
		return playerNumber;
	}
}
