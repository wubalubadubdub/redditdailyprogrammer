package redditdailyprogrammer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class TexasHoldThem {

	private static Scanner sc = new Scanner(System.in);
	private static int numOfPlayers;

	Random rankSuit = new Random();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getPlayerCount();
		Player You = new Player();
		You.dealHand();

	}

	public static int getPlayerCount() {
		System.out.println("How many players? (2-8): ");
		numOfPlayers = sc.nextInt();
		return numOfPlayers;

	}

}

class Player {

	ArrayList<String> ranks = new ArrayList<String>(Arrays.asList("2", "3",
			"4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"));

	ArrayList<String> suits = new ArrayList<String>(Arrays.asList("s", "d",
			"c", "h"));

	ArrayList<String> dealt = new ArrayList<String>(); // keeps track of hands
														// already dealt

	// assign vars for the rank of each random card
	Random randRank = new Random();

	// and for the suit of each random card
	Random randSuit = new Random();

	public void dealHand() {
		// before dealing a card, check to see if it's already been dealt
		int rankChoice;
		int suitChoice;

		// strings for ranks and suits
		String r1;
		String r2;
		String s1;
		String s2;

		// strings for cards
		String c1;
		String c2;
		
		String hand;

		do {

			// generate first random card

			rankChoice = randRank.nextInt(ranks.size());
			suitChoice = randSuit.nextInt(suits.size());

			r1 = ranks.get(rankChoice);
			s1 = suits.get(suitChoice);
			c1 = r1 + s1;

		} while (dealt.contains(c1));
		
		dealt.add(c1); // when a card is dealt, add it to the arraylist of dealt
						// cards so we won't deal it again
		
		do {
			
		

		// generate second random card

		rankChoice = randRank.nextInt(ranks.size());
		suitChoice = randSuit.nextInt(suits.size());
		
		r2 = ranks.get(rankChoice);
		s2 = suits.get(suitChoice);
		c2 = r2 + s2;
		
		} while (dealt.contains(c2));
		
		dealt.add(c2);
		hand = c1 + " " + c2; //hand is the concatenation of the two cards w/space in between
		System.out.println("You: " + hand);
		

	}

}
