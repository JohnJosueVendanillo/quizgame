package com.quizgame;

import java.util.Scanner;

public class QuizGameDriver {
	static Scanner scan = new Scanner(System.in);
	
	static Player player = new Player();

	public static void main(String[] args) {

		String input;
		boolean check = false;

		while (!check) {
			try {
				
				System.out.println("\nWelcome to PINOY KABA? Quiz game");
				System.out.print("Enter 1 to Enter.\nEnter 2 to show Score Rankings.\nEnter 0 to Exit.\nEnter here:");
				input = scan.nextLine();
				
				if (input.equals("1")) {
					// enter the game
					
					
					player.playerDetails();
					player.categories();
					player.toLoad();
					
					
				} else if (input.equals("2")) {
					// here will show the rankings Top 1 - 10 highscores
					
				} else if (input.equals("0")) {
					System.err.println("Exiting program.....\nThank you!");
					System.exit(0);
				}
				else {
					System.err.println("RESULT: INVALID INPUT. TRY AGAIN");
					check = false;
				}
			}catch (Exception e) {
				System.err.println("RESULT: INVALID INPUT. TRY AGAIN");
				check = false;
			}

		}

	}

	
}
