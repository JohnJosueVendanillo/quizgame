package com.quizgame;

import java.util.Scanner;

public class Player {
	Scanner scan = new Scanner(System.in);

	private String playerName;
	private int playerScore;

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public int getPlayerScore() {
		return playerScore;
	}

	public void setPlayerScore(int playerScore) {
		this.playerScore = playerScore;
	}

	public Player(String playerName, int playerScore) {
		this.playerName = playerName;
		this.playerScore = playerScore;
	}

	public Player() {

	}

	String q1 = "What is the National Fruit of Philippines?" + "\na) Grapes b)Mango c)lychee";
	String q2 = "What is the national Food of the Philippines?" + "\na) Adobo b)Sinigang c)Pepper beef mushroom";
	String q3 = "What food is being sell every Simbang Gabi that being cooked with burning coal on the top?"
			+ "\na) Puto bungbong b)Leche Flan c)Bibingka";
	String q4 = "What kind of food is famous in Ilocos region?" + "\na) Turon b)Empanada c)Stick-o";
	String q5 = "What kind of raw food that mixed with vegetables & vinegar and other spices?"
			+ "\na) Spaghetti b)Adobo c)Kinilaw";

	Questions[] question = { new Questions(q1, "b"), new Questions(q2, "a"), new Questions(q3, "c"),
			new Questions(q4, "b"), new Questions(q5, "c") };

	String w1 ="Where is Boracay located?" + "\na) Pampanga b)Bohol c)Aklan";
	String w2 ="Where is the capital of the philippines located?" + "\na) Cebu b)Pampanga c)Manila";
	String w3 ="Where is famous chocolocalte hills located?" + "\na) Cavite b)Bohol c)Surigao";
	String w4 ="Where is the summer capital of the Philippines?" + "\na) Baguio City b)Palawan c)Boracay";
	String w5 ="Where is the place that Jose Rizal has been exiled?" + "\na)Hawaii b)Hongkong c)Dapitan";
	
	Questions[] questionb = { new Questions(w1, "c"), new Questions(w2, "c"), new Questions(w3, "b"),
			new Questions(w4, "a"), new Questions(w5, "c") };
	
	public void playerDetails() {
		String input;
		System.out.println("\n============================");
		System.out.println("Enter your Name: ");
		input = scan.nextLine();
		setPlayerName(input);

	}

	public void categories() {

		boolean check = false;
		System.out.println("Hello " + getPlayerName() + ", Welcome to the game!.\nPlease select a category.\n");

		while (!check) {
			String input;
			System.out.format("%2s %6s %6s %6s\n", "A.)FOODS", "B.)PLACES", "C.)EVENTS", "D.)PERSON");
			System.out.print("Enter here:");
			input = scan.next();

			if (input.equals("A") || input.equals("a")) {
				categoryAquestions(question);

				check = true;
			} else if (input.equals("B") || input.equals("b")) {
				categoryBquestions(questionb);
				check = true;
			} else if (input.equals("C") || input.equals("c")) {

			} else if (input.equals("D") || input.equals("d")) {

			}

			else {
				check = false;
			}

		}

	}

	public void categoryAquestions(Questions[] question) {

		int score = 0;

		String input;

		for (int i = 0; i < question.length; i++) {

			System.out.println("Question #" + (i + 1));
			System.out.println(question[i].prompt);
			System.out.print("Enter:");
			input = scan.next();
			if (input.equals(question[i].answer)) {
				score++;
			}

		}

		setPlayerScore(score);

		System.out.println(
				"Player Name: " + getPlayerName() + ".\nYour Score: " + getPlayerScore() + "/" + question.length + ".");

	}
	
	
	public void categoryBquestions(Questions[] questionb) {

		int score = 0;

		String input;

		for (int i = 0; i < question.length; i++) {

			System.out.println("Question #" + (i + 1));
			System.out.println(questionb[i].prompt);
			System.out.print("Enter:");
			input = scan.next();
			if (input.equals(questionb[i].answer)) {
				score++;
			}

		}

		setPlayerScore(score);

		System.out.println(
				"Player Name: " + getPlayerName() + ".\nYour Score: " + getPlayerScore() + "/" + question.length + ".");

	}

	public void toLoad() {

	}

}
