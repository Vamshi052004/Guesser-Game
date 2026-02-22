package guesser;

import java.util.Random;

public class Guesser {
	int guessNumber;
	public int guessNumber() {
		System.out.println("Guesser Kindly guess a number from 1 to 10");
		Random r = new Random();
		guessNumber = r.nextInt(10) + 1;
		return guessNumber;
	}
}
