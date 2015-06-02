package redditdailyprogrammer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HoldemGame {

	int numPlayers;
	Random r = new Random(); //used for generating random cards
	
	int cIndex;
	String card;
	
	ArrayList<String> cards = new ArrayList<String>(Arrays.asList("2d", "2s",
			"2c", "2h", "3d", "3s", "3c", "3h", "4d", "4s", "4c", "4h", "5d",
			"5s", "5c", "5h", "6d", "6s", "6c", "6h", "7d", "7s", "7c", "7h",
			"8d", "8s", "8c", "8h", "9d", "9s", "9c", "9h", "10d", "10s",
			"10c", "10h", "Jd", "Js", "Jc", "Jh", "Qd", "Qs", "Qc", "Qh", "Kd",
			"Ks", "Kc", "Kh", "Ad", "As", "Ac", "Ah"));
	
	ArrayList<String> board = new ArrayList<String>(); //to hold flop, turn, and river cards
	
	
	
	HoldemPlayer p1 = new HoldemPlayer("You");
	HoldemPlayer p2 = new HoldemPlayer("CPU1");
	HoldemPlayer p3 = new HoldemPlayer("CPU2");
	HoldemPlayer p4 = new HoldemPlayer("CPU3");
	HoldemPlayer p5 = new HoldemPlayer("CPU4");
	HoldemPlayer p6 = new HoldemPlayer("CPU5");
	HoldemPlayer p7 = new HoldemPlayer("CPU6");
	HoldemPlayer p8 = new HoldemPlayer("CPU7");

	
	HoldemPlayer [] players = {p1, p2, p3, p4, p5, p6, p7, p8};

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HoldemGame game = new HoldemGame();
		game.getPlayers(); // have the user enter the number of players
		game.dealHands();
		game.displayHands();
		game.dealBoard();
		game.displayBoard();
		
		
		

		
	}

	public int getPlayers() {
		Scanner sc = new Scanner(System.in);
		boolean firstTry = true;
		do {
			if (firstTry) {
				System.out.println("How many players? (2-8): ");
				firstTry = false;
			}

			else
				System.out
						.println("Not a valid choice. Enter a whole number between 2 and 8.");

			while (!sc.hasNextInt()) {
				System.out
						.println("Not a valid choice. Enter a whole number between 2 and 8.");
				sc.next();
			}

			numPlayers = sc.nextInt();

		} while (numPlayers < 2 || numPlayers > 8);

		return numPlayers;

	}

	public void dealHands() {
		// code that sets the hand var for each player
		
	
		

		for (int i = 0; i < numPlayers; i++) {
			
			for (int j = 0; j < 2; j++) {
				 cIndex = r.nextInt(cards.size()); //generate index for random card
				 card = cards.get(cIndex); //get the card at that index
				 players[i].hand.add(card); //add to the player's hand
				 cards.remove(cIndex); //remove it from the arraylist of cards so it can't be selected again
				 
				
				 
			}
			
			

		}
			
			 

	}
	
	public void displayHands() {
		
		
		
		for (int i = 0; i < numPlayers; i++) {
				System.out.println(players[i].getName() + ": " + players[i].hand); 
			}
			
		}
	
	public void dealBoard() {
		for (int i = 0; i < 5; i++) {
			 cIndex = r.nextInt(cards.size()); //generate index for random card
			 card = cards.get(cIndex);
			 board.add(card); //add the card to the board of community cards
			 cards.remove(cIndex); //make sure it can't be selected again
			 
		}
	}
	
	public void displayBoard() {
		String flop;
		String turn;
		String river;
		
		
		flop = board.get(0) + " " + board.get(1) + " " + board.get(2);
		turn = board.get(3);
		river = board.get(4);
		
		System.out.println(); //to make space between players hands and this
		System.out.println("Flop: " +flop);
		System.out.println("Turn: " +turn);
		System.out.println("River: " +river);
		
	}
	
	
	

}
