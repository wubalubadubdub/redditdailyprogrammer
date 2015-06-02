package redditdailyprogrammer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class TexasHoldThem {

	private static Scanner sc = new Scanner(System.in);
	public static int numOfPlayers;
	
	static ArrayList<String> ranks = new ArrayList<String>(Arrays.asList("2", "3",
			"4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"));

	static ArrayList<String> suits = new ArrayList<String>(Arrays.asList("s", "d",
			"c", "h"));
	
	static ArrayList<String> dealt = new ArrayList<String>(); 
	
	static Random rRank = new Random();
	static Random rSuit = new Random();
	static int rankIndex;
	static int suitIndex;


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		playerCount();
		//run dealHands method to deal hands to the given number of players
		dealHands();
		

	}

	public static void playerCount() {
		
		boolean firstTry = true;
		do {
			if (firstTry) {
				System.out.println("How many players? (2-8): ");
				firstTry = false;
			}
			
			else System.out.println("Not a valid choice. Enter a whole number between 2 and 8.");
			
			while(!sc.hasNextInt()) {
				System.out.println("Not a valid choice. Enter a whole number between 2 and 8.");
				sc.next();
			}
			
			numOfPlayers = sc.nextInt();
			
		}while(numOfPlayers < 2 || numOfPlayers > 8);
		
		
		
		
		
		
		

	}
	
	public static void dealHands() {
		int cardsToDeal = 2*numOfPlayers; //each player gets two cards
		
		
		
		for (int i = 0; i < cardsToDeal; i++) {
			
			//select a random index from each arraylist
			int rankIndex;
			int suitIndex;
			
			//get the string at each index
			String r;
			String s; 
			String c;
			
			
			
		
		do {
			rankIndex = rRank.nextInt(ranks.size());
			suitIndex = rSuit.nextInt(suits.size());
			r = ranks.get(rankIndex);
			s = suits.get(suitIndex);
			c = r+s;
			
			
			
		} while (dealt.contains(c));
		
		dealt.add(c);
			
		
			
			
		}
		
		for (String s: dealt) {
			System.out.println(s);
		}
		
		
	}
	
	//method that matches cards to players

}




