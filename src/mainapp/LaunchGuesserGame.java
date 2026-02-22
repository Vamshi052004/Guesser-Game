package mainapp;

import Umpire.Umpire;

public class LaunchGuesserGame {

	public static void main(String[] args) {
		Umpire u = new Umpire();
		u.collectNumberFromGuesser();
		u.collectNumberFromPlayer();
		u.Compare();

	}

}
