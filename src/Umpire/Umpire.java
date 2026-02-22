package Umpire;

import guesser.Guesser;
import player.Player;

public class Umpire {
	int numberFromGuesser;
	int numberFromPlayer1;
	int numberFromPlayer2;
	int numberFromPlayer3;
	
	public void collectNumberFromGuesser() {
		Guesser g = new Guesser();
		numberFromGuesser = g.guessNumber();
	}
	
	public void collectNumberFromPlayer() {
		Player p1 = new Player();
		Player p2 = new Player();
		Player p3 = new Player();
		
		numberFromPlayer1 = p1.guessNumber();
		numberFromPlayer2 = p2.guessNumber();
		numberFromPlayer3 = p3.guessNumber();
	}
	
	public void Compare() {
		if(numberFromGuesser == numberFromPlayer1) {
			System.out.println("Player1 wins");
		}
		else if(numberFromGuesser == numberFromPlayer2) {
			System.out.println("Player2 wins");
		}
		else if(numberFromGuesser == numberFromPlayer3) {
			System.out.println("Player3 wins");
		}
		else {
			System.out.println("Game Lost... Try Again!!");
		}
		System.out.println("Number guessed by the guesser is " + numberFromGuesser);
	}
}
